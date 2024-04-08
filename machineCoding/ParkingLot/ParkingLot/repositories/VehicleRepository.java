package main.java.ParkingLot.repositories;

import main.java.ParkingLot.models.Vehicle;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class VehicleRepository {

    Map<Long, Vehicle> vehicleMap=new HashMap<>();
    private long vehicleId;

    public Optional<Vehicle> findGateByVehicleId(int  vehicleId)
    {
         if(vehicleMap.containsKey(vehicleId))
         {
             return Optional.of(vehicleMap.get(vehicleId));
         }
        return Optional.empty();
    }
    public Optional<Vehicle> findGateByVehiclenumber(String vehicleNumber)
    {
        for(Vehicle vehicle:vehicleMap.values())
        {
            if(vehicle.getVehicleNumber().equals(vehicleNumber))
            {
                return Optional.of(vehicle);
            }
        }
        return Optional.empty();
    }

    public Vehicle save(Vehicle vehicle)
    {
        vehicleId++;
        vehicle.setId(vehicleId);
        vehicleMap.put(vehicleId,vehicle);
        return vehicle;
    }

}
