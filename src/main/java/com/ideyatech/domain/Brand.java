package com.ideyatech.domain;

import javax.persistence.*;

/**
 * Created by nicktunac on 17/08/2016.
 */
@Entity
@Table(name="Brands")
public class Brand {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "BrandsKey")
    private long brandsKey;

    @Column(name = "Brand_Code")
    private long brandCode;

    @Column(name = "Brand_Name", nullable = false)
    private String brandName;

    @ManyToOne
    @JoinColumn(name = "CompaniesKey", nullable = false)
    private Company company;

    public long getBrandsKey() {
        return brandsKey;
    }

    public void setBrandsKey(long brandsKey) {
        this.brandsKey = brandsKey;
    }

    public long getBrandCode() {
        return brandCode;
    }

    public void setBrandCode(long brandCode) {
        this.brandCode = brandCode;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
