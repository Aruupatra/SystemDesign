package main.java.ParkingLot.strategies;

import main.java.ParkingLot.exceptions.ParkingLotNotFoundException;
import main.java.ParkingLot.models.Gate;
import main.java.ParkingLot.models.ParkingSpot;
import main.java.ParkingLot.models.VehicleType;

public interface SpotAssignmentStrategy {

    public ParkingSpot getSpot(Gate gate, VehicleType vehicleType) throws ParkingLotNotFoundException;
}
