// Пусть дан список сотрудников.
// Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. 
// Отсортировать по убыванию популярности.

import java.util.*;
public class Task_5_2 {
    public static void main(String[] args) {
        String[] arr = {
        "Иван Иванов", 
        "Светлана Петрова", 
        "Кристина Белова", 
        "Анна Мусина", 
        "Анна Крутова", 
        "Иван Юрин", 
        "Петр Лыков",
        "Павел Чернов",
        "Петр Чернышов",
        "Мария Федорова",
        "Марина Светлова",
        "Мария Савина",
        "Мария Рыкова",
        "Марина Лугова",
        "Анна Владимирова",
        "Иван Мечников",
        "Петр Петин",
        "Иван Ежов"};
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            String[] n = arr[i].split(" ");
            if (map.containsKey(n[0])) {
            int j = map.get(n[0]);
            map.put(n[0], j + 1);
            }
            else
            map.put(n[0], 1);
            }
            map.entrySet().stream()
            .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
            .forEach(System.out::println);
    }
}
            
        // Set<String> persons = new HashSet<>();
        // int count = 0;
        // for (int i = 0; i < person1.size(); i++) {
        //     if (persons.contains(person1)) {
        //     System.out.println("YES");
        //     } else {
        //     System.out.println("NO");
        //     persons.add(person1[i]);}}
            
