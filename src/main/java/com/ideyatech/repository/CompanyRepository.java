package com.ideyatech.repository;

import com.ideyatech.domain.Company;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by nicktunac on 17/08/2016.
 */

public interface CompanyRepository extends CrudRepository<Company, Long> {

    Company findByCode(long code);

}
