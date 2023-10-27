
public class Motorcycle extends Vehicle {

    private int limit;

    public Motorcycle(int id, String band, int price,int limit) {
        super(id, band, price);
        this.limit = limit;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("limit: " + limit);
    }
}
