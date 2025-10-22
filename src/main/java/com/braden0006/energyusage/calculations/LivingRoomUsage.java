package com.braden0006.energyusage.calculations;

import org.springframework.stereotype.Component;

@Component
public class LivingRoomUsage {
    // This is the calculation for daily usage of a television in kWh
    private double televisionEnergy = ((80 * 9.5) / 1000) * 30;

    public double getTelevisionEnergy() {
        return televisionEnergy;
    }

    public void setTelevisionEnergy(float televisionEnergy) {
        this.televisionEnergy = televisionEnergy;
    }
}
