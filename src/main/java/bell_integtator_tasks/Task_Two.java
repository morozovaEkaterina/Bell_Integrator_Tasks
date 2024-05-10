package bell_integtator_tasks;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task_Two {
    public static void main(String[] args) {
        Map<String, String> Kirill = new HashMap<>() {{
            put("Имя", "Кирилл");
            put("Возраст", "26");
            put("Должность", "Middle java dev");
            put("Зарплата", "150000 руб");
        }};
        Map<String, String> Vitali = new HashMap<>() {{
            put("Имя", "Виталий");
            put("Возраст", "28");
            put("Должность", "Senior java automation QA");
            put("Зарплата", "2000$");
        }};
        Map<String, String> Aleksandr = new HashMap<>() {{
            put("Имя", "Александр");
            put("Возраст", "31");
            put("Должность", "junior functional tester");
            put("Зарплата", "50000 руб");
        }};
        Map<String, String> Dementi = new HashMap<>() {{
            put("Имя", "Дементий");
            put("Возраст", "35");
            put("Должность", "dev-ops");
            put("Зарплата", "1500 $");
        }};

        List<Map<String, String>> employees = List.of(Kirill, Vitali, Aleksandr, Dementi);

        System.out.println("Сотрудники младше 30 лет:");
        employees.stream()
                .filter(e -> Integer.parseInt(e.get("Возраст")) < 30)
                .map(e -> e.get("Имя"))
                .forEach(System.out::println);

        System.out.println("\nСотрудники с зарплатой в рублях: ");
        employees.stream()
                .filter(e -> e.get("Зарплата").contains("руб"))
                .map(e -> e.get("Имя"))
                .forEach(System.out::println);

        System.out.println("\nСредний возраст сотрудников: ");
        Double averageAge = employees.stream()
                .mapToDouble(e -> Double.parseDouble(e.get("Возраст")))
                .average()
                .orElse(0);
        System.out.println(averageAge);
    }
}

