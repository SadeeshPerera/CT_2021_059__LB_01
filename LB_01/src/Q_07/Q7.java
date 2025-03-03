package Q_07;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q7
{
    public static void main(String[] args)
    {
        JFrame frame=new JFrame();
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        new Timer(1000, e -> frame.setTitle(new SimpleDateFormat(
                "hh:mm:ss a").format(new Date()))).start();
        frame.setVisible(true);


    }
}
