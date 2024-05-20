package OOPSConcepts.Aggregation;

import java.util.ArrayList;
import java.util.Arrays;

public class ClientAggregation {

    public static void main(String[] args) {
        
        Departments comuterDep = new Departments("Computer Eng");
        Departments ECEDep = new Departments("Ece Eng");
        

        ArrayList<Departments> departmentsList = new ArrayList<>();
        departmentsList.addAll(Arrays.asList(comuterDep, ECEDep));


        College bestCollege = new College("Sarkar Engineering College");
        
        bestCollege.setDepartments(departmentsList);

        for(Departments department:bestCollege.getDepartments())

        {
            System.out.println(department.getName() + " if from "+ bestCollege.getName());
        }

    }
}
