package com.vladproduction.record_pattern;

public class TicketMachine {

    public String getDetails(Ticket ticket) {
        if (ticket instanceof AdultTicket(var price)) {
            return STR."Adult ticket type [price: $\{price}]";
        } else if (ticket instanceof ChildTicket(var price)) {
            return STR."Child ticket type [price: $\{price}]";
        } return "Unknown ticket type";
    }

}
