package com.Thupakula.ThupakulaHotel.service.interfac;



import com.Thupakula.ThupakulaHotel.dto.LoginRequest;
import com.Thupakula.ThupakulaHotel.dto.Response;
import com.Thupakula.ThupakulaHotel.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}
