package com.example.machineCoding.TrueCaller.models.common;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;
@Getter
@Setter
public class OperationHours {

    private LocalTime openHour;
    private LocalTime closeHour;
}
