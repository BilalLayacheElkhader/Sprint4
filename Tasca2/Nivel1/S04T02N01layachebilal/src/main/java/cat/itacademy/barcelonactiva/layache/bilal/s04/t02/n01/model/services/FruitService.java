package cat.itacademy.barcelonactiva.layache.bilal.s04.t02.n01.model.services;

import cat.itacademy.barcelonactiva.layache.bilal.s04.t02.n01.model.domain.Fruit;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FruitService {
    Fruit save(Fruit fruit);

    Fruit updateFruit(Fruit fruit);

    Fruit deleteFruit(int fruitId);

    Fruit getById(int fruitId);

    Iterable<Fruit> getAllFruits();
    //@Autowired
   // FruitInterface fr;

}
