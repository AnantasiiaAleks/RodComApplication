package purchases;

public abstract class Purchases {
    String name;
    String date;
    double price;

    public Purchases(String name, String date, double price){
        this.name = name;
        this.date = date;
        this.price = price;
    }
    public String toString(){
        return date + " " + name + ": " + price;
    }
}
