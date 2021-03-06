/* Change Log
11/26/2016 Deividas
    Converted fields to simple* type
10/24/2016 Fergus
    Removed the startDate and endDate fields since those will be in the reservation
    Change the type of hasPets, disabilityAccessible, allowsSmoking to Boolean
    Renamed some variables and functions for clarity
    Added the inventory arraylist field.
 */
package prms;

import java.util.ArrayList;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class HotelRoom {

    private SimpleStringProperty roomNumber = new SimpleStringProperty("");
    private SimpleDoubleProperty price = new SimpleDoubleProperty();
    private SimpleIntegerProperty beds = new SimpleIntegerProperty();
    private SimpleBooleanProperty allowsPets = new SimpleBooleanProperty();
    private SimpleBooleanProperty disabilityAccessible = new SimpleBooleanProperty();
    private SimpleBooleanProperty allowsSmoking = new SimpleBooleanProperty();
    
    private SimpleStringProperty dateLastCleaned = new SimpleStringProperty();

    public ArrayList<InventoryItem> inventory;

    public HotelRoom(String roomNumber, double price, int beds, Boolean allowsPets, Boolean disabilityAccessible, Boolean allowsSmoking, String dateLastCleaned) {

        setRoomNumber(roomNumber);
        setPrice(price);
        setBeds(beds);
        setAllowsPets(allowsPets);
        setDisabilityAccessible(disabilityAccessible);
        setAllowsSmoking(allowsSmoking);
        setDateLastCleaned(dateLastCleaned);
        
        inventory = new ArrayList<InventoryItem>();

    }

    HotelRoom(String string, double aDouble, int aInt, boolean aBoolean, boolean aBoolean0, boolean aBoolean1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getPrice() {
        return price.get();
    }

    public String getDateLastCleaned() {
        return dateLastCleaned.get();
    }

    public int getBeds() {
        return beds.get();
    }

    public boolean getAllowsPets() {
        return allowsPets.get();
    }

    public boolean getDisabilityAccessible() {
        return disabilityAccessible.get();
    }

    public boolean getAllowsSmoking() {
        return allowsSmoking.get();
    }

    public String getRoomNumber() {
        return roomNumber.get();
    }

    public ArrayList<InventoryItem> getInventory() {
        return inventory;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber.set(roomNumber);
    }

    public void setPrice(double price) {
        this.price.set(price);
    }

    public void setBeds(int beds) {
        this.beds.set(beds);
    }

    public void setAllowsPets(Boolean allowsPets) {
        this.allowsPets.set(allowsPets);
    }

    public void setDisabilityAccessible(Boolean disabilityAccessible) {
        this.disabilityAccessible.set(disabilityAccessible);
    }

    public void setAllowsSmoking(Boolean allowsSmoking) {
        this.allowsSmoking.set(allowsSmoking);
    }

    public void setDateLastCleaned(String dateLastCleaned) {
        this.dateLastCleaned.set(dateLastCleaned);
    }

    @Override
    public String toString() {
        return "Hotel room name: $" + this.roomNumber
                + "\nprice: $" + this.price
                + "\n# of beds: " + this.beds
                + "\nDisability Accessible: " + this.disabilityAccessible
                + "\nAllows Pets: " + this.allowsPets
                + "\nAllows Smoking: " + this.allowsSmoking
                + "\nDate last cleaned: " + this.dateLastCleaned;
    }

}