package Q_08;

import java.util.Scanner;

public class Q8
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String [] parts = input.split("!");
        System.out.println(parts[0].trim());
        System.out.println(parts[1].trim());
    }

}
