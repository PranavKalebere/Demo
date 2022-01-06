package com.nec.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COMPANY")
public class Company
{
    @Id
    private int id;
    private String companyName;
    private int netWorth;

    public Company() {
    }

    public Company(String companyName, int netWorth) {
        this.companyName = companyName;
        this.netWorth = netWorth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getNetWorth() {
        return netWorth;
    }

    public void setNetWorth(int netWorth) {
        this.netWorth = netWorth;
    }
    public String toString()
    {
        return companyName+"  "+netWorth+" ";
    }
}

