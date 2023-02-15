import java.util.Arrays;
import java.util.OptionalInt;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task2_1();
        task2_2();
        task2_3();
        task2_4();

    }
    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1 () {
        System.out.println("Задача 1");
         // Пишем код для задачи 1

        int [] a = new int []{1,2,3};
        float [] b = {1.57f, 7.654f, 9.986f};
        int [] c = {1,2,3,4,5,6,7};
    }

    public static void task2 () {
        System.out.println("Задача 2");
        // Пишем код для задачи 2
        int[] a = new int[]{1, 2, 3};

        System.out.print(a[0] + ", " + a[1] + ", " + a[2]);
        System.out.println("");


        float [] b = {1.57f, 7.654f, 9.986f};
        System.out.println(Arrays.toString(b));


        int [] c = {1,2,3,4,5,6,7};
        for (int i = 0; i < c.length; i++) {
            if(i==c.length-1){
                System.out.println(c[i]);
                break;
            }
            System.out.print(c[i] + ", ");
        }
        System.out.println("");

    }
    public static void task3 () {
        System.out.println("Задача 3");
        // Пишем код для задачи 3
        int[] a = new int[]{1, 2, 3};

        System.out.print(a[2] + ", " + a[1] + ", " + a[0]);
        System.out.println("");

        float [] b = {1.57f, 7.654f, 9.986f};
        for (int i = b.length-1; i >=0; i--) {
            if(i==0){
                System.out.println(b[i]);
                break;
            }
            System.out.print(b[i] + ", ");
        }

        int [] c = {1,2,3,4,5,6,7};
        for (int i = c.length-1; i >=0; i--) {
            if(i==0){
                System.out.println(c[i]);
                break;
            }
            System.out.print(c[i] + ", ");
        }
        System.out.println("");
    }

    public static void task4 () {
        System.out.println("Задача 4");
        // Пишем код для задачи 4
        int[] a = new int[]{1, 2, 3};
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2!=0){
                a[i] ++ ;
          }
        }
        System.out.println(Arrays.toString(a));
    }
    public static void task2_1 () {
        System.out.println("Задача 2_1");
        int[] arr = generateRandomArray();
        // int[] arr — объявление массива
        // generateRandomArray() — вызов метода «сгенерироватьМассив»
        // Пишем код для задачи 2_1
            //через index

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            //System.out.println(arr[i]);
            sum = sum + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " +sum+ " рублей(index)");

            //через for each
        int sum2 = 0;
        for (int element : arr ) {
            sum2 += element;
        }
        System.out.println("Сумма трат за месяц составила " +sum2+ " рублей(for-each)");

            //Arrays.stream
        int sum3 = Arrays.stream(arr).sum();

        System.out.println("Сумма трат за месяц составила " +sum3+ " рублей(Arrays.stream)");

    }
    public static void task2_2 () {
        System.out.println("Задача 2_2");
        int[] arr = generateRandomArray();
        // int[] arr — объявление массива
        // generateRandomArray() — вызов метода «сгенерироватьМассив»
        // Пишем код для задачи 2_2
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            //System.out.println(arr[i]);
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " +min+" рублей. Максимальная сумма трат за день составила " +max+ " рублей");
    }
    public static void task2_3 () {
        System.out.println("Задача 2_3");
        int[] arr = generateRandomArray();
        // int[] arr — объявление массива
        // generateRandomArray() — вызов метода «сгенерироватьМассив»
        // Пишем код для задачи 2_3
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            //System.out.println(arr[i]);
            sum = sum + arr[i];

        }
         sum = sum / arr.length;
        System.out.println("Средняя cумма трат за месяц составила " +sum+ " рублей(index)");

    }
    public static void task2_4 () {
        System.out.println("Задача 2_4");
       // Пишем код для задачи 2_4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i] + "");
        }

        }




    }


