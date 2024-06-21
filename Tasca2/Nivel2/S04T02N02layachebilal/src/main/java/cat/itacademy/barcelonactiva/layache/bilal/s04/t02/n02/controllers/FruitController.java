package cat.itacademy.barcelonactiva.layache.bilal.s04.t02.n02.controllers;


import cat.itacademy.barcelonactiva.layache.bilal.s04.t02.n02.model.domain.Fruit;
import cat.itacademy.barcelonactiva.layache.bilal.s04.t02.n02.model.services.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/fruits")
public class FruitController {
    @Autowired
    private FruitService fruitService;
    @PostMapping("/add")
    public ResponseEntity<Fruit> addFruit(@RequestBody Fruit fruit){
        Fruit fruit1 = fruitService.save(fruit);
        return ResponseEntity.ok(fruit1);
    }
    @PutMapping("/update")
    public ResponseEntity<Fruit> updateFruit(@RequestBody Fruit fruit){
        Fruit fruit1 = fruitService.updateFruit(fruit);
        return ResponseEntity.ok(fruit1);

    }
    @DeleteMapping("/delete/{fruitId}")
    public ResponseEntity<String> deleteFruit(@PathVariable int fruitId){
        Fruit fruit1 = fruitService.deleteFruit(fruitId);
        return ResponseEntity.ok("Deleted!");
    }

    @GetMapping("/getOne/{fruitId}")
    public ResponseEntity<String> getById(@PathVariable int fruitId) {
        Optional<Fruit> optionalFruit = Optional.ofNullable(fruitService.getById(fruitId));
        Fruit fruit = null;
        if(optionalFruit.isPresent()){
            return ResponseEntity.ok(optionalFruit.get().toString());
        }else {
           return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No encontrado");
        }
    }

    @GetMapping("/getAll")
    public ResponseEntity<String> getAll() {
        Iterable<Fruit> itFruit = fruitService.getAllFruits();
        return ResponseEntity.ok(itFruit.toString());
    }

}
