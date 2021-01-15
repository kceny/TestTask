package com.space.service;

import com.space.controller.ShipOrder;
import com.space.model.Ship;
import com.space.model.ShipType;

import java.util.Date;
import java.util.List;

public interface ShipService {
    public Ship saveShip(Ship ship);

    public Ship getShip(Long id);

    public Ship updateShip(Ship oldShip, Ship newShip) throws IllegalArgumentException;

    public void deleteShip(Ship ship);

    public List<Ship> getShips(String name, String planet, ShipType shipType, Long after, Long before, Boolean isUsed,
                               Double minSpeed, Double maxSpeed, Integer minCrewSize, Integer maxCrewSize,
                               Double minRating, Double maxRating);

    public List<Ship> sortShips(List<Ship> ships, ShipOrder order);

    public List<Ship> getPage(List<Ship> ships, Integer pageNumber, Integer pageSize);

    public boolean isShipValid(Ship ship);

    public double computeRating(double speed, boolean isUsed, Date prod);
}
