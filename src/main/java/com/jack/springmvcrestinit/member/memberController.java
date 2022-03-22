package com.jack.springmvcrestinit.member;


import com.jack.springmvcrestinit.member.model.Member;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class memberController {

		@GetMapping("/member")
		public Member memberInfo() {
			Member member = new Member();
			member.author = "123";
			member.projectName = "123123";
			// response.setSuccess()
			return member;
	}
}