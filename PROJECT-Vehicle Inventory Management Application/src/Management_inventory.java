import java.util.*;
public class Management_inventory {
    ArrayList<Vehicle> list = new ArrayList<Vehicle>();
    
    
    public void add_vehicle(Vehicle vehicle){
        list.add(vehicle);
    }
    
    public ArrayList<Vehicle> print_vehicles(){
        
        return list;
    }
}
