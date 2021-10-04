import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
//        List<String> strings1 = new LinkedList<>();

        strings.add("Firman");
        strings.add("Kurniawan");
        strings.add("2");

        strings.set(0, "TMJ");
        strings.remove(2);
        System.out.println(strings.get(1));

        for (var value : strings){
            System.out.println(value);
        }
    }
}
