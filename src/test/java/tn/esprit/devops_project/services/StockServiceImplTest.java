package tn.esprit.devops_project.services;

import com.github.springtestdbunit.annotation.DatabaseSetup;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.devops_project.entities.Stock;

import java.util.List;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@ActiveProfiles("test")
@Transactional
class StockServiceImplTest {

    @Autowired
    private StockServiceImpl stockService;

    @Test
    @DatabaseSetup("/data-set/stock-data.xml")
    void addStock() {
        Stock stock = new Stock();
        stock.setTitle("bon");
        stockService.addStock(stock);
        List<Stock> allstocks = stockService.retrieveAllStock();

    }

    @Test
    void retrieveStock() {
        //final Stock stock = stockService.retrieveStock(1L);
         //assertEquals("stock 1", stock.getIdStock());


    }

    @Test
    void retrieveAllStock() {
        //final List<Stock> allStocks = stockService.retrieveAllStock();
    }
}
