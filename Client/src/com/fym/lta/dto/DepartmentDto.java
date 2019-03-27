package com.fym.lta.dto;

public class DepartmentDto {
    private int id ;
    private String code,name,description ; 
    
    
    public DepartmentDto() {
        super();
    }

    public DepartmentDto(int id, String code, String name,
                         String description) {
        super();
        this.id = id;
        this.code = code;
        this.name = name;
        this.description = description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
