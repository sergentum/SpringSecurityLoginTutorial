package com.example.model;

import javax.persistence.*;

@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "transaction_id")
    private int id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id")
    private User user;

//    @JoinColumn(name = "payee_id")
//    private Payee payee;

    private int amount;

    public void setUser(User user) {
        this.user = user;
    }

//    public void setPayee(Payee payee) {
//        this.payee = payee;
//    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public User getUser() {

        return user;
    }

//    public Payee getPayee() {
//        return payee;
//    }

    public int getAmount() {
        return amount;
    }
}
