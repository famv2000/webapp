package fam.v.coursework.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "sales")
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "AMOUNT")
    private double amount;

    @Column(name = "QUANTITY")
    private int quantity;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd//MM//yyyy")
    @Column(name = "SALE_DATE")
    private Date saleDate;

    // đây là phần định nghĩa quan hê với bảng Warehouse
    @ManyToOne
    @JoinColumn(name = "warehouse_id")
    private Warehouse warehouse;

    public Sale() {}

    public Sale(double amount, int quantity, Date sale_Date) {
        this.amount = amount;
        this.quantity = quantity;
        this.saleDate = sale_Date;
    }

    /*public Warehouse getWarehouse() {
        return warehouse;
    }*/

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getSale_Date() {
        return saleDate;
    }

    public void setSale_Date(Date sale_Date) {
        this.saleDate = sale_Date;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Sale sale = (Sale) o;
        return id == sale.id && saleDate == sale.saleDate  ;
    }




}
