package Q_03;

import java.util.Scanner;

public class Q3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first name");
        String firstname=sc.nextLine();
        System.out.println("Enter middle name");
        String middlename=sc.nextLine();
        System.out.println("Enter last name");
        String lastname=sc.nextLine();


        String initial= middlename.substring(0,1);
        System.out.println(firstname+ " " +initial+ "." +lastname);
    }


}
