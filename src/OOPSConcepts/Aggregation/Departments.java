package OOPSConcepts.Aggregation;

public class Departments {

    private String name;

    public Departments(String name)
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
        return "Departments [name=" + name + "]";
    }

    

    
}
