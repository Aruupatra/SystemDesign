package main.java.ParkingLot.controlers;

import main.java.ParkingLot.dtos.IssueTicketRequestDtos;
import main.java.ParkingLot.dtos.IssueTicketResponseDtos;
import main.java.ParkingLot.dtos.ResponseStatus;
import main.java.ParkingLot.models.Gate;
import main.java.ParkingLot.models.Ticket;
import main.java.ParkingLot.models.VehicleType;
import main.java.ParkingLot.services.TicketService;

public class TicketControler {

    TicketService ticketService;
    public TicketControler(TicketService ticketService)
    {
        this.ticketService=ticketService;
    }

    public IssueTicketResponseDtos issueTicket(IssueTicketRequestDtos issueTicketRequestDtos)
    {
        IssueTicketResponseDtos issueTicketResponseDtos=new IssueTicketResponseDtos();
       try
       {
           Ticket ticket=ticketService.issueTicket(issueTicketRequestDtos.getGateid(),
                   issueTicketRequestDtos.getVehicleType(),
                   issueTicketRequestDtos.getVehicleNumber(),
                   issueTicketRequestDtos.getOwnerName());

           issueTicketResponseDtos.setTicket(ticket);
           issueTicketResponseDtos.setResponseStatus(ResponseStatus.SUCCUESS);


       }
       catch (Exception e)
       {
           issueTicketResponseDtos.setResponseStatus(ResponseStatus.FAILURE);
       }


        return issueTicketResponseDtos;
    }
}
