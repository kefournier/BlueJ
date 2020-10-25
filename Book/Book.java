
/**
 * Unit 2 Project: Books, Books, Books
 *
 * @author Kirsten Fournier
 * @version October 19, 2020
 */
public class Book
{
    //these are my instance variables
    private String title;
    private String author;
    private String genre;
    private int pages;
    
    //constructor to intialize instance variables
    public Book(String bookTitle, String bookAuthor, int bookPages){
        title = bookTitle;
        author = bookAuthor;
        pages = bookPages;
    }
    
    //overloaded constructor to initialize instance variables
    public Book(String bookTitle, String bookAuthor, int bookPages, String bookGenre){
        title = bookTitle;
        author = bookAuthor;
        pages = bookPages;
        genre = bookGenre;
    }
    
    //method to randomize rating for each book object
    public int addRatings(int min, int max){
        
        int range = (max - min) + 1;
        int rating = (int)(Math.random() * range) + min;
        return rating;
    }
    
    //main method
    public static void main(String[] args){
        
        //creating book objects with call to the first constructor
        Book firstBook = new Book("Little Women", "Louisa May Alcott", 750);
        Book secondBook = new Book("Catcher in the Rye", "J.D. Salinger", 277);
        
        //Creating two more book objects with call to the overloaded constructor
        Book thirdBook = new Book("To Kill a Mockingbird", "Harper Lee", 281, "Southern Gothic");
        Book fourthBook = new Book("1984", "George Orwell", 328, "Dystopian Literature"); 
        
        //printing out the attributes of each book object
        System.out.println("My first book is " + firstBook.title + " by " + firstBook.author + " and is " + firstBook.pages + " pages long.");
        System.out.println();
        
        System.out.println("My second book is " + secondBook.title + " by " + secondBook.author + " and is " + secondBook.pages + " pages long.");
        System.out.println();
        
        System.out.println("My third book is " + thirdBook.title + " by " + thirdBook.author + " and is " + thirdBook.pages + " pages long and of the " + thirdBook.genre + " genre.");
        System.out.println();
        
        System.out.println("My fourth book is " + fourthBook.title + " by " + fourthBook.author + " and is " + fourthBook.pages + " pages long and of the " + fourthBook.genre + " genre.");
        System.out.println();
        
        //creating variable to hold three different randomized ratings of book
        //calling my addRatings method to generate the random rating
        int firstBookRating1 = firstBook.addRatings(0, 5);
        int firstBookRating2 = firstBook.addRatings(0, 5);
        int firstBookRating3 = firstBook.addRatings(0, 5);
        
        //printing out each rating for the book
        System.out.println("The first rating for " + firstBook.title + " is " + firstBookRating1 + " stars.");
        System.out.println("The second rating for " + firstBook.title + " is " + firstBookRating2 + " stars.");
        System.out.println("The third rating for " + firstBook.title + " is " + firstBookRating3 + " stars.");
        
        //finding the average of the three ratings
        //note the use of typecasting to avoid integer division
        double avgFirstBookRating = (double)(firstBookRating1 + firstBookRating2 + firstBookRating3)/3;
        System.out.println();
        
        //using printf to format the printing of the average rating
        System.out.printf("The average rating for %s is %.2f.\n", firstBook.title, avgFirstBookRating);
        
        System.out.println();
        
        int secondBookRating1 = secondBook.addRatings(0, 5);
        int secondBookRating2 = secondBook.addRatings(0, 5);
        int secondBookRating3 = secondBook.addRatings(0, 5);

        System.out.println("The first rating for " + secondBook.title + " is " + secondBookRating1 + " stars.");
        System.out.println("The second rating for " + secondBook.title + " is " + secondBookRating2 + " stars.");
        System.out.println("The third rating for " + secondBook.title + " is " + secondBookRating3 + " stars.");

        double avgSecondBookRating = (double)(secondBookRating1 + secondBookRating2 + secondBookRating3)/3;
        System.out.println();
        System.out.printf("The average rating for %s is %.2f.\n", secondBook.title, avgSecondBookRating);
        
        System.out.println();
        
        int thirdBookRating1 = thirdBook.addRatings(0, 5);
        int thirdBookRating2 = thirdBook.addRatings(0, 5);
        int thirdBookRating3 = thirdBook.addRatings(0, 5);
        

        System.out.println("The first rating for " + thirdBook.title + " is " + thirdBookRating1 + " stars.");
        System.out.println("The second rating for " + thirdBook.title + " is " + thirdBookRating2 + " stars.");
        System.out.println("The third rating for " + thirdBook.title + " is " + thirdBookRating3 + " stars.");
        
        double avgThirdBookRating = (double)(thirdBookRating1 + thirdBookRating2 + thirdBookRating3)/3;
        System.out.println();
        System.out.printf("The average rating for %s is %.2f.\n", thirdBook.title, avgThirdBookRating);
        
        
        System.out.println();
        
        int fourthBookRating1 = fourthBook.addRatings(0, 5);
        int fourthBookRating2 = fourthBook.addRatings(0, 5);
        int fourthBookRating3 = fourthBook.addRatings(0, 5);
        

        System.out.println("The first rating for " + fourthBook.title + " is " + fourthBookRating1 + " stars.");
        System.out.println("The second rating for " + fourthBook.title + " is " + fourthBookRating2 + " stars.");
        System.out.println("The third rating for " + fourthBook.title + " is " + fourthBookRating3 + " stars.");
        
        double avgFourthBookRating = (double)(fourthBookRating1 + fourthBookRating2 + fourthBookRating3)/3;
        System.out.println();
        System.out.printf("The average rating for %s is %.2f.\n", fourthBook.title, avgFourthBookRating);
        
        System.out.println();
        
        //using dot notation to get at the pages for each book
        //and add them all together
        int totalPagesAllBooks = firstBook.pages + secondBook.pages + thirdBook.pages + fourthBook.pages;
        
        System.out.println("The total pages of all the books combined is " + totalPagesAllBooks + ".");
        
        System.out.println();
        //using the length method of the String class to 
        //add up all the characters of each book title
        int numCharactersAllTitles = firstBook.title.length() + secondBook.title.length() + thirdBook.title.length() + fourthBook.title.length();
        System.out.println("The number of characters in all the titles combined is " + numCharactersAllTitles + ".");
    
        System.out.println();
        //using dot notation and substring method to extract
        //first letter of each author's name and concatenate 
        //them together
        System.out.println("The first letters of each author's name concatenated together are " + firstBook.author.substring(0,1) + secondBook.author.substring(0,1) + thirdBook.author.substring(0,1) + fourthBook.author.substring(0,1) + ".");
        
        System.out.println();
        //using dot notation and substring method to extract
        //last letter of each title and concatenate 
        //them together. Remember length()-1 gets you last
        //character in the string 
        System.out.println("The last letters of each book title concatenated together are " + firstBook.title.substring((firstBook.title.length()) - 1) + secondBook.title.substring((secondBook.title.length()) - 1) + thirdBook.title.substring((thirdBook.title.length()) - 1) + fourthBook.title.substring((fourthBook.title.length()) - 1) + ".");
        
    }
}
