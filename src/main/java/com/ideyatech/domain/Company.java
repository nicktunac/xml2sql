package com.ideyatech.domain;

import javax.persistence.*;
import java.util.List;

/**
 * Created by nicktunac on 17/08/2016.
 */
@Entity
@Table(name="Companies")
public class Company {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "CompaniesKey")
    private long CompaniesKey;

    @Column(name = "Code", nullable = false)
    private long code;

    @Column(name = "Company_Name", nullable = false)
    private String companyName;

    @OneToMany(mappedBy = "company")
    private List<Brand> brands;

    public long getCompaniesKey() {
        return CompaniesKey;
    }

    public void setCompaniesKey(long companiesKey) {
        CompaniesKey = companiesKey;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public List<Brand> getBrands() {
        return brands;
    }

    public void setBrands(List<Brand> brands) {
        this.brands = brands;
    }
}
