/*В калькулятор добавьте возможность отменить последнюю операцию.
        Пример
        1+2
        3
        +4
        7
        Отмена
        3
        *3
        9*/

import java.lang.reflect.Type;
import java.util.LinkedList;
import java.util.Scanner;

public class hw_4_3 {
    public static int mult(int a, int b) {
        return a*b;
    }
    public static int div(int a, int b) {
        return a/b;
    }
    public static int plus(int a, int b) {
        return a+b;
    }
    public static int sub(int a, int b) {
        return a-b;
    }
    public static void main(String[] args) {
        LinkedList<Integer> resultList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите математическую операцию:");
        String operation = sc.next();
        int a = operation.charAt(0) - '0';
        char operator = operation.charAt(1);
        int b = operation.charAt(2) - '0';
        switch (operator) {
            case '*':
                resultList.add(a*b);
                System.out.println(resultList.getLast());
                break;
            case '/':
                resultList.add(a/b);
                System.out.println(resultList.getLast());
                break;
            case '+':
                resultList.add(a+b);
                System.out.println(resultList.getLast());
                break;
            case '-':
                resultList.add(a-b);
                System.out.println(resultList.getLast());
                break;
        }
        while (true){
            System.out.println("Что дальше?");
            operation = sc.next();
            operator = operation.charAt(0);
            switch (operator){
                case '*':
                    a = operation.charAt(1) - '0';
                    resultList.add(resultList.getLast() * a);
                    System.out.println(resultList.getLast());
                    break;
                case '/':
                    a = operation.charAt(1) - '0';
                    resultList.add(resultList.getLast() / a);
                    System.out.println(resultList.getLast());
                    break;
                case '+':
                    a = operation.charAt(1) - '0';
                    resultList.add(resultList.getLast() + a);
                    System.out.println(resultList.getLast());
                    break;
                case '-':
                    a = operation.charAt(1) - '0';
                    resultList.add(resultList.getLast() - a);
                    System.out.println(resultList.getLast());
                    break;
                default:
                    resultList.removeLast();
                    System.out.println(resultList.getLast());
                    break;

            }
        }

    }
}
