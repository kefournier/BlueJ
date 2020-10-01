public class ChallengeReplace
{
  public static void main(String[] args)
  {
     String message = "I love cats! I have a cat named Coco. My cat's very smart!";
     int index = 0;
     int indexDog = 0;
     int count = 0;
     int fromIndex = 0;
      
     // Write a loop here that replaces every occurrence of "cat"
     // in the message with "dog", using indexOf and substring.
      
      while(message.indexOf("cat") >= 0){
          index = message.indexOf("cat");
          
          String firstpart = message.substring(0,index);
          String lastpart = message.substring(index+3);
          message = firstpart + "dog" + lastpart;
          count++;
      }

     System.out.println(message);
     System.out.println("There were " + count + " replacements.");
      
    
          
        indexDog = message.indexOf("dogs");
          System.out.println(indexDog);
          fromIndex = indexDog + 4;
          System.out.println(fromIndex);
          String firstpartDog = message.substring(0,fromIndex);
          String lastpartDog = message.substring(fromIndex);
          message = firstpartDog + " and cats" + lastpartDog;
     
      
     
        System.out.println(message);
   }
}
