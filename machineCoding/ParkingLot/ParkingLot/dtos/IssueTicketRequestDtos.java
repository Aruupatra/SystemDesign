package main.java.ParkingLot.dtos;

import main.java.ParkingLot.models.Gate;
import main.java.ParkingLot.models.VehicleType;

public class IssueTicketRequestDtos {


    private int gateid;
    private VehicleType vehicleType;
    private String vehicleNumber;
    private String ownerName;


    public int getGateid() {
        return gateid;
    }

    public void setGateid(int gateid) {
        this.gateid = gateid;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }


}
