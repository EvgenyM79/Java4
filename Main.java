import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(0, "test1");
        map1.put(1, "test1");
        map1.put(3, "test3");
        map1.put(4, "test4");
        map1.put(6, "test1");
        map1.put(7, "test6");
        map1.put(9, "test1");
        System.out.println(map1);
        Map<Object,Object> map3 = new HashMap<>();
        InvertMap<Object,Object> map5 = new InvertMap(map1,map3);
        System.out.println(map5.getMap2());
    }
}
