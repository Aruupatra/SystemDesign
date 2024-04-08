package main.java.ParkingLot.repositories;

import main.java.ParkingLot.models.Gate;
import main.java.ParkingLot.models.ParkingLot;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ParkingLotRepository {

    Map<Long, ParkingLot> parkingLotMap=new HashMap<>();

    public Optional<ParkingLot> findParkingLotByGateId(long gateId)
    {
        if(parkingLotMap.containsKey(gateId))
        {
            return Optional.of(parkingLotMap.get(gateId));
        }
       return Optional.empty();
    }

    public void add(Gate gate, ParkingLot parkingLot)
    {
        parkingLotMap.put(gate.getId(),parkingLot);
    }
}
