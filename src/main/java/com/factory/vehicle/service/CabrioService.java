package com.factory.vehicle.service;

import com.factory.vehicle.models.CarType;
import org.springframework.stereotype.Service;

@Service("cabrioService")
public class CabrioService implements ICarService {

    @Override
    public CarType getType() {
        return CarType.CABRIO;
    }
}
