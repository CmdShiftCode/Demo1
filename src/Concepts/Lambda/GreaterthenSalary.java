package Concepts.Lambda;

import java.util.ArrayList;
import java.util.List;

public class GreaterthenSalary implements SpecificSalaryConditionInterface {

    @Override
    public List<Employee> getSpecificSalaryConditionEmployee(List<Employee> employees
    , double salaryCondition) {
        ArrayList<Employee> returnEmployeeList = new ArrayList<>();
        for(Employee employee:employees)
        {
            if(employee.getSalary() > salaryCondition)
            {
                returnEmployeeList.add(employee);
            }
        }
        return returnEmployeeList;
    }

}
