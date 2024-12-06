package com.kinjo.ems_backend.mapper;

import com.kinjo.ems_backend.dto.EmployeeDto;
import com.kinjo.ems_backend.entity.Employee;

public class EmployeeMapper {

    public static EmployeeDto mapEmployeeDto(Employee employee){
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }
    public static Employee mapEmployee(EmployeeDto employeeDto){
        return new Employee(
          employeeDto.getId(),
          employeeDto.getFirstName(),
          employeeDto.getLastName(),
                employeeDto.getEmail()
        );
    }
}
