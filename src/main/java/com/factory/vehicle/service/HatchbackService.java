package com.factory.vehicle.service;

import com.factory.vehicle.models.CarType;
import org.springframework.stereotype.Service;

@Service("hatchbackService")
public class HatchbackService implements ICarService {
    public CarType getType() {
        return CarType.HATCHBACK;
    }
}
