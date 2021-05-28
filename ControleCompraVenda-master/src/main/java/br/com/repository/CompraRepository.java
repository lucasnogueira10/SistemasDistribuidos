package br.com.repository;

import br.com.model.Compra;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompraRepository extends MongoRepository<Compra, String> {
}