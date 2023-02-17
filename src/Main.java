import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
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

}