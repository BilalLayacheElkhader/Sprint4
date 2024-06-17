package cat.itacademy.barcelonactiva.layache.bilal.s04.t01.n01.Controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

        private static final String NAME = "UNKNOWN";

        @GetMapping("/saluda")
    public static String saluda(@RequestParam(value = "name", defaultValue = NAME) String name){
        return "Hola " + name + ". Estàs executant un projecte Maven";
    }
    @GetMapping({"/saluda2","/saluda2/{name}"})
    public static String saluda2(@PathVariable(required = false) String name){
        if(name == null){
            name = NAME;
        }
        return "Hola " + name + ". Estàs executant un projecte Maven";
    }
}
