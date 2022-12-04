package com.factory.vehicle.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter
@AllArgsConstructor
public class ProductionResponse {

    CarType type;
    boolean isProduced = true;

    public ProductionResponse() {

    }
}
