import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int[] nums = new int[5];
        nums[0] = 10;
        nums[1] = 15;
        nums[2] = 20;
        nums[3] = 25;
        nums[4] = 30;
        int res = nums[0] + nums[1];
        System.out.println(res);


        float[] nums2 = new float[]{5.45f, 10.19f, 58.45f, 125f, 48.45f};
        for (int i = 0; i < nums2.length; i++) {
            System.out.println("элемент массива nums2 " + i + " равен " + nums2[i]);
        }

        float x = 3.4f;
        float[] arr = new float[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = x *= 2.3f;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("элемент массива arr " + i + " равен " + arr[i]);
        }

        int[][] arr2 = new int[][]{
                {1, 5, 5},
                {3, 7, 5},
                {7, 9, 3},
                {55, 12, 123},
                {88, 152, 13}
        };
        int ii = arr2.length; //определение длинны массива
        int jj = arr2[0].length; //определение длинны массива массива
        System.out.println("динна двухмерного массива " + ii);
        System.out.println("динна двухмерного массива массива " + jj);
        for (int i = 0; i < arr2.length; i++) {   // вывод значений двумерного массива с помощью циклов
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(" " + arr2[i][j]);
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(arr2)); // упрощенный вывод значений двухмерного массива массива



        int [] num5 = new int[] {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};
        for (int i = num5.length -1; i > 0; i--){ // сортировка массива по возрастанию вручную
            for (int j =0; j < i; j++) {
                if (num5[j] > num5[j+1]){
                    int temp = num5[j];
                    num5[j] = num5[j+1];
                    num5[j+1] = temp;
                }
            }
        }
         for (int i = 0; i < num5.length; i++) { // вывод знач массива вручную
            System.out.print(num5[i] + " ");
        }
        System.out.println();



        int [] num6 = new int[] {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};
        Arrays.sort(num6); //сортировка массива по возрастанию методом сорт класса аррайс
        System.out.println(Arrays.toString(num6)); //вывод данных методом тустринг класса аррейс

        int [] num7 = new int[] {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};
        int [] num8 = Arrays.copyOf(num7,num7.length); //копирование массива
        System.out.println(Arrays.toString(num7)); //вывод данных массива
        System.out.println(Arrays.toString(num8)); //вывод данных массива
        //Arrays.fill(num8, 55); // заполняет весь массив одним и тем же значением
        //System.out.println(Arrays.toString(num8)); //вывод данных массива
        System.out.println("Массивы num7 и num8 " + (Arrays.equals(num7, num8) ? "равны": " не равны")); //сравнение массивов








/*
        ArrayList<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("3");
        list.add("2");
        list.add("2");
*/
        //list.remove("3");

        //ArrayList<String> listtodel = new ArrayList<>();
        //listtodel.add("2");
        //listtodel.add("3");
        //list.removeAll(listtodel);

        //for (var item : list) {
        //    System.out.println(item);
        //}
/*
        //System.out.println(list);
        Integer[] a = new Integer[]{1,2,2,2,3};
        Integer[] b = new Integer[]{2};
        //int [] a1 = new int[] {1, 2};
        System.out.println(Arrays.toString(a));



        ArrayList<Integer> a1 = new ArrayList<Integer> ();
        a1.addAll(List.of(a));
        ArrayList<Integer> b1 = new ArrayList<Integer> ();
        b1.addAll(List.of(b));
        a1.removeAll(b1);
        System.out.println(a1);
*/


/*
        ArrayList<String> a1 = new ArrayList<String> ();
        a1.add("1");
        a1.add("2");


        ArrayList<String> b1 = new ArrayList<String> ();
        b1.add("1");
        a1.removeAll(b1);
        System.out.println(a1);

        //int c = a.length;
        //for (int i=0; i < b.length; i++) {
        //    for (int j=0; j < c; j++) {
                //if (b[i] == a[x]) {a.splice(x, 1); x--; c--}
        //    }
        //}
*/

        int[] a = new int[]{1,2,2,2,3};
        int[] b = new int[]{2};
        int len = 3;
        int[] c = new int[len];
       // for (i = 0; i < b.)

        

        System.out.println(Arrays.toString(c));







    }
}