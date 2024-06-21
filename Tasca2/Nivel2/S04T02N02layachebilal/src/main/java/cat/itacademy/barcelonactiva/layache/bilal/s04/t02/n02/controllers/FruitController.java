package cat.itacademy.barcelonactiva.layache.bilal.s04.t02.n02.controllers;


import cat.itacademy.barcelonactiva.layache.bilal.s04.t02.n02.model.domain.Fruit;
import cat.itacademy.barcelonactiva.layache.bilal.s04.t02.n02.model.services.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
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
        fruitService.deleteFruit(fruitId);
        return ResponseEntity.ok("Eliminat");
    }

    @GetMapping("/getOne/{fruitId}")
    public ResponseEntity<Optional<Fruit>> getById(@PathVariable int fruitId) {
        Optional<Fruit> fruit = fruitService.getById(fruitId);
        return ResponseEntity.ok().body(fruit);

        }


    @GetMapping("/getAll")
    public ResponseEntity<String> getAll() {
        Iterable<Fruit> itFruit = fruitService.getAllFruits();
        return ResponseEntity.ok(itFruit.toString());
    }

}
