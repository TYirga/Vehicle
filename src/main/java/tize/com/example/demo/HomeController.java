package tize.com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String carVehicle(){
        Car cc= new Car(" Porsche");
        cc.setSpeed(90);
        Vehicle vv=new Vehicle();

        return cc.getAcceleration() + "br/" + cc.getSpeed();
    }
}
