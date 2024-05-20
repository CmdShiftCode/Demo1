package OOPSConcepts.Composition;

public class DepartmentsComposition {

    private String name;

    public DepartmentsComposition(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DepartmentsComposition [name=" + name + "]";
    }

    
}
