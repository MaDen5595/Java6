package Zadanie3;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What your fav planet?");
        String a = scan.nextLine();
        System.out.println("What breed of dog do you want?");
        String b = scan.nextLine();
        System.out.println("What would it be called?");
        String c = scan.nextLine();
        System.out.println("What's your favorite car brand?");
        String d = scan.nextLine();
        System.out.println("What's your favorite model?");
        String e = scan.nextLine();
        System.out.println("What's your favorite engine in this model?");
        String f = scan.nextLine();
        Planet p = new Planet(a);
        Sobaka s = new Sobaka(c, b);
        Car ca = new Car(d, e, f);
        System.out.println(p.getName());
        System.out.println(s.getName());
        System.out.println(ca.getName());
    }
}
