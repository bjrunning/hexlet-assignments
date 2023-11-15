package exercise.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

// BEGIN
import exercise.daytime.Daytime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
// END

// BEGIN
@RestController
@RequestMapping("/welcome")
public class WelcomeController {

    @Autowired
    private Daytime daytime;

    @GetMapping
    public String index() {
        return daytime.getName();
    }
}

// END
