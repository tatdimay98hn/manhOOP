/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap11_b1;

/**
 *
 * @author Manh Nguyen
 */
public class Lap11_b1 {

    public static <T extends Comparable> void sortASC(T[] a) {
        T temp = a[0];
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i].compareTo(a[j]) > 0) {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;

                }
            }
        }
    }

    public static <T extends Comparable> void show(T[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        String[] words = {"anh", "mạnh", "đẹp", "trai", "vl"};
        // sắp xếp dãy số theo thứ tự tăng dần
        sortASC(words);
        System.out.println("Dãy được sắp xếp tăng dần: ");
        show(words);
        System.out.println("-------------------------");
        Integer [] arr={5,3,6,2,7};
        sortASC(arr);
        System.out.println("Dãy được sắp xếp tăng dần: ");
        show(arr);

    }

}
