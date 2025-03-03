package Q_02;
import javax.swing.*;
import java.util.Scanner;

public class Q2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first name:");
        String first=sc.nextLine();
        System.out.println("Enter last name:");
        String last=sc.nextLine();
        //System.out.println(first+" "+last);

        JFrame frame=new JFrame();
        frame.setSize(800,600);
        frame.setTitle(first+""+last);
        frame.setVisible(true);

    }

}
