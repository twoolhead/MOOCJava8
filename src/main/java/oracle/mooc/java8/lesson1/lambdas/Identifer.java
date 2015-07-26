package oracle.mooc.java8.lesson1.lambdas;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thomas on 7/20/2015.
 */
public class Identifer {

    public void identifyFirst(List<Something> somethings) {
        for(Something something : somethings) {
            if (something.age == 10){
                printFirstFound(something);
            }
        }
    }

    public void identifySecond(List<Something> somethings) {
        for(Something something : somethings) {
            if (something.age == 20){
                printSecondFound(something);
            }
        }
    }

    private void printFirstFound(Something something) {
        System.out.println("Found first : " + something.age + " : " + something.name);
    }

    private void printSecondFound(Something something) {
        System.out.println("Found second : " + something.age + " : " + something.name);
    }

    public static void main(String ... varArgs) {
        Identifer identifier = new Identifer();

        List<Something> listOfSomething = new ArrayList<>();

        Something first = new Something();
        first.name = "first";
        first.age =  10;

        Something second = new Something();
        second.name = "second";
        second.age = 20;

        listOfSomething.add(first);
        listOfSomething.add(second);

        identifier.identifyFirst(listOfSomething);
        identifier.identifySecond(listOfSomething);
    }

}
