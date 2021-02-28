package druid.crawler.common.entity;


import lombok.Data;
import org.springframework.stereotype.Component;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name="foundation_info")
@Component
public class FoundationInfo {

    /**
     * 基金代码
     */
    @Id
    @Column(name="foundation_code")
    private String foundationCode;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="id",nullable=false,insertable=false,updatable=false,columnDefinition="int not null UNIQUE key auto_increment")
    private Long id;

    /**
     * 基金名称
     */
    private String name;

    /**
     * 跟新时间
     */
    private LocalDateTime updateTime;

    @OneToMany(targetEntity = StockInfo.class,cascade = CascadeType.ALL)
    @JoinColumn(name="foundation_code",referencedColumnName = "foundation_code")
    private Set<StockInfo> StockInfoList = new HashSet<>();

}
