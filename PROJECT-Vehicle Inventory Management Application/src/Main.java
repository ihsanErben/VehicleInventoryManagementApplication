
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Management_inventory manage = new Management_inventory();
        boolean cikis = false;
        while (cikis == false) {
            System.out.println("---------------------------------------------------------------------------------");
            System.out.println("1 -- add car");
            System.out.println("2 -- add motorcycle");
            System.out.println("3 -- print all vehicles");
            System.out.println("4 -- update car information");
            System.out.println("5 -- update motorcycle information");
            System.out.println("0 -- exit");
            System.out.print("enter an option: ");
            int option = input.nextInt();
            System.out.println("");
            switch (option) {

                case 0:
                    cikis = true;
                    break;
                case 1:
                    System.out.print("id: ");
                    int id1 = input.nextInt();
                    System.out.print("band: ");
                    String band1 = input.next();
                    System.out.print("price: ");
                    int price1 = input.nextInt();
                    System.out.print("door: ");
                    int door = input.nextInt();
                    Car car = new Car(id1, band1, price1, door);
                    manage.add_vehicle(car);
                    break;
                case 2:
                    System.out.print("id: ");
                    int id2 = input.nextInt();
                    System.out.print("band: ");
                    String band2 = input.next();
                    System.out.print("price: ");
                    int price2 = input.nextInt();
                    System.out.print("limit: ");
                    int limit = input.nextInt();
                    Motorcycle motorcycle = new Motorcycle(id2, band2, price2, limit);
                    manage.add_vehicle(motorcycle);
                    break;
                case 3:
                    for (Vehicle x : manage.print_vehicles()) {
                        System.out.println("-------------------------");
                        x.displayInfo();
                    }
                    break;
                case 4:
                    System.out.print("write the car id whose informations you want to change: ");
                    int ID = input.nextInt();
                    
                    boolean exit = false;
                    while(exit == false){
                    System.out.print("what do you want to organise:   1)id   2)band   3)price   4)door   0)exit     :");
                    int option2 = input.nextInt();
                    switch (option2) {

                        case 1:
                            System.out.print("write the new ID: ");
                            int newID = input.nextInt();

                            for (Vehicle x : manage.print_vehicles()) {
                                if (x.getId() == ID) {
                                    x.setId(newID);
                                    break;
                                } else {
                                    System.out.println("There is no ided " + ID);
                                }
                            }
                            break;
                        case 2:
                            System.out.print("write the new band: ");
                            String newBand = input.next();
                            for (Vehicle x : manage.print_vehicles()) {
                                if (ID == x.getId()) {
                                    x.setBand(newBand);
                                    break;
                                } else {
                                    System.out.println("There is no ided " + ID);
                                }
                            }
                            break;
                        case 3:
                            System.out.print("write the new price: ");
                            int newPrice = input.nextInt();
                            for (Vehicle x : manage.print_vehicles()) {
                                if (ID == x.getId()) {
                                    x.setPrice(newPrice);
                                    break;
                                } else {
                                    System.out.println("There is no ided " + ID);
                                }
                            }
                            break;
                        case 4:
                            System.out.print("write the new door: ");
                            int newDoor = input.nextInt();
                            for (Vehicle x : manage.print_vehicles()) {
                                if (ID == x.getId()) {
// HOCAM BURASI ----------------------------------------------------------------------------------------------------------------------------------------------- BURASI !!! door u super class da değil de sub class da tanımladığım için ulaşamıyorum.
                                } else {
                                    System.out.println("There is no ided " + ID);
                                }
                            }
                            break;
                        case 0:
                            exit = true;
                            break;
                    }
                    }
                    
                    
                    

                case 5:
                    System.out.print("write the motorcycle id whose informations you want to change: ");
                    int ID2 = input.nextInt();
                    
                    boolean exit2 = false;
                    while(exit2 == false){
                        
                    System.out.print("what do you want to organise:   1)id   2)band   3)price   4)limit      :");
                    int option3 = input.nextInt();
                    switch (option3) {

                        case 1:
                            System.out.print("write the new ID: ");
                            int newID = input.nextInt();

                            for (Vehicle x : manage.print_vehicles()) {
                                if (x.getId() == ID2) {
                                    x.setId(newID);
                                    break;
                                } else {
                                    System.out.println("There is no ided " + ID2);
                                }
                            }
                            break;
                        case 2:
                            System.out.print("write the new band: ");
                            String newBand = input.next();
                            for (Vehicle x : manage.print_vehicles()) {
                                if (ID2 == x.getId()) {
                                    x.setBand(newBand);
                                    break;
                                } else {
                                    System.out.println("There is no ided " + ID2);
                                }
                            }
                            break;
                        case 3:
                            System.out.print("write the new price: ");
                            int newPrice = input.nextInt();
                            for (Vehicle x : manage.print_vehicles()) {
                                if (ID2 == x.getId()) {
                                    x.setPrice(newPrice);
                                    break;
                                } else {
                                    System.out.println("There is no ided " + ID2);
                                }
                            }
                            break;
                        case 4:
                            System.out.print("write the new limit: ");
                            int newLimit = input.nextInt();
                            for (Vehicle x : manage.print_vehicles()) {
                                if (ID2 == x.getId()) {
// HOCAM BURASI ----------------------------------------------------------------------------------------------------------------------------------------------- BURASI !!! 
                                } else {
                                    System.out.println("There is no ided " + ID2);
                                }
                            }
                        case 0:
                            exit2 = true;
                            break;
                    }
            }
            }

        }
    }
}
