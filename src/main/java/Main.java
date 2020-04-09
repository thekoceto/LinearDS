import implementations.ArrayList;
import interfaces.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("0");
        names.add("1");
        names.add("3");
        names.add("4");
        names.add("5");
        names.add("6");
        names.add(2,"2");

        for (String name : names ) {
            System.out.println(name);
        }
    }
}
