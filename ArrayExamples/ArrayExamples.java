
/**
 * Array Example Exercises
 *
 * @author Mrs. Fournier
 * @version January 31, 2021
 */
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



  public static void main(String[] args){
      int [] myNumbers = {27, 13, 14, 9, 7};
      int [] yourNumbers = {31, 30, 4, 1, 17};
      System.out.println(average(myNumbers));
      System.out.println(countAboveAve(myNumbers));
      System.out.println(largest(myNumbers));
      System.out.println(indexOfSmallest(myNumbers));
      
      System.out.println();
      
      System.out.println(average(yourNumbers));
      System.out.println(countAboveAve(yourNumbers));
      System.out.println(largest(yourNumbers));
      System.out.println(indexOfSmallest(yourNumbers));
  }
}
