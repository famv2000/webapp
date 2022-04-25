package fam.v.coursework.models;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "warehouses")
public class Warehouse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NAME", nullable = false, unique = true, length = 50)
    private String name;

    @Column(name = "QUANTITY")
    private int quantity;

    @Column(name = "AMOUNT")
    private double amount;

    @OneToMany(mappedBy = "warehouse", cascade = CascadeType.ALL)
    private Set<Sale> sales;

    public Warehouse() {
        super();
    }

    public Warehouse(String name, int quantity, double amount) {
        this.name = name;
        this.quantity = quantity;
        this.amount = amount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Warehouse warehouses = (Warehouse) o;
        return id == warehouses.id && name == warehouses.name  ;
    }



}
