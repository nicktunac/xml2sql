package com.ideyatech.repository;

import com.ideyatech.domain.Brand;
import com.ideyatech.domain.Company;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by nicktunac on 17/08/2016.
 */

public interface BrandRepository extends CrudRepository<Brand, Long> {

    List<Brand> findByBrandCode(long brandCode);

}
