import java.util.*;

class main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> words = new ArrayList<>(List.of("My name is ", "Danya ", "Danya ", "my ", "boy "));
        task1(nums);
        task2(nums);
        task3(words);
        task4(words);
    }

    private static void task1(List<Integer> list) {
        System.out.println("Задание 1");
        for (Integer number : list) {
            if (number % 2 != 0) {
                System.out.print(number);
            }
        }
        System.out.println();
    }

    private static void task2(List<Integer> list) {
        System.out.println("Задание 2");
        Set<Integer> set = new TreeSet<>(list);
        for (Integer number : list) {
            if (number % 2 == 0) {
                System.out.print(number);
            }
        }
        System.out.println();
    }

    private static void task3(List<String> list) {
        System.out.println("Задание 3");
        Set<String> set = new HashSet<>(list);
        for (String word : set) {
            System.out.print(word);
        }
        System.out.println( );
    }

    private static void task4(List<String> list) {
        System.out.println("Задание 4");
        Set<String> set = new HashSet<>(list);
        for (String word : set) {
            System.out.println(word + "-->" + Collections.frequency(list, word));


        }
    }
}