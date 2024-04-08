import main.java.ParkingLot.controlers.TicketControler;
import main.java.ParkingLot.dtos.IssueTicketRequestDtos;
import main.java.ParkingLot.dtos.IssueTicketResponseDtos;
import main.java.ParkingLot.models.*;
import main.java.ParkingLot.repositories.GateRepository;
import main.java.ParkingLot.repositories.ParkingLotRepository;
import main.java.ParkingLot.repositories.TicketRepository;
import main.java.ParkingLot.repositories.VehicleRepository;
import main.java.ParkingLot.services.TicketService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Client {
    public static void main(String[] args) {

        TicketService ticketService;

        GateRepository gateRepository=new GateRepository();
        VehicleRepository vehicleRepository=new VehicleRepository();
        TicketRepository ticketRepository=new TicketRepository();
        ParkingLotRepository parkingLotRepository=new ParkingLotRepository();

        //create a Operator FIRST
        Operator op1=new Operator();
        op1.setName("Kumar");
        op1.setEmpId(001);
        op1.setId(1);
        op1.setCreateAt(new Date());
        op1.setUpdatedAt(new Date());
        //Create a Gate
        Gate gate1=new Gate();
        gate1.setGateNumber(1001);
       // gate1.setGateStatus();
        gate1.setCurroperator(op1);
        gate1.setId(1);
        gate1.setCreateAt(new Date());
        gate1.setUpdatedAt(new Date());

        gateRepository.add(gate1.getId(),gate1);

        //List of parkingSpot

        ParkingSpot spot1=new ParkingSpot();
        spot1.setSpotNumber(1);
        List<VehicleType> vehicleTypeList=new ArrayList<>();
        vehicleTypeList.add(VehicleType.SEDAN);
        vehicleTypeList.add(VehicleType.SUV);
        spot1.setVehicleType(vehicleTypeList);
        spot1.setParkingSpotStatus(ParkingSpotStatus.EMPTY);


        //parkingFloor
        ParkingFloor floor1=new ParkingFloor();
        floor1.setFloorNumber(1);
        List<ParkingSpot> parkingSpotList=new ArrayList<>();
        parkingSpotList.add(spot1);
        floor1.setParkingSpots(parkingSpotList);

        //parkingLot
        ParkingLot p1=new ParkingLot();
        List<ParkingFloor> parkingFloorList=new ArrayList<>();
        parkingFloorList.add(floor1);
        p1.setId(100001);
        p1.setParkingFloors(parkingFloorList);

        parkingLotRepository.add(gate1,p1);






        ticketService=new TicketService(gateRepository,vehicleRepository,ticketRepository,parkingLotRepository);

        TicketControler ticketControler=new TicketControler(ticketService);

        IssueTicketRequestDtos issueTicketRequestDtos=new IssueTicketRequestDtos();
        issueTicketRequestDtos.setGateid(1);
        issueTicketRequestDtos.setVehicleType(VehicleType.SEDAN);
        issueTicketRequestDtos.setOwnerName("Arun");
        issueTicketRequestDtos.setVehicleNumber("OD13M3662");
        IssueTicketResponseDtos issueTicketResponseDtos=ticketControler.issueTicket(issueTicketRequestDtos);
        Ticket newticket=issueTicketResponseDtos.getTicket();

        System.out.println(newticket.getNumber());
    }
}