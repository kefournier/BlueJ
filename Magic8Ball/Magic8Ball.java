/**
 * Magic8Ball program to practice with Math.random.
 *
 * @author Mrs. Fournier
 * @version November 3, 2020
 */
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Magic8Ball
{

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();//creates the new frame object
        ImageIcon icon = new ImageIcon("magic8.png");//creates the image object
        frame.add(new JLabel(icon));//creates the label to put the picture on
        frame.pack();//sets the image to its preferred dimensions
        //make the frame appear on the screen
        //if you don't set setVisible to true the frame object
        //will exist as an object in memory and the picture
        //won't actually appear on the screen
        frame.setVisible(true);

        Scanner question = new Scanner(System.in);
        System.out.println("Welcome to the Magic 8 Ball!");
        System.out.println("What would you like to ask the Magic 8 Ball today?");
        System.out.println("I can only understand yes/no questions.");
        System.out.println(" ");
        System.out.println("Please proceed with your question: ");
        String magicQuestion = question.nextLine();

        question.close();

        //set a random number from 1 to 8
        int number = (int)(Math.random() * 8) + 1;

        String response1 = "It is certain.";
        String response2 = "It is decidedly so.";
        String response3 = "Without a doubt.";
        String response4 = "Reply hazy, try again.";
        String response5 = "Cannot predict now.";
        String response6 = "Concentrate and try again.";
        String response7 = "Outlook good.";
        String response8 = "Don't count on it.";

        if (number == 1) {
            System.out.println(response1);
        }

        if (number == 2) {
            System.out.println(response2);
        }

        if (number == 3) {
            System.out.println(response3);
        }

        if (number == 4) {
            System.out.println(response4);
        }

        if (number == 5) {
            System.out.println(response5);
        }

        if (number == 6) {
            System.out.println(response6);
        }

        if (number == 7) {
            System.out.println(response7);
        }

        if (number == 8) {
            System.out.println(response8);
        }


    }
}
