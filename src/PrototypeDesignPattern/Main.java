package PrototypeDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Rabit r = new Rabit("Name1");
         Map<String ,Integer> tree = new HashMap<>();
        tree.put("Name1" , 1);

       RabitFamilyTree tree1 = new RabitFamilyTree(tree);
    r.family=tree1;

        Rabit r1  = r.clone();
        Map<String ,Integer> tree2 =  r1.family.getFamilyTree();
        tree2.put("Checked" , 12);
Rabit r2  = r.clone();
r2.list.add("IDK");



        r1.name="Name2";

        System.out.println(r1+"  " + r + "  " +r2);
      //  tree.put("Random" , 4);
  //      System.out.println(" It is first Rabbit" +  r +"  Its is Second Rabit   " + r1);
    }
}
