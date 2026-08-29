class appointment {

    protected String username;
    protected String number;

    public appointment(String username, String number) {
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


class Owner extends appointment {

    private String sex;

    public Owner(String username, String number, String sex) {

        super(username, number);
        this.sex = sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return this.sex;
    }

    public void print() {

        System.out.println("Customer Name = " + this.username);
        System.out.println("Phone Number = " + this.number);
        System.out.println("Sex = " + this.sex);
    }
}