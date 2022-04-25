package fam.v.coursework.controllers;

import fam.v.coursework.models.Warehouse;
import fam.v.coursework.repositories.WarehousesRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/warehouses")
public class WarehouseController {
    @Autowired
    private WarehousesRepositories warehousesRepositories;


    @GetMapping("/list")
    public String getAllWarehouses(Model model) {
        List<Warehouse> listWarehouses = warehousesRepositories.findAll();
        model.addAttribute("listWarehouses", listWarehouses);
        return "warehouses/list";
    }

    @GetMapping("/add")
    public String add(Model model) {
        Warehouse newWarehouse = new Warehouse();
        model.addAttribute("warehouse", newWarehouse);
        return "warehouses/addOrEdit";
    }



    @GetMapping("/edit/{id}")
    public String edit(Model model, @PathVariable(name = "id") Integer id) {
        return "warehouses/addOrEdit";
    }

    @PostMapping("/saveOrUpdate")
    public String saveOrUpdate(Model model, Warehouse warehouse) {

        warehousesRepositories.save(warehouse);
        model.addAttribute(warehouse);
        return "warehouses/addOrEdit";
    }


    @GetMapping("/delete/{id}")
    public String deleteWarehouses(Model model, @PathVariable Integer id) {

        // code....
        return "list";
    }




}
