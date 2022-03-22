package com.jack.springmvcrestinit.member;


import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;


@RestController
public class apiController {

	@GetMapping("/api")
		public 	ResponseEntity<String> memberInfo(@RequestParam String id) {

			RestTemplate restTemplate = new RestTemplate();
			HttpHeaders headers = new HttpHeaders();
			// header 세팅
			headers.set("Accept-Language", "ko-KR,ko;q=0.9,en-US;q=0.8,en;q=0.7");
			headers.set("Accept-Charset", "application/x-www-form-urlencoded; charset=UTF-8");
			headers.set("Origin", "https://developer.riotgames.com");
			headers.set("X-Riot-Token", "RGAPI-389ada79-4a2d-4409-bbae-d1a032e9e291");
			HttpEntity requesHeader = new HttpEntity(headers);
			// request URL 세팅
			String url = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/"+id;

			ResponseEntity<String> response = restTemplate.exchange( url, HttpMethod.GET, requesHeader, String.class );
			
			return response;
	}
}