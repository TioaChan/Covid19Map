package dev.tioachan.covid19map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Covid19mapApplicationTests {


	@Value("${epidemic.url}")
	private String url;
	@Value("${epidemic.key}")
	private String key;

	@Test
	public void UrlTest(){
		System.out.println(url);
		System.out.println(key);
	}

	@Test
	void contextLoads() {
	}

}
