package main.java.ParkingLot.factory;

import main.java.ParkingLot.models.SpotAssignmentStrategyType;
import main.java.ParkingLot.repositories.ParkingLotRepository;
import main.java.ParkingLot.strategies.RandomSpotAssignmentStrategy;
import main.java.ParkingLot.strategies.SpotAssignmentStrategy;

public class SpotAssignmentStrategyFactory {

    public static SpotAssignmentStrategy getSpotAssignmentStrategy(SpotAssignmentStrategyType spotAssignmentStrategyType, ParkingLotRepository parkingLotRepository)
    {
        System.out.println("hi");
        if(spotAssignmentStrategyType.equals(SpotAssignmentStrategyType.RANDOM))
        {
            return new RandomSpotAssignmentStrategy(parkingLotRepository);
        }
        return null;
    }
}
