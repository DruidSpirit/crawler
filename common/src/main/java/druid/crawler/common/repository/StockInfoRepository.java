package druid.crawler.common.repository;

import druid.crawler.common.entity.StockInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockInfoRepository extends JpaRepository<StockInfo,Integer> {
}
