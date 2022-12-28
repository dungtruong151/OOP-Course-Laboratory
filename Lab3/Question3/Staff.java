package Lab3.Question3;

public class Staff extends Person{
    private String school;
    private double pay;

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    void setSchool(String school) {
        this.school = school;
    }
    void setPay(double pay) {
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }
    public double getPay() {
        return pay;
    }

    public String toString() {
        return "Staff[" + super.toString() + ",school=" + school + ",pay=" + pay + "]";
    }
}
