
/**
 * Write a description of class Kevin here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Kevin
{
  private static final double learnRate = 0.10;

  public static int get95Percent()
  {
    int months = 0;
    double total = 0.0;
    while (total < 0.95)
    {
      total += (1 - total) * learnRate;
      months++;
    }
    return months;
  }

  public static void main(String[] args)
  {
    int months = get95Percent();
    int years = months / 12;
    months -= 12 * years;
    if (years > 0)
      System.out.print(years + " years");
    if (years > 0 && months > 0)
      System.out.print(" and ");
    if (months > 0)
      System.out.print(months + " months");
    System.out.println();
  }
}