package com.example.fooddelivery.strategies;

import com.example.fooddelivery.constants.Constant;

public class GoldPriceCalculationStrategy implements PriceCalculationStrategies{
    @Override
    public int CalculatePrice(int price) {
        return Constant.BASECHARGE+(price*Constant.GoldCharges);
    }
}
