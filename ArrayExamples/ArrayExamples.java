
/**
 * Array Example Exercises
 *
 * @author Mrs. Fournier
 * @version January 31, 2021
 */

import java.util.Arrays;

public class ArrayExamples
{
    //Write the method average which accepts 
    //an int array and returns the average of 
    //the values 
    public static double average(int[] theNumbers){
        double sum = 0;
        for(int i = 0; i < theNumbers.length; i++){
            sum = sum + theNumbers[i];
        }
        return sum/theNumbers.length;
    }

    //Write the method countAboveAve which accepts 
    //an int array and returns the number of values 
    //that are above the average. You must call the 
    //previous method average. 

    public static int countAboveAve(int[] theNumbers){
        int count = 0;
        for (int i = 0; i < theNumbers.length; i++){
            if(theNumbers[i] > average(theNumbers)){
                count++;
            }
        }
        return count;
    }

    //Write the method largest which accepts 
    //an int array and returns the largest 
    //value of the array. 
    public static int largest(int[] theNumbers){

        int largest = theNumbers[0];

        //starting i at one because need to compare 
        //it with "largest" which is the value at 
        //index 0
        for (int i = 1; i < theNumbers.length; i++) {
            if (theNumbers[i] > largest) {
                largest = theNumbers[i];
            }
        }
        return largest;
    }

    //Write the method indexOfsmallest which 
    //accepts an int array and returns the 
    //index of the smallest value. If there are 
    //multiple smallest values, return the index 
    //of the first one
    public static int indexOfSmallest(int[] theNumbers){
        int smallest = theNumbers[0];
        int index = 0;
        for (int i = 1; i < theNumbers.length; i++) {
            if (theNumbers[i] < smallest) {
                smallest = theNumbers[i];
                index = i;
            }
        }
        return index;
    }

    //method to determine if all numbers in the 
    //array are even
    public static boolean allEven(int[] array){
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 != 0){
                return false;
            }
        }
        return true;
    }

    //method to print each number of the original
    //array twice, and store the values in a new array
    public static int[] stutter(int[] numbers){
        int[] result = new int[2 * numbers.length];
        for(int i = 0; i < numbers.length; i++){
            result[2 * i] = numbers[i];
            result[2 * i + 1] = numbers[i];
        }
        return result;
    }

    //method to reverse an array of numbers and 
    //house those reversed numbers in a new method
    public static int[] reverseNew(int[] theArray){
        int[] newArray = new int[theArray.length];

        for(int i = 0; i < theArray.length; i++){
            newArray[i] = theArray[theArray.length - 1 - i];
        }
        return newArray;
    }

    //method to reverse array values and hold those
    //values in the same array
    public static int[] reverseSame(int[] theArray){

        for(int i = 0; i < theArray.length/2; i++){

            int temp = theArray[i];
            theArray[i] = theArray[theArray.length - 1 - i];
            theArray[theArray.length - 1 - i] = temp;
        }

        return theArray;
    }

    //method to return a digitValue that occurs most
    //frequently in a number
    public static int mostFrequentDigit(int n){
        int[] counts = new int[10];
        while(n > 0){
            int digit = n % 10;
            counts[digit] = counts[digit] + 1;
            n = n / 10;
        }
        int largestIndex = 0;
        for(int i = 0; i < counts.length; i++){
            if(counts[i] > largestIndex){
                largestIndex = i;
            }
        }
        return largestIndex;
    }

    //method to detect at least one odd number
    public static boolean atLeastOneOdd(int[] array){
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 != 0){
                return true;
            }
        }
        return false;
    }

    //method to shift each element in an array
    //one position to the right
    public static int[] shiftRight(int[] array){
        //hold onto last element in array so it
        //doesn't get overwritten during the shift
        int temp = array[array.length - 1];
        for(int i = 1; i < array.length; i++){
            array[array.length - i] = array[array.length - i - 1];
        }
        array[0] = temp;
        return array;
    }

    //method to shift each element in an array
    //one position to the right
    public static int[] shiftLeft(int[] array){
        //hold onto first element in array so it
        //doesn't get overwritten during the shift
        int temp = array[0];
        for(int i = 0; i < array.length - 1; i++){
            array[i] = array[i + 1];
        }
        array[array.length - 1] = temp;
        return array;
    }

    /*
    public static int mode(int[] array){

    //should you accept 101 scores or make this
    //a smaller range? Maybe do 0 - 20 for a point
    //system? Or can you keep it open ended?
    int[] scores = new int[21]   
    }
     */

    public static void main(String[] args){
        int [] myNumbers = {27, 13, 14, 9, 7};
        int [] yourNumbers = {31, 30, 4, 1, 17};
        int [] moreNumbers = {2, 4, 6, 8, 10};
        int [] testNumbers = {11, 34, 5, 17, 56};
        int [] testNumbers2 = {11, 34, 5, 17, 56};

        System.out.println(average(myNumbers));
        System.out.println(countAboveAve(myNumbers));
        System.out.println(largest(myNumbers));
        System.out.println(indexOfSmallest(myNumbers));
        System.out.println(allEven(myNumbers));
        System.out.println();

        int[] stuttered = stutter(myNumbers);
        System.out.println(Arrays.toString(stuttered));
        System.out.println();

        int[] testArray = reverseNew(myNumbers);
        System.out.println(Arrays.toString(testArray));
        System.out.println();

        int[] testArray2 = reverseSame(myNumbers);
        System.out.println(Arrays.toString(testArray2));

        System.out.println();

        System.out.print("At least one odd: ");
        System.out.println(atLeastOneOdd(myNumbers));
        System.out.println();
        System.out.print("At least one odd: ");
        System.out.println(atLeastOneOdd(moreNumbers));
        System.out.println();

        System.out.println(average(yourNumbers));
        System.out.println(countAboveAve(yourNumbers));
        System.out.println(largest(yourNumbers));
        System.out.println(indexOfSmallest(yourNumbers));
        System.out.println(allEven(yourNumbers));

        System.out.println("Most frequently occurring digit: " + mostFrequentDigit(669260267));

        shiftRight(testNumbers);
        System.out.println(Arrays.toString(testNumbers));

        shiftLeft(testNumbers2);
        System.out.println(Arrays.toString(testNumbers2));

        System.out.println();
        //first attempt to reverse array
        //half of array gets overwritten
        int[] arrayNumbers = {11, 42, -5, 27, 0, 89};
        for(int i = 0; i < arrayNumbers.length; i++){
            arrayNumbers[i] = arrayNumbers[arrayNumbers.length - 1 - i];
        }
        System.out.println(Arrays.toString(arrayNumbers));

        System.out.println();
        //second attempt to reverse array, goes too far
        //and un-reverses the array
        int[] arrayNumbers2 = {11, 42, -5, 27, 0, 89};
        for(int i = 0; i < arrayNumbers2.length; i++){
            int temp = arrayNumbers2[i];
            arrayNumbers2[i] = arrayNumbers2[arrayNumbers2.length - 1 - i];
            arrayNumbers2[arrayNumbers2.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arrayNumbers2));

        System.out.println();
        //third attempt to reverse array, this one works
        int[] arrayNumbers3 = {11, 42, -5, 27, 0, 89};
        for(int i = 0; i < arrayNumbers3.length/2; i++){
            int temp = arrayNumbers3[i];
            arrayNumbers3[i] = arrayNumbers3[arrayNumbers3.length - 1 - i];
            arrayNumbers3[arrayNumbers3.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arrayNumbers3));

    }
}
