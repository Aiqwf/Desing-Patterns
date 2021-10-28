package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public     class Junior implements  Programmers{
private String id;
    protected String title;
    protected double salary;
private   int sayac=0;
    List<Junior> child ;
public Junior(){
    child =new ArrayList<>();
}

public  List<Junior> getChild(){
    return child;
}

public void addChild(Junior junior) {
sayac++;

    String id=sayac+"";
   String t= junior.getTitle();

   switch (t) {
       case "sj":
           id+="sj";
       break;
           case "mj":
           id+="mj";
           break;
       default:
           System.out.println("Wrong Title");
   }
junior.setId(id);
    child.add(junior);
}


public void deleteJunior(String id){
    System.out.println("Remove Child");

    for(int i=0; i<child.size();i++) {
        if(child.get(i).getId().equals(id)){
            System.out.println("Child Removedd" );
            child.remove(child.get(i));
        }
    }

}

public boolean updateJunior(Junior junior) {
    for(int i=0; i<child.size();i++) {
        if(child.get(i).getId().equals(junior.getId())){
         child.set(i, junior);
       return true;

        }
    }
    return false;
}
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public double getSalary() {
        return 0;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public void setSalary(double salary ){
        this.salary=salary;
    }
    public void setTitle(String title){
        this.title=title;
    }


    @Override
    public String toString() {
        return "Junior{" +
                "title='" + title + '\'' +
                ", salary=" + salary +
                ", child=" + child +
                '}';
    }
}
