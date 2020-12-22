
/**
 * JavaTextbook program
 *
 * @author Mrs. Fournier
 * @version December 21, 2020
 */

//This needs to be debugged
public class JavaTextbook
{
    public static int monthsStudy(){
        double score = 1;
        int months = 0;
        int proficientScore = 95;
        
        while (score < proficientScore){
            score = score * 1.10;
            months++;
        }
    return months;
    }

    public static void main(String[] args){
        System.out.println(monthsStudy());
    }
}
