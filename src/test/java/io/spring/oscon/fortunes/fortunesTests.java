package io.spring.oscon.fortunes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Fortunes.class)
@WebAppConfiguration
public class fortunesTests {

	@Test
	public void contextLoads() {
	}

}
