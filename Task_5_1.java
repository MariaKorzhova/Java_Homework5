// Реализуйте структуру телефонной книги с помощью HashMap, 
// учитывая, что 1 человек может иметь несколько телефонов.

import java.util.*;
import java.util.Map;

public class Task_5_1 {

public static void main(String[] args) {
    List<String> person1 = new ArrayList<>();
    person1.add("89999999999");
    person1.add("89997777777");
    List<String> person2 = new ArrayList<>();
    person2.add("80000000000");
    person2.add("85555555555");
    List<String> person3 = new ArrayList<>();
    person3.add("81111111111");
    person3.add("82222222222");

    HashMap<String, List> map = new HashMap<>(Map.of(
        "Иван Иванов", person1, 
        "Александр Петров", person2, 
        "Виктор Долголюбов", person3
    ));
System.out.println(map);
}
}

