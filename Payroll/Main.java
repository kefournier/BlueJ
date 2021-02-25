
/**
 * Main class for Unit 6 Progress Check FRQs
 *
 * @author Mrs. Fournier
 * @version February 17, 2021
 */
public class Main
{
    public static void main(String[] args){
        
        //testing for each loop FRQ#1
        String[] words = {"ten", "fading", "post", "card", "thunder", "hinge", "trailing", "batting"};
        
        //prints all words that contain "ing"
        for(String item : words){
            if(item.indexOf("ing") != -1){
                System.out.println(item);
            }
        }
        
        System.out.println();
        
        //only prints words ending in "ing"
        for(String otherItem : words){
            if(otherItem.substring(otherItem.length() - 3).equals("ing")){
                System.out.println(otherItem);
            }
        }
        
        System.out.println();
        //testing for part a FRQ#2
        int itemsSold[] = {48, 50, 37, 62, 38, 70, 55, 37, 64, 60};
        //need to create a Payroll object that has the array
        //as an attribute
        Payroll myObject = new Payroll(itemsSold);
        
        System.out.println(myObject.computeBonusThreshold());
        System.out.println();
        myObject.computeWages(10.0, 1.5);
        myObject.printWages();
    }
    
}


