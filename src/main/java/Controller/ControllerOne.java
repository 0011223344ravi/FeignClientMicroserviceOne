package Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/one")
public class ControllerOne {

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
