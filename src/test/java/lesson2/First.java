package lesson2;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

//import static com.sun.tools.javac.main.Option.O;
import static java.lang.System.*;

public class First {

    float fuelCons = 0;

    @Test
    public void first() {
        int a = 3;
        int b = 16;
        int c = sum(a, b);
        out.println(sum(3, 16));

        a = 22;
        b = 15;
        c = sum(22, 15);
        out.println(sum(22, 15));
    }

    private int sum(int a, int b) {
        out.println("First digit is: " + a + " and second is: " + b);
        //                  First digit is: 3 and second is: 16
        int c = a + b;
        return c;
    }

    private float fuelCons(Freight freight, float distance){
        float fuelCons = freight.getFuelUse() / 100 * distance;
        out.println("Fuel consumption of " + freight.getModel() + " " + freight.getType() + " per " + distance + " km is: " + fuelCons + " l");
        return fuelCons;
    };

    private float priceForTon(int freightVolume, float capacity, float loadUnload, String model, String type){
        float fuelCons1 = fuelCons;
        float fuelUse;
        float distance;
        float priceForTon = freightVolume / capacity * loadUnload + fuelCons1 * 2;
        out.println("Price for 1 ton transportation by " + model + " " + type + " is " + priceForTon);
        return priceForTon;
    };

    @Test
    public void calc(){
        Freight nissan = new Freight();
        nissan.setType("car");
        nissan.setModel("Nissan");
        nissan.setFuelUse(10);
        nissan.setCapacity(1);
        nissan.setLoadUnload(68);

        Freight mercedes = new Freight();
        mercedes.setType("car");
        mercedes.setModel("Mercedes");
        mercedes.setFuelUse(12);

        /*fuelCons(nissan, 1000);
        fuelCons(12, 1000, "Mercedes", "car");
        fuelCons(15, 1000, "Jeep", "car");
        fuelCons(1100, 1000, "Jack", "train");
        fuelCons(1200, 1000, "John", "train");

        priceForTon(1, 1, 68, "Nissan", "car");
        priceForTon(1, 1, 120, "Mercedes", "car");
        priceForTon(1, 1.20f, 100, "Jeep", "car");
        priceForTon(1, 100, 1600, "Jack", "train");
        priceForTon(1, 80, 1400, "John", "train");*/
    }

    @Test
    public void usingObjects() {
        Student mihail = new Student(); //тут мы сохраняем все параметры для студента Михаила
        mihail.setFirstName("Mihail");
        mihail.setLastName("The greatest");
        mihail.setAge(18);
        mihail.setPersonalCode("123456-11111");

        Student timur = new Student();
        timur.setFirstName("Timur");
        timur.setLastName("Timurovich");
        timur.setAge(24);
        timur.setPersonalCode("543211-12345");

        out.println(mihail.getFirstName() + " " + mihail.getLastName());
        out.println(timur.getFirstName() + " " + timur.getLastName());
    }
}
