import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car newCarFiat = new Car("Fiat", "500", 2019, "groen", 1.4F);
        Car newCarToyota = new Car("Toyota", "Aygo", 2016, "blauw", 1.2F);
        Car newCarVolvo = new Car("Volvo", "CX90", 2022, "zwart", 2.0F);

        System.out.println(newCarFiat.carBrand + " " + newCarFiat.carType + " " + newCarFiat.carBuildYear + " " + newCarFiat.carColor + " " + newCarFiat.carEngineCapacity);
    }
}
