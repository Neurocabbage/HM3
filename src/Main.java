import java.util.*;


public class Main {

    public static void main(String[] args) {
        problem02();
    }
    static void problem01(){
        // Пусть дан произвольный список целых чисел, удалить из него четные числа
        List<Integer> list = new ArrayList<Integer>(10);

        list.add(11);
        list.add(12);
        list.add(38);
        list.add(3);
        list.add(10);

        System.out.println(list);

        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
            Integer number = iterator.next();
            if (number % 2 == 0) {

                iterator.remove();
            }

        }
        System.out.println(list);

    }

    static void problem02(){
        /*
        Задан целочисленный список ArrayList.
        Найти минимальное, максимальное и среднее арифметическое из этого списка.
        Collections.max()
         */
        List<Integer> list = new ArrayList<Integer>(10);

        list.add(11);
        list.add(12);
        list.add(38);
        list.add(3);
        list.add(10);

        System.out.println(list);
        Integer max = Collections.max(list);
        System.out.println("Максимальное значение : " + max);
        Double average = list.stream().mapToInt(val -> val).average().orElse(0.0);
        System.out.println("Среднее значение : " + average);

    }
}