package Concepts.Lambda;

import java.util.List;

@FunctionalInterface
public interface SpecificSalaryConditionInterface {

    public List<Employee> getSpecificSalaryConditionEmployee(List<Employee> emp, double salaryCondition);

}
