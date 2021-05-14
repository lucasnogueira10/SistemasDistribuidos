package Controller;

import br.com.store.Main;
import br.com.store.model.Avaliacao;
import br.com.store.service.AvaliacaoService;
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
public class AvaliacaoControllerTest {

    @Autowired
    private AvaliacaoService avaliacaoService;

    @Test
    public void save() throws Exception {

        long qtd = 1000000;

        avaliacaoService.deleteAll();

        for ( int i = 1 ; i <= qtd ; i++){
            avaliacaoService.sendProductRabbit(new Avaliacao(i, "teste"+i, 0+i, "Lucas"+i));
        }

        Thread.sleep(5000);
        List<Avaliacao> lst = avaliacaoService.findAll();

        System.out.println("Qtd:" + lst.size());
        Assert.assertEquals(lst.size(), qtd);
    }

}
