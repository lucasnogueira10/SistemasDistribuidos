package br.com.repository;

import br.com.Model.Modulo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModuloRepository extends MongoRepository<Modulo, String> {
}