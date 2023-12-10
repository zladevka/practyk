package org.example.Lesson13;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class User {
  private String name;
  private int age;
  private String email;
  private String gender;

  public User(String name, int age, String email, String gender) {
    this.name = name;
    this.age = age;
    this.email = email;
    this.gender = gender;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getEmail() {
    return email;
  }

  public String getGender() {
    return gender;
  }

  public static void main(String[] args) {
    List<User> users = Stream.generate(User::generateRandomUser)
        .limit(20)
        .filter(user -> user.getAge() > 18)
        .sorted((user1, user2) -> user1.getName().compareTo(user2.getName()))
        .filter(user -> user.getEmail() != null && !user.getEmail().isEmpty())
        .collect(Collectors.toList());

    Map<String, List<String>> groupedByGender = users.stream()
        .collect(Collectors.groupingBy(User::getGender,
            Collectors.mapping(User::getName, Collectors.toList())));

    System.out.println(groupedByGender);
  }

  private static User generateRandomUser() {
    String[] names = {"John", "Bill", "Bob", "Clara", "Kate", "Monica"};
    String[] genders = {"male", "female"};
    return new User(names[new Random().nextInt(names.length)],
        new Random().nextInt(50) + 10,
        "user" + new Random().nextInt(100) + "@example.com",
        genders[new Random().nextInt(genders.length)]);
  }
}
