
/**
 * APCalendar FRQ
 *
 * @author Mrs. Fournier
 * @version December 16, 2020
 */
public class APCalendar
{
    public static boolean isLeapYear(int year){
        
        if (((year % 4 == 0) && (year % 100!= 0)) || (year % 400 == 0)){
            return true;
        }
        return false;
   }
    public static int numberOfLeapYears(int year1, int year2){
        int leapYear = 0;
        
        for (int i = year1; i <= year2; i++){
            if(isLeapYear(i) == true){
                leapYear++;
            }
            
        }
           return leapYear;     
    }
    
    public static int dayOfWeek(int month, int day, int year){
        int firstDay = firstDayOfYear(year);
        int currentDay = dayOfYear(month, day, year);
        
        //you want to add the first day to the current day
        //because the first day of the year may not have
        //started on day 0 (Sunday)
        //and your range is going to be max + min - 1
        //you mod by 7 because there are 7 days in the week!
        return (currentDay - firstDay) %  7;
    }
    
    public static void main(String[] args){
        
        System.out.println(isLeapYear(2020));
        System.out.println(numberOfLeapYears(1990, 2020));
    }
}

/*
(b) Write the static method dayOfWeek, 
which returns the integer value representing 
the day of the week for the given date (month, day, year), 
where 0 denotes Sunday, 1 denotes Monday, ..., and 6 
denotes Saturday. For example, 2019 began on a Tuesday, 
and January 5 is the fifth day of 2019. As a result, 
January 5, 2019, fell on a Saturday, and the method 
call dayOfWeek(1, 5, 2019) returns 6.

As another example, January 10 is the tenth day of 
2019. As a result, January 10, 2019, fell on a Thursday, 
and the method call dayOfWeek(1, 10, 2019) returns 4.

In order to calculate this value, two helper methods are 
provided for you.

firstDayOfYear(year) returns the integer value representing 
the day of the week for the first day of year, where 0 
denotes Sunday, 1 denotes Monday, ..., and 6 denotes Saturday. For example, since 2019 began on a Tuesday, firstDayOfYear(2019) returns 2.
dayOfYear(month, day, year) returns  n , where month, day, 
and year specify the  nth  day of the year. For the first 
day of the year, January 1 (month = 1, day = 1), the value 
1 is returned. This method accounts for whether year is a 
leap year. For example,
     dayOfYear(3, 1, 2017) returns 60, since 2017 is not a leap year, 
     while

     dayOfYear(3, 1, 2016) returns 61, since 2016 is a leap year.
     
     
Class information for this question:
public class APCalendar
private static boolean isLeapYear(int year)
public static int numberOfLeapYears(int year1, int year2)
private static int firstDayOfYear(int year)
private static int dayOfYear(int month, int day, int year)
public static int dayOfWeek(int month, int day, int year)
*/
//Complete method dayOfWeek below. You must use firstDayOfYear and dayOfYear appropriately to receive full credit.

/** Returns the value representing the day of the week for the given date

*  (month, day, year), where 0 denotes Sunday, 1 denotes Monday, ...,

*  and 6 denotes Saturday.

*  Precondition: The date represented by month, day, year is a valid date.

*/
/*
public static int dayOfWeek(int month, int day, int year)
*/