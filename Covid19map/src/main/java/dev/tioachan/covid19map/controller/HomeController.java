package dev.tioachan.covid19map.controller;

import dev.tioachan.covid19map.domian.DataInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController("/")
public class HomeController {

	@Autowired
	private RestTemplate restTemplate;
	@Value("${epidemic.url}")
	private String url;
	@Value("${epidemic.key}")
	private String key;

	@GetMapping("/getAllData.do")
	public DataInfo getAllData(){
		String addr=url + "?key=" + key;
		DataInfo dataInfo = restTemplate.getForObject(addr, DataInfo.class);
		return dataInfo;
	}
}
