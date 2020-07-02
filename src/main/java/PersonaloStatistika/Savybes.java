package PersonaloStatistika;

import Enumai.Lytis;
import Enumai.Pareigos;

import static Sala.CreatePerson.setRandomInInterval;

public class Savybes {
    String pareigos;
    int atlygis;
    int stazas;

    public String getPareigos() {
        return pareigos;
    }

    public int getAtlygis() {
        return atlygis;
    }


    public int getStazas() {
        return stazas;
    }

    public Savybes(){
        this.pareigos = setPareigos();
        this.atlygis = setRandomInInterval(2500, 500);
        this.stazas = setRandomInInterval(30, 0);
    };
    /**
     * getPareigos() sugeneruoja atsitiktines pareigas ,  iš 6 variantų
     * @return
     */
    private String setPareigos() {
        Pareigos pareigos = Pareigos.get(setRandomInInterval(5, 0));
        return pareigos.toString();
    }
}
