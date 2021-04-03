
/**
 * MagicSquare Lab
 *
 * @author Mrs. Fournier
 * @version March 30, 2021
 */
public class MagicSquare
{
    //private instance variables 
    private int[][] square;
    private int n; //rows of square
    
    public MagicSquare(int[][] squareArray){
        //intializing the 2D array instance variable
        square = squareArray; 
        //initializing n with the size of the square 2D array
        n = square.length;
    }
    
    //returns the row sum of row indicated by parameter row
    public int rowSum(int row){
        int sum = 0;
        for(int i = 0; i < n; i++){
                //summing up each index of the given row
                sum = sum + square[row][i];
            }
            return sum;
    }
    
    //returns the column sum of column indicated by parameter column
    public int colSum(int col){
        int sum = 0;
        for(int i = 0; i < square[0].length; i++){
            //summing up each index of the given column
            sum = sum + square[i][col];
        }
        return sum;
    }
        
    public boolean diagSums(int sum){
        int majorSum = 0;
        int minorSum = 0;
        
        for(int i = 0; i < n; i++){
            //same row, same column will grab values on diagonal
            //from top left to bottom right
            majorSum += square[i][i];
            //subtracting i from last element of row will get values
            //on diagonal from top right to bottom left
            minorSum += square[i][n-1-i];
        }
        if(majorSum == sum && minorSum == sum){
            return true;
        }
        return false;
    }
    
    public boolean exactlyOnce(){
        int [] tally = new int[n*n];
        int i = 0;
        int j = 1;
        
        while(i < square[0].length){
            if (square[i] == square[j+1]){
                tally[i]++;
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
    /*
    public boolean exactlyOnce(){
        int count = 0;
        //int [] tally = new tally[n];
        
        for(int i = 0; i < n; i++){
            
            for(int j = 0; j < n; j++){
                
                //???
                if(square[i][j] == square[i][j+1]){
                    count++;
                    return false;
                }
            }
        }
        return true;
    }
    */
                
                
    
                
}
