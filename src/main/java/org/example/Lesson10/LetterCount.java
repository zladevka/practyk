package org.example.Lesson10;

import java.util.HashMap;
import java.util.Map;

public class LetterCount {
  public static void main(String[] args) {
    String sentence = "Жив собі хлопчина на ім'я Максим. Змалку його зачаровували вигадкові світи комп'ютерних ігор. З роками цікавість переросла в палке бажання зрозуміти, як це працює всередині. Максим вирішив, що хоче стати програмістом.\n" +
        "\n" +
        "Він розпочав вивчення програмування, занурюючись у світ Java та Python. Перші кроки були важкими, але Максим не здавався. Він вивчав кожен рядок коду, вирішуючи завдання та розв'язуючи проблеми.\n" +
        "\n" +
        "З часом Максим розумів, що програмування - це не лише код, але й творчий процес, де він може втілювати свої ідеї у віртуальній реальності. Відкриваючи для себе нові технології та алгоритми, він ставав все кращим програмістом.\n" +
        "\n" +
        "Максиму вдалося перетворити свою страсть у професію. Він працював над захопливими проектами, створюючи програми, які полегшували життя інших. Його історія - це приклад того, як впереджена ціль і наполегливість допомагають перетворити мрію в реальність.";
    countAndPrintLetters(sentence);
  }

  public static void countAndPrintLetters(String sentence) {
    Map<Character, Integer> letterCountMap = new HashMap<>();

    for (char c : sentence.toCharArray()) {
      if (Character.isWhitespace(c)) {
        continue;
      }
      letterCountMap.put(c, letterCountMap.getOrDefault(c, 0) + 1);
    }
    System.out.println("Кількість кожної літери у реченні");
    for (Map.Entry<Character, Integer> entry : letterCountMap.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }
  }
}