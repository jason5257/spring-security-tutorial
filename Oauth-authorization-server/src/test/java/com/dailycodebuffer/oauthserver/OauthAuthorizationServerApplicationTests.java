package com.dailycodebuffer.oauthserver;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class OauthAuthorizationServerApplicationTests {

	@Test
	void contextLoads() {

		System.out.println("(new BCryptPasswordEncoder(11)).encode(\"1234\") = " + (new BCryptPasswordEncoder(11)).encode("1234"));
	}

}
