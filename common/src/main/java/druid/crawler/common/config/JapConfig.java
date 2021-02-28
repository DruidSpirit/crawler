package druid.crawler.common.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan("druid.crawler.common.entity")
@EnableJpaRepositories("druid.crawler.common.repository")
@Configuration
public class JapConfig {
}
