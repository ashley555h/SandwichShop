import static java.lang.System.out;
import java.util.Scanner;

public class SandwichShop
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //define variables
        int goalForVeggies = 50;
        int goalForBurger = 250;
        int goalForSubs = 180;
        int goalForSoup = 70;

        int quantityVeggie;
        int quantityBurger;
        int quantitySubs;
        int quantitySoup;

        
        //use while loop to return code back to the beginning and repeat 
       
        //get input for quantity of each item sold and return if goal was met/not met
        out.println("Checking sales goals.");
        out.println("The sales goal for veggie sandwiches is " + goalForVeggies);
        out.println("How many veggie sandwiches were sold today?");
        quantityVeggie = keyboard.nextInt();
        out.println("");
        
            if (quantityVeggie >= goalForVeggies)
            {
                out.println("Made goal for veggies.");
            }
            else
            {
                out.println("Fell short");
            }

            out.println("The sales goal for burgers is " + goalForBurger);
            out.println("How many burgers were sold today?");
            quantityBurger = keyboard.nextInt();
            out.println("");
            
            if (quantityBurger >= goalForBurger)
            {
                out.println("Made goal for burgers.");
            }
            else
            {
                out.println("Fell short");
            }

            out.println("The sales goal for subs is " + goalForSubs);
            out.println("How many subs were sold today?");
            quantitySubs = keyboard.nextInt();
            out.println("");
            
            if (quantitySubs >= goalForSubs)
            {
                out.println("Made goal for subs.");
            }
            else
            {
                out.println("Fell short");
            }

            out.println("The sales goal for soup is " + goalForSoup);
            out.println("How many soups were sold today?");
            quantitySoup = keyboard.nextInt();
            out.println("");
            
            if (quantitySoup >= goalForSoup)
            {
                out.println("Made goal for soup.");
            }
            else
            {
                out.println("Fell short");
                out.println("");

            }

            if (quantityVeggie >= goalForVeggies && quantityBurger >= goalForBurger && quantitySubs >= goalForSubs && quantitySoup >= goalForSoup)
            {
                out.println("Made goal for everything!");
            }

        }
    }


