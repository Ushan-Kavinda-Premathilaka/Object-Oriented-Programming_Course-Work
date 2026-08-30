import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

class Database {

    private JFrame f6;
    private JTable table;
    private DefaultTableModel model;

    public void open() {

        f6 = new JFrame("Admin Database");
        f6.setSize(1000, 600);
        f6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f6.getContentPane().setBackground(Color.PINK);
        f6.setLayout(null);
        JLabel label7 = new JLabel("Appointment Database");

        label7.setBounds(350, 20, 400, 40);
        label7.setFont(new Font("Arial", Font.BOLD, 25));
        f6.add(label7);

        String[] columns = {
            "Owner Name",
            "Owner Sex",
            "Phone Number",
            "Pet Name",
            "Pet Age",
            "Pet Sex",
            "Pet Type",
            "Appointment Date",
            "Appointment Time"
        };
        model = new DefaultTableModel(columns, 0);
        table = new JTable(model);
       
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(20, 80, 940, 350);
        f6.add(scrollPane);
      
        JButton refreshButton = new JButton("Refresh");
        refreshButton.setBounds(300, 470, 150, 40);
        f6.add(refreshButton);

        JButton backButton = new JButton("Back");
        backButton.setBounds(550, 470, 150, 40);
        f6.add(backButton);
        loadAppointments();

     refreshButton.addActionListener(new ActionListener() {

    public void actionPerformed(ActionEvent e) {
     loadAppointments();
     JOptionPane.showMessageDialog( f6,"Database Refreshed!");
               }
    });
         backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                UserTypeForm u1 = new UserTypeForm();
                u1.open();
                f6.dispose();
            }
        });

        f6.setVisible(true);
    }

    public void loadAppointments() {

        // Safety check
        if (model == null) {
            return;
        }
       model.setRowCount(0);

        if (AppointmentDatabase.count == 0) {
            System.out.println("No appointments found.");
            return;
        }
        for (int i = 0; i < AppointmentDatabase.count; i++) {

            Object[] row = {AppointmentDatabase.ownerName[i],AppointmentDatabase.ownerSex[i], AppointmentDatabase.phoneNumber[i],AppointmentDatabase.petName[i],AppointmentDatabase.petAge[i],AppointmentDatabase.petSex[i], AppointmentDatabase.petType[i],AppointmentDatabase.appointmentDate[i],AppointmentDatabase.appointmentTime[i] };
            model.addRow(row);
        }
        System.out.println("Appointments loaded: " + AppointmentDatabase.count );
    }
}
