package com.wellsfargo.counselor.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Security {
    @Id
    @GeneratedValue
    private long securityId;

    @Column
    private long portfolioId;

    @Column
    private String name;

    @Column
    private String category;

    @Column
    private double purchasePrice;

    @Column
    private Date purchaseDate;
 
    @Column
    private long quantity;

    public Security(long portfolioId, String name, String category, double purchasePrice, Date purchaseDate, long quantity)
    {
        this.portfolioId = portfolioId;
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }

    public long getSecurityId() {return securityId;}
    public long getPortfolioId() {return portfolioId;}
    public String getName() {return name;}
    public String getCategory() {return category;}
    public double getPurchasePrice() {return purchasePrice;}
    public Date getPurchaseDate() {return purchaseDate;}
    public long getQuantitiy() {return quantity;}

    public void setPortfolioId(long portfolioId)
    {
        this.portfolioId = portfolioId;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setCategory(String category)
    {
        this.category = category;
    }
    public void setPurchasePrice(double price)
    {
        this.purchasePrice = price;
    }
    public void setPurchaseDate(Date date)
    {
        this.purchaseDate = date;
    }
    public void setQuantity(long quantity)
    {
        this.quantity = quantity;
    }
    


}
