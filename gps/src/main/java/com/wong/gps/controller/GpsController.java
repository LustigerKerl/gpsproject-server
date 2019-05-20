//package com.wong.gps.controller;
//
//
//import com.wong.gps.GpsRepository;
//import com.wong.gps.dto.GpsDTO;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Controller
//public class GpsController {
//    @Autowired
//    private GpsRepository gpsRepository;
//
//    @RequestMapping("/home")
//    public String home() {
//        return "hi";
//    }
//
//    //    @RequestMapping(value = "/list", method = RequestMethod.GET)
////    public List<GpsDTO> list() {
////        List<GpsDTO> list = new ArrayList<>();
////        for (int i = 0; i <= 10; i++) {
////            GpsDTO gps = new GpsDTO();
////            gps.setDuration(i);
////            gps.setName("abc" + i);
////            gps.setNowLocation("abcd" + i);
////            gps.setSeq(i);
////            list.add(gps);
////        }
////        return list;
////    }
////    @GetMapping("/")
////    public String abc(Model model) {
////        List<GpsDTO> list= gpsRepository.findByNews();
////        System.out.println(list);
////        model.addAttribute("gps",gpsRepository.findByNews());
//////         model.addAttribute("gps",gpsRepository.findByNews());
////        return "hi";
////    }
////    @GetMapping("/")
////    public String abc(Model model) {
////        model.addAttribute("gps",gpsRepository.findByNews());
////        System.out.println(model);
////
////        return "hi";
////    }
//    @GetMapping("hi")
//    public String abs(Model model){
//        model.addAttribute("gps",gpsRepository.findAll());
//        return "abcd";
//    }
//
//
//}