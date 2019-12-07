public class Main {

    public static void main(String[] args) {
        int[] masInt = new int[]{23,7,12,9,35,45,3};
        ClassInt masNew = new ClassInt(masInt);
        //masNew.show();
        System.out.println("Реализация next ");
        System.out.print("Номер элемента " + masNew.carentElement());
        System.out.println(" значение = " + masNew.next());
        System.out.print("Номер элемента " + masNew.carentElement());
        System.out.println(" значение = " + masNew.next());
        System.out.print("Номер элемента " + masNew.carentElement());
        System.out.println(" значение = " + masNew.next());

        System.out.println("Реализация prev ");
        System.out.print("Номер элемента " + masNew.carentElement());
        System.out.println(" значение = " + masNew.prev());
        System.out.print("Номер элемента " + masNew.carentElement());
        System.out.println(" значение = " + masNew.prev());
        System.out.print("Номер элемента " + masNew.carentElement());
        System.out.println(" значение = " + masNew.prev());
        System.out.print("Номер элемента " + masNew.carentElement());
        System.out.println(" значение = " + masNew.prev());
        System.out.print("Номер элемента " + masNew.carentElement());
        System.out.println(" значение = " + masNew.prev());


        System.out.println("Используем hashnext");
        while (masNew.hasNext()) {
            System.out.print(masNew.next() + " ");
        }
    }
}
