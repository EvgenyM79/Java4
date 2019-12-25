import java.util.*;

public class InvertMap<K,V> {
    private Map<K, V> map;
    private Map<V, Collection<K>> map2;

    public InvertMap(Map<K, V> map, Map<V, Collection<K>> map2){
        this.map = map;
        map2 = invertMap(map);
        this.map2 = map2;
    }

    private <K, V> Map<V, Collection<K>> invertMap(Map<K, V> map) {
        Map<V, Collection<K>> reverseMap = new HashMap<>();
        //Перебираем по значениям
        for (Map.Entry entry : map.entrySet()) {
            //Если еще такого ключа в развернутой мапе нет, то создаем ключ и пустой массив значений
            if (!reverseMap.containsKey(entry.getValue())) {
                reverseMap.put((V)entry.getValue(), new ArrayList());
            }
            //получаем массив значений для данного ключа в развернутой мапе
            Collection<K> keys = reverseMap.get(entry.getValue());
            //добавляем текуще значение в массив
            keys.add((K) entry.getKey());
            //добавляем в нашу map2 ключ и новый массив значений keys
            reverseMap.put((V)entry.getValue(), keys);
        }
        return reverseMap;
    }

    public Map<V, Collection<K>> getMap2(){
        return map2;
    }
}
