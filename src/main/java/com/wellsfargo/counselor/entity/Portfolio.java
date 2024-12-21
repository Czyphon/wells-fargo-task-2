package com.wellsfargo.counselor.entity;


import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue
    private long portfolioId;

    @Column 
    private long clientId;

    @Column
    private Date creationDate; 

    public Portfolio(long clientId, Date creationDate)
    {
        this.clientId = clientId;
        this.creationDate = creationDate;
    }

    public long getPortfolioId() {return portfolioId;}
    public long getClientId() {return clientId;}
    public Date getCreationDate() {return creationDate;}

    public void setClientId(long clientId)
    {
        this.clientId = clientId;
    }
    public void setDate(Date creationDate)
    {
        this.creationDate = creationDate;
    }

}
