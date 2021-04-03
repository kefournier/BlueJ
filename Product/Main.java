
/**
 * Main Class
 *
 * @author Mrs. Fournier
 * @version March 24, 2021
 */
public class Main
{
    public static void main(String[] args){
        
        String groceryItem[] = {"Chicken", "Meat", "Milk", "Cereal", "Eggs"};
   //Student obj = new Student("Krishna", 25, subs);
   //obj.display();
        
        GroceryStore[] obj = new GroceryStore[5];
        //Product [] obj = new Product[5];
        //GroceryStore g1 = new GroceryStore[obj] ;
        //GroceryStore g1 = new GroceryStore[Product];
 
     //create & initialize actual employee objects using constructor
        obj[0] = new Product("Chicken",2);
        obj[1] = new Product("Meat",1);
        obj[2] = new Product("Cereal",1);
        obj[3] = new Product("Milk",1);
        obj[4] = new Product("Fruit",0);
        
        System.out.println(obj.getReorderList(1));
        
        
 
        
        //GroceryStore p1 = new GroceryStore[5];
        
        //GroceryStore g1 = new GroceryStore(p1);
        
        
    }
    
}
