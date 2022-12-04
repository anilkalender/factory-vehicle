package com.factory.vehicle.service;

import com.factory.vehicle.exception.NotFoundException;
import com.factory.vehicle.models.CarType;
import com.factory.vehicle.models.ProductionResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CarService {

    private final ICarService cabrioService;
    private final ICarService hatchbackService;
    private final ICarService sedanService;

    public ProductionResponse checkProduction(String type) {

        CarType cartype;
        ProductionResponse response = new ProductionResponse();

        try {
            cartype = CarType.valueOf(type);
        } catch (IllegalArgumentException e) {
            throw new NotFoundException("NOT_FOUND_CAR_TYPE : " + type);
        }

        switch (cartype){

            case CABRIO:
                response.setType(cabrioService.getType());
                break;
            case SEDAN:
                response.setType(sedanService.getType());
                break;
            case HATCHBACK:
                response.setType(hatchbackService.getType());
                break;
            default:
                throw new NotFoundException("Unexpected value: " + type);
        }
        return response;
    }
}
