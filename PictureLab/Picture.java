import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
    /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  ////////////////////// methods you will be writing /////////////////////
  /**Method to traverse the 2D pixel array and
  * switche the RGB values around.
  */
 public void switchColors()
 {
   Pixel[][] pixels = this.getPixels2D();
   int red, green, blue = 0;

   for (Pixel[] rowArray : pixels)
    {
      for (Pixel p: rowArray)
      {
       red = p.getRed();
       green = p.getGreen();
       blue = p.getBlue();
       p.setRed(green);
       p.setGreen(blue);
       p.setBlue(red);
     }
   }
 }

  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {

  }
  
  /** Method to remove all the Red and Green */
  public void keepOnlyBlue()
  {

  }
  
  /** Method to  make all three colors the negative of the 
     original values*/
  public void negate()
  {

  }
 
  
  /** Method to turn the picture into shades of gray. 
    *Set the red, green, and blue values to the average 
    *of the current red, green, and blue values 
    */
   public void grayScale()
   {
       
   }

  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {

  }
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {

  }
  
  /** copy the passed fromPic to the
    * specified startRow and startCol in the
    * current "this" picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    
  }

  /** Method to create a collage of several pictures */
  public void createCollage()
  {

  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    
  }
  

  
} // this } is the end of class Picture, put all new methods before this
