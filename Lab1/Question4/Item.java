public class Item {
    public String ID;
    public String name;
    public double price;

    public Item(String ID, String name, double price) {
        this.ID = ID;
        this.name = name;
        this.price = price;
    }

    public String getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
