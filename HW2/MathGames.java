package HW2;


public class MathGames {
public static void main(String[] args) {
    double grade = 88.0;
char letterGrade = getLetterGrade(grade);
System.out.println("Your grade is a " + letterGrade);
System.out.println(" ");
double a = 3;
double b = 4;
System.out.println("The hypotenuse of a triangle with sides a and b is " + pythagorean(a, b));
System.out.println("The tip per person is " + calculateTipPerPerson(400, 4, 20));
System.out.println(" ");


// q: || = or right?



}
    

    // 1. Create a method that will calculate the Pythagorean Theorem (https://en.wikipedia.org/wiki/Pythagorean_theorem)
    // c = sqrt(a^2+b^2)
    // NOTE: You can assume you will only need to calculate the Hypotenuse
    // Hint 1: Method should take in 2 sides(a and b) of the triangle and return the missing side.
    //      Remember the Triangle has a base, Perpendicular, and Hypotenuse
    // Hint 2: Math.pow and Math.sqrt are your friend here
    // Bonus points: Try to make it accept any 2 sides and return the 3rd. So it can take in
    // Hypotenuse and Perpendicular and return the base.
    // Example 1: pythagorean(3,4) would return 5

// 
// }

public static double pythagorean(double a, double b) {
    double c = 0;
    if (a > 0 && b > 0) {
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    } else if (a > 0 && c > 0) {
        b = Math.sqrt(Math.pow(c, 2) - Math.pow(a, 2));
    } else if (b > 0 && c > 0) {
        a = Math.sqrt(Math.pow(c, 2) - Math.pow(b, 2));
    }
    return a > 0 && b > 0 && c == 0 ? c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)) : c;
}




    
    // Done : 2. Create a method that will calcuate my grade in the class. You can use the grade range as follows
        // A: 100 - 90
        // B:  89 - 80
        // C:  79 - 70
        // D:  69 - 60
        // F:  60 -  0 
        // method should accept the grade as a double and return the letter grade of what I got
        // NOTE: Im a really nice guy and always round up on my grading so a 69.3 will round up to a 70.0
        // Hint 1: if statements required here you will probably need at the least 5 if / ifelse / else statments
        // Hint 2: You will probably need to cast the double to an int
        // Hint 3: You will probably need to use the Math.ceil() method
        // Example: grade(69.3) would return a D

        
            

//q: how do I make it look like this? grade(69.3) would return a D
//q:

    
// public static double grade(double grade) {
//     double grade = 69.3;

//     if ((grade) >= 90 && grade <= 100) {
//    System.out.println("A"); 
//     } else if ((grade) >= 80 && grade <= 89) {
//     System.out.println("B"); 
//     } else if ((grade) >= 70 && grade <= 79) {
//     System.out.println("C");
//     } else if ((grade) >= 60 && grade <= 69) {
//     System.out.println("D");
//     } else {
//     System.out.println("F"); }
//     return grade;
// }
    
public static char getLetterGrade(double grade) {
    int roundedGrade = (int) Math.ceil(grade); // Round up to the nearest whole number
    char letterGrade;

    if (roundedGrade >= 90 && roundedGrade <= 100) {
        letterGrade = 'A';
    } else if (roundedGrade >= 80 && roundedGrade <= 89) {
        letterGrade = 'B';
    } else if (roundedGrade >= 70 && roundedGrade <= 79) {
        letterGrade = 'C';
    } else if (roundedGrade >= 60 && roundedGrade <= 69) {
        letterGrade = 'D';
    } else {
        letterGrade = 'F';
    }

    return letterGrade;


    
}





    
       
    
    


    
    







            



            
        




    





    // 3. Create a method that will calculate the tip on a bill per person
    //      Method parameters: total bill, amount of people splitting the bill, percentage to tip.
    //      Note: I would like the total always rounded up to a whole number
    //      Hint 1: percentage can be made easier to work with if you divide by 100 so 18% is 18/100 = 0.18
    //      Hint 2: Using doubles will be helpful for when you need to calculate decimals
    //      Hint 3: It is possible you might need to Cast a double to an int or vice versa
    //      Hint 4: You will probably need to use the Math.ceil() method
    //      Example: tip(100, 4, 18) would return 5.0

    
 


        


    // You can either create a tester class or put your code here
     







    // 3. Create a method that will calculate the tip on a bill per person
    //      Method parameters: total bill, amount of people splitting the bill, percentage to tip.
    //      Note: I would like the total always rounded up to a whole number
    //      Hint 1: percentage can be made easier to work with if you divide by 100 so 18% is 18/100 = 0.18
    //      Hint 2: Using doubles will be helpful for when you need to calculate decimals
    //      Hint 3: It is possible you might need to Cast a double to an int or vice versa
    //      Hint 4: You will probably need to use the Math.ceil() method
    //      Example: tip(100, 4, 18) would return 5.0

    // public static int tip(double totalBill, int numPeople, double tipPercentage) {
    //     double tipAmount = totalBill * tipPercentage / 100.0;
    //     double totalAmount = totalBill + tipAmount;
    //     int perPersonAmount = (int) Math.ceil(totalAmount / numPeople);
    //     return perPersonAmount;
    public static int calculateTipPerPerson(double billAmount,  int numPeople, double tipPercentage) {
        double tipAmount =  billAmount * tipPercentage / 100.0;
        double tipPerPerson = tipAmount / numPeople;
        return (int) Math.ceil(tipPerPerson);
}
    
}


    // You can either create a tester class or put your code here
        
    

