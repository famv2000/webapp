package fam.v.coursework.models;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "charges")
public class Charge {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "AMOUNT")
    private double amount;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd//MM//yyyy")
    @Column(name = "CHARGE_DATE")
    private Date chargeDate;

    @ManyToOne
    @JoinColumn(name = "expense_item_id")
    private ExpenseItem expenseItem;

    public Charge() {}

    public Charge(double amount, Date chargeDate) {
        this.amount = amount;
        this.chargeDate = chargeDate;
    }

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

    public Date getChargeDate() {
        return chargeDate;
    }

    public void setChargeDate(Date chargeDate) {
        this.chargeDate = chargeDate;
    }







}
