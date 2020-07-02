import java.util.Arrays;

public abstract class Person {
    String vardas;
    String pavarde;
    int amzius;
    String lytis;
    int vidurkis;
    int[] savybes;
    boolean gyvas;

    public abstract boolean getGyvas();
    public abstract int getAmzius();
    public abstract void setGyvas();
    public abstract void printPerson();
    public abstract void incAmzius();
}


