package fam.v.coursework.models;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "expense_items")
public class ExpenseItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;

    @Column(name ="NAME", nullable = false, length = 100)
    private String name;

    @OneToMany(mappedBy = "expenseItem", cascade = CascadeType.ALL)
    private Set<Charge> charges;

    public ExpenseItem() {}

    public ExpenseItem(String name) {
        this.name = name;
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
}
