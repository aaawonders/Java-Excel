import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame{


    Frame() {
        String Title = "Home";
        Color Roxo = new Color(72, 50, 168);

        JLabel l = new JLabel();
        JFrame f = new JFrame();
        JPanel p = new JPanel();
        JButton Button = new JButton();
        Button.setBounds(200,100,100,50);
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle(Title);
        f.setResizable(false);
        f.getContentPane().setBackground(new Color(72, 50, 168));



        f.setVisible(true);
    }

    public void AddEvent(ActionEvent e ){
        if (e.getSource() == Button){
            System.out.println("Apertou");
        }
    }
}
