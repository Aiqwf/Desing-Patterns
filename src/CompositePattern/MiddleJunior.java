package CompositePattern;

public class MiddleJunior extends Junior{
private String id;

public MiddleJunior(double salary){
    setTitle("mj");
    setSalary(salary);
}

    @Override
    public double getSalary() {
        return 0;
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }


    @Override
    public String toString() {
        return "MiddleJunior{" +
                "title='" + title + '\'' +
                ", salary=" + salary +
                ", child=" + child +
                '}'+" Id are : "+getId();
    }
}
