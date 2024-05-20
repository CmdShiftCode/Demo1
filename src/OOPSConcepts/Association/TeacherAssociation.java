package OOPSConcepts.Association;

import java.util.ArrayList;
import java.util.List;

public class TeacherAssociation {

    private String name;
    private List<StudentAssociation> studentAssociations;

    public TeacherAssociation(String name)
    {
        this.name = name;
        this.studentAssociations = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<StudentAssociation> getStudentAssociations() {
        return studentAssociations;
    }

    public void setStudentAssociations(List<StudentAssociation> studentAssociations) {
        this.studentAssociations = studentAssociations;
    }

    @Override
    public String toString() {
        return "TeacherAssociation [name=" + name + ", studentAssociations=" + studentAssociations + "]";
    }

    
}
