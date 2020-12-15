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
public final class ReadWriteFacade {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    public List<Company> searchCompany(String partOfName)  {
        List<Company> companyList = companyDao.retrieve_PartOfLastName(partOfName);
        return companyList;
    }

    public List<Employee> searchEmployee(String partOfName) {
        List<Employee> employeeList = employeeDao.retrieve_PartOfLastName(partOfName);
        return employeeList;
    }
}