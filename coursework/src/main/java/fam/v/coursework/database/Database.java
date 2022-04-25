package fam.v.coursework.database;


import fam.v.coursework.models.Sale;
import fam.v.coursework.models.Warehouse;
import fam.v.coursework.repositories.SalesRepositories;
import fam.v.coursework.repositories.WarehousesRepositories;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
public class Database {

    @Bean
    CommandLineRunner initDatabaseWarehouses(WarehousesRepositories warehousesRepositories) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                /*Warehouse warehouseA = new Warehouse("nhan", 12344, 120);
                Warehouse warehouseB = new Warehouse("Van", 32788372, 7823);
                Warehouse warehouseC = new Warehouse("Dung", 9892332, 3829);
                Warehouse warehouseD = new Warehouse("Linh", 37874, 3498);
                // để lưu 4 object này, cần gọi hàm save của productRepositories
                System.out.println("Insert data" + warehousesRepositories.save(warehouseA));
                System.out.println("Insert data" + warehousesRepositories.save(warehouseB));
                System.out.println("Insert data" + warehousesRepositories.save(warehouseC));
                System.out.println("Insert data" + warehousesRepositories.save(warehouseD));*/
            }
        };
    }

    @Bean
    CommandLineRunner initDatabaseSales(SalesRepositories salesRepositories) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                /*Sale saleA = new Sale(500.5, 1000, new Date(1200));
                Sale saleB = new Sale(250.5, 5000, new Date(1500));
                Sale saleC = new Sale(650.5, 7000, new Date(2000));
                Sale saleD = new Sale(150.5, 3000, new Date(3000));
                // để lưu 4 object này, cần gọi hàm save của productRepositories
                System.out.println("Insert data" + salesRepositories.save(saleA));
                System.out.println("Insert data" + salesRepositories.save(saleB));
                System.out.println("Insert data" + salesRepositories.save(saleC));
                System.out.println("Insert data" + salesRepositories.save(saleD));*/
            }
        };
    }



}
