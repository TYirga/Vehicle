package tize.com.example.demo;

public class Car extends Vehicle {
    private String carName;
    private double  speed;
    public Car(String carName){
      this.carName=carName;

    }
    @Override
public String getAcceleration(){
        return carName + " is accelerated";
}
public void setSpeed( double speed){
        this.speed=speed;
}
public String getSpeed(){
        return ("The Speed is "+ speed + " MPH");
}
}
