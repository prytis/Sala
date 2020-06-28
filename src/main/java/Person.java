import java.util.Arrays;

public abstract class Person {

    String vardas;
    String pavarde;
    int amzius;
    String lytis;
    int vidurkis;
    int[] pazymiai;


    public void printPerson() {

        System.out.println(this.vardas + " "
                + this.pavarde + " " +
                this.amzius + " " +
                this.lytis + " " +
                Arrays.toString(this.pazymiai)+ " "+
                this.vidurkis);


    }
}

