import java.util.HashMap;
import java.util.Map;

public class Main {

    //public String veryName;
    public int maxValue;

    public static int generateInt(){
        return (int) (Math.random()*8);
    }
    String goodname = getClass().getName();

    public static void main(String[] args) {
        String goodName =  "";
        //String goodname = getClass().getName();
        int maxValue = 0;

        String[] name = new String[]{"Петр", "Иван", "Сергей", "Павел", "Юрий","Ваня", "Петр","Генадий", "Василий"};
        HashMap<String, Integer> m1 = new HashMap();
        for (int i = 0; i < 15; i ++){
            new Itog(m1, name[generateInt()], generateInt());
        }
        System.out.println(m1);
        System.out.println("Лучший результат у " + goodName + " " + maxValue);

	// write your code here
    }
}
