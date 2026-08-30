class AppointmentDatabase {

    static String[] ownerName = new String[100];
    static String[] ownerSex = new String[100];
    static String[] phoneNumber = new String[100];
    static String[] petName = new String[100];
    static String[] petAge = new String[100];
    static String[] petSex = new String[100];
    static String[] petType = new String[100];
    static String[] appointmentDate = new String[100];
    static String[] appointmentTime = new String[100];
    static int count = 0;

    public static void addAppointment(
            String owner,
            String sex,
            String phone,
            String pet,
            String age,
            String petSexValue,
            String type,
            String date,
            String time) {

        if (count < 100) {

            ownerName[count] = owner;
            ownerSex[count] = sex;
            phoneNumber[count] = phone;

            petName[count] = pet;
            petAge[count] = age;
            petSex[count] = petSexValue;
            petType[count] = type;

            appointmentDate[count] = date;
            appointmentTime[count] = time;

            count++;
        }
    }

    public static void displayAppointments() {

        for (int i = 0; i < count; i++) {

            System.out.println("Appointment " + (i + 1));
            System.out.println("Owner Name = " + ownerName[i]);
            System.out.println("Owner Sex = " + ownerSex[i]);
            System.out.println("Phone Number = " + phoneNumber[i]);

            System.out.println("Pet Name = " + petName[i]);
            System.out.println("Pet Age = " + petAge[i]);
            System.out.println("Pet Sex = " + petSex[i]);
            System.out.println("Pet Type = " + petType[i]);

            System.out.println("Appointment Date = " + appointmentDate[i]);
            System.out.println("Appointment Time = " + appointmentTime[i]);

            System.out.println("------------");
        }
    }
}
