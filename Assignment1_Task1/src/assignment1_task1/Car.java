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
public class Car {
    public String carRegistrationNumber;
    public Car(String carRegistrationNumber)
    {
        this.carRegistrationNumber=carRegistrationNumber;
    }

    @Override
    public String toString() {
        return "Car{" + "carRegistrationNumber=" + carRegistrationNumber + '}';
    }
    
}
