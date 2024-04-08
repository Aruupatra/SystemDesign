package main.java.ParkingLot.strategies;

import main.java.ParkingLot.models.*;
import main.java.ParkingLot.repositories.ParkingLotRepository;
import main.java.ParkingLot.exceptions.*;

import java.util.Optional;

public class RandomSpotAssignmentStrategy implements SpotAssignmentStrategy{

    ParkingLotRepository parkingLotRepository;
    public RandomSpotAssignmentStrategy(ParkingLotRepository parkingLotRepository)
    {
        this.parkingLotRepository=parkingLotRepository;
    }
    @Override
    public ParkingSpot getSpot(Gate gate, VehicleType vehicleType) throws ParkingLotNotFoundException {

        Optional<ParkingLot> optionalParkingLot= parkingLotRepository.findParkingLotByGateId(gate.getId());

        ParkingLot parkingLot=null;
        if(optionalParkingLot.isPresent())
        {

            parkingLot=optionalParkingLot.get();
        }
        else {

            throw new ParkingLotNotFoundException("There is No parkingLot related to this Gate");
        }

        for(ParkingFloor parkingFloor:parkingLot.getParkingFloors())
        {

            for(ParkingSpot parkingSpot:parkingFloor.getParkingSpots())
            {

                if(parkingSpot.getParkingSpotStatus().equals(ParkingSpotStatus.EMPTY) )
                {
//                    for(VehicleType vehicleType1:parkingSpot.getVehicleType().equals(vehicleType))
//                    {
//
//                    }
                   // System.out.println(parkingSpot.getVehicleType());
                    for(VehicleType vehicleType1:parkingSpot.getVehicleType())
                    {
                        if(vehicleType1.equals(vehicleType))
                        {
                            return parkingSpot;
                        }
                    }
                    return parkingSpot;
                }
            }
        }
        return null;

    }


}
