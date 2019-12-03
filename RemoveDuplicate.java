import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicate{

    public RemoveDuplicate(ArrayList<String> newList) {
        HashSet<String> remDubl = new HashSet<>();
        remDubl.addAll(newList);
        newList.clear();
        newList.addAll(remDubl);
    }

}
