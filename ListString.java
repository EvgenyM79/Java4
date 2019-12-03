import java.util.ArrayList;

public class ListString {

    public Integer generateInt(){
        return (int) (Math.random()*7);
    }

    public ListString(ArrayList<String> newList ,String[] name, int num) {
        for (int i = 0; i < num; i++) {
            newList.add(name[generateInt()]);
        }
    }

}
