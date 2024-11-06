package net.engineeringdigest.journalApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mypro {

    @Autowired
    private Dog dog;

    @GetMapping("abc")
    public String sayhello() {
        return dog.Fun();
    }
}