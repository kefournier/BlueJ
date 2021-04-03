
/**
 * Unit 8 Labs 
 *
 * @author Mrs. Fournier
 * @version March 29, 2021
 */
public class Labs
{
    //Write a method called sum which accepts a 2D array of 
    //integers and returns the sum of all the elements
    public static int sum(int[][] array){
        
        int total = 0;
        
        for(int row = 0; row < array.length; row++){
            
            for(int col = 0; col < array[0].length; col++){
                
                total = total + array[row][col];
            }
        }
        return total;
    }
    
    //Write a method called rowSum that accepts two parameters:
    //a 2D array of integers and an integer row. Return the 
    //sum of the integers of elements in the row given by
    //the parameter row 
    public static int rowSum(int[][] array, int row){
        
        int sum = 0;
        
        for(int i = 0; i < array.length; i++){
            
            for(int j = 0; j < array[0].length; j++){
                if (i == row){
                    sum = sum + array[i][j];
                }
            }
        }
        return sum;
    }
    
    //Write a method colSum that acceptes 2 parameters:
    //a 2D array of integers and an integer col. Return
    //the sum of the integer elements in the column 
    //given by col
    public static int colSum(int[][] array, int col){
        
        int sum = 0;
        
        for(int i = 0; i < array[0].length; i++){
            
            for(int j = 0; j < array.length; j++){
                if (i == col){
                    sum = sum + array[j][i];
                }
            }
        }
        return sum;
    }
    
    
    //Write a method sum2 to sum up all of the 
    //elements in a 2D array, but you must use
    //the previously written method rowSum
    public static int sum2(int[][] array){
      
      int sum = 0;
      
      for(int i = 0; i < array.length; i++){
          sum += rowSum(array, i);
      }    
      return sum;
    } 
            
    //Write a method called largest that accepts a 2D array 
    //of integers and returns the largest value. Use
    //a nested for each loop
    public static int largest(int[][] array){
        
        int largest = array[0][0];
        
        //for each index in the array
        for(int [] indexItem: array){
            
            //for each value in each index
            for(int value: indexItem){
                
                if(largest < value){
                    largest = value;
                }
            }
        }
        return largest;
    }
            
    //Write a method largestByRow which accepts two
    //parameters: a 2D array of integers and an integer row.
    //Return the largest value in the row given by the 
    //paramter row
    public static int largestByRow(int[][] array, int row){
        
        int largest = array[row][0];
        
        for(int col = 0; col < array[row].length; col++){
          
            if(largest < array[row][col])
                largest = array[row][col];
            }
        return largest;
    }
               
    
    //Write a method largest2 which accepts a 2D
    //array of integers and returns the largest
    //value. You must call largestByRow. 
    public static int largest2(int[][] array){
        
        int largestValueRow = largestByRow(array, 0);
        
        for(int i = 0; i < array.length; i++){
            
            if(largestValueRow < largestByRow(array, i)){
                largestValueRow = largestByRow(array, i);
            }
        }
        return largestValueRow;   
        
    }
    
    //Write a method printTranspose that takes a 2D
    //array of integers and prints the transposed array.
    //A transposed array is the array whose rows are the
    //columns of the original array. Do not create a new
    //array, instead, use for loops to traverse the 
    //original array
    public static void printTranspose(int[][] array){
        
      for(int col = 0; col < array[0].length; col++){
          for(int row = 0; row < array.length; row++){
              System.out.print(array[row][col] + " ");
          }
          System.out.println();
      }

  }
  
    
    //Main method
    public static void main(String[] args){
        
        int[][] myArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] myArray2 = {{11, 12, 23}, {14, 5, 76}, {97, 88, 9}};
        
        System.out.println(sum(myArray));
        System.out.println(rowSum(myArray, 0));
        System.out.println(colSum(myArray, 1));
        System.out.println(largest(myArray));
        System.out.println(largest(myArray2));
        System.out.println(largestByRow(myArray2, 1));
        System.out.println(largest2(myArray2));
        
        System.out.println();
        printTranspose(myArray);
    }
    
}
