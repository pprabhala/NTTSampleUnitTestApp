package com.ntt.ite.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ZipCodeServiceImpl implements ZipCodeService {
	
    private String url = "http://api.openweathermap.org/data/2.5/weather?zip=94040,us";
	
	RestTemplate restTemplate = new RestTemplate();

	@Override
	public String getZipDetails(String zipCode) {
		// TODO Auto-generated method stub
		System.out.println("Calling the weather API.....");
		String response = null;
		response = restTemplate.getForObject(url, String.class);
		return response;
	}

}
