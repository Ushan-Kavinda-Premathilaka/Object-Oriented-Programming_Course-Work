class Appointment {

    protected String username;
    protected String number;

    public Appointment(String username, String number) {
        this.username = username;
        this.number = number;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getUsername() {
        return this.username;
    }

    public String getNumber() {
        return this.number;
    }

    public void print() {
        System.out.println("Username = " + this.username);
        System.out.println("Phone number = " + this.number);
    }
}




class Animal extends Appointment {

    private String time;
    private String sex;
    private String type;
    private String date;

    public Animal( String username,String number,String sex,String type,String date, String time  ){

        super(username, number);

        this.sex = sex;
        this.type = type;
        this.date = date;
        this.time = time;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSex() {
        return this.sex;
    }

    public String getType() {
        return this.type;
    }

    public String getDate() {
        return this.date;
    }

    public String gettime() {
        return this.time;
    }

    public void print() {

        System.out.println("Animal Name = " + this.username);
        System.out.println("Age = " + this.number);
        System.out.println("Sex = " + this.sex);
        System.out.println("Pet Type = " + this.type);
        System.out.println("Appointment Date = " + this.date);
        System.out.println("Appointment Time = " + this.time);
    }
}