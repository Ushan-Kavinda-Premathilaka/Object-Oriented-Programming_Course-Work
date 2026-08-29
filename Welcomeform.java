import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//Welcome Form
class Welcomeform {

    public void open() {
        //Create Frame
        JFrame f2 = new JFrame("Welcome Page");
        f2.setSize(700, 600);
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f2.getContentPane().setBackground(Color.white);
        f2.setLayout(null);

        //Welcome Label
        JLabel label2 = new JLabel("Welcome to the Pet Care Center!!!");
        label2.setBounds(150, 40, 400, 20);
        label2.setFont(new Font("Arial", Font.BOLD, 25));
        f2.add(label2);

        //Continue Button
        JButton ContinueButton = new JButton("Continue");
        ContinueButton.setBounds(200, 200, 250, 40);
        ContinueButton.setBackground(Color.BLACK);
        ContinueButton.setForeground(Color.WHITE);
        f2.add(ContinueButton);

        //Continue action button
        ContinueButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                UserTypeForm u1 = new UserTypeForm();
                u1.open();
                f2.dispose();
            }
        });



    

        f2.setVisible(true);
    }
}