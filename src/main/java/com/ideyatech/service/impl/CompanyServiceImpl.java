package com.ideyatech.service.impl;

import com.ideyatech.domain.Company;
import com.ideyatech.repository.CompanyRepository;
import com.ideyatech.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.Element;

/**
 * Created by nicktunac on 17/08/2016.
 */
@Service
public class CompanyServiceImpl implements CompanyService{

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public Company findByCode(long code) {
        return companyRepository.findByCode(code);
    }

    @Override
    public Company save(Company c) {
        return companyRepository.save(c);
    }

    @Override
    public Company builder(Element e) {
        Company c = new Company();

        c.setCode(Long.parseLong(e.getElementsByTagName("Code").item(0).getTextContent()));
        c.setCompanyName(e.getElementsByTagName("Company_Name").item(0).getTextContent());

        return c;
    }
}
