
public class Vehicle implements VehicleInfo{

    int id;
    String band;
    int price;

    public Vehicle(int id, String band, int price) {
        this.id = id;
        this.band = band;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void displayInfo() {
        System.out.println("id: " + id);
        System.out.println("band: " + band);
        System.out.println("price: " + price);
    }
    
    

}
