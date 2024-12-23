package com.example.employeedetails.Service;

import com.example.employeedetails.Repository.ERepository;
import com.example.employeedetails.entity.emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EService {
    @Autowired
    public ERepository erepository;

    public List<emp> getAllEmp()
    {
        return (List<emp>) erepository.findAll();
    }
    public emp getEmpById(Long eid)
    {
        return erepository.findById(eid).get();
    }
    public emp addEmp(emp e)
    {
        e.calculate();
        return erepository.save(e);
    }
    public emp updateEmp(emp e,Long eid)
    {
        emp empObj=erepository.findById(eid).get();
        if(empObj!=null)
        {
            empObj.setEname(e.getEname());
            empObj.setSalary(e.getSalary());
            empObj.calculate();
        }
        return erepository.save(empObj);
    }
    public String delEmp(Long eid)
    {
        emp empObj=erepository.findById(eid).get();
        if(empObj!=null)
        {
            erepository.delete(empObj);
        }
        return "Employee deleted successfully!" +eid;
    }
}
