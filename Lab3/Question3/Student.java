package Lab3.Question3;

public class Student extends Person{
    private String program;
    private int year;
    private double fee;
    
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    void setProgram(String program) {
        this.program = program;
    }
    void setYear(int year) {
        this.year = year;
    }
    void setFee(double fee) {
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }
    public int getYear() {
        return year;
    }
    public double getFee() {
        return fee;
    }

    public String toString() {
        return "Student[" + super.toString() + ",program=" + program + ",year=" + year + ",fee=" + fee + "]";
    }
}
