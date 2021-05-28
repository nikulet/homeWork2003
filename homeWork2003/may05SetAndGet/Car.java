package tekWillHomeWorks.homeWork2003.may05SetAndGet;

public class Car {
    String brand;
    String model;
    String gearboxTransmition;
    String color;
    String typeOfConsum;

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "Toyota";
        c1.model = "CH-R";
        c1.gearboxTransmition = "automat";
        c1.color = "red";
        c1.typeOfConsum = "disel";
        System.out.println("Marca de masina " + c1.brand + ", modelul " + c1.model +
                ", transmisie " + c1.gearboxTransmition + ", coloarea " + c1.color +
                ", tipul de consum " + c1.typeOfConsum);

        Car c2 = new Car();
        c2.setBrand("Toyota");
        c2.setModel("CH-R");
        ;
        c2.setGearboxTransmition("manual");
        c2.setColor("blue");
        c2.setTypeOfConsum("disel");
        System.out.println("Marca de masina " + c2.getBrand() + ", modelul " + c2.getModel() +
                ", transmisie " + c2.getGearboxTransmition() + ", coloarea " + c2.getColor() +
                ", tipul de consum " + c2.getTypeOfConsum());


        Car c3 = new Car("Toyota", "CH-R", "automat", "gris", "benzina");
        System.out.println("Marca de masina " + c3.getBrand() + ", modelul " + c3.getModel() +
                ", transmisie " + c3.getGearboxTransmition() + ", coloarea " + c3.getColor() +
                ", tipul de consum " + c3.getTypeOfConsum());
    }

    Car() {
        brand = null;
        model = null;
        gearboxTransmition = null;
        color = null;
        typeOfConsum = null;
    }

    Car(String newBrand) {
        brand = newBrand;
    }

    Car(String newBrand, String newModel) {
        brand = newBrand;
        model = newModel;
    }

    Car(String newBrand, String newModel, String newGearboxTransmition) {
        brand = newBrand;
        model = newModel;
        gearboxTransmition = newGearboxTransmition;
    }

    Car(String newBrand, String newModel, String newGearboxTransmition, String newColor) {
        brand = newBrand;
        model = newModel;
        gearboxTransmition = newGearboxTransmition;
        color = newColor;
    }

    Car(String newBrand, String newModel, String newGearboxTransmition, String newColor, String newTypeOfConsum) {
        brand = newBrand;
        model = newModel;
        gearboxTransmition = newGearboxTransmition;
        color = newColor;
        typeOfConsum = newTypeOfConsum;
    }

    public void setBrand(String newBreand) {
        brand = newBreand;
    }

    public String getBrand() {
        return brand;
    }


    public void setModel(String newModel) {
        model = newModel;
    }

    public String getModel() {
        return model;
    }

    public void setGearboxTransmition(String newGearboxTransmition) {
        gearboxTransmition = newGearboxTransmition;
    }

    public String getGearboxTransmition() {
        return gearboxTransmition;
    }

    public void setColor(String newColor) {
        color = newColor;
    }

    public String getColor() {
        return color;
    }

    public void setTypeOfConsum(String newTypeOfConsum) {
        typeOfConsum = newTypeOfConsum;
    }

    public String getTypeOfConsum() {
        return typeOfConsum;
    }
}
