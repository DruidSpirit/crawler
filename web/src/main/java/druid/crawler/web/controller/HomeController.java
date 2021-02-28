package druid.crawler.web.controller;

import druid.crawler.common.entity.StockInfo;
import druid.crawler.common.repository.StockInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("")
@RequiredArgsConstructor
public class HomeController {

    private final StockInfoRepository stockInfoRepository;

    @GetMapping("/index")
    public String index(Map<String, Object> map) {
        List<StockInfo> list = stockInfoRepository.findAll();
        map.put("list", list);
        return "index";
    }
}
