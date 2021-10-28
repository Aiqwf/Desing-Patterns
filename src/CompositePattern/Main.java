package CompositePattern;

import java.util.List;

public class Main {
    public static void main(String[] args) {
Junior junior =new Junior();
 MiddleJunior middleJunior =new MiddleJunior(12);
 junior.addChild(middleJunior);

 StrongJunior strongJunior = new StrongJunior(15);
        junior.addChild(strongJunior);
List<Junior> list= junior.getChild();
        for(int i=0 ; i<junior.getChild().size();i++) {
            System.out.println(list.get(i));
}//obsever
junior.deleteJunior("1mj");
        for(int i=0 ; i<junior.getChild().size();i++) {
            System.out.println(list.get(i));
        }
     }
}
