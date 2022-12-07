package lesson2;

import java.math.BigDecimal;

public class Freight {
    private String type;
    private String model;
    private float fuelUse;
    private float capacity;
    private float loadUnload;
    private float distance;

    public void setType(String type){ this.type = type; }
    public void setModel(String model){ this.model = model; }
    public void setFuelUse(float fuelUse){
        this.fuelUse = fuelUse;
    }
    public void setCapacity(float capacity) {this.capacity = capacity; }
    public void setLoadUnload(float loadUnload){
        this.loadUnload = loadUnload;
    }
    public void setDistance(float distance){
        this.distance = distance;
    }

    public String getModel(){return model;}
    public String getType(){return type;}
    public float getFuelUse(){return fuelUse;}
    public float getCapacity(){return capacity;}
    public float getLoadUnload(){return loadUnload;}
    public float getDistance(){return distance;}

}
