import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Itog {

    public String goodName;
    public int maxValue;

    public Itog(HashMap<String, Integer> m1, String name, int val) {
            System.out.println(name + " " + val);
            boolean f = true;
            boolean t = true;
            if (m1.size() == 0) {
                maxValue = val; //(Collections.max(m1.values()));
                goodName = name;
                m1.put(name, val);
                f = false;
            }
            if (f) {
                for (Map.Entry<String, Integer> entry : m1.entrySet()) {
                    if (name.equals(entry.getKey())) {
                        t = false;
                    }
                }
            }

            if (f && !t) {
                boolean k = true;
                for (Map.Entry<String, Integer> entry : m1.entrySet()) {
                    if (val > entry.getValue() && k) {
                        maxValue = val; //(Collections.max(m1.values()));
                        goodName = name;
                        m1.put(name, val);
                        f = false;
                    }
                }
            }

            if (f && t) {
                if (val > maxValue) {
                    maxValue = val; //(Collections.max(m1.values()));
                    goodName = name;
                    m1.put(name, val);
                    f = false;
                }
            }
        }
    }



