package HW3;
import java.util.Scanner;

public class Loops {

    //NOTE: DO NOT change anything in the boiler plate
    //If I added default code it is meant to be there
    //and should not be adjusted unless otherwise noted
    //(return statments are usually changed)

    //Make a method that will return true if a given 
    //String contains between 1 and 3 'e' chars.
    //Ex.
    //loopE("eat") -> true
    //eeat -> true
    //eeeat -> true
    //eeeeat -> false

    //Q: buddy c, how would I make it so the code returns true if it's between 1 and 3?
    //Q: So if I did a <= 4 && >= 1


    public static boolean loopE(String str){
        for (int i= 0 ; i < str.length(); i++) {
            if ( str.charAt(i) == 'e' && i <= 3 && i >= 1) {
                return true;
            }
         
        }
        return false;
    } 

    //Given a String str and int n return a larger string
    //that is n copies of the original string 
    //Ex.
    //stringTimes("Code",2) ->"CodeCode"
    //stringTimes("Code",4) ->"CodeCodeCodeCode"
    public static String stringTimes(String str, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(str);
        }
        return str;
    } 
    


    //Create a method Given a string, return the string where all of the "z"
    //Have been removed. Except do not remove a z at the start
    //or end
    //Ex.
    //stringZ("zHelloz") -> "zHelloz"
    //stringZ("nozthaznks") -> "nothanks"
    //stringZ("xksiazdjaasldzsajzasdz") -> "xksiadjaasldsajasdz"
    public static String stringZ(String str){
        return null; // <- this should be changed 
    }

    //Create a method that contains a while loop that allows for
    //The user to input numbers until the number 0 is entered. Each time a number is 
    //entered the total will be summed and then prompted for a second number. 
    //NOTE: I require the use of scanner here to get each integer from the user
    //Assume the numbers entered are integers
    //Also note that the method is void meaning you will not need to return anything
    //It will need to sysout the numbers however
    //Below is a sample output what I would like
    // I will add up the numbers you give me....
    // Number: 12
    // The total so far is 12.
    // Number: 2
    // The total so far is 14.
    // Number: 3
    // The total so far is 17.
    // Number: 4
    // The total so far is 21.
    // Number: 1
    // The total so far is 22.
    // Number: 2
    // The total so far is 24.
    // Number: 3
    // The total so far is 27.
    // Number: 0
    // TOTAL ENDED --- The total is 27.
    public static void sums(){
            System.out.println("I will add up the numbers you give me....");
            System.out.println("Number: ");
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();
            int total = 0;
            while (num != 0) {
                total += num;
                System.out.println("The total so far is " + total + ".");
                System.out.println("Number: ");
                num = input.nextInt();
            }
            System.out.println("TOTAL ENDED --- The total is " + total + ".");
        }
    

    public static void main(String[] args) {
        // Add code to help test your methods here
        //sums();
        //System.out.print(stringTimes("Fuck", 2));
        System.out.println(loopE("eeeeat"));


    }   
}

