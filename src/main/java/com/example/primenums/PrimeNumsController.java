package com.example.primenums;

        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.web.bind.annotation.*;
        import org.springframework.stereotype.*;

@Controller
@SpringBootApplication
public class PrimeNumsController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "1 is a prime number";
    }

    public static void main(String[] args) {
        SpringApplication.run(PrimeNumsController.class, args);
    }
}