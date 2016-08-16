package com.ideyatech.service;

import com.ideyatech.domain.Company;
import org.w3c.dom.Element;

/**
 * Created by nicktunac on 17/08/2016.
 */
public interface CompanyService {

    public Company findByCode(long code);

    public Company save(Company c);

    public Company builder(Element e);

}
