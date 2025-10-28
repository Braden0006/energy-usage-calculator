package com.braden0006.energyusage.service;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class LivingRoomUsage {

    // This class calculates a random double integer value for a TV that is being used between 1-11 hours
    // for every day of the month
    public double calculateDailyTVEnergy() {
        double result = 0;

        for (int i = 0; i < 31; i++) {
            Random randomNum = new Random();

            int max = 11;
            int min = 1;

            double randomHours = randomNum.nextDouble(max - min + 1) + min;

            result += randomHours;
        }

        return result;
    }

    public double calculateDailyLampEnergy() {
        double result = 0;

        for (int i = 0; i < 31; i++) {
            Random randomNum = new Random();

            int max = 7;
            int min = 1;

            double randomHours = randomNum.nextDouble(max - min + 1) + min;

            result += randomHours;
        }

        return result;
    }

    // This is the calculation for daily usage of a television in kWh
    double tvEnergy = ((80 * calculateDailyTVEnergy()) / 1000);
    double secondTVEnergy = Math.round(tvEnergy * 100);
    double finalTVEnergy = secondTVEnergy / 100;

    // This is the calculation for daily usage of a lamp in kWh
    double lampEnergy = ((10 * calculateDailyLampEnergy()) / 1000);
    double secondLampEnergy = Math.round(lampEnergy * 100);
    double finalLampEnergy = secondLampEnergy / 100;

    double totalEnergy = finalTVEnergy + finalLampEnergy;

    public double getTelevisionEnergy() {
        return finalTVEnergy;
    }

    public double getLampEnergy() {
        return finalLampEnergy;
    }

    public double getTotalLivingEnergy() {
        return totalEnergy;
    }

    public void setTelevisionEnergy(double tvEnergy) {
        this.tvEnergy = tvEnergy;
    }

    public void setLampEnergy(double lampEnergy) {
        this.lampEnergy = lampEnergy;
    }
}
