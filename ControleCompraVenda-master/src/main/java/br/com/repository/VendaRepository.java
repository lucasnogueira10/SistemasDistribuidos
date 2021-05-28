package br.com.repository;

import br.com.model.Venda;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendaRepository extends MongoRepository<Venda, String> {
}
