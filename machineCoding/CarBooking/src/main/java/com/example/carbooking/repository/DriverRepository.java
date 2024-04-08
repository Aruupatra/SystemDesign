package com.example.carbooking.repository;

import com.example.carbooking.module.Cab;
import com.example.carbooking.module.Driver;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
@Component
public class DriverRepository {
    static Map<Integer, Driver> drivers=new HashMap<>();

    public static void addCab(Driver driver)
    {
        drivers.put(driver.getDriver_id(),driver);
    }

    public Driver getCab(int driver_id)
    {
        return drivers.get(driver_id);
    }
}
