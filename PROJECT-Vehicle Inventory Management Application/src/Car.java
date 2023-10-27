
public class Car extends Vehicle {

    int door;

    public Car(int id, String band, int price,int door) {
        super(id, band, price);
        this.door = door;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("door: " + door);

    }

}
