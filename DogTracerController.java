package com.xvitcoder.dogtracer.controller;



import java.util.Locale;
import java.util.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xvitcoder.dogtracer.beans.Info;
import com.xvitcoder.dogtracer.service.InfoService;



@Controller
@RequestMapping("/data")
public class DogTracerController {
	
	@Autowired
	private InfoService InfoService;

	@RequestMapping(value = "/send", method = RequestMethod.GET)
public @ResponseBody String addTemp(@RequestParam String field1, @RequestParam String field2) {
    Locale.setDefault(Locale.US); // Ensure locale is consistent

    Info info = new Info();
    String id = "100";

    float lat_deg = Float.parseFloat(field1.substring(0, 2)) + Float.parseFloat(field1.substring(2)) / 60;
    float lon_deg = Float.parseFloat(field2.substring(0, 3)) + Float.parseFloat(field2.substring(3)) / 60;

    String lat1 = String.valueOf(lat_deg);
    String lng1 = String.valueOf(lon_deg);

    info.setLng1(lng1);
    info.setLat1(lat1);
    info.setId(id);

    InfoService.addValue(info);

    System.out.println("lat1  ::" + lat_deg);
    System.out.println("lang1  ::" + lon_deg);

    return "Sent successfully.";
}


	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public @ResponseBody Queue<Info> getdata() {

		return InfoService.getAllValues();
	}
}
