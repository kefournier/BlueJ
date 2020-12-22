
/**
 * Write a description of class HeadsOrTails here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HeadsOrTails
{
    public static int fourHeads(int n){

        int heads = 1;
        int headsTails;
        int headsCount = 0;

        int fourHeads = 0;

        for (int i = 0; i < n; i++) {
            headsTails = (int) (Math.random() * 2) + 1;

            if (headsTails == heads) { //checking for heads flip
                System.out.println("H");
                headsCount++; //incrementing head count

                    if (headsCount >= 4) { //if head count more than 4

                    System.out.println("Four heads in a row!");
                    fourHeads = 1; //variable indicate 4 cases in a row really exists
                    break; //break out of loop

                }

            } else {
                System.out.println("T");
                headsCount = 0; //reset headsCount to 0 when coin flips a tail
            }
        }

        if(fourHeads != 1) { //if 4 consecutive heads does not exist, print better luck next time
            System.out.println("Better luck next time!\n");
        }

        return 0;
    }


    public static void main(String[] args){

        fourHeads(9);
    }
} 
