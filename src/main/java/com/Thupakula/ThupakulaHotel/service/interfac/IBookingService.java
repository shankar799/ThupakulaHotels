package com.Thupakula.ThupakulaHotel.service.interfac;



import com.Thupakula.ThupakulaHotel.dto.Response;
import com.Thupakula.ThupakulaHotel.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}
