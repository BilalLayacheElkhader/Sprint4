package cat.itacademy.barcelonactiva.layache.bilal.s04.t02.n01.model.services;

import cat.itacademy.barcelonactiva.layache.bilal.s04.t02.n01.model.domain.Fruit;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface FruitService {
    Fruit save(Fruit fruit);

    Fruit updateFruit(Fruit fruit);

    void deleteFruit(int fruitId);

    Optional<Fruit> getById(int fruitId);

    Iterable<Fruit> getAllFruits();


}
