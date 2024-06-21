package cat.itacademy.barcelonactiva.layache.bilal.s04.t02.n02.model.services;

import cat.itacademy.barcelonactiva.layache.bilal.s04.t02.n02.exceptions.FruitNotFoundException;
import cat.itacademy.barcelonactiva.layache.bilal.s04.t02.n02.model.domain.Fruit;
import cat.itacademy.barcelonactiva.layache.bilal.s04.t02.n02.model.repository.FruitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FruitSeriveImpl implements FruitService{
    @Autowired
    private FruitRepo fr;
    @Override
    public Fruit save(Fruit fruit) {
        return fr.save(fruit);
    }

    @Override
    public Fruit updateFruit(Fruit fruit) {
    if(!fr.existsById(fruit.getId())){
        throw new FruitNotFoundException("No existe");
    }
        return fr.save(fruit);
    }

    @Override
    public void deleteFruit(int fruitId) {
       if(!fr.existsById(fruitId)){
           throw new FruitNotFoundException("La fruta con id : "+fruitId + " haz intentado eliminar no existe.");
       }else {
           fr.deleteById(fruitId);
       }
    }

    @Override
    public Optional<Fruit> getById(int fruitId) {
        if(!fr.existsById(fruitId)){
            throw new FruitNotFoundException("La fruta con id : "+fruitId + " haz intentado buscar no existe.");
        }
        return fr.findById(fruitId);
    }

    @Override
    public Iterable<Fruit> getAllFruits() {
        return fr.findAll();
    }
}
