package Zadanie3;

public class Car implements Nameable{
    private String brand;
    private String model;
    private String engineType;
    Car(String brand, String model, String engineType){
        this.brand = brand;
        this.model = model;
        this.engineType = engineType;
    }
    @Override
    public String getName() {
        return brand + " " + model + " " + engineType;
    }
}
