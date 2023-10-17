package Zadanie3;

public class Sobaka implements Nameable{
    private String name;
    private String poroda;
    Sobaka(String name, String poroda){
        this.name = name;
        this.poroda = poroda;
    }
    @Override
    public String getName() {
        return poroda+" "+name;
    }
}
