package druid.crawler.web;

import druid.crawler.common.entity.FoundationInfo;
import druid.crawler.common.entity.StockInfo;
import druid.crawler.common.repository.FoundationInfoRepository;
import druid.crawler.common.repository.StockInfoRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@SpringBootTest
@RunWith(SpringRunner.class)
class WebApplicationTests {

    @Autowired
    private StockInfoRepository stockInfoRepository;

    @Autowired
    private FoundationInfoRepository foundationInfoRepository;

    @Test
    @Transactional
    @Rollback(false)
    void contextLoads() {

        FoundationInfo foundationInfo = new FoundationInfo();
        foundationInfo.setName("基金测试关联");
        foundationInfo.setFoundationCode("12345678");
        foundationInfo.setUpdateTime(LocalDateTime.now());

        StockInfo stockInfo = new StockInfo();
        stockInfo.setName("股票测试关联");
        stockInfo.setStockCode("9991");
        stockInfo.setUpdateTime(LocalDateTime.now());

        stockInfo.setFoundationInfo(foundationInfo);

        stockInfoRepository.save(stockInfo);

        //foundationInfo.getStockInfoList().add(stockInfo);
        //foundationInfoRepository.save(foundationInfo);
    }

}
