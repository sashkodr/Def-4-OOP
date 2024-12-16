import java.util.*;

public class Main {
    public static void main(String[] args) {
        String word = "Сашко";
        HashMap<Character, Integer> letterCount = new HashMap<>();
        for (char letter : word.toCharArray()) {
            letterCount.put(letter, letterCount.getOrDefault(letter, 0) + 1);
        }
        System.out.println("1. Кількість повторів літер у слові \"" + word + "\":");
        for (char key : letterCount.keySet()) {
            System.out.println(key + " - " + letterCount.get(key));
        }

        System.out.println();

        String[] inputNames = {"Ольга", "Максим", "Олександр", "Ольга", "Дмитро", "Катерина", "Максим"};
        HashSet<String> uniqueNames = new HashSet<>();
        LinkedHashMap<String, Integer> nameCountMap = new LinkedHashMap<>();

        for (String name : inputNames) {
            nameCountMap.put(name, nameCountMap.getOrDefault(name, 0) + 1);
        }

        List<String> uniqueNameList = new ArrayList<>();
        List<String> duplicateNameList = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : nameCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueNameList.add(entry.getKey());
            } else {
                duplicateNameList.add(entry.getKey());
            }
        }

        System.out.println("2.Імена:"); //HashSet
        System.out.println("Кількість імен: " + nameCountMap.size());
        System.out.println("Імена: " + nameCountMap.keySet());
        System.out.println("Унікальні імена: " + uniqueNameList);
        System.out.println("Повторювані імена: " + duplicateNameList);

        System.out.println();

        String myName = "Олександр";
        LinkedHashSet<String> orderedNames = new LinkedHashSet<>(Arrays.asList(inputNames));
        System.out.println("3. Імена у порядку додавання :"); //LinkedHashSet
        System.out.println("Кількість унікальних імен: " + orderedNames.size());
        System.out.println("Імена: " + orderedNames);
        System.out.println("Чи є моє ім'я \"" + myName + "\" у списку? " + orderedNames.contains(myName));

        System.out.println();

        HashMap<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Ольга", "123-456-789");
        phoneBook.put("Максим", "987-654-321");
        phoneBook.put("Дмитро", "555-666-777");
        phoneBook.put("Олександр", "999-888-777");
        System.out.println("4. Телефонний довідник (HashMap):");
        System.out.println("Довідник: " + phoneBook);

        String searchName = "Олександр";
        if (phoneBook.containsKey(searchName)) {
            System.out.println("Номер телефону для \"" + searchName + "\": " + phoneBook.get(searchName));
        } else {
            System.out.println("Ім'я \"" + searchName + "\" не знайдено.");
        }

        String deleteName = "Ольга";
        phoneBook.remove(deleteName);
        System.out.println("Телефонний довідник після видалення \"" + deleteName + "\": " + phoneBook);

        System.out.println();

        String[] tasks = {"Завдання 1", "Завдання 2", "Завдання 1", "Завдання 3", "Завдання 2"};
        LinkedHashSet<String> uniqueTasks = new LinkedHashSet<>(Arrays.asList(tasks));
        System.out.println("5. Список завдань без дублікатів (LinkedHashSet):");
        System.out.println("Унікальні завдання: " + uniqueTasks);
    }
}
