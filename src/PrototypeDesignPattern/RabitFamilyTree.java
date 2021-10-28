package PrototypeDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class RabitFamilyTree  implements  Cloneable{

private String name;
public String getName ( )
{
    return name;
}

    public void setName(String name) {
        this.name = name;
    }

    private Map<String  , Integer> familyTree;
      RabitFamilyTree(Map<String, Integer>  familyTree) {
    Map<String, Integer> map =new HashMap<>(familyTree);
    this.familyTree=map;

    }

public Map<String,Integer> getFamilyTree( ){

        return familyTree;
}

    public void setFamilyTree(Map<String, Integer> familyTree) {
        this.familyTree = familyTree;
    }

    @Override
    public String toString() {
        return "RabitFamilyTree{" +
                "familyTree=" + familyTree +
                '}';
    }

@Override
   public Object clone() throws CloneNotSupportedException {
        return super.clone();
}


}
