package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface CompanyDao extends CrudRepository<Company,Integer> {

    @Query(nativeQuery = true)
    List<Company> findCompanyWith3Letters(@Param("PARAMETER")String parameter);

    @Query
    List<Company> findCompaniesByPattern(@Param("PATTERN") String pattern);

}
