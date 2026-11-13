
package com.example.Day36.model;

import jakarta.persistence.*;

@Entity
@Table(name = "identity_cards")
public class IdentityCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cardId;

    private String cardNumber;

    @OneToOne
   @JoinColumn(name = "employee_id", unique = true)
   private Employee employee;

    public IdentityCard() {
    }

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
