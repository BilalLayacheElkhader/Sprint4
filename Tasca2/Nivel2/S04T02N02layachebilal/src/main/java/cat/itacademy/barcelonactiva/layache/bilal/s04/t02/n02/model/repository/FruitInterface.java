package cat.itacademy.barcelonactiva.layache.bilal.s04.t02.n02.model.repository;

import cat.itacademy.barcelonactiva.layache.bilal.s04.t02.n02.model.domain.Fruit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FruitInterface extends CrudRepository<Fruit, Integer> {

}
