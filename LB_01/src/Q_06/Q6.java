package Q_06;

import javax.swing.*;
import java.util.Scanner;

public class Q6
{
    public static void main(String[] args)
    {
        JFrame frame=new JFrame();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Frame Title:");
        String Title=sc.nextLine();

        System.out.println("Enter Frame Width:");
        int Width = sc.nextInt();

        System.out.println("Enter Frame Height:");
        int Height=sc.nextInt();
        frame.setTitle(Title);
        frame.setSize(Width,Height);
        frame.setVisible(true);
    }
}
