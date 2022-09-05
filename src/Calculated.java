import java.util.Scanner;

public class Calculated {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = number();
        int num2 = number();
        char op = operation();
        int result = Calculated(num1, num2, op);
        System.out.println(result);
    }

    public static int number() {
        System.out.println("Введите число");
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Ошибка, попробуйте еще раз");
            scanner.next();
            num = number();
        }
        return num;
    }

    public static char operation() {
        System.out.println("Ввести операцию");
        char op;
        if (scanner.hasNext()) {
            op = scanner.next().charAt(0);
        } else {
            System.out.println("Ошибка, попробуйте еще раз");
            scanner.next();
            op = operation();
        }
        return op;
    }

    public static int Calculated(int num1, int num2, char op) {
        int result;
        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            default:
                System.out.println("Оператор не найден");
                result = Calculated(num1, num2, operation());
        }
        return result;

    }
}
