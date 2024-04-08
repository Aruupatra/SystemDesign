package main.java.ParkingLot.repositories;

import main.java.ParkingLot.models.Gate;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GateRepository {

    Map<Long, Gate> gateMap=new HashMap<>();

    public Optional<Gate> findGateById(int id)
    {
        //System.out.println(id);
       // Gate obj=gateMap.get((long)id);
      //  System.out.println(obj);

        if(gateMap.containsKey((long)id))
        {
           return Optional.of(gateMap.get((long)id));
        }
       return Optional.empty();
    }

    public void add(long id,Gate gate)
    {
        gateMap.put(id,gate);
    }
}
