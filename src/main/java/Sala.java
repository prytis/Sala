import java.util.ArrayList;
import java.util.List;

public class Sala {
    public static void main(String[] args) {
        System.out.println("Sala");
        int count = 100;
        List<Person> zmones = new ArrayList<>();


        for (int i = 0; i < count; i++) {
            zmones.add(new getPerson());
        }
        for (int i = 0; i < zmones.size(); i++) {
            zmones.get(i).printPerson();
        }
    }
}
