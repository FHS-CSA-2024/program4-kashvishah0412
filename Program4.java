//Youre on your own!
//Jk ask for help if you need it (but also look at previous programs!!)
import java.util.Scanner;
public class Program3{
    public static void main(String[] args) {
        //declare variables
        int numberA = 0;
        int numberB = 0;
        int numberC = 0;
        int numberD = 0;
        double sum = 0;
        double average = 0;
        
        //Scanner  
        Scanner numScanner = new Scanner (System.in);
        
        //User input 
        System.out.println("Enter a 3 digit number for the first value: ");
        numberA = numScanner.nextInt();
        
        System.out.println("Enter a 3 digit number for the second value: ");
        numberB = numScanner.nextInt();
        
        System.out.println("Enter a 3 digit number for the third value: ");
        numberC = numScanner.nextInt();
        
        System.out.println("Enter a 3 digit number for the fourth number: ");
        numberD = numScanner.nextInt(); 
        
        //Calculations
        sum = numberA + numberB + numberC + numberD;
        average = sum / 4; 
        
        //Print
        System.out.println("The sum of the four numbers is " + (int)sum);
        System.out.println("The average of the four numbers is " + average);
        
        
        //
    }
}


//Paste console output below:
/*

Enter a 3 digit number for the first value: 
475
Enter a 3 digit number for the second value: 
821
Enter a 3 digit number for the third value: 
369
Enter a 3 digit number for the fourth number: 
562
The sum of the four numbers is 2227
The average of the four numbers is 556.75
*/
