import Enumai.*;
import java.util.Arrays;
import java.util.Random;

public class getPerson extends Person {

    getPerson() {
        this.lytis = setLytis();
        this.vardas = setVardas();
        this.pavarde = setPavarde();
        this.amzius = setAmzius();
        this.savybes = setSavybes();
        this.vidurkis = vidurkis();
        this.gyvas = true;
    }
    getPerson(int amzius) {
        this.lytis = setLytis();
        this.vardas = setVardas();
        this.pavarde = setPavarde();
        this.amzius = amzius;
        this.savybes = setSavybes();
        this.vidurkis = vidurkis();
        this.gyvas = true;
    }

    private int vidurkis(){
        int vid = 0;
        for (int  i=0; i < this.savybes.length; i++){
            vid += this.savybes[i];
        }
        return vid;
    }



    /**
     * getAmzius() sugeneruoja atsitiktinį skaičių nuo 1 iki 90
     * @return
     */
    private int setAmzius() {
        return setRandomInInterval(90, 0);
    }

    /**
     * getLytis() sugeneruoja atsitiktine lytį , kol kas iš dviejų variantų
     * @return
     */
    private String setLytis() {
        Lytis lytis = Lytis.get(setRandomInInterval(1, 0));
        return lytis.toString();
    }

    /**
     * getSavybes() sugeneruoja 5 elementų masyvą su atsitinktemis savybemis skaleje  nuo 0 iki 10
     * @return
     */
    private  int[] setSavybes(){
        int[] savybes = new int[5];
        for (int i = 0; i < savybes.length; i++){
            savybes[i] = setRandomInInterval(10, 3);
        }
        return savybes;
    }

    /**
     * getVardas() atsitiktinai sugeneruoja varda prasidedantį didžiąja raide
     * @return String  str
     */
    private  String setVardas() {
        String str = "";
        Random rn = new Random();
        int flag = 1;
        int ilgis = setRandomInInterval(6, 3);
        int ranCaital = setRandomInInterval(90, 65);
        int ranSmall = setRandomInInterval(121, 97);
        for (int i = 0; i < ilgis; i++) {
            if (i == 0) {
                CapitalLetter Capital = CapitalLetter.get(setRandomInInterval(23, 0));
                str = str + Capital;
            } else {
                if (flag == 1) {
                    Sonant balse = Sonant.get(setRandomInInterval(10, 0));
                    str = str + balse;
                    flag = 0;
                } else {
                    Consonant priebalse = Consonant.get(setRandomInInterval(18, 0));
                    str = str + priebalse;
                    flag = 1;
                }
            }

        }
        if (flag == 0) {
            Consonant priebalse = Consonant.get(setRandomInInterval(18, 0));
            str = str + priebalse;
        }
        if (this.lytis == "mot"){
            GetEndM galune = GetEndM.get(setRandomInInterval(1, 0));
            str = str + galune;
        } else {
            GetEnd galune = GetEnd.get(setRandomInInterval(2, 0));
            str = str + galune;
        }
        return str;
    }

    /**
     * getPavarde() sugeneruoja atsitiktinę pavardę, priklausančią nuo lyties
     * @return String str
     */
    private String setPavarde() {
        String str = "";
        Random rn = new Random();
        int flag = 1;
        int ilgis = setRandomInInterval(8, 4);
        int ranCaital = setRandomInInterval(90, 65);
        int ranSmall = setRandomInInterval(121, 97);
        for (int i = 0; i < ilgis; i++) {
            if (i == 0) {
                CapitalLetter Capital = CapitalLetter.get(setRandomInInterval(23, 0));
                str = str + Capital;
            } else {
                if (flag == 1) {
                    Sonant balse = Sonant.get(setRandomInInterval(10, 0));
                    str = str + balse;
                    flag = 0;
                } else {
                    Consonant priebalse = Consonant.get(setRandomInInterval(18, 0));
                    str = str + priebalse;
                    flag = 1;
                }
            }

        }
        if (flag == 0) {
            Consonant priebalse = Consonant.get(setRandomInInterval(18, 0));
            str = str + priebalse;
        }
        if (this.lytis == "mot"){
            GetSecondEndM galune = GetSecondEndM.get(setRandomInInterval(4, 0));
            str = str + galune;
        } else {
            GetSecondEnd galune = GetSecondEnd.get(setRandomInInterval(3, 0));
            str = str + galune;
        }
        return str;
    }

    /**
     * setRandomInInterval(int max, int min) sugeneruoja atsitiktinį skaičių užduotame internale
     * @param max intervalo maksimali reiksme
     * @param min intervalo minimali reiksme
     * @return int randomInt
     */
    private static int setRandomInInterval(int max, int min) {
        int randomInt = (min + (int) (Math.random() * ((max - (min)) + 1)));
        return randomInt;
    }

    /**
     *  Nustato pozymį kad zmogus mires
     */
    public void setGyvas() {
        this.gyvas = false;
    }

    /**
     * grazina ar zmogus mires ar gyvas
     * @return
     */
    public boolean getGyvas() {
        return gyvas;
    }

    /**
     * Grazina zmogaus varda
     * @return
     */
    public String getVardas() {
        return vardas;
    }

    /**
     * Grazina zmogaus pavarde
     * @return
     */
    public String getPavarde() {
        return pavarde;
    }

    /**
     * Grazina zmogaus amziu
     * @return
     */
    public int getAmzius() {
        return amzius;
    }

    /**
     * padidina zmogaus amziu 1 metais
     */
    public void incAmzius() {
        this.amzius++;
    }

    /**
     * grazina zmogaus lyti
     * @return
     */
    public String getLytis() {
        return lytis;
    }

    public int getVidurkis() {
        return vidurkis;
    }

    /**
     * Grazina zmogaus savybes
     * @return
     */
    public int[] getSavybes() {
        return savybes;
    }

    /**
     *  Atspausdina vieno zmogaus duomenis
     */
    public void printPerson() {

        System.out.println(this.vardas + " "
                + this.pavarde + " " +
                this.amzius + " " +
                this.lytis + " " +
                Arrays.toString(this.savybes)+ " "+
                this.gyvas);


    }


}
