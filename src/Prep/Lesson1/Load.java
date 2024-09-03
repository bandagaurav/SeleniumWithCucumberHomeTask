package Prep.Lesson1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Appliance {
    private String name;
    private int powerConsumption;

    public Appliance(String name, int powerConsumption) {
        this.name = name;
        this.powerConsumption = powerConsumption;
    }

    public String getName() {
        return name;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }
}

 class Load {
    private List<Appliance> appliances;

    public Load() {
        appliances = new ArrayList<>();
    }

    public void addAppliance(Appliance appliance) {
        appliances.add(appliance);
    }
    public List<Appliance> getAppliances(){
        return appliances;
    }

    public int calculateCurrentLoad() {
        int totalPower = 0;
        for (Appliance appliance : appliances) {
            totalPower += appliance.getPowerConsumption();
        }
        return totalPower;
    }

    public void sortAppliancesByPowerConsumption() {
        Collections.sort(appliances, Comparator.comparingInt(Appliance::getPowerConsumption));
    }

    public static void main(String args[]){
        Load load=new Load();
        Appliance fan=new Appliance("Fan",1);
        Appliance light=new Appliance("Light",2);
        Appliance tv=new Appliance("TV",3);

        load.addAppliance(fan);
        load.addAppliance(light);
        load.addAppliance(tv);
load.sortAppliancesByPowerConsumption();
for(Appliance appliance:load.getAppliances()){
    System.out.println(appliance.getName()+" - "+appliance.getPowerConsumption());
}
int totalPowerConsumption=load.calculateCurrentLoad();
System.out.println("Total Power Consumption "+ totalPowerConsumption+" units");
    }
}