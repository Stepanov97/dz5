import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,-4,6,10,11,2,45,-8,6,7,-2,10);
        System.out.println(list);
        Set<Integer> newList = new TreeSet<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) >= 0) {
                newList.add(list.get(i));
            }
        }
        System.out.println(newList);
    }
}