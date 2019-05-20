package com.wong.gps.controller;


import com.wong.gps.GpsRepository;
import com.wong.gps.dto.GpsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/api")
public class GpsApiController {
    @Autowired
    private GpsRepository gpsRepository;

    @RequestMapping(value = "/gps", method = RequestMethod.GET)
    public List<GpsDTO> getGpsData() {

        return gpsRepository.findAll();
    }

    @RequestMapping(value = "/gps", method = RequestMethod.POST)
    public GpsDTO postGpsData(@RequestParam String name, @RequestParam String nowLocation, @RequestParam long duration) {
        GpsDTO gpsDTO = gpsRepository.findByIdAndNowLocation(name, nowLocation);
        if (gpsDTO == null) {
            return gpsRepository.save(new GpsDTO(name, duration, nowLocation));
        } else {
            gpsDTO.setDuration(duration);
            return gpsRepository.save(gpsDTO);
        }
//        System.out.println(gpsDTO);
    }
}

