package com.example.feignclientmicroserviceone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/one")
public class FeignClientMicroserviceOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignClientMicroserviceOneApplication.class, args);
    }

    @GetMapping("/name")
    public String getName (){
        return "Ravi";
    }


    @GetMapping("/address")
    public String getAddress (){
        return "Ballia";
    }
    @GetMapping("/status")
    public String getStatus (){
        return "Active";
    }
}
