package OOPSConcepts.Association;

import java.util.ArrayList;
import java.util.Arrays;

public class ClientAssociation {

    public static void main(String[] args) {
        
        StudentAssociation s1 = new StudentAssociation("Ronak");
        StudentAssociation s2 = new StudentAssociation("Amit");
        

        ArrayList<StudentAssociation> StudentAssociationList = new ArrayList<>();
        StudentAssociationList.addAll(Arrays.asList(s1, s2));


        TeacherAssociation teacherAssociation = new TeacherAssociation("Ankita");
        
        teacherAssociation.setStudentAssociations(StudentAssociationList);

        for(StudentAssociation studentAssociation:teacherAssociation.getStudentAssociations())

        {
            System.out.println(studentAssociation.getName() + " studies in "+ 
            teacherAssociation.getName() + " Mam Class");
        }

    }
}
