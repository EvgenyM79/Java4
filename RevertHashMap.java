import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class RevertHashMap {

    public RevertHashMap(HashMap<String, Integer> m1, HashMap<Integer, String> m2){
        for (Map.Entry<String,Integer> entry : m1.entrySet()){
            m2.put(entry.getValue(),entry.getKey());
        }
    }
}
