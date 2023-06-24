package org.exam.ext1.ext1;

import org.exam.ext1.ext1.mappers.TestMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
class Ext1ApplicationTests {

	TestMapper testMapper;

	@Test
	void testBoard() {

		log.info("=====");
		log.info(testMapper.testNow());
	}

}
