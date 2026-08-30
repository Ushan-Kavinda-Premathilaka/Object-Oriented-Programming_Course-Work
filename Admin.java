import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class LoginForm {

    public void open() {

        JFrame f4 = new JFrame("Login Form");

        f4.setSize(800, 600);
        f4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f4.getContentPane().setBackground(Color.GRAY);
        f4.setLayout(null);


        JLabel label4 = new JLabel("Welcome to the Admin!!!");

        label4.setBounds(180, 20, 400, 40);
        label4.setFont(new Font("Arial", Font.BOLD, 25));

        f4.add(label4);


        JLabel Adminlabel = new JLabel("Admin :");

        Adminlabel.setBounds(50, 80, 150, 30);

        f4.add(Adminlabel);


        JTextField Adminfield = new JTextField();

        Adminfield.setBounds(200, 80, 250, 30);

        f4.add(Adminfield);


        JLabel PasswordLabel = new JLabel("Password :");

        PasswordLabel.setBounds(50, 140, 150, 30);

        f4.add(PasswordLabel);


        JPasswordField PasswordField = new JPasswordField();

        PasswordField.setBounds(200, 140, 250, 30);

        f4.add(PasswordField);


        JButton LoginButton = new JButton("Login");

        LoginButton.setBounds(200, 200, 250, 40);

        LoginButton.setBackground(Color.BLUE);
        LoginButton.setForeground(Color.BLACK);

        f4.add(LoginButton);
        
        JButton BackButton = new JButton("Back");

        BackButton.setBounds(400, 325, 250, 30);

        BackButton.setBackground(Color.RED);
        BackButton.setForeground(Color.BLACK);

        f4.add(BackButton);

        LoginButton.addActionListener(new ActionListener() {

       public void actionPerformed(ActionEvent e) {

        String admin = Adminfield.getText();

        String password = new String(PasswordField.getPassword());


        verify l1 = new verify(admin, password);


        if (l1.validate()) {

            JOptionPane.showMessageDialog(f4,"Login Successful!!");


            // Open Admin Database
            Database a5 = new Database();

            a5.open();


            // Close Login window
            f4.dispose();

        } else {

            JOptionPane.showMessageDialog(f4,"Login Failed!!" );
       
        }
    }
});
          BackButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                 UserTypeForm a3 = new  UserTypeForm();
                a3.open();

                // Close User Type window
                f4.dispose();
            }
        });
   
        f4.setVisible(true);
    }
}

class login {

    protected String Admin;
    protected String Password;

    public login(String Admin, String Password) {

        this.Admin = Admin;
        this.Password = Password;
    }

    public void setname(String Admin) {
        this.Admin = Admin;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getname() {
        return this.Admin;
    }

    public String getPassword() {
        return this.Password;
    }

    public void print() {

        System.out.println("Admin = " + this.Admin);
        System.out.println("Password = " + this.Password);
    }

    public void verify() {

        this.Admin = "";
        this.Password = "";
    }
}


class verify extends login {

    public verify(String name, String Password) {

        super(name, Password);
    }


    public void print() {

        System.out.println("Admin = " + this.Admin);
        System.out.println("Password = " + this.Password);
    }

    public boolean validate() {

        if (Admin.equals("Admin") && Password.equals("Admin123")) {

            return true;

        } else {

            return false;
        }
    }
}
