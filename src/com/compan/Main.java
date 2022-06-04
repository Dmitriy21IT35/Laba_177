package com.compan;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args){
        LogisticFactory GruLandFactory=new LandLogisticFactory();
        LogisticFactory GruAirFactory=new AirLogisticFactory();
        LogisticFactory GruSeaFactory=new SeaLogisticFactory();
        Logistic GruLandLogistic=GruLandFactory.createLogistic();
        Logistic GruAirLogistic=GruAirFactory.createLogistic();
        Logistic GruSeaLogistic=GruSeaFactory.createLogistic();
        System.out.println(GruLandLogistic);
        System.out.println(GruAirLogistic);
        System.out.println(GruSeaLogistic);
    }
}


abstract class Logistic {
    String Transport;
    List<String> accessories=new ArrayList();
    public String toString(){
        return "MODEL TRANSPORT:" + Transport + "\n"+ accessories;

    }
}
abstract class LogisticFactory{
    public abstract Logistic createLogistic();
}
class LandLogisticFactory extends LogisticFactory {
    public Logistic createLogistic(){

        return new LandLogistic();
    }}
class AirLogisticFactory extends LogisticFactory{
    public Logistic createLogistic(){

        return new AirLogistic();
    }}
class SeaLogisticFactory extends LogisticFactory{
    public Logistic createLogistic(){

        return new SeaLogistic();
    }}

class LandLogistic extends Logistic{
    public LandLogistic(){
        Transport="Truck";
        accessories.add("Capacity in tons");
        accessories.add("Fuel consumption");
        accessories.add("Travel time");
        accessories.add("System Gps");
    }
}
class AirLogistic extends Logistic{
    public AirLogistic(){
        Transport="Cargo boeing";
        accessories.add("Capacity in tons");
        accessories.add("Fuel consumption");
        accessories.add("Time in ways");
        accessories.add("System Gps");
    }
}
class SeaLogistic extends Logistic{
    public SeaLogistic(){
        Transport="Cargo ship";
        accessories.add("Capacity in tons");
        accessories.add("Fuel consumption");
        accessories.add("Time in ways");
        accessories.add("System Gps");

    }
}

