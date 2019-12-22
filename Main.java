import sun.swing.StringUIClientPropertyKey;

import javax.jnlp.IntegrationService;
import java.sql.Struct;
import java.util.*;

public class Main {

    public static <K, V> Map<V, Collection<K>> inverse(Map<Integer, String> map){
        Map<V, Collection<K>> resultMap = new HashMap<>();
        Set<K> keys = (Set<K>) map.keySet();
        for(K key : keys){
            V value = (V) map.get(key);
            resultMap.compute(value, (v, ks) -> {
                if(ks == null){
                    ks = new HashSet<>();
                }
                ks.add(key);
                return ks;
            });
        }
        return resultMap;
    }

    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        //TreeMap<Double, Integer> map2 = new TreeMap<Double, Integer>();
        map1.put(0, "test1");
        map1.put(1, "test1");
        map1.put(3, "test3");
        map1.put(4, "test4");
        map1.put(6, "test1");
        map1.put(7, "test6");
        System.out.println(map1);
        Map<Number, Collection<Object>> map2 = inverse(map1);
        System.out.println(map2);
    }
}
