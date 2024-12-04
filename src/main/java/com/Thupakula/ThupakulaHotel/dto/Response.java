package com.Thupakula.ThupakulaHotel.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {

    private int statusCode;

    private String message;

    private String token;

    private String role;

    private String bookingConfirmationCode;

    private String expirationTime;

    private UserDTO user;

    private RoomDTO room;

    private BookingDTO booking;

    private List<UserDTO> userList;

    private List<RoomDTO> roomList;

    private List<BookingDTO> bookingList;






}
