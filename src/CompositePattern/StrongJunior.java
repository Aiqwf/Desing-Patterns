package CompositePattern;

public class StrongJunior extends  Junior{
private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public StrongJunior(double salary){
         setTitle("sj");
        setSalary(salary);
    }

    @Override
    public double getSalary() {
        return 0;
    }

    @Override
    public String  getTitle() {
        return super.getTitle();
    }

    @Override
    public String toString() {
        return "StrongJunior{" +
                "title='" + title + '\'' +
                ", salary=" + salary +
                ", child=" + child +
                '}' +" id are  : "+getId();
    }
}
