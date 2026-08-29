import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class UserTypeForm {

    public void open() {
        //Create frame
        JFrame f3 = new JFrame("User Type");
        f3.setSize(600, 400);
        f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f3.getContentPane().setBackground(Color.PINK);
        f3.setLayout(null);

        //Title
        JLabel label6 = new JLabel(" Select user type");
        label6.setBounds(180, 20, 400, 40);
        label6.setFont(new Font("Arial", Font.BOLD, 25));
        f3.add(label6);
    
        //Client button
        JButton ClientButton = new JButton("Client");
        ClientButton.setBounds(100, 150, 150, 40);
        ClientButton.setBackground(Color.WHITE);
        ClientButton.setForeground(Color.BLACK);
        f3.add(ClientButton);

        //Dr. button
        JButton DoctorButton = new JButton("Admin");
        DoctorButton.setBounds(300, 150, 150, 40);
        DoctorButton.setBackground(Color.WHITE);
        DoctorButton.setForeground(Color.BLACK);
        f3.add(DoctorButton);

        //Action client button
        ClientButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FormAppointment a1 = new FormAppointment();
                a1.open();
                f3.dispose();
            }
        });

        //Action dr. button
        DoctorButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                LoginForm a2 = new LoginForm();
                a2.open();
                f3.dispose();
            }
        });
        f3.setVisible(true);
    }
}