package main.java.ParkingLot.services;

import main.java.ParkingLot.exceptions.GateNotFoundException;
import main.java.ParkingLot.exceptions.ParkingLotNotFoundException;
import main.java.ParkingLot.factory.SpotAssignmentStrategyFactory;
import main.java.ParkingLot.models.*;
import main.java.ParkingLot.repositories.GateRepository;
import main.java.ParkingLot.repositories.ParkingLotRepository;
import main.java.ParkingLot.repositories.TicketRepository;
import main.java.ParkingLot.repositories.VehicleRepository;
import main.java.ParkingLot.strategies.SpotAssignmentStrategy;

import java.util.Date;
import java.util.Optional;
import java.util.Random;

public class TicketService {

    GateRepository gateRepository;
    VehicleRepository vehicleRepository;
    TicketRepository ticketRepository;
    ParkingLotRepository parkingLotRepository;

    public TicketService(GateRepository gateRepository,VehicleRepository vehicleRepository,TicketRepository ticketRepository,ParkingLotRepository parkingLotRepository)
    {
        this.gateRepository=gateRepository;
        this.vehicleRepository=vehicleRepository;
        this.ticketRepository=ticketRepository;
        this.parkingLotRepository=parkingLotRepository;
    }
    public Ticket issueTicket(int gateid, VehicleType vehicleType,String vehicleNumber,String owner) throws GateNotFoundException, ParkingLotNotFoundException {

        Optional<Gate> optionalGate=gateRepository.findGateById(gateid);
        Gate gate=null;
        Operator operator=null;
        Vehicle vehicle=null;

        if(optionalGate.isPresent())
        {
            gate=optionalGate.get();
            operator=gate.getCurroperator();
        }
        else {
          //  System.out.println("hi");
            throw new GateNotFoundException("Invalid Gate Id");
        }

        Optional<Vehicle> optionalVehicle=vehicleRepository.findGateByVehiclenumber(vehicleNumber);
        if(optionalVehicle.isPresent())
        {
            vehicle=optionalVehicle.get();

        }
        else {
             vehicle=new Vehicle();
            vehicle.setVehicleNumber(vehicleNumber);
            vehicle.setOwnerName(owner);
            vehicle.setVehicleType(vehicleType);
            vehicle=vehicleRepository.save(vehicle);
        }

        SpotAssignmentStrategy spotAssignmentStrategy= SpotAssignmentStrategyFactory.getSpotAssignmentStrategy(SpotAssignmentStrategyType.RANDOM,parkingLotRepository);

        ParkingSpot parkingSpot=spotAssignmentStrategy.getSpot(gate,vehicleType);
        System.out.println(parkingSpot);

        Ticket ticket=new Ticket();
        ticket.setEntryTime(new Date());
        ticket.setNumber((String.valueOf(new Random().nextInt())));
        ticket.setGeneratedBy(operator);
        ticket.setParkingSpot(parkingSpot);
        ticket.setGeneratedAt(gate);
        ticket.setVehicle(vehicle);
        ticket=ticketRepository.save(ticket);
        return ticket;

    }

}
