import java.util.ArrayList;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class RemoveDuplicate{

    public RemoveDuplicate(Collection list1) {
        //list1 = new HashSet(list1);
        Collection collection = new HashSet(list1);
        list1.clear();
        list1.addAll(collection);
        //System.out.println(collection);
        //System.out.println(list1);
    }

}
