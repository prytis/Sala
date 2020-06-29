import java.util.ArrayList;
import java.util.List;

public class Sala {

    public static void main(String[] args) {
        System.out.println("Socialinis Eksperimentas => Sala");
        System.out.println("------------------------------");
        int count = 4;
        int years = 5;

        List<Person> zmones = new ArrayList<>();

        zmones = colonizeIsland(zmones, count);
        System.out.println("Saloje apgyvendintu zmoniu skaicius: "+ zmones.size());
        printZmones(zmones);


        System.out.println("------------------------------");

        for ( int i = 0; i < years; i++) {
            zmones = increaseAmzius(zmones);
            zmones = newBorn(zmones);
            zmones = runYear(zmones);
        }

        System.out.println("Zmoniu skaicius po "+years+" "+ "metu: "+ zmones.size());
        printZmones(zmones);
        System.out.println("------------------------------");

        }

    /**
     * Atspausdina zmoniu sarsa
     * @param zmones
     */
    private static void printZmones(List<Person> zmones) {
        for (int i = 0; i < zmones.size(); i++) {
            zmones.get(i).printPerson();
        }
    }

    /**
     * padidina visu zmoniu amziu vienais metais
     * @param zmones
     * @return
     */
    private static List<Person> increaseAmzius(List<Person> zmones) {
        for (int i = 0; i < zmones.size(); i++) {
            if (zmones.get(i).getGyvas()) {
                zmones.get(i).incAmzius();
            }
        }
        return zmones;
    }


    /**
     *  Sugeneruoja tikimybe atsirasti naujagimiui arba zmogui numirti
     * @param max
     * @param min
     * @return
     */
    private static int setChanse(int max, int min) {
        int randomInt = (min + (int) (Math.random() * ((max - (min)) + 1)));
        return randomInt;
    }

    /**
     * Suskaiciuoja zmones kurie numirs
     * @param zmones
     * @return
     */
    private static List<Person> runYear( List<Person> zmones) {

        for (int i = 0; i < zmones.size(); i++) {

            if (zmones.get(i).getAmzius() > 10 && zmones.get(i).getAmzius() < 20
                    && setChanse(10, 0) == 0) {
                zmones.get(i).setGyvas();
            }
            if (zmones.get(i).getAmzius() > 20 && zmones.get(i).getAmzius() < 30
                    && setChanse(9, 0) == 0) {
                zmones.get(i).setGyvas();
            }
            if (zmones.get(i).getAmzius() > 30 && zmones.get(i).getAmzius() < 40
                    && setChanse(8, 0) == 0) {
                zmones.get(i).setGyvas();
            }
            if (zmones.get(i).getAmzius() > 40 && zmones.get(i).getAmzius() < 50
                    && setChanse(7, 0) == 0) {
                zmones.get(i).setGyvas();
            }
            if (zmones.get(i).getAmzius() > 50 && zmones.get(i).getAmzius() < 60
                    && setChanse(6, 0) == 0) {
                zmones.get(i).setGyvas();
            }
            if (zmones.get(i).getAmzius() > 60 && zmones.get(i).getAmzius() < 70
                    && setChanse(5, 0) == 0) {
                zmones.get(i).setGyvas();
            }
            if (zmones.get(i).getAmzius() > 70 && zmones.get(i).getAmzius() < 80
                    && setChanse(1, 0) == 0) {
                zmones.get(i).setGyvas();
            }
            if (zmones.get(i).getAmzius() > 80 && zmones.get(i).getAmzius() < 90
                    && setChanse(1, 0) == 0) {
                zmones.get(i).setGyvas();
            }
            if (zmones.get(i).getAmzius() > 90 && zmones.get(i).getAmzius() < 100
                    && setChanse(1, 0) == 0) {
                zmones.get(i).setGyvas();
            }
            if (zmones.get(i).getAmzius() > 100 && zmones.get(i).getAmzius() < 110
                    && setChanse(1, 0) == 0) {
                zmones.get(i).setGyvas();
            }

        }
        return zmones;
    }

    /**
     * Sugeneruoja naujagimius
     * @param zmones
     * @return
     */
    private static List<Person> newBorn( List<Person> zmones) {

        for (int i = 0; i < zmones.size(); i++) {

            if (zmones.get(i).getAmzius() > 10 && zmones.get(i).getAmzius() < 20
                    && setChanse(6, 0) == 0) {
                zmones.add(new getPerson(0));
            }
            if (zmones.get(i).getAmzius() > 20 && zmones.get(i).getAmzius() < 30
                    && setChanse(2, 0) == 0) {
                zmones.add(new getPerson(0));
            }
            if (zmones.get(i).getAmzius() > 30 && zmones.get(i).getAmzius() < 40
                    && setChanse(2, 0) == 0) {
                zmones.add(new getPerson(0));
            }
            if (zmones.get(i).getAmzius() > 40 && zmones.get(i).getAmzius() < 50
                    && setChanse(4, 0) == 0) {
                zmones.add(new getPerson(0));
            }
            if (zmones.get(i).getAmzius() > 50 && zmones.get(i).getAmzius() < 60
                    && setChanse(6, 0) == 0) {
                zmones.add(new getPerson(0));
            }
            if (zmones.get(i).getAmzius() > 60 && zmones.get(i).getAmzius() < 70
                    && setChanse(7, 0) == 0) {
                zmones.add(new getPerson(0));
            }
            if (zmones.get(i).getAmzius() > 70 && zmones.get(i).getAmzius() < 80
                    && setChanse(8, 0) == 0) {
                zmones.add(new getPerson(0));
            }
            if (zmones.get(i).getAmzius() > 80 && zmones.get(i).getAmzius() < 90
                    && setChanse(15, 0) == 0) {
                zmones.add(new getPerson(0));
            }
            if (zmones.get(i).getAmzius() > 90 && zmones.get(i).getAmzius() < 100
                    && setChanse(25, 0) == 0) {
                zmones.add(new getPerson(0));
            }
            if (zmones.get(i).getAmzius() > 100 && zmones.get(i).getAmzius() < 110
                    && setChanse(39, 0) == 0) {
                zmones.add(new getPerson(0));
            }

        }
        return zmones;
    }
    /**
     * Apgyvendina sala kolonistais
     * @param zmones
     * @param count
     * @return
     */
    private static List<Person> colonizeIsland(List<Person> zmones, int count){
        for (int i = 0; i < count; i++) {
            zmones.add(new getPerson());
        }
    return   zmones;
    }
    }


