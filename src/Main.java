import java.util.Random;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println(" Задача 1 ");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000; // генерируем случайное число
        }
        return arr;
    }

    public static void task2() {
        System.out.println(" Задача 2 ");
        int[] arr = generateRandomArray();
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");
    }

    public static void task3() {
        System.out.println(" Задача 3 ");
        int daysInMonth = 30;
        int[] dailySpendings = new int[daysInMonth];
        Random random = new Random();

        for (int i = 0; i < daysInMonth; i++) {
            dailySpendings[i] = random.nextInt(100_000) + 100_000; // генерируем случайное число
            int totalSpending = 0;
            for (int spending : dailySpendings) {
                totalSpending += spending;
            }

            double averageSpending = (double) totalSpending / daysInMonth;
            System.out.println("Средняя сумма трат за месяц составила " + averageSpending + " рублей");
        }
    }

    public static void task4() {
        System.out.println(" Задача 4 ");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        boolean flipped = false; // флаг, указывающий на то, что перевернули имя и фамилию
        char[] lastName = new char[reverseFullName.length]; // массив для фамилии
        char[] firstName = new char[reverseFullName.length]; // массив для имени
        int lastNameIndex = -1; // индекс для хранения текущего символа фамилии
        int firstNameIndex = -1; // индекс для хранения текущего символа имени

        for (int i = 0; i < reverseFullName.length; i++) {
            // если нашли пробел, значит достигли конца фамилии
            if (reverseFullName[i] == ' ') {
                flipped = true; // переворачиваю флаг
                firstNameIndex = 0; //  добавляю символы в массив для имени с первого индекса
            } else {
                if (flipped) { // если флаг перевернут, то  находимся в имени
                    firstName[firstNameIndex] = reverseFullName[i]; // добавляю символ в массив для имени
                    firstNameIndex++; // увеличиваю индекс массива для имени
                } else { // иначе находимся в фамилии
                    lastNameIndex++; // увеличиваю индекс массива для фамилии
                    lastName[lastNameIndex] = reverseFullName[i]; // добавляю символ в массив для фамилии
                }
            }
        }

// переворачиваем и выводим фамилию
        for (int i = lastNameIndex; i >= 0; i--) {
            System.out.print(lastName[i]);
        }
        System.out.print(" ");

// переворачиваем и выводим имя
        for (int i = firstNameIndex - 1; i >= 0; i--) {
            System.out.print(firstName[i]);
        }
    }
}