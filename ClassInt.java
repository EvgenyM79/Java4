public class ClassInt {

    private int[] masInt;
    private int nElement = 0;

    public ClassInt(int[] masInt) {
        this.masInt = masInt;
    }

    public boolean hasNext(){
        return nElement < masInt.length;
    }

    public int next(){
        if (nElement < masInt.length) return masInt[nElement++];
        else return masInt[nElement];
    }

    public int prev(){
        if (nElement > 0) return masInt[nElement--];
        else return masInt[nElement];
    }

    public int carentElement(){
        return nElement;
    }


    public boolean hasPrev(){
        return nElement > 0;
    }

}
