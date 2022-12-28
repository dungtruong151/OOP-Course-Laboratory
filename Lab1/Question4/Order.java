public class Order {
    public String ID;
    public Item[] items;
    public Order(String ID, Item[] items) {
        this.ID = ID;
        this.items = items;
    }

    public String getID() {
        return ID;
    }
    public Item[] getItems() {
        return items;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    public void setItems(Item[] items) {
        this.items = items;
    }

    public double calculateAverageCost() {
        double total = 0;
        for (int i=0;i<items.length;i++) {
            total += items[i].getPrice();
        }
        return total/items.length;
    }
}   
