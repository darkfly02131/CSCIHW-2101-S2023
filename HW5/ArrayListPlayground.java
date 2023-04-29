package HW5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListPlayground {
    public static void main(String[] args) {
    //Q: buddy c, what's the syntax for declaring an ArrayList?
    //A: ArrayList<type> name = new ArrayList<type>();
    //Q: buddy c, what's the syntax for adding an element to an ArrayList?
    //Q: How would I declare an arraylist nums of 15 elements of type int?
    //A: ArrayList<Integer> nums = new ArrayList<Integer>();
    //Q: how do I add an element to an ArrayList?
    //A: nums.add(5);
    //Q: how would I set the value of the 5th element to 99?
    //A:
    // Question 1
    // Write Java statements that do the following:
    // a) Declare an arrayList nums of 15 elements of type int.
    // b) Output the value of the tenth element of the array nums.
    // c) Set the value of the 5th element of the array nums to 99.
    // d) set the value of the 13th element to 15
    // d) set the value of the 2nd element to 6
    // d) Set the value of the 9th element of the array nums to the sum of the 13th and 2nd elements of the array nums.
    ArrayList<Integer> nums = new ArrayList<Integer>();
    for (int i = 0; i < 15; i++) {
        nums.add(i);
//Q: how do I sort an ArrayList?
//A:

    }
    nums.set(4, 99);
    nums.set(12, 15);
    nums.set(1, 6);
    nums.set(8, nums.get(12) + nums.get(1));
    System.out.println(nums);
    
    //Q:buddy c, why am I getting a index out of bounds exception?
    //Q: how do i set a value at a specific index?
    //A:
    //A:

    


         
    // Question 2
    // a) create an arrayList of Strings that contain each day of the week.(starting on monday)
    // b) output each of the days of the week
    // c) output the days of the week that we have class 
    // d) change the arrayList to start on Sunday
    ArrayList<String> days = new ArrayList<String>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
    System.out.println(days);
    System.out.println(days.get(0));
    days.set(0, "Sunday");
    System.out.println(days);
    }
//Q: buddy c, what are the commands available for arraylists?
//A: .add(), .get(), .set(), .remove(), .size(), .clear(), .contains(), .indexOf(), .isEmpty(), .lastIndexOf(), .toArray(), .toString(), .sort(), .subList(), .trimToSize()

// Question 3 
    // a) create an ArrayList and prompt the user for numbers to add to it until the number 0 is selected
    // b) return the largest and smallest number
    // c) return the ArrayList sorted smallest to largest
    // d) take that ArrayList see if its size is divisable by 3 and then output the ArrayList in a matrix format
    // NOTE: make the matrix n X 3 so it can be n rows by 3 columns 
    // EX. ArrayList [1,2,3,4,5,6,7,8,9]
    // 1 2 3
    // 4 5 6
    // 7 8 9
    // NOTE: If the ArrayList is NOT divisable by 3 ask the user for more numbers and add them until it is
    // ArrayList Size: 7
    // Please enter 2 more numbers to create the matrix...
    // 
    // Hint 1: use collections sort to sort the numbers 
    // Hint 2: you can see if the size of the array list is divisible by 3 by running:
    //  numbers.size()%3==0
    // Hint 3: You can use this logic to print the array list in a 3x3 pattern once its created:
    // for(int i=0;i<numbers.size();i++)
    //     {
    //         System.out.print(numbers.get(i)+" ");
    //         if((i+1)%3==0)
    //         {
    //             System.out.println();
    //         }
    //     }
        
   

}





   

