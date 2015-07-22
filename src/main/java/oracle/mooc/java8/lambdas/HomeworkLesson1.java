/**
 * Copyright © 2014, Oracle and/or its affiliates. All rights reserved.
 *
 * JDK 8 MOOC Lesson 1 homework
 */
package oracle.mooc.java8.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Speakjava (simon.ritter@oracle.com)
 */
public class HomeworkLesson1 {
  /**
   * Run the exercises to ensure we got the right answers
   */
  public void runExercises() {
    System.out.println("JDK 8 Lambdas and Streams MOOC Lesson 1");
    System.out.println("Running exercise 1 solution...");
    exercise1();
    System.out.println("Running exercise 2 solution...");
    exercise2();
    System.out.println("Running exercise 3 solution...");
    exercise3();
    System.out.println("Running exercise 4 solution...");
    exercise4();
    System.out.println("Running exercise 5 solution...");
    exercise5();
  }

  /**
   * All exercises should be completed using Lambda expressions and the new
   * methods added to JDK 8 where appropriate. There is no need to use an
   * explicit loop in any of the code. Use method references rather than full
   * lambda expressions wherever possible.
   */
  /**
   * Exercise 1
   *
   * Create a string that consists of the first letter of each word in the list
   * of Strings provided.
   */
  private void exercise1() {
    List<String> list = Arrays.asList(
        "alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

    StringBuilder firstLetterBuilder = new StringBuilder();
    //list.forEach(s -> firstLetterBuilder.append(s.substring(0, 1)));
    //list.forEach(firstLetterBuilder::append);

    System.out.println(firstLetterBuilder);

    list.forEach(s -> System.out.println(s.substring(0, 1)));
    list.stream().map(s -> s.substring(0, 1)).forEach(System.out::println);
  }

  /**
   * Exercise 2
   *
   * Remove the words that have odd lengths from the list.
   */
  private void exercise2() {
    List<String> list = new ArrayList<>(Arrays.asList(
        "alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));

    list.stream().filter((s) -> s.length() % 2 == 0 ).forEach(System.out::println);

    list.removeIf(s -> s.length() % 2 != 0);
    list.forEach(System.out::println);
  }

  /**
   * Exercise 3
   *
   * Replace every word in the list with its upper case equivalent.
   */
  private void exercise3() {
    List<String> list = new ArrayList<>(Arrays.asList(
        "alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));

    list.stream().map((s) -> s.toUpperCase()).forEach(System.out::println);

    list.replaceAll(s -> s.toUpperCase());
    list.forEach(System.out::println);
  }

  /**
   * Exercise 4
   *
   * Convert every key-value pair of the map into a string and append them all
   * into a single string, in iteration order.
   */
  private void exercise4() {
    Map<String, Integer> map = new TreeMap<>();
    map.put("c", 3);
    map.put("b", 2);
    map.put("a", 1);

    map.forEach((k, v) -> System.out.println(k + v));

    Map<String, Integer> map2 = new TreeMap<>((f, s) -> s.compareTo(f));
    map2.putAll(map);
    map2.forEach((k, v) -> System.out.println(k + v));
  }

  /**
   * Exercise 5
   *
   * Create a new thread that prints the numbers from the list.
   */
  private void exercise5() {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    new Thread(() -> list.forEach(System.out::println)).start();
  }

  /**
   * Main entry point for application
   *
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    HomeworkLesson1 lesson = new HomeworkLesson1();
    lesson.runExercises();
  }
}
