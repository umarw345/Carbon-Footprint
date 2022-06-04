/**
 * @author umarwaheed
 * CIS 36A, Lab 9
 */ 
import java.util.Scanner;

public class CarbonFootprint {
     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          System.out.println("Welcome to the Carbon Calculator! ");
          
          System.out.println("");
          
          System.out.print("Enter the number of people in your household: ");
          int people = input.nextInt();
         
          System.out.print("Enter the number of miles your household travels by bus per month: ");
          double bus = input.nextDouble();
         
          System.out.print("Enter the number of miles your household travels by electric car per month: ");
          double eCar = input.nextDouble();
         
          System.out.print("Enter the number of miles your household travels by small car (40 mpg) per month: ");
          double sCar = input.nextDouble();
         
          System.out.print("Enter the number of miles your household travels by medium car (21 mpg) per month: ");
          double mCar = input.nextDouble();
         
          System.out.print("Enter the number of miles your household travels by SUV per month: ");
          double suv = input.nextDouble();
         
          System.out.print("Enter the number of miles your household travels by airplane per year: ");
          double airplane = input.nextDouble();
         
          System.out.print("Enter the number the total number of household members traveling by air: ");
          int planeFlyers = input.nextInt();
       
          System.out.print("Enter your monthly kWHof electricity: ");
          double kwh = input.nextDouble();
         
          System.out.print("Enter your monthly total of natural gas in therms: ");
          double gas = input.nextDouble();
         
          System.out.print("Enter the number of people in your household who eat meat: ");
          int meat = input.nextInt();
         
          System.out.print("Enter the number of people in your household who are vegetarian: ");
          int vegetarian = input.nextInt();
         
          System.out.print("Enter the number of people in your household who are vegan: ");
          int vegan = input.nextInt();
      
          System.out.println("");
          System.out.println("");
          System.out.println("Your Household Carbon Emissions Summary");
          System.out.println("");
          System.out.println("");
      
         
         final double TOTALBUS = bus * 12 * 0.64;
         System.out.printf("Emissions from bus travel: %.1f lbs of CO2 per year", TOTALBUS);
         
        
         
         final double TOTALEV = eCar * 12 * 0.35;
         System.out.printf("\nEmissions from travel by electric vehicles: %.1f lbs of CO2 per year", TOTALEV);
            
         
         final double SMALLCAR = sCar * 12 * 0.59;
         System.out.printf("\nEmissions from travel by small vehicle: %.1f lbs of CO2 per year", SMALLCAR);
           
         
         final double MEDCAR = mCar * 12 * 1.1;
         System.out.printf("\nEmissions from travel by medium vehicle: %.1f lbs of CO2 per year", MEDCAR);
         
         
         final double SUVV = 1.57 * 12 * suv;
         System.out.printf("\nEmissions from travel by SUV: %.1f lbs of CO2 per year", SUVV);
         
         
         final double AIRPLANETOTAL =  planeFlyers * airplane * 0.9;
         System.out.printf("\nEmissions from travel by air: %.1f lbs of CO2 per year", AIRPLANETOTAL);
         
         
         final double KWHTOTAL = kwh * 12 * 0.524;
         System.out.printf("\nEmissions from electricity: %.1f lbs of CO2 per year", KWHTOTAL);
         
         
         
         final double GASTOTAL = gas * 12 * 13.446;
         System.out.printf("\nEmissions from natural gas: %.1f lbs of CO2 per year", GASTOTAL);
         
          
         
         final double TOTALHOUSEWASTE = people * 1800;
         System.out.printf("\nEmissions from household waste: %.1f lbs of CO2 per year", TOTALHOUSEWASTE);
         
         
         final double CONSUMERS = (meat * 2800) + (vegetarian * 1500) + (vegan * 1100);
         System.out.printf("\nEmissions from food consumption: %.1f lbs of CO2 per year", CONSUMERS);
         
           
         double annualE = (TOTALBUS + TOTALEV + MEDCAR + SMALLCAR + SUVV +
         AIRPLANETOTAL + KWHTOTAL + GASTOTAL + TOTALHOUSEWASTE
       		  + CONSUMERS);
         final double TONS = annualE/2000;
         System.out.println("");
         System.out.printf("\nTotal annual emissions: %.1f tons", TONS);
         
         
         
      
      
          input.close();
   }
}
