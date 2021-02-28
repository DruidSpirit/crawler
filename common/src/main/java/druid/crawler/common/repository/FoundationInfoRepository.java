package druid.crawler.common.repository;

import druid.crawler.common.entity.FoundationInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoundationInfoRepository extends JpaRepository<FoundationInfo,Integer> {
}
