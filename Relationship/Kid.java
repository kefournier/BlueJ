
/**
 * Testing Unit 3 Exam FRQ: Kid 
 *
 * @author Mrs. Fournier
 * @version November 30, 2020
 */
public class Kid
{
    // instance variables - replace the example below with your own
    private String parent;

    /**
     * Constructor for objects of class Kid
     */
    public Kid(String kidParent)
    {
        
        parent = kidParent;
    }

    public String getParent()
    {
        // put your code here
        return parent;
    }
    
    public static void determineRelationship(Kid one, Kid two){
        if(one == two){
            System.out.println("Same kid");
        }
        if(one.getParent().equals(two.getParent())){
            System.out.println("Same parent");
        }
        else{
            System.out.println("Unrelated");
        }
}
}
