import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeMap;

public class ClassCalc {

    public static int n;

    public static void calcAll(ArrayList<TempCar> listCar){
        double[] allkm = {0,0,0,0};
        TreeMap<Double, Integer> map2 = new TreeMap<Double, Integer>();
        //TempCar chCar = new TempCar(0, "",0,0.0,0.0,0);

        for (TempCar car : listCar) {
            switch (car.model) {
                case 100: {
                    allkm[0] += car.km * car.prkm * car.cena / 100;
                    break;
                }
                case 200: {
                    allkm[1] += car.km * car.prkm * car.cena / 100;
                    break;
                }
                case 300: {
                    allkm[2] += car.km * car.prkm * car.cena / 100;
                    break;
                }
                case 400: {
                    allkm[3] += car.km * car.prkm * car.cena / 100;
                    break;
                }
            }
        }
        System.out.println("Расход для легковых авто(C100) составил " + allkm[0]);
        System.out.println("Расход для грузовых авто(C200) составил " + allkm[1]);
        System.out.println("Расход для посажирских авто(C300) составил " + allkm[2]);
        System.out.println("Расход для тяжелой техники (краны)(C400) составил " + allkm[3]);
        System.out.println("Общий расход составил " + (allkm[0] +allkm[1] + allkm[2] + allkm[3]));

        for (int i = 0; i < 4; i ++) {
            map2.put(allkm[i], (i+1)*100);
        }
        System.out.println(map2);
        System.out.print("Тип авто " + map2.get(map2.firstKey()));
        System.out.println(" с наименьшей стоимостью расходов " + map2.firstKey());
        System.out.print("Тип авто " + map2.get(map2.lastKey()));
        System.out.println(" с наибольшей стоимость расходов " + map2.lastKey());
    }
}
