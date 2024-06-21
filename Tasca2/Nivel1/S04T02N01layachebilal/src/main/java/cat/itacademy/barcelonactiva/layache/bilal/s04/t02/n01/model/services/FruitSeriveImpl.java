package cat.itacademy.barcelonactiva.layache.bilal.s04.t02.n01.model.services;

import cat.itacademy.barcelonactiva.layache.bilal.s04.t02.n01.model.domain.Fruit;
import cat.itacademy.barcelonactiva.layache.bilal.s04.t02.n01.model.repository.FruitInterface;
import org.aspectj.apache.bcel.classfile.Module;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FruitSeriveImpl implements FruitService{
    @Autowired
    private FruitInterface fr;
    @Override
    public Fruit save(Fruit fruit) {
        return fr.save(fruit);
    }

    @Override
    public Fruit updateFruit(Fruit fruit) {
        return fr.save(fruit);
    }

    @Override
    public Fruit deleteFruit(int fruitId) {
         fr.deleteById(fruitId);
        return null;
    }

    @Override
    public Fruit getById(int fruitId) {
        Optional<Fruit> optionalFruit = fr.findById(fruitId);
        Fruit fruit1 = null;
        if(optionalFruit.isPresent()){
             fruit1 = optionalFruit.get();
        }
        return fruit1;
    }

    @Override
    public Iterable<Fruit> getAllFruits() {
        return fr.findAll();
    }
}
