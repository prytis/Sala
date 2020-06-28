import Enumai.*;

import java.util.Arrays;
import java.util.Random;

public class getPerson extends Person {

    getPerson() {

        this.lytis = getLytis();
        this.vardas = getVardas();
        this.pavarde = getPavarde();
        this.amzius = getAmzius();
        this.pazymiai = getPazymai();
        this.vidurkis = vidurkis();
    }

    private int vidurkis(){
        int vid = 0;
        for (int  i=0; i < this.pazymiai.length; i++){
            vid += this.pazymiai[i];
        }
        return vid;
    }



    /**
     * getKlase() sugeneruoja atsitiktinį skaičių nuo 1 iki 12
     * @return
     */
    private int getAmzius() {
        return setRandomInInterval(90, 1);
    }

    /**
     * getLytis() sugeneruoja atsitiktine lytį , kol kas iš dviejų variantų
     * @return
     */
    private String getLytis() {
        Lytis lytis = Lytis.get(setRandomInInterval(1, 0));
        return lytis.toString();
    }

    /**
     * getPazymiai() sugeneruoja 5 elementų masyvą su atsitinktiniai pažymiais nuo 3 iki 10
     * @return
     */
    private  int[] getPazymai(){
        int[] pazymiai = new int[5];
        for (int i = 0; i < pazymiai.length; i++){
            pazymiai[i] = setRandomInInterval(10, 3);
        }
        return pazymiai;
    }

    /**
     * getVardas() atsitiktinai sugeneruoja varda prasidedantį didžiąja raide
     * @return String  str
     */
    private  String getVardas() {
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
    private String getPavarde() {
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



}
