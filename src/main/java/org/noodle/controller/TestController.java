package org.noodle.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/developer/*")
public class TestController {
	
	
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);

	
	@GetMapping("/api")
	public void apiGET(){
		logger.info("apiGET.....");
	}
}
