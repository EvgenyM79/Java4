import java.util.HashMap;
import java.util.Map;

public class newMap {


    public newMap(HashMap<String, Integer> m1, String[] name, int num) {
        for (int i = 0; i < num; i ++){
            m1.put(name[generateInt()], generateInt());
        }
    }

    public Integer generateInt(){
        return (int) (Math.random()*7);
    }

}
