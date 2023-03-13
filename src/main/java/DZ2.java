// 1. Напишите программу, чтобы найти вхождение в строке
// (содержащей все символы другой строки).
public class DZ2 {
    public static void main(String[] args)
    {
        String test = "GeekBrains";

        CharSequence seq = "e";
        boolean bool = test.contains(seq);
        System.out.println("Найден 'e'?: " + bool);

        // return false
        boolean sqFound = test.contains("x");
        System.out.println("Найден 'x'?: " + sqFound);
    }
    // 2 Напишите программу на Java, чтобы проверить, являются ли две данные строки
    // вращением друг друга.
    public static boolean searchPalindrom(String firstStr, String secondStr) {
        return firstStr.equals(new StringBuilder(secondStr).reverse().toString());
    }
    // 4 Дано два числа, например 3 и 56, необходимо составить следующие строки:
    // 3 + 56 = 59
    // 3 – 56 = -53
    // 3 * 56 = 168
    // Используем метод StringBuilder.append().
    public static String compilerMathToStr(int num1, int num2, char sign) {
        StringBuilder mathTask = new StringBuilder();
        mathTask.append(num1).append(" ").append(sign).append(" ").append(num2).append(" = ");
        switch (sign) {
            case '+':
                mathTask.append(num1 + num2);
                break;
            case '-':
                mathTask.append(num1 - num2);
                break;
            case '*':
                mathTask.append(num1 * num2);
                break;
        }
        return mathTask.toString();
    }

    // 5 Замените символ “=” на слово “равно”. Используйте методы
    // StringBuilder.insert(),
    // StringBuilder.deleteCharAt().
    public static String replacEqual(String mathTask) {
        StringBuilder task = new StringBuilder(mathTask);
        int index = task.indexOf("=");
        return task.deleteCharAt(index).insert(index, "равно").toString();
    }

}
