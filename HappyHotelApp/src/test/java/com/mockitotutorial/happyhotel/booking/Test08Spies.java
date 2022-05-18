package com.mockitotutorial.happyhotel.booking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.mockito.Mockito.*;

class Test08Spies {
    private BookingService bookingService;
    private PaymentService paymentServiceMock;
    private RoomService roomServiceMock;
    private BookingDAO bookingDAOMock;
    private MailSender mailSenderMock;

    @BeforeEach
    void setup(){
        this.paymentServiceMock = mock(PaymentService.class);
        this.roomServiceMock = mock(RoomService.class);
        this.bookingDAOMock = spy(BookingDAO.class);
        this.mailSenderMock = mock(MailSender.class);

        this.bookingService = new BookingService(paymentServiceMock, roomServiceMock, bookingDAOMock, mailSenderMock);
    }
    @Test
    void should_MakeBooking_When_InputOK(){
        //given
        BookingRequest bookingRequest = new BookingRequest("1", LocalDate.of(2022, 01, 01), LocalDate.of(2022, 01,
                05), 2, true);

        //when
        String bookingId = bookingService.makeBooking(bookingRequest);
        //then
        verify(bookingDAOMock).save(bookingRequest);
        System.out.println("The bookindId = "+bookingId);
    }
    @Test
    void should_CancelBooking_When_InputOK(){
        //given
        BookingRequest bookingRequest = new BookingRequest("1", LocalDate.of(2022, 01, 01), LocalDate.of(2022, 01,
                05), 2, true);
        bookingRequest.setRoomId("1.3");
        String bookingId = "1";
        //when
        bookingService.cancelBooking(bookingId);
        doReturn(bookingRequest).when(bookingDAOMock).get(bookingId);
        //then

    }
}