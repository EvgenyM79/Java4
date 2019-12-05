public class Main {


    public static void main(String[] args) {
        Del val = new Del("45", "s");
       try {
            System.out.println(val.del());
        }
        catch (MyException e) {
            System.out.println(ExceptionEnum.valueOf(e.p).getTitle());
        }


        //System.out.println(val.del());




        //System.out.println(val.del());



	// write your code here
        //DaysEnum d1 = new DaysEnum();
       /* for (DaysEnum d : DaysEnum.valueOf()){
            System.out.println(d.getTitle() + " " + d.getTitle());
        }*/
    }
}

