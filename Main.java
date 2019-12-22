import java.util.*;

public class Main {

    public static <K, V> Map<V, Collection<K>> inverse(Map<Integer, String> map){
        Map<V, Collection<K>> resultMap = new HashMap<>();
        HashSet<Integer> set1 = new HashSet();
        System.out.println(map);
        int mapSize = map.size();
        System.out.println(mapSize);
        Boolean[] matrix =new Boolean[mapSize];
        for (int i = 0; i < mapSize; i ++) {
            matrix[i] = true;
            System.out.println(matrix[i]);
        }
        int i = 0;
        for(Map.Entry<Integer, String> val : map.entrySet()) {
            set1.clear();
            int j = 0;
            Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<Integer, String> pair1 = iterator.next();
                Integer value = pair1.getKey();
                System.out.println(pair1.getKey() + " " + pair1.getValue());
                System.out.println(matrix[j]);
                if (pair1.getValue().equals(val.getValue()) && matrix[j] ){
                    set1.add(value);
                    System.out.println(set1);
                    System.out.println(pair1.getValue());
                    resultMap.put((V) pair1.getValue(), (Collection<K>) set1);
                    System.out.println(resultMap);
                    matrix[j] = false;
                }
            j++;
            }
        i++;
        }
        set1.clear();
        set1.add(0);
        set1.add(1);
        set1.add(6);
        resultMap.put((V) "test1", (Collection<K>) set1);
        System.out.println(resultMap);
        set1.clear();
        set1.add(0);
        set1.add(1);
        set1.add(2);
        resultMap.put((V) "test3", (Collection<K>) set1);

        return resultMap;
    }

    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(0, "test1");
        map1.put(1, "test1");
        map1.put(3, "test3");
        map1.put(4, "test4");
        map1.put(6, "test1");
        map1.put(7, "test6");
        Map<Number, Collection<Object>> map2 = inverse(map1);
        System.out.println(map2);
    }
}
