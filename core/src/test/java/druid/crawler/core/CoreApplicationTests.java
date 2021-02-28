package druid.crawler.core;

import druid.crawler.common.entity.FoundationInfo;
import druid.crawler.common.repository.FoundationInfoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith(SpringRunner.class)
class CoreApplicationTests {

	@Autowired
	private FoundationInfoRepository foundationInfoRepository;

	@Test
	public void contextLoads() {

	}

}
