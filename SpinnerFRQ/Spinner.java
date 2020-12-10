
/**
 * Practice FRQ for Unit 3: Spinner
 *
 * @author Mrs. Fournier
 * @version November 11, 2020
 */
public class Spinner
{
   //Part A 
   public int spin(int min, int max){
       int result = (int)(Math.random() * (max - min + 1)) + min;
       return result;
    }
    
    //Part B
    public void playRound(){
        int playerSpin = spin(1, 10);
        int computerSpin = spin(2, 8);
        
        int difference = playerSpin - computerSpin;
        
        if(difference == 0){
            int player2Spin = spin(1, 10);
            int computer2Spin = spin(2, 8);
            
            int difference2 = player2Spin - computer2Spin;
            
            if(difference2 == 0){
                System.out.println("It's a tie!");
            }
                else if((playerSpin + player2Spin) > (computerSpin + computer2Spin)){
                    System.out.println("You win 1 point!");
                }
                else{
                    System.out.println("You lose 1 point.");
                }
            }
            
        else if (difference > 0){
           System.out.println("You win " + difference + " points.");
           }
           
        else{
           System.out.println("You lose " + difference + " points.");
           }
        }
       
        
        public static void main(String[] args){
            
            /** created an instance of the class using 
            * the Java default constructor, so I would
            * be able to test the non-static playRound 
            * method inside the main method. Otherwise,
            * I would have gotten a compiler error that 
            * I "can't call a non-static method from within
            * a static method" - this was a live and learn
            * moment for me!
            */
            Spinner myTest = new Spinner();
            myTest.playRound(); //test my method
            myTest.playRound(); //test again
            myTest.playRound(); //test again
            myTest.playRound(); //test again
            myTest.playRound(); //test again
            
            /**Note: When you run this code in BlueJ
            /*you will also be given the option to create
            /*a new Spinner object (or instance of the
            /*class) to test your code - something I
            /*just noticed myself
            */
        }
}
