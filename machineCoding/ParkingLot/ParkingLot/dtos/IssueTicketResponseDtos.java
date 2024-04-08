package main.java.ParkingLot.dtos;

import main.java.ParkingLot.models.Ticket;

public class IssueTicketResponseDtos {

    private Ticket ticket;
    private ResponseStatus responseStatus;
    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }



}
