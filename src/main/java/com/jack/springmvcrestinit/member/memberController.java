package com.jack.springmvcrestinit.member;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class memberController {

	@GetMapping("/member")
	public String projectInfo() {
//		return "Project name is preword.";
		return "{\"project name\": \"preword\"," +
				"\"created date\": \"2021-07-03\"}";
	}
}