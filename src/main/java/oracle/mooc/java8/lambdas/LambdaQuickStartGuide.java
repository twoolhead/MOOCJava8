package oracle.mooc.java8.lambdas;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thomas on 7/20/2015.
 */
public class LambdaQuickStartGuide {

    public void sortingWithLambdas() {
        List<Something> listOfSomething = new ArrayList<>();

        Something first = new Something();
        first.name = "first";
        first.age =  10;

        Something second = new Something();
        second.name = "second";
        second.age = 20;

        listOfSomething.add(first);
        listOfSomething.add(second);

        listOfSomething.sort((Something a, Something b) -> a.name.compareTo(b.name));
        listOfSomething.forEach(System.out::println);

        // reverse sort
        listOfSomething.sort((a,  b) -> b.name.compareTo(a.name));
        listOfSomething.forEach(System.out::println);
    }

    public static void main(String ... varArgs) {
        LambdaQuickStartGuide guide = new LambdaQuickStartGuide();
        guide.sortingWithLambdas();
    }

}
