package PersonaloStatistika;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import static Sala.CreatePerson.setRandomInInterval;

// Užduotis:
// 1. Turime klasę Darbuotojas - implementuokime enkapsuliaciją
// 2. Sukurkite duobuotojų kolekciją (daugiau nei 10 narių)
// 3. Askaičiuokite amžiaus vidurkį visų darbuotojų
// 4. Atskirai apskaičiuokite atlyginimo vidurkį žmonių,
// ... kurie vyresni nei 50 (reiktų daugiau nei 5 žmonių, kurie vyresni nei 50)

public class Main {
    public static void main(String[] args) {

        List <Darbuotojai> darbuotojai = new ArrayList<>();

        darbuotojai = pasamdytiDarbuotojus(darbuotojai, 100);

        printDarbuotojai(darbuotojai);
        System.out.println("----------------------------------------------");
        System.out.println("");
        System.out.println("Salos darbuotoju amziaus vidurkis:" +
                darbuotojuAmziausVidurkis(darbuotojai) + " metai");

        System.out.println("Salos darbuotoju vyresniu negu 50 metu atlyginimo vidurkis:" +
                darbuotojuAtlygioVidurkis(darbuotojai,50) + " eur");

        System.out.println("");
        System.out.println("----------------------------------------------");



    }
    /**
     * Pasamdomi darbuotojai
     * @param darbuotojai
     * @param count
     * @return
     */
    public static List<Darbuotojai> pasamdytiDarbuotojus(List<Darbuotojai> darbuotojai, int count){
        for (int i = 0; i < count; i++) {
            darbuotojai.add(new Darbuotojai(setRandomInInterval(75, 18) ));
        }
        return   darbuotojai;
    }
    /**
     * Atspausdina darbuotoju sarsa
     * @param darbuotojai
     */
    private static void printDarbuotojai(List<Darbuotojai> darbuotojai) {
        for (int i = 0; i < darbuotojai.size(); i++) {
            darbuotojai.get(i).printPerson(1);
        }
    }
    /**
     * Suskaiciuoja darbuotoju amziaus virurki
     * @param darbuotojai
     */
    private static String darbuotojuAmziausVidurkis(List<Darbuotojai> darbuotojai) {
        float vidurkis = 0;
        for (int i = 0; i < darbuotojai.size(); i++) {
            vidurkis += darbuotojai.get(i).getAmzius();
        }
        return String.format("%.4g",vidurkis/darbuotojai.size());
    }

    /**
     * Suskaiciuoja darbuotoju atlyginimo vidutki vyresviu negu @param amzius
     * @param darbuotojai
     * @param amzius
     * @return
     */
    private static String darbuotojuAtlygioVidurkis(List<Darbuotojai> darbuotojai, int amzius) {
        float suma = 0;
        int count = 0;
        float vidurkis;
        for (int i = 0; i < darbuotojai.size(); i++) {
            if (darbuotojai.get(i).getAmzius() >= amzius) {
                suma += darbuotojai.get(i).getSavybes().getAtlygis();
                count++;
            }
        }
        String pattern = "##.00";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);

        String format = decimalFormat.format(suma/count);

        return format;
    }
}


