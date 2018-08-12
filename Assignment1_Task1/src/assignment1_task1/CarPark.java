/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1_task1;

/**
 *
 * @author wrk2544
 */
public class CarPark {
    public String carParkLocation;
    public Car currentCar;
    public float timeOccupancy; 
    
    public CarPark(String carParkLocation,Car currentCar, float timeOccupancy)
    {
        this.carParkLocation=carParkLocation;
        this.currentCar=currentCar;
        this.timeOccupancy=timeOccupancy;
    }
    
    public CarPark(String carParkLocation) // create carParkLocation without car
    {
        this.carParkLocation=carParkLocation;
        this.currentCar=null;
        this.timeOccupancy=-1;
    }
    
    public CarPark() // default constructor
    {
        this.carParkLocation=null;
        this.currentCar=null;
        this.timeOccupancy=-1;
    }

    @Override
    public String toString() {
        if (this.currentCar!=null)
        {
            return "CarPark{" + "carParkLocation=" + carParkLocation + ", currentCar=" + currentCar + ", timeOccupancy=" + timeOccupancy + '}';
        }
        else
        {
            return "CarPark{" + "carParkLocation=" + carParkLocation + ": CURRENTLY EMPTY";
        }
    }
    
    // this method is to compare 2 CarPark object to see if they have the same car 
    public static boolean equals(CarPark aCarPark, CarPark anotherCarPark)
    {
        if (aCarPark.currentCar.carRegistrationNumber.equalsIgnoreCase(anotherCarPark.currentCar.carRegistrationNumber.toLowerCase()))
        {
            return true;
        }
        return false;
    }
    
}