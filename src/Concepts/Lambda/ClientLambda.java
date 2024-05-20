package Concepts.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClientLambda {

    public static void main(String[] args) {
        
        ArrayList<Integer> a = new ArrayList<>();
        a.add(12);
        a.add(45);
        a.add(78);
        a.add(32);
        a.add(65);

        //lambda expression for priniing array list
        a.forEach((n)-> {
            //System.out.println(n);
        });

        System.out.println("----------------------------------------------------");

        //a.forEach((n)-> System.out.println(n));



        // custom lambda expression on Employee object 
        List<Employee> employees = new ArrayList<>();
        Employee e = new Employee("Ronak", "Finance", 90000.0);
        Employee e1 = new Employee("Neha", "HR", 45000.0);
        Employee e2 = new Employee("Atul", "Sales", 60000.0);
        Employee e3 = new Employee("Neeraj", "Finance", 70000.0);
        Employee e4 = new Employee("Priya", "HR", 65000.0);
        Employee e5 = new Employee("Aditya", "Sales", 80000.0);

        employees.addAll(Arrays.asList(e,e1,e2,e3,e4,e5));


         employees.sort((emp1, emp2) -> {
            return emp1.getDepartmentName().compareTo(emp2.getDepartmentName());
        });
      
       // employees.forEach(emp -> System.out.println(emp));


        // getting salary for greater then, less then, and equal to by calling the defined function

        SpecificSalaryConditionInterface salaryGreaterCondition = new GreaterthenSalary();
   /*      
        salaryGreaterCondition.getSpecificSalaryConditionEmployee(employees, 50000.0)
        .forEach((n) -> System.out.println(n)
        );
*/
        System.out.println("-=-=-=-=================================");
/* 
        SpecificSalaryConditionInterface salaryEqualConditionEmployee = new EqualToSalary();
        salaryEqualConditionEmployee.getSpecificSalaryConditionEmployee(employees, 70000.0)
        .forEach((emp) -> System.out.println(emp));
        */


        System.out.println("----------------------------------------------------------------");

        // we created 3 different classes can i avaoid and use lambda in place of that, let's try

        SpecificSalaryConditionInterface myLambdaGreaterCondition = (empList, d1) -> {
            ArrayList<Employee> returnEmployeeList = new ArrayList<>();
            for (Employee employee : empList) {
                if(employee.getSalary() > d1)
                    returnEmployeeList.add(employee);
            }
            return returnEmployeeList;
        };

        
        myLambdaGreaterCondition.getSpecificSalaryConditionEmployee(employees, 75000.0)
        .forEach((emp)-> System.out.println(emp));


        System.out.println("==================================================");

        SpecificSalaryConditionInterface myLambdaLessThenCondition = (employeeList, d1) -> {
            ArrayList<Employee> returnEmp = new ArrayList<>();
            for(Employee employee: employeeList)
            {
                if(employee.getSalary() < d1)
                    returnEmp.add(employee);
            }
            
            return returnEmp;
        };

        myLambdaLessThenCondition.getSpecificSalaryConditionEmployee(employees, 50000.0)
        .forEach((emp)-> System.out.println(emp));



















        // here i'm shpwing how to use functional interface with lambda

        // sorting the emp salary in asending order
      /*   Comparator salaryComparatorAesc = (d1, d2) -> {
            if(d1 > d2)
                return 1;
            else if(d1 < d2)
                return -1;
            else
                return 0;
        };

        employees.sort((emp1, emp2)->{ 
           return salaryComparatorAesc.compareTo(emp1.getSalary(), emp2.getSalary()); 
        } );

        employees.forEach((em)-> System.out.println(em));



        System.out.println("-------------------------------------------------");

        //sorting the emp salary in desecding order

        Comparator slaryComparatorDesc = (d1, d2) -> {
            if(d1 > d2)
                return -1;
            else if(d1 < d2)
                return 1;
            else
                return 0;
        };

        employees.sort((emp1, emp2) -> slaryComparatorDesc.compareTo(emp1.getSalary(), emp2.getSalary()));

        employees.forEach((em) -> System.out.println(em));
    */
    }

    
}
