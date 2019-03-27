package com.fym.lta.dto;

public class EmployeeDto 
{ 
    private int id ;
    private String Lname,fname,address,email ; 
    private  DepartmentDto dept ; 
  
    public EmployeeDto()
    {
        super();
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public String getLname() {
        return Lname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFname() {
        return fname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setDept(DepartmentDto dept) {
        this.dept = dept;
    }

    public DepartmentDto getDept() {
        return dept;
    }
}
