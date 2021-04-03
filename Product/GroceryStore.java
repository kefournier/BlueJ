
/**
 * GroceryStore class
 *
 * @author Mrs. Fournier
 * @version March 24, 2021
 */

import java.util.ArrayList;

public class GroceryStore
{
    private Product[] productsStocked;
    
    public GroceryStore(){

        productsStocked = new Product[5];
    }
    
    /*
    public GroceryStore(Product[] p){

        productsStocked = p;
    }
    */
    
    public ArrayList<Integer> getReorderList(int min){
        
        ArrayList<Integer> stock = new ArrayList<Integer>();
        
        for(int  i = 0; i < productsStocked.length; i++){
            if(productsStocked[i].getQuantity() <= min){
                stock.add(i);
            }
        }
        return stock; 
        
    }
       
    
}
