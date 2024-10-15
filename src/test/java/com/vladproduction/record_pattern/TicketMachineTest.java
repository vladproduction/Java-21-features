package com.vladproduction.record_pattern;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class TicketMachineTest {

    TicketMachine ticketMachine;

    @BeforeEach
    void setUp() {
        ticketMachine = new TicketMachine();
    }
    @Test
    void getAdultTicketDetailsTest() {
        assertEquals("Adult ticket type [price: $15]", ticketMachine.getDetails(new AdultTicket(15)));
    }
    @Test
    void getChildTicketDetailsTest() {
        assertEquals("Child ticket type [price: $7]", ticketMachine.getDetails(new ChildTicket(7)));
    }
    @Test
    void getUnknownTicketDetailsTest() {
        assertEquals("Unknown ticket type", ticketMachine.getDetails(null));
    }
}