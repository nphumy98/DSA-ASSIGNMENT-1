/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1_task1;

import java.util.Scanner;

/**
 *
 * @author wrk2544
 */
public class Assignment1_Task1 {

    /**
     * @param args the command line arguments
     */
    // I create 2 linklist , one for occupied car park , one for empty car park
    public static  SinglyLinkedList<CarPark> occupiedCarPark= new SinglyLinkedList<CarPark>();
    public static   SinglyLinkedList<CarPark> availableCarPark= new SinglyLinkedList<CarPark>();
    public static Scanner keyboard= new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        
        //make keyboard
        
        //initialise carpark
        CarPark carPark1= new CarPark("WZ01",new Car("Nissan"),2);
        CarPark carPark2= new CarPark("WZ02",new Car("Toyota"),1);
        CarPark carPark3= new CarPark("WZ03",new Car("BMW"),3);
        CarPark carPark4= new CarPark("WZ04",new Car("Lambo"),4);
        CarPark carPark5= new CarPark("WZ05");
        CarPark carPark6= new CarPark("WZ06",new Car("Lexus"),5);
        CarPark carPark7= new CarPark("WZ07");
        CarPark carPark8= new CarPark("WZ08",new Car("Vinfast"),3);
        CarPark carPark9= new CarPark("WZ09");
        
        
        
        occupiedCarPark.add(carPark1);
        occupiedCarPark.add(carPark2);
        occupiedCarPark.add(carPark3);
        occupiedCarPark.add(carPark4);
        occupiedCarPark.add(carPark6);
        occupiedCarPark.add(carPark8);
        
        availableCarPark.add(carPark5);
        availableCarPark.add(carPark7);
        availableCarPark.add(carPark9);
        
//        System.out.println(occupiedCarPark.sizeList);
//       occupiedCarPark.traverse();
//       System.out.println("=========================================");
//       System.out.println(occupiedCarPark.contains(carPark4));
//       occupiedCarPark.traverse();
//       availableCarPark.traverse();
       
      
       int optionMainMenu=-1;
       
       while(optionMainMenu!=5)
       {
           printMenu();
           optionMainMenu=keyboard.nextInt();
           keyboard.nextLine(); // clear all the buffer
           if (optionMainMenu==1)
           {
               seeAvailableCarPark();
               keyboard.nextLine();
           }
           else if (optionMainMenu==2)
           {
               seeOccupiedCarPark();
               keyboard.nextLine();
           }
           else if (optionMainMenu==3)
           {
               leaveCar();
               keyboard.nextLine();
           }
           else if (optionMainMenu==4)
           {
               findCar();
               keyboard.nextLine();
           }
           else if (optionMainMenu==5)
           {
               System.out.println("THANK FOR CHOOSING OUR CARPARK SYSTEM. GOOD BYE!!!");
           }
 
       }
       
    }
    
    public static void printMenu()
    {
       System.out.println("WELCOME TO THE CARPARK SYSTEM!!!");
       System.out.println("===================================");
       System.out.println("1. SEE NUMBER OF AVALIABLE CARPARK (INCLUDE LOCATIONS)");
       System.out.println("2. SEE NUMBER OF OCCUPIED CAR PARK (INCLUDE LOCATIONS AND PARKING TIME)");
       System.out.println("3. LEAVE CAR FROM THE CARPARK (INCLUDE CALCULATE PARKING COST)");
       System.out.println("4. FIND IF YOUR CAR IS IN THE CARPARK (EXTRA FEATURE)");
       System.out.println("5. QUIT THE SYSTEM");
       System.out.println("PLEASE SELECT ONE OPTION:");
    }
    
    public static void calculateCost(CarPark aCarPark)
    {
        if (aCarPark.timeOccupancy>=0)
        {
            int parkingCost=0;
            if (aCarPark.timeOccupancy<=1)
            {
                parkingCost=4;
            }
            else if (aCarPark.timeOccupancy<=2)
            {
                parkingCost=8;
            }
            else if (aCarPark.timeOccupancy<=3)
            {
                parkingCost=12;
            }
            else if (aCarPark.timeOccupancy<=4)
            {
                parkingCost=16;
            }
            else if (aCarPark.timeOccupancy<=5)
            {
                parkingCost=20;
            }
            else
            {
                parkingCost=24;
            }
            System.out.println("The car has parked here for "+aCarPark.timeOccupancy +"hours. The parking cost is: $"+parkingCost);
        }
        else
        {
            System.out.println("This parking time is less than zero. You don't have to pay money when you dont park the car");
        }
    }
    
        public static void seeAvailableCarPark()
    {
        System.out.println("The number of available car park: "+availableCarPark.sizeList);
        if (availableCarPark.sizeList==0)
        {
            System.out.println("There is no car park available at the moment. The Car Park is full");
        }
        else
        {
            availableCarPark.traverse();
        }
        System.out.println("PRESS ENTER TO BACK MAIN MENU");
    }
    
    public static void seeOccupiedCarPark()
    {
        System.out.println("The number of occupied car park: "+occupiedCarPark.sizeList);
        if (occupiedCarPark.sizeList==0)
        {
            System.out.println("The Car Park is empty. All CarPark locations available however no car park at the moment");
        }
        else
        {
            occupiedCarPark.traverse();
        }
        System.out.println("PRESS ENTER TO BACK MAIN MENU");
    }
    
    public static void leaveCar()
    {
        occupiedCarPark.traverse();
        if (occupiedCarPark.sizeList==0)
        {
            System.out.println("The Car Park is empty. Your car is definitely not in here");
        }
        else
        {
            System.out.println("Please select the option ");
            int index= keyboard.nextInt();
            keyboard.nextLine(); // clear all the buffer
            //we create a temporary carpark to search for element in the list that match carPark registration number
            CarPark carRequested= occupiedCarPark.remove(index-1);
            System.out.println("The car with the registration number: "+carRequested.currentCar.carRegistrationNumber+" has left the car Park");
            calculateCost(carRequested); // calculate the cost for the car
            // add the carPark to availableCarPark List
            carRequested.currentCar=null;
            carRequested.timeOccupancy=-1;
            availableCarPark.add(carRequested);
        }
        System.out.println("PRESS ENTER TO BACK MAIN MENU");
    }
    
    public static void findCar()
    {
        if (occupiedCarPark.sizeList==0)
        {
            System.out.println("The Car Park is empty. Your car is not in here");
        }
        else
        {
            System.out.println("Please enter your car registration number: ");
            String carParkRegistrationNumber= keyboard.nextLine();
            //we create a temporary carpark to search for element in the list that match carPark registration number
            CarPark carRequested= new CarPark("temporaryCarPark",new Car(carParkRegistrationNumber),0);
            int index= occupiedCarPark.indexOf(carRequested); // check the car is in car park
            if (index==-1) // not in car park
            {
                System.out.println("Sorry the car with the registration number: "+carParkRegistrationNumber+" is not in here");
            }
            else // if it is in the car park
            {
                carRequested=occupiedCarPark.get(index);
                System.out.println("The car with the registration number: "+carRequested.currentCar.carRegistrationNumber+" in here");
                System.out.println("The location: "+carRequested.carParkLocation);
                System.out.println("The parking time: "+carRequested.timeOccupancy);
            }
            
        }
        System.out.println("PRESS ENTER TO BACK MAIN MENU");
    }
    
   
}
