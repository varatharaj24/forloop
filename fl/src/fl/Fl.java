package fl;

import java.util.Scanner;

public class Fl {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num;
        System.out.println("enter the number: ");
        num=in.nextInt();
        System.out.println("|--------|------|");
    for (int i=0;i<=num;i++){
        System.out.println("|  "+i+ " \t | " + (char) i + "\t|");
        
    }
        System.out.println("|--------|------|");
    }
    
}
