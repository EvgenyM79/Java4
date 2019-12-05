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
        String goodName1 =  "";
        String name1 = "";
        //String goodname = getClass().getName();
        int maxValue1 = 0;
        int value =0;
        String[] name = new String[]{"Петр", "Иван", "Сергей", "Павел", "Юрий","Ваня", "Петр","Генадий", "Василий"};
        HashMap m1 = new HashMap();
        for (int i = 0; i < 15; i ++){
            name1 = name[generateInt()];
            value = generateInt();
            if (value > maxValue1){
                maxValue1 = value;
                goodName1 = name1;
            }
            new Itog(m1, name1, value);
        }
        System.out.println(m1);
        System.out.println("Лучший результат у " + goodName1 + " " + maxValue1);

	// write your code here
    }
}
