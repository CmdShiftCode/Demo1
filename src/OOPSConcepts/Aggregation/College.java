package OOPSConcepts.Aggregation;

import java.util.List;

public class College {

    private String name;
    private List<Departments> departments;

    public College(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Departments> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Departments> departments) {
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "College [name=" + name + ", departments=" + departments + "]";
    }

    
}
