package com.example.model;

import javax.persistence.*;

@Entity
@Table(
        name = "payee",
        uniqueConstraints = {@UniqueConstraint(columnNames = {"name"})}
)
public class Payee {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "payee_id", unique = true, nullable = false)
    private int id;

    @Column(name = "payee")
    private String name;

    private int min;

    private int max;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {

        return id;
    }

    public String getName() {
        return name;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public Payee() {
    }

    public Payee(String name, int min, int max) {
        this.name = name;
        this.min = min;
        this.max = max;
    }
}
