import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class FormAppointment {

    public void open() { 

    
        JFrame f1 = new JFrame ("Book Appointment");

        f1.setSize(700, 600);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.getContentPane().setBackground(Color.GREEN);
        f1.setLayout(null);



        JLabel label = new JLabel("Book your appointment!!!");

        label.setBounds(180, 20, 400, 40);
        label.setFont(new Font("Arial", Font.BOLD, 25));

        f1.add(label);


    

        JLabel customerLabel = new JLabel("Owner Name :");

        customerLabel.setBounds(50, 80, 150, 30);
        f1.add(customerLabel);


        JTextField customerField = new JTextField();

        customerField.setBounds(200, 80, 250, 30);
        f1.add(customerField);


        JLabel sexLabel1 = new JLabel("Sex :");

        sexLabel1.setBounds(50, 120, 150, 30);
        f1.add(sexLabel1);


        JTextField sexField1 = new JTextField();

        sexField1.setBounds(200, 120, 250, 30);
        f1.add(sexField1);


        JLabel phoneLabel = new JLabel("Phone Number :");

        phoneLabel.setBounds(50, 160, 150, 30);
        f1.add(phoneLabel);


        JTextField phoneField = new JTextField();

        phoneField.setBounds(200, 160, 250, 30);
        f1.add(phoneField);



        JLabel nameLabel = new JLabel("Pet Name :");

        nameLabel.setBounds(50, 210, 150, 30);
        f1.add(nameLabel);


        JTextField nameField = new JTextField();

        nameField.setBounds(200, 210, 250, 30);
        f1.add(nameField);


        JLabel typeLabel = new JLabel("Pet Type :");

        typeLabel.setBounds(50, 250, 150, 30);
        f1.add(typeLabel);


        JTextField typeField = new JTextField();

        typeField.setBounds(200, 250, 250, 30);
        f1.add(typeField);


        JLabel sexLabel2 = new JLabel("Pet Sex :");

        sexLabel2.setBounds(50, 290, 150, 30);
        f1.add(sexLabel2);


        JTextField sexField2 = new JTextField();

        sexField2.setBounds(200, 290, 250, 30);
        f1.add(sexField2);


        JLabel ageLabel = new JLabel("Pet Age :");

        ageLabel.setBounds(50, 330, 150, 30);
        f1.add(ageLabel);


        JTextField ageField = new JTextField();

        ageField.setBounds(200, 330, 250, 30);
        f1.add(ageField);



        JLabel dateLabel = new JLabel("Appointment Date :");

        dateLabel.setBounds(50, 370, 150, 30);
        f1.add(dateLabel);


        JTextField dateField = new JTextField();

        dateField.setBounds(200, 370, 250, 30);
        f1.add(dateField);


        JLabel timeLabel = new JLabel("Appointment Time :");

        timeLabel.setBounds(50, 410, 150, 30);
        f1.add(timeLabel);


        JTextField timeField = new JTextField();

        timeField.setBounds(200, 410, 250, 30);
        f1.add(timeField);


        JButton bookButton = new JButton("Book Appointment");

        bookButton.setBounds(200, 470, 250, 35);

        bookButton.setBackground(Color.BLACK);
        bookButton.setForeground(Color.WHITE);

        f1.add(bookButton);
 
        
        JButton BackButton = new JButton("Back");

        BackButton.setBounds(400, 510, 250, 30);

        BackButton.setBackground(Color.RED);
        BackButton.setForeground(Color.BLACK);

        f1.add(BackButton);       


     bookButton.addActionListener(new ActionListener() {

    public void actionPerformed(ActionEvent e) {

        
        String customerName = customerField.getText();
        String phoneNumber = phoneField.getText();
        String ownerSex = sexField1.getText();

        
        Owner owner = new Owner(customerName, phoneNumber, ownerSex);



        String petName = nameField.getText();
        String petAge = ageField.getText();
        String petSex = sexField2.getText();
        String petType = typeField.getText();
        String appointmentDate = dateField.getText();
        String appointmentTime = timeField.getText();

        
        Animal animal = new Animal(petName,petAge,petSex,petType,appointmentDate,appointmentTime);


        
        AppointmentDatabase.addAppointment(customerName,ownerSex,phoneNumber,petName,petAge,petSex,petType,appointmentDate,appointmentTime);

        JOptionPane.showMessageDialog(f1,"Appointment Booked Successfully!");


    
        customerField.setText("");
        phoneField.setText("");
        sexField1.setText("");
        nameField.setText("");
        ageField.setText("");
        sexField2.setText("");
        typeField.setText("");
        dateField.setText("");
        timeField.setText("");
    }
});
       
         BackButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                UserTypeForm l1 = new UserTypeForm();
                l1.open();

            
                f1.dispose();
            }
        });


        

    

        f1.setVisible(true);
    }
}
