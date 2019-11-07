import org.omg.PortableInterceptor.ObjectReferenceFactory;

import java.io.PrintStream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class streamlambad {
    public static void main (String[] args) {
        

      /*  List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        Stream<Integer> stream = integers.stream();
        Stream<Integer> integerStream = stream.map(a -> a + 1);
        System.out.println(integerStream.max(Comparator.comparing(value -> value)).get());

    //  https://zhuanlan.zhihu.com/p/28226687
        Stream<String> a = Stream.of("a", "b", "c");
        List<String> collect = a.collect(Collectors.toList());
        System.out.println(collect);
       *//* int[] s={1,2,3};
        IntStream stream1 = Arrays.stream(s);
         stream1.forEach(
                 (w)-> {System.out.println(w);}
         );*//*

        Set<Integer> collect1 = Stream.of(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6)).flatMap(ss -> ss.stream()).filter(c -> c > 2).map(e -> e + 1).collect(Collectors.toSet());
           collect1.forEach(System.out::println);*/

       /* List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Stream<Integer> stream = integers.stream();

        Set<Integer> collect = stream.map(integer -> integer + 1).filter(s->s>5).collect(Collectors.toSet());
        System.out.println(collect.toString());*/

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Stream<Integer> stream = integers.stream();
        /*Optional<Integer> max = stream.map(s->s+5).max(Comparator.comparing(value -> value));
        System.out.println(max.get());*/
        List<Integer> integers2 = Arrays.asList(10,11,12,13);
        Stream<Integer> stream1 = integers2.stream();

        //List<Object> collect = Stream.of(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6)).flatMap(ss -> ss.stream()).collect(Collectors.toList());
        List<Integer> collect = Stream.of(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6)).flatMap(ss -> ss.stream()).collect(Collectors.toList());
        System.out.println(collect.toString());
    }
}
