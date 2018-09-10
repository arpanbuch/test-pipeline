package com.ab.tests;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PipeLineTest {

	private final Logger logger = LoggerFactory.getLogger(PipeLineTest.class);

	@Test
	public void testMe() {
		System.out.println("RUN ME");
		logger.debug("DEBUG");
		logger.info("INFO");
		logger.error("ERROR");
	}
}
