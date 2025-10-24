package com.braden0006.energyusage.controllers;

import com.braden0006.energyusage.calculations.LivingRoomUsage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class EnergyController {
    LivingRoomUsage livingRoomEnergy = new LivingRoomUsage();

    @GetMapping("/energy")
    public String displayEnergy() {

        return "TV energy: " + livingRoomEnergy.getTelevisionEnergy() + "\n" +
                "Lamp energy: " + livingRoomEnergy.getLampEnergy() + "\n" +
                "Total energy: " + livingRoomEnergy.getTotalLivingEnergy();
    }
}
