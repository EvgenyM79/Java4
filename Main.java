import java.util.ArrayList;
import java.util.HashSet;

public class Main {

    public static Integer generateInt(){
        return (int) (Math.random()*5);
    }
    public static void main(String[] args) {
        ArrayList<ClassUser> listExample = new ArrayList<ClassUser>();
        HashSet<ClassUser> list2 = new HashSet<ClassUser>();
        String[] fam = new String[]{"Иванов", "Петров", "Сидоров", "Сорокин", "Свистунов"};
        String[] name = new String[]{"Петр", "Иван", "Сергей", "Павел", "Юрий"};
        int nName = 0, nFam = 0;

        for (int i = 0; i < 25; i++) {
            nName = generateInt();
            nFam = generateInt();
            ClassUser user1 = new ClassUser(name[nName], fam[nFam]);
            listExample.add(user1);
            //colExample.add(user1);
        }
        int count = 0;
        for (ClassUser user : listExample) {
            System.out.println(count + " " + user.name + " " + user.fam);
            count++;
        }
        System.out.println(" Число объектов = " + count);
        boolean t =true;
        while (t) {
            t = false;
            for (int i = 0; i < listExample.size(); i++) {
                for (int j = i; j < listExample.size(); j++) {
                    if (i != j && listExample.get(i).equals(listExample.get(j))) {
                        listExample.remove(j);
                        t = true;
                    }
                }
            }
        }
        count = 0;
        //listExample.removeIf(Objects::);
        //Set<ClassUser> listExample2 = new HashSet<ClassUser>(listExample);
        //List<ClassUser> listExample2 = listExample.stream().distinct().collect(Collectors.toCollection(LinkedList::new));
        //listExample.stream().distinct().collect(Collectors.toList());

        //listExample.clear();
        //listExample.addAll(listExample2);
        count = 0;
        for (ClassUser user : listExample) {
            System.out.println(count + " " + user.name + " " + user.fam);
            count++;
        }
        System.out.println(" Число объектов = " + count);

    }
}
