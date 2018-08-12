/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1_task2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author wrk2544
 */
public class Assignment1_Task2 {

    /**
     * @param args the command line arguments
     */
    public static int studentNumber=50;
    public static Student[] mainArray= new Student[studentNumber];
    public static Student[] auxilaryArray= new Student[studentNumber];
    public static int numberCollectedPaper=0; //size of collectedStudentArray
    public static Random rand= new Random();
    public static void main(String[] args) {
        Scanner keyboard= new Scanner(System.in);
        int option=0;
        System.out.println("WELCOME TO SORTING STUDENT ID SYSTEM");
        System.out.println("1.CASE 1: The invigilator will get the exam papers (randomly) from all studentsand then sort them as per requirements. Note: MergeSort algorithm is chosen to handle this case");
        System.out.println("2.CASE 2: The invigilator will get the exam paper from each student and placed iton the desk in sorted order. i.e., when the invigilator places the last student’spaper on desk, the papers will be in the required sorted order.");
        System.out.println("3.QUIT");
        System.out.println("PLEASE SELECT YOUR CHOICE (1 to 3)");
        option=keyboard.nextInt();
        if (option==1)
        {
            initialiseAuxilaryArray();// initiallise auxilary Array for mergeSort
            System.out.println("NOTE: MERGESORT IS CHOSEN TO HANDLE CASE 1");
            // COLLECT 10 PAPERS
            collect10Paper();
            System.out.println("===============================================================================");
            System.out.println("BEFORE SORT 10 PAPERS:");
            printMainArray();
            mergeSort(mainArray,auxilaryArray,0,numberCollectedPaper-1); // user MergeSort
            System.out.println("===============================================================================\n\n");
            System.out.println("AFTER SORT 10 PAPERS:");
            printMainArray();
            System.out.println("===============================================================================\n\n");
            
            // COLLECT 20 PAPERS
            collect20Paper();
            System.out.println("===============================================================================\n\n");
            System.out.println("BEFORE SORT 20 PAPERS:");
            printMainArray();
            mergeSort(mainArray,auxilaryArray,0,numberCollectedPaper-1); // user MergeSort
            System.out.println("===============================================================================\n\n");
            System.out.println("AFTER SORT 20 PAPERS:");
            printMainArray();
            System.out.println("===============================================================================\n\n");
            
            // COLLECT 30 PAPERS
            collect30Paper();
            System.out.println("===============================================================================\n\n");
            System.out.println("BEFORE SORT 30 PAPERS:");
            printMainArray();
            mergeSort(mainArray,auxilaryArray,0,numberCollectedPaper-1); // user MergeSort
            System.out.println("===============================================================================\n\n");
            System.out.println("AFTER SORT 30 PAPERS:");
            printMainArray();
            System.out.println("===============================================================================\n\n");
            
            // COLLECT 40 PAPERS
            collect40Paper();
            System.out.println("===============================================================================\n\n");
            System.out.println("BEFORE SORT 40 PAPERS:");
            printMainArray();
            mergeSort(mainArray,auxilaryArray,0,numberCollectedPaper-1); // user MergeSort
            System.out.println("===============================================================================\n\n");
            System.out.println("AFTER SORT 40 PAPERS:");
            printMainArray();
            System.out.println("===============================================================================\n\n");
            
            //COLLECT 50 PAPERS
            collect50Paper();
            System.out.println("===============================================================================\n\n");
            System.out.println("BEFORE SORT 50 PAPERS:");
            printMainArray();
            mergeSort(mainArray,auxilaryArray,0,numberCollectedPaper-1); // user MergeSort
            System.out.println("===============================================================================\n\n");
            System.out.println("AFTER SORT 50 PAPERS:");
            printMainArray();
            System.out.println("===============================================================================\n\n");
        }
        else if (option==2)
        {
            System.out.println("NOTE: INSERTIONSORT IS CHOSEN TO HANDLE CASE 2");
             // COLLECT 10 PAPERS
            collect10Paper();
            System.out.println("===============================================================================");
            System.out.println("BEFORE SORT 10 PAPERS:");
            printMainArray(); 
            insertionSort(); // use InsertionSort
            System.out.println("===============================================================================\n\n");
            System.out.println("AFTER SORT 10 PAPERS:");
            printMainArray();
            System.out.println("===============================================================================\n\n");
            
            // COLLECT 20 PAPERS
            collect20Paper();
            System.out.println("===============================================================================\n\n");
            System.out.println("BEFORE SORT 20 PAPERS:");
            printMainArray();
            insertionSort(); //use InsertionSort
            System.out.println("===============================================================================\n\n");
            System.out.println("AFTER SORT 20 PAPERS:");
            printMainArray();
            System.out.println("===============================================================================\n\n");
            
            // COLLECT 30 PAPERS
            collect30Paper();
            System.out.println("===============================================================================\n\n");
            System.out.println("BEFORE SORT 30 PAPERS:");
            printMainArray();
            insertionSort(); //use InsertionSort
            System.out.println("===============================================================================\n\n");
            System.out.println("AFTER SORT 30 PAPERS:");
            printMainArray();
            System.out.println("===============================================================================\n\n");
            
            // COLLECT 40 PAPERS
            collect40Paper();
            System.out.println("===============================================================================\n\n");
            System.out.println("BEFORE SORT 40 PAPERS:");
            printMainArray();
            insertionSort(); //use InsertionSort
            System.out.println("===============================================================================\n\n");
            System.out.println("AFTER SORT 40 PAPERS:");
            printMainArray();
            System.out.println("===============================================================================\n\n");
            
            //COLLECT 50 PAPERS
            collect50Paper();
            System.out.println("===============================================================================\n\n");
            System.out.println("BEFORE SORT 50 PAPERS:");
            printMainArray();
            insertionSort(); //use InsertionSort
            System.out.println("===============================================================================\n\n");
            System.out.println("AFTER SORT 50 PAPERS:");
            printMainArray();
            System.out.println("===============================================================================\n\n");
        }
        else if (option==3)
        {
            System.out.println("Thank for using our System. Good bye!!!");
        }
    }
    
    
    public static void collect10Paper() // first 10 paper collected
    {   
        //intialise arrayStudent
        numberCollectedPaper=10;
        mainArray[0]= new Student("Beulah", "Coleman","BCIS",1,122999);
        mainArray[1]= new Student("Adeline", "Knott","BCIS",2,122555);
        mainArray[2]= new Student("Bobbie", "Costa","BCIS",3,122777);
        mainArray[3]= new Student("Deborah", "Gray","BCIS",1,122666);
        mainArray[4]= new Student("Dylan", "Benton","BCIS",2,122333);
        mainArray[5]= new Student("Malachi", "Patrick","BCIS",3,122111);
        mainArray[6]= new Student("Jamie", "Dunkley","BCIS",1,122000);
        mainArray[7]= new Student("Amba", "Walter","BCIS",2,122888);
        mainArray[8]= new Student("Cassius", "Derrick","BCIS",3,122444);
        mainArray[9]= new Student("Tadhg", "Liu","BCIS",1,122222);
    }
    
        public static void collect20Paper() // next 10 paper = total 20 papers collected
    {
        numberCollectedPaper=20;
        mainArray[10]= new Student("Arjan", "Gibson","BCIS",1,123999);
        mainArray[11]= new Student("Brook", "Prince","BCIS",2,123555);
        mainArray[12]= new Student("Sofija", "Valenzuela","BCIS",3,123777);
        mainArray[13]= new Student("Humza", "Burris","BCIS",1,123666);
        mainArray[14]= new Student("Melvin", "Fisher","BCIS",2,123333);
        mainArray[15]= new Student("Kiri", "Hopper","BCIS",3,123111);
        mainArray[16]= new Student("Saskia", "Parrish","BCIS",1,123000);
        mainArray[17]= new Student("Patrick", "Romero","BCIS",2,123888);
        mainArray[18]= new Student("Brenden", "Cruz","BCIS",3,123444);
        mainArray[19]= new Student("Reece", "Ford","BCIS",1,123222);
    }
        
        public static void collect30Paper() // next 10 paper = total 30 papers collected
    {     
        numberCollectedPaper=30;
        mainArray[20]= new Student("Kynan", "Lord","BCIS",1,124999);
        mainArray[21]= new Student("Shelley", "Bloggs","BCIS",2,124555);
        mainArray[22]= new Student("Tai", "Young","BCIS",3,124777);
        mainArray[23]= new Student("Melinda", "Richards","BCIS",1,124666);
        mainArray[24]= new Student("Zaynah", "Shepherd","BCIS",2,124333);
        mainArray[25]= new Student("Janae", "Richmond","BCIS",3,124111);
        mainArray[26]= new Student("Kaylum", "Alexander","BCIS",1,124000);
        mainArray[27]= new Student("Yvonne", "Pickett","BCIS",2,124888);
        mainArray[28]= new Student("Kendal", "Salinas","BCIS",3,124444);
        mainArray[29]= new Student("Tehya", "Nielsen","BCIS",1,124222);        
    }
        
        public static void collect40Paper()  // next 10 paper = total 40 papers collected
    {   
        //intialise arrayStudent
        numberCollectedPaper=40;
        mainArray[30]= new Student("Annabelle", "Gibbons","BCIS",1,125999);
        mainArray[31]= new Student("Kezia","Lindsay","BCIS",2,125555);
        mainArray[32]= new Student("Javan", "Barnes","BCIS",3,125777);
        mainArray[33]= new Student("Amelia", "Robin","BCIS",1,125666);
        mainArray[34]= new Student("Tamia", "Estrada","BCIS",2,125333);
        mainArray[35]= new Student("Soren", "Underwood","BCIS",3,125111);
        mainArray[36]= new Student("Evie", "Mccarthy","BCIS",1,125000);
        mainArray[37]= new Student("Karim", "Smith","BCIS",2,125888);
        mainArray[38]= new Student("Jaeden", "Bowman","BCIS",3,125444);
        mainArray[39]= new Student("Samirah", "Nunez","BCIS",1,125222);
                
    }
        
    public static void collect50Paper()  // next 10 paper = total 40 papers collected
    {   
        //intialise arrayStudent
        numberCollectedPaper=50;        
        mainArray[40]= new Student("Johan", "Walls","BCIS",1,126999);
        mainArray[41]= new Student("Arthur", "Schwartz","BCIS",2,126555);
        mainArray[42]= new Student("Sullivan", "Devlin","BCIS",3,126777);
        mainArray[43]= new Student("Dilara", "Hooper","BCIS",1,126666);
        mainArray[44]= new Student("Reanna", "Velasquez","BCIS",2,126333);
        mainArray[45]= new Student("Parris", "Mcgowan","BCIS",3,126111);
        mainArray[46]= new Student("Charlton", "Parsons","BCIS",1,126000);
        mainArray[47]= new Student("Waleed", "Delgado","BCIS",2,126888);
        mainArray[48]= new Student("Antonio", "Sims","BCIS",3,126444);
        mainArray[49]= new Student("Charli", "Vo","BCIS",1,126222);
    }
    
    public static void initialiseAuxilaryArray() // initlaise auxi array for merge Sort
    {
        for(int i=0;i<studentNumber;i++)
        {
            numberCollectedPaper++;
            auxilaryArray[i]=new Student("unknown","unknown","unknown",-1,-1);
        }
    }
    
    public static void printMainArray()
    {
        int counter=0;
        for(int i=0;i<numberCollectedPaper;i++)
        {
            counter++;
            System.out.println(counter+": "+mainArray[i]);
        }
    }
    public static void insertionSort()
    {
       for(int i=1;i<numberCollectedPaper;i++)
       {
           int j=i;
           Student pickStudent = new Student(mainArray[i].firstName,mainArray[i].surName,mainArray[i].program,mainArray[i].uniYear,mainArray[i].studentID);
           while((j>0)&&(pickStudent.studentID<mainArray[j-1].studentID))
           {
               Student.swapStudent(mainArray[j],mainArray[j-1]);
               j--;
           }
           Student.swapStudent(mainArray[j], pickStudent);
       }
    }
    
    public static void mergeSort(Student[] mainArray,Student[]tempArray, int low, int high)
    {
        int middle= (high+low)/2;
        if (high-low<=0)
        {
            return;
        }
        else
        {
            mergeSort( mainArray,tempArray,low, middle);
            mergeSort(mainArray,tempArray,middle+1,high);
            merge(mainArray,tempArray,low, middle, high);
        }
    }
    
    public static void merge(Student[] mainArray,Student[]tempArray,int low, int middle, int high)
    {
        //copy from main array to tempArray
        for(int i=low;i<=high;i++)
        {
            Student.swapStudent(tempArray[i],mainArray[i]);
        }
        
        //sort and put back to mainArray
        int mainArrayIndex= low;// use this index to check position of main array 
        int lowTempIndex=low; // use this index to check position of low array (or temparray in the left)
        int highTempIndex=middle+1; // use this index to check position of high array (or temparray in the right)
        while((lowTempIndex<=middle)&&(highTempIndex<=high))
        {
            if (tempArray[lowTempIndex].studentID<=tempArray[highTempIndex].studentID)
            {
                Student.swapStudent(mainArray[mainArrayIndex ],tempArray[lowTempIndex]);
                lowTempIndex++;
            }
            else
            {
                Student.swapStudent(mainArray[mainArrayIndex ],tempArray[highTempIndex]);
                highTempIndex++;
            }
            mainArrayIndex++;
        }
        
        if(highTempIndex>high) // if highindex array dont have any element left
        {
            for(int i=lowTempIndex;i<=middle;i++) // copy all element from low indexarray to main array
            {
                Student.swapStudent(mainArray[mainArrayIndex ],tempArray[i]);   
                mainArrayIndex++;
            }
        }
        else if (lowTempIndex>middle)// if lowindex array dont have any element left
        {
            for(int i=highTempIndex;i<=high;i++) // copy all element from high indexarray to main array
            {
                Student.swapStudent(mainArray[mainArrayIndex ],tempArray[i]);
                mainArrayIndex++;
            }
        }
    }
}
