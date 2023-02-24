import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArraylistColl {
    public static void main(String args[])
    {
        ArrayList a = new ArrayList();
        a.add("34");
        a.add("Anusha");
        a.add(true);
        a.add(null);
        a.add("Anusha");
        Iterator il = a.iterator();
        for(Object temp: a)
        {
            System.out.println(temp);
        }

    System.out.println(a.size());
        a.add("5");

       List<Object> B= Collections.synchronizedList(a);
       B.add("come");

            System.out.println(B);

        List<Object> A=  Collections.unmodifiableList(a);
        A.add("HEllo");
        System.out.println(A);
    }

}
