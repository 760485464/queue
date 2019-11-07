import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lambda {
    public static void main(String []ages) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        for (Integer lists : list) {
            System.out.print(lists);
        }
        System.out.println("-----------------------------");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
        System.out.println("----------------------------");
        list.forEach(System.out::print);

    }


     public void test(String str){

     }
}
