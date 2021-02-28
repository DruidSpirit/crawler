package druid.crawler.common.entity;


import lombok.Data;
import org.springframework.stereotype.Component;
import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name="stock_info")
@Component
public class StockInfo {

    /**
     * 主键id
     */
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    /**
     * 基金名称
     */
    private String name;

    /**
     * 基金代码
     */
    @Column(name="stock_code")
    private String stockCode;

    /**
     * 跟新时间
     */
    private LocalDateTime updateTime;

    @ManyToOne(targetEntity = FoundationInfo.class,cascade = CascadeType.ALL)
    @JoinColumn(name="foundation_code",referencedColumnName = "foundation_code")
    private FoundationInfo foundationInfo;

}
