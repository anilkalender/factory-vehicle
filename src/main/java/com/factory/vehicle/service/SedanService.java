package com.factory.vehicle.service;

import com.factory.vehicle.models.CarType;
import org.springframework.stereotype.Service;

@Service("sedanService")
public class SedanService implements ICarService {

    public CarType getType() {
        return CarType.SEDAN;
    }
}
