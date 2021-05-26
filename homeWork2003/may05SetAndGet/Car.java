package tekWillHomeWorks.homeWork2003.may05SetAndGet;

public class Car {
    String brand;
    String model;
    String gearboxTransmition;
    String color;
    String typeOfConsum;

    public Car(){
        brand="null";
        model="null";
        gearboxTransmition="null";
        color="null";
        typeOfConsum="null";
    }

    public void setBrand(String newBreand){
        brand=newBreand;
    }

    public String getBrand() {
        return brand;
    }

    public void setModel(String newModel){
        model=newModel;
    }
    public String getModel(){
        return model;
    }

    public void setGearboxTransmition(String newGearboxTransmition){
        gearboxTransmition=newGearboxTransmition;
    }
    public  String getGearboxTransmition(){
        return gearboxTransmition;
    }
    public  void setColor(String newColor){
        color=newColor;
    }
    public String getColor(){
        return color;
    }
    public  void  setTypeOfConsum(String newTypeOfConsum){
        typeOfConsum=newTypeOfConsum;
    }
    public String getTypeOfConsum(){
        return typeOfConsum;
    }
}
