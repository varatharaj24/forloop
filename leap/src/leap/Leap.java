
package leap;

import java.util.Scanner;


public class Leap {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int year;
        System.out.print("enter the year: ");
        year=in.nextInt();
        if((year%4==0)&&(year%400==0)||(year%100!=0))
        {
            System.out.println("leapyear");
        }
        else
        {
            System.out.println("not leapyear");
        }
        
    }
    
}
