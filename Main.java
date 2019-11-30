import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] masCar = new String[]{"C100_1-100", "C200_1-120-1200", "C300_1-120-30", "C400_1-80-20", "C100_2-50", "C200_2-40-1000", "C300_2-200-45", "C400_2-10-20",
                "C100_3-10", "C200_3-170-1100", "C300_3-150-29", "C400_3-100-28", "C100_1-300", "C200_1-100-750", "C300_1-32-15", "C200_4-200-15"};
        double[][] masVes = new double[][]{{100, 12.5, 46.10, 0}, {200, 12, 48.90, 0}, {300, 11.5, 47.50, 0},{400, 20, 48.90, 0}};
        TempCar[] tempAllCar = new TempCar[masCar.length]; // массив машин с параметрами (например объект с индексом 1: {200,"1", 120, 1200}
        String[] masParCar = masCar[0].substring(1).split("[-_]+"); //Инициализация переменной для разложение (например "200_1-120-1200) на все параметры одной машины
        ArrayList<TempCar> listCar = new ArrayList<TempCar>();
        TempCar tmpCar = new TempCar(0,"",0,0.0,0.0,0);
        for (int i = 0; i < masCar.length; i++) {
            masParCar = masCar[i].split("[-_]+");
            switch (masParCar[0]) {
                case "C100": {
                    tempAllCar[i] = new TempCar(Integer.parseInt(masParCar[0].replaceFirst("C", "")), masParCar[1],
                            Integer.parseInt(masParCar[2]), masVes[0][1], masVes[0][2], 0);
                    tmpCar = new TempCar(Integer.parseInt(masParCar[0].replaceFirst("C", "")), masParCar[1],
                            Integer.parseInt(masParCar[2]), masVes[0][1], masVes[0][2], 0);
                    //ClassCar[i] = new tempAllCar[i];
                    if (!listCar.contains(tmpCar)) {
                        listCar.add(tmpCar);
                        //System.out.println(" =" + listCar.get(listCar.size()-1).gosNum);
                    }
                    else {
                        ListIterator<TempCar> iterator = listCar.listIterator();
                        while (iterator.hasNext()) {
                            TempCar next = iterator.next();
                            if (next.equals(tmpCar)) {
                                //Replace element
                                System.out.println(iterator.nextIndex()-1 + " " + listCar.get(iterator.nextIndex()-1).km + " + " + tmpCar.km );
                                System.out.println(iterator.nextIndex()-1 + " " + listCar.get(iterator.nextIndex()-1).pBigAvto + " + " + tmpCar.pBigAvto );
                                tmpCar.km += listCar.get(iterator.nextIndex()-1).km;
                                tmpCar.pBigAvto += listCar.get(iterator.nextIndex()-1).pBigAvto;
                                iterator.set(tmpCar);
                            }
                        }
                        }
                    //listCar.add(tmpCar);
                    System.out.println("М:"+ tempAllCar[i].model + " Гос№:" + tempAllCar[i].gosNum + " Пр: " + tempAllCar[i].km +  " расход:" + tempAllCar[i].prkm + " цена:" + tempAllCar[i].cena + " доп пр: " + tempAllCar[i].pBigAvto);
                    //System.out.println(listCar);
                    break;
                }
                case "C200": {
                    tempAllCar[i] = new TempCar(Integer.parseInt(masParCar[0].replaceFirst("C", "")), masParCar[1],
                            Integer.parseInt(masParCar[2]), masVes[1][1], masVes[1][2], Integer.parseInt(masParCar[3]));
                    tmpCar = new TempCar(Integer.parseInt(masParCar[0].replaceFirst("C", "")), masParCar[1],
                            Integer.parseInt(masParCar[2]), masVes[1][1], masVes[1][2], Integer.parseInt(masParCar[3]));
                    if (!listCar.contains(tmpCar)) {
                        listCar.add(tmpCar);
                        //System.out.println(" =" + listCar.get(listCar.size()-1).gosNum);
                    }
                    else {
                        ListIterator<TempCar> iterator = listCar.listIterator();
                        while (iterator.hasNext()) {
                            TempCar next = iterator.next();
                            if (next.equals(tmpCar)) {
                                //Replace element
                                System.out.println(iterator.nextIndex()-1 + " " + listCar.get(iterator.nextIndex()-1).km + " + " + tmpCar.km );
                                System.out.println(iterator.nextIndex()-1 + " " + listCar.get(iterator.nextIndex()-1).pBigAvto + " + " + tmpCar.pBigAvto );
                                tmpCar.km += listCar.get(iterator.nextIndex()-1).km;
                                tmpCar.pBigAvto += listCar.get(iterator.nextIndex()-1).pBigAvto;
                                iterator.set(tmpCar);
                            }
                        }
                    }
                    System.out.println("М:"+ tempAllCar[i].model + " Гос№:" + tempAllCar[i].gosNum + " Пр: " + tempAllCar[i].km +  " расход:" + tempAllCar[i].prkm + " цена:" + tempAllCar[i].cena + " доп пр: " + tempAllCar[i].pBigAvto);
                    break;
                }
                case "C300": {
                    tempAllCar[i] = new TempCar(Integer.parseInt(masParCar[0].replaceFirst("C", "")), masParCar[1],
                            Integer.parseInt(masParCar[2]), masVes[2][1], masVes[2][2], Integer.parseInt(masParCar[3]));
                    tmpCar = new TempCar(Integer.parseInt(masParCar[0].replaceFirst("C", "")), masParCar[1],
                            Integer.parseInt(masParCar[2]), masVes[2][1], masVes[2][2], Integer.parseInt(masParCar[3]));
                    if (!listCar.contains(tmpCar)) {
                        listCar.add(tmpCar);
                        //System.out.println(" =" + listCar.get(listCar.size()-1).gosNum);
                    }
                    else {
                        ListIterator<TempCar> iterator = listCar.listIterator();
                        while (iterator.hasNext()) {
                            TempCar next = iterator.next();
                            if (next.equals(tmpCar)) {
                                //Replace element
                                System.out.println(iterator.nextIndex()-1 + " " + listCar.get(iterator.nextIndex()-1).km + " + " + tmpCar.km );
                                System.out.println(iterator.nextIndex()-1 + " " + listCar.get(iterator.nextIndex()-1).pBigAvto + " + " + tmpCar.pBigAvto );
                                tmpCar.km += listCar.get(iterator.nextIndex()-1).km;
                                tmpCar.pBigAvto += listCar.get(iterator.nextIndex()-1).pBigAvto;
                                iterator.set(tmpCar);
                            }
                        }
                    }
                    System.out.println("М:"+ tempAllCar[i].model + " Гос№:" + tempAllCar[i].gosNum + " Пр: " + tempAllCar[i].km +  " расход:" + tempAllCar[i].prkm + " цена:" + tempAllCar[i].cena + " доп пр: " + tempAllCar[i].pBigAvto);
                    break;
                }
                case "C400": {
                    tempAllCar[i] = new TempCar(Integer.parseInt(masParCar[0].replaceFirst("C", "")), masParCar[1],
                            Integer.parseInt(masParCar[2]), masVes[3][1], masVes[3][2], Integer.parseInt(masParCar[3]));
                    tmpCar = new TempCar(Integer.parseInt(masParCar[0].replaceFirst("C", "")), masParCar[1],
                            Integer.parseInt(masParCar[2]), masVes[3][1], masVes[3][2], Integer.parseInt(masParCar[3]));
                    if (!listCar.contains(tmpCar)) {
                        listCar.add(tmpCar);
                        //System.out.println(" =" + listCar.get(listCar.size()-1).gosNum);
                    }
                    else {
                        ListIterator<TempCar> iterator = listCar.listIterator();
                        while (iterator.hasNext()) {
                            TempCar next = iterator.next();
                            if (next.equals(tmpCar)) {
                                //Replace element
                                System.out.println(iterator.nextIndex()-1 + " " + listCar.get(iterator.nextIndex()-1).km + " + " + tmpCar.km );
                                System.out.println(iterator.nextIndex()-1 + " " + listCar.get(iterator.nextIndex()-1).pBigAvto + " + " + tmpCar.pBigAvto );
                                tmpCar.km += listCar.get(iterator.nextIndex()-1).km;
                                tmpCar.pBigAvto += listCar.get(iterator.nextIndex()-1).pBigAvto;
                                iterator.set(tmpCar);
                            }
                        }
                    }
                    System.out.println("М:"+ tempAllCar[i].model + " Гос№:" + tempAllCar[i].gosNum + " Пр: " + tempAllCar[i].km +  " расход:" + tempAllCar[i].prkm + " цена:" + tempAllCar[i].cena + " доп пр: " + tempAllCar[i].pBigAvto);
                    break;
                }
            }
        }
        System.out.println("ArrayList без дублей");
        for (TempCar car : listCar){
            System.out.println("М:"+ car.model + " Гос№:" + car.gosNum + " Пр: " + car.km +  " расход:" + car.prkm + " цена:" + car.cena + " доп пр: " + car.pBigAvto);
        }
        ClassCalc.calcAll(listCar);
        listCar.sort(new Comparator<TempCar>() {
            @Override
            public int compare(TempCar o1, TempCar o2) {
                return o1.km.compareTo(o2.km);

            }
        });
        System.out.println("ArrayList отсортированный по пробегу ");
        for (TempCar car : listCar){
            System.out.println("М:"+ car.model + " Гос№:" + car.gosNum + " Пр: " + car.km +  " расход:" + car.prkm + " цена:" + car.cena + " доп пр: " + car.pBigAvto);
        }

        listCar.sort(new Comparator<TempCar>() {
            @Override
            public int compare(TempCar o1, TempCar o2) {
                return o1.pBigAvto.compareTo(o2.pBigAvto) + o1.km.compareTo(o2.km);

            }
        });
        System.out.println("ArrayList отсортированный по пробегу и доп. параметру ");
        for (TempCar car : listCar){
            System.out.println("М:"+ car.model + " Гос№:" + car.gosNum + " Пр: " + car.km +  " расход:" + car.prkm + " цена:" + car.cena + " доп пр: " + car.pBigAvto);
        }
    }
}



