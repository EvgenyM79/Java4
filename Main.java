import java.util.HashMap;
import java.util.Map;

public class Main {


    public static void main(String[] args) {
        String[] name = new String[]{"Петр", "Иван", "Сергей", "Павел", "Юрий","Ваня", "Петр"};
        HashMap<String, Integer> m1 = new HashMap();
        HashMap<Integer, String> m2 = new HashMap();
        new newMap(m1, name,15);
        System.out.println(m1);
        new RevertHashMap(m1,m2);
        System.out.println(m2);
	// write your code here
    }
}
