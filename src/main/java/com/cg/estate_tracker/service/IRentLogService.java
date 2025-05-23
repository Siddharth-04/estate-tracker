package com.cg.estate_tracker.service;

import com.cg.estate_tracker.dtos.RentDTO;
import com.cg.estate_tracker.dtos.ResponseDTO;
import com.cg.estate_tracker.model.User;

public interface IRentLogService {
    ResponseDTO addRentLog(User user,RentDTO rentDTO);

    ResponseDTO viewRentLog(User user, Long propertyId);
}
