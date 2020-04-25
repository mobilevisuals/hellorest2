package pac.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HController {

    @RequestMapping("/")
    public String index()
    {return "hello";}

    @RequestMapping("/hello2")
    public String text2()
    {return "hello2!!!";}

    @RequestMapping("/hello")
    public String addFoo(@RequestParam String firstname, @RequestParam(required = false,defaultValue = "Gunnar") String lastname) {
        return "Hello " + firstname + " " + lastname;
    }

    @RequestMapping("/listHello")
    public String listHello(@RequestParam List<String> id) {
        return "IDs are " + id;
    }

    @GetMapping("/pathtest/{id}")
    public String pathvartest(@PathVariable String id) {
        return "ID: " + id;
    }

    @RequestMapping("/hellohtml")
    public String helloHTML() {
        return "<H1>Hello </h1>";
    }

}
