package OOPSConcepts.Composition;

import java.util.ArrayList;
import java.util.List;

public class CollegeComposition {

    private String name;
    private List<DepartmentsComposition> departmentCompositionList;

    public CollegeComposition(String name)
    {
        this.name = name;
        this.departmentCompositionList = new ArrayList<>();
    }

    public void addDepartment(DepartmentsComposition departmentsComposition)
    {
        departmentCompositionList.add(departmentsComposition);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<DepartmentsComposition> getDepartmentCompositionList() {
        return departmentCompositionList;
    }

    public void setDepartmentCompositionList(List<DepartmentsComposition> departmentCompositionList) {
        this.departmentCompositionList = departmentCompositionList;
    }

    @Override
    public String toString() {
        return "CollegeComposition [name=" + name + ", departmentCompositionList=" + departmentCompositionList + "]";
    }

    

}
