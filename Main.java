import java.util.ArrayList;



public class Main {


    public static void main(String[] args) {
        String[] name = new String[]{"Петр", "Иван", "Сергей", "Павел", "Юрий","Ваня", "Петр"};
        ArrayList<String> listExample3 = new ArrayList<String>();
        //ArrayList<String> listExample3 = new ArrayList<String>();
        new ListString(listExample3,name, 25);
        System.out.println(listExample3);
        new RemoveDuplicate(listExample3);
        //System.out.println(new RemoveDuplicate(listExample3));
        System.out.println(listExample3);
    }
}
