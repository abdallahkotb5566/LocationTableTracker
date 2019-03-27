package com.fym.lta.dao;

import com.fym.lta.dto.EmployeeDto;

public interface EmpDao
{
    
    public boolean isExisit(EmployeeDto emp) ;
    public boolean insertnew(EmployeeDto emp) ;
    public boolean updata(EmployeeDto emp) ;

    
    public list <EmployeeDto > ListAll();
   public EmployeeDto SearchforEmp(String code);


    
    
}
