import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static int searchCh(String stroka, char findCh) {
        StringBuilder poiskCh = new StringBuilder(stroka);
        //System.out.println(poiskCh);
            String regexp = String.valueOf(findCh);
            Pattern pattern = Pattern.compile(regexp);
            Matcher matcher = pattern.matcher(poiskCh);
        int numFindCh = 0;
        while (matcher.find()) {
            //System.out.println("Найден символ \"" + findCh + "\" - позиция " + (matcher.end() - 1) );
            numFindCh++;
        }
        findCh = (char) ((int) findCh - 32);
        String regexp2 = String.valueOf(findCh);
        Pattern pattern2 = Pattern.compile(regexp2);
        Matcher matcher2 = pattern2.matcher(poiskCh);
        while (matcher2.find()) {
            //System.out.println("Найден символ \"" + findCh + "\" - позиция " + (matcher.end() - 1) );
            numFindCh++;
        }
        //System.out.println("Символ \"" + findCh + "\" встретился " + numFindCh + " раз(а)." );
        return numFindCh;
    }

    public static void main(String[] args) {
        HashMap<Character, Integer> dict1= new HashMap<>(26);
        String newStroka = "AAAsdfdsf,srwe14,7854,,dgd,afrfg6789421,afaSSsd234,1235zcpoyPPudnvode..,10";
        //char newfindCh = 'a';
        for (int i = (int) 'a'; i <= (int) 'z' ; i++) {
            dict1.put((char) i, searchCh(newStroka, (char) i));
        }
        //System.out.println((int) 'a');
        //System.out.println((int) 'A');
        //System.out.println((int) 'z');
        //System.out.println((int) 'Z');
        System.out.println(dict1);
        //searchCh(newStroka, newfindCh);
    }
}