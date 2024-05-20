package OOPSConcepts.Composition;

public class ClientComposition {

    public static void main(String[] args) {
        
        CollegeComposition collegeComposition = new CollegeComposition("Aryan Engineering College");

        collegeComposition.addDepartment(new DepartmentsComposition("CSE Eng"));
        collegeComposition.addDepartment(new DepartmentsComposition("ECE Eng"));
        collegeComposition.addDepartment(new DepartmentsComposition("Mech Eng"));

        for(DepartmentsComposition departmentsComposition: collegeComposition.getDepartmentCompositionList())
        {
            System.out.println(departmentsComposition.getName() 
            + " is from : " + collegeComposition.getName());
        }
    }
}
