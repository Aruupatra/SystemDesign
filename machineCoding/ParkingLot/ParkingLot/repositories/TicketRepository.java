package main.java.ParkingLot.repositories;

import main.java.ParkingLot.models.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepository {

    Map<Long, Ticket> ticketMap=new HashMap<>();
    public long ticketId=0;
    public Ticket save(Ticket ticket)
    {
        ticketId++;
        ticket.setId(ticketId);
        ticketMap.put(ticketId,ticket);
        return ticket;
    }


}
