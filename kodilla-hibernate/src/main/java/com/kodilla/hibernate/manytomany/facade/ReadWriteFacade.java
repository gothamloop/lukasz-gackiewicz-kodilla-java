package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReadWriteFacade {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(ReadWriteFacade.class);

    public List<Company> findCompany(String name) {

        LOGGER.info("Retrieving companies");

        List<Company> companies = companyDao.retrieveCompanyPartName(name);

        if (companies.size() > 0) {
            LOGGER.info("Found it");
        } else {
            LOGGER.error(FacadeException.NOTHING_FOUND);
        }
        return companies;
    }

    public List<Employee> findEmployee(String lastname) {

        LOGGER.info("Retrieving employees");

        List<Employee> employees = employeeDao.retrieveEmployeePartName(lastname);

        if (employees.size() > 0) {
            LOGGER.info("Found it");
        } else {
            LOGGER.error(FacadeException.NOTHING_FOUND);
        }
        return employees;
    }
}