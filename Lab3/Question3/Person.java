package Lab3.Question3;

public class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    void setName(String name) {
        this.name = name;
    }
    void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }

    public String toString() {
        return "Person[name=" + name + ",address=" + address + "]";
    }
}
