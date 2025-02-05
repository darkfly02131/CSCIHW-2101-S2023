package HW4;

import java.util.Scanner;

public class Arrays {

    // CONVERT THE SUMS METHOD FROM HW3 TO ADD EACH VALUE TO AN ARRAY AND THEN OUTPUT THE 
    // ARRAY AND THE TOTAL.
    // SEE HW3 FOR SUMS METHOD
    // If you want to use an ArrayList for the inputs to be dynamic that is okay
    // Otherwise if you are using a regular array, assume the size is 10 total. 
    // EXAMPLE 
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
    // Number: 0
    // Total: 22
    // Array: {12,2,3,4,1,0}
    // public static void sums(){
    //     System.out.println("I will add up the numbers you give me....");
    //     System.out.println("Number: ");
    //     Scanner input = new Scanner(System.in);
    //     long num = input.nextInt();
    //     long total = 0;
    //     while (num != 0) {
    //         total += num;
    //         System.out.println("The total so far is " + total + ".");
    //         System.out.println("Number: ");
    //         num = input.nextLong();
    //     }
    //     System.out.println("TOTAL ENDED --- The total is " + total + ". \n");
    public static void Arraysums(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("I will add up the numbers you give me....");
        int total = 0;
        int[] sum = new int[10];
        for (int i = 0; i < sum.length; i++) {
            System.out.println("Number: ");
            sum[i] = scanner.nextInt();
            total += sum[i];
            
            System.out.println("The total so far is " + total + ".");
            if (sum[i] == 0) {
                break;
            }
            
        }
        
        System.out.println("TOTAL ENDED --- The total is " + total + ". \n");





    }

    // Create a method that will brute force a password EX.
    // bruteForce("ZZZZ")
    // The program should then guess each char of the string and compare it to see if it is equal
    // to the index of the alphabet char array below
    // Output Example:
    // Z
    // ZZ
    // ZZZ
    // ZZZZ

    // Hint 1: using a char array for the password is helpful here 
    // Hint 2: using the method .toCharArray is a way to convert the password parameter to a char array as well
    // From there creating for and while loops to compare the values is trivial

    public static String bruteForce(String password){
        String answer = "";
        char[] alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
        '!', '@', '#', '$', '%', '^', '&', '*', '(', ')','<','>','/','?'};
    
        char[] passwordArray = password.toCharArray();
        
        for (int i = 0; i < passwordArray.length; i++) {
            for (char c: alphabet) {
                if (c == passwordArray[i]) {
                   answer += c;
                   System.out.println(answer);
                  
                   }
                }
            }return answer;


    }
    //Q:Buddy c, how would I make it so that it compares the password in the for loop
    //Q: what would that look like buddy c?
    //Q: How do I make it s
    // for (int i = 0; i < passwordArray.length; i++) {

            
         //stopping here for today. I will continue tomorrow.
        
        
        
        //Q: Oh, Buddy C, how do I fix these errors great one>
        //q: syntax error on return
        //Q: It doesn't like the return statement
        //q:
//Q: buddy c, how do I make it so that it prints out the whole password instead of everything except the first letter?
//A: You need to use a nested for loop. The outer loop will iterate through the password array and the inner loop will iterate through the alphabet array. You can then compare the values of the password array to the alphabet array and print out the values that match. You can also use the .equals method to compare the values of the password array to the alphabet array.
//Q: can you show me?
//A: Sure, I'll post it in the chat.
//Q: thanks!
//=
    // Create a method that will sort an Array of integers from smallest to greatest.
    // NOTE: You CANNOT use the built in Arrays.sort method
    // Ex. 
    // sorter([9,10,2,5,3,4,7,8]) -> [2,3,4,5,7,8,9,10]

    // Hint 1: a temp Array is a helpful way to store variables for comparing 
    // Hint 2: 2 nested For loops should be all thats needed for the swapping logic


//   s
//   S
//   S
    public static int[] sorter(int[] nums){
            int n = nums.length;
            int[] sortedArray = new int[n];
            // Copy the original array into the sortedArray
            for (int i = 0; i < n; i++) {
                sortedArray[i] = nums[i];
            }
            // Perform bubble sort to sort the sortedArray
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (sortedArray[j] > sortedArray[j + 1]) {
                        // Swap elements
                        int temp = sortedArray[j];
                        sortedArray[j] = sortedArray[j + 1];
                        sortedArray[j + 1] = temp;
                    }
                }

            }
            // Return the sorted result
            for (int i = 0; i < sortedArray.length; i++) {
                System.out.print(sortedArray[i]+ ",");
                
            }
            return sortedArray;

        }


    public static void main(String[] args) {
        // Tester main method for your methods
        System.out.println("=======================================");
        Arraysums();
        System.out.println("=======================================");
        sorter(new int[]{9,10,2,5,3,4,7,8});
        System.out.println("\n=======================================");
        bruteForce("ZZZZ");
        System.out.println("=======================================");


    }   

    
}