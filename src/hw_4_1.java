import java.util.LinkedList;
//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

public class hw_4_1 {
    public static LinkedList reversedList(LinkedList ll) {
        LinkedList rl = new LinkedList<>();
        for (int i = ll.size()-1; i >= 0; i--) {
            rl.add(ll.get(i));
        }
        return rl;
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            ll.add(i);
        }
        System.out.println("Original LinkedList:");
        System.out.println(ll);
        System.out.println("Reversed LinkedList:");
        System.out.println(reversedList(ll));
    }
}
