package com.braden0006.energyusage.controllers;

import com.braden0006.energyusage.service.LivingRoomUsage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class EnergyController {
    //LivingRoomUsage livingRoomEnergy = new LivingRoomUsage();

    @GetMapping("/energy")
    public String displayEnergy(Model model) {

        model.addAttribute("livingroom", new LivingRoomUsage());

        return "index";
    }
}
