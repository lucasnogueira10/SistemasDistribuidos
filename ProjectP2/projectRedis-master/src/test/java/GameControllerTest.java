import br.com.projRedis.Main;
import br.com.projRedis.model.Game;
import br.com.projRedis.service.GameService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Main.class)
@WebAppConfiguration
public class GameControllerTest {

    @Autowired
    private GameService gameService;

    @Test
    public void save() throws Exception {

        long qtd = 500;

        gameService.deleteAll();

        for (int i = 1; i <= qtd; i++) {
            gameService.sendGameRabbit(new Game(String.valueOf(i), "Lucas" + i, "Descricao" + i));
        }

        Thread.sleep(5000);
        List<Game> lst = gameService.findAll();

        System.out.println("Qtd:" + lst.size());
        Assert.assertEquals(lst.size(), qtd);
    }

}

