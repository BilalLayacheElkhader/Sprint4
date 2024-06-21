package cat.itacademy.barcelonactiva.layache.bilal.s04.t02.n03.model.repository;

import cat.itacademy.barcelonactiva.layache.bilal.s04.t02.n03.model.domain.Fruit;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FruitRepo extends MongoRepository<Fruit,String>{

}
