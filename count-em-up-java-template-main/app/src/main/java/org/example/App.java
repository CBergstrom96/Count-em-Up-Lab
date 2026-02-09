package org.example;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    System.out.println("Please use the digits 1 through 8 to interact with the counter app.\n1 = tens\n2 = ones\n3 = tenths\n4 = hundredths");
    System.out.println("5 = Show running total\n6 = Show number of overflows\n7 = Clear counter\n8 = Exit app");

    GroceryCounter groceryCounter = new GroceryCounter();
    Scanner in = new Scanner(System.in);
    boolean appOn = true;


    while(appOn) {

        if(in.hasNextInt()) {

            int userInput = in.nextInt();

            switch(userInput) {
                case 1:
                    groceryCounter.tens();
                    break;  
            
                case 2:
                    groceryCounter.ones();
                    break;

                case 3:
                    groceryCounter.tenths();
                    break;

                case 4:
                    groceryCounter.hundredths();
                    break;
                
                case 5:
                    groceryCounter.total();
                    break;

                case 6:
                    groceryCounter.overflows();
                    break;

                case 7:
                    groceryCounter.clear();
                    break;

                case 8:
                    appOn = false;
                    in.next();
                    break;
                }
            }
        
        else {
            System.out.println("Invalid Input.");
            in.next();
        }
    
    }
}
}
