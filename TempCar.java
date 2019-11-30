import java.sql.DataTruncation;

public class TempCar {


    public Integer model, km, pBigAvto;
    public String gosNum;
    public Double prkm, cena;

    @Override
    public boolean equals(Object obj) {
        TempCar tmpCar = (TempCar) obj;
        return (this.model.equals(tmpCar.model)) && (this.gosNum.equals(tmpCar.gosNum));
    }

    public TempCar(Integer model, String gosNum, Integer km, Double prkm, Double cena, Integer pBigAvto){
        this.model = model;
        this.gosNum = gosNum;
        this.km = km;
        this.prkm = prkm;
        this.cena = cena;
        this.pBigAvto = pBigAvto;
    }

    public Integer getModel() {
        return model;
    }
    public void setModel(Integer model) {
        this.model = model;
    }
    public String getGosNum() {
        return gosNum;
    }
    public void setGosNum(String gosNum) {
        this.gosNum = gosNum;
    }
    @Override
    public String toString()	{
        return "model : " + model + "; gosNum : " + gosNum;
    }
    public Integer getKm() {
        return km;
    }
    public void setKm(Integer model) {
        this.km = km;
    }
    public Integer getPBigAvto() {
        return pBigAvto;
    }
    public void setPBigAvto(Integer pBigAvto) {
        this.pBigAvto = pBigAvto;
    }

}
