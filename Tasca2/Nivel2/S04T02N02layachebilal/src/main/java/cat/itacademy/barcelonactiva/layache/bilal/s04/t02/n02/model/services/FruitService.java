package cat.itacademy.barcelonactiva.layache.bilal.s04.t02.n02.model.services;

import cat.itacademy.barcelonactiva.layache.bilal.s04.t02.n02.model.domain.Fruit;
import org.springframework.stereotype.Service;

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
