import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(-8,7,2,5,-1,-4,4,11,-9,0,3,8,6);
        System.out.println(list);
        Set<Integer> newList = new LinkedHashSet<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) >= 0) {
                newList.add(list.get(i));
            }
        }
        System.out.println(newList);
    }
}