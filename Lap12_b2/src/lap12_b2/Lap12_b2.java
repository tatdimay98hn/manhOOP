/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap12_b2;
import java.util.Scanner;

/**
 *
 * @author Manh Nguyen
 */
public class Lap12_b2 {
    public static Scanner scanner = new Scanner(System.in);

    /*
     *Bạn nên sử dụng strategy pattern cho những trường hợp sau:
     * Bạn có một đoạn code dễ thay đổi, và bạn tách chúng ra 
     * khỏi chương trình
     * chính để dễ dàng bảo trì Bạn muốn tránh sự rắc rối, khi 
     * phải hiện thực
     * một chức năng nào đó qua quá nhiều lớp con. Bạn muốn thay
     * đổi thuật toán sử dụng khi chạy chương trình
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        // khởi tạo mảng arr
        int[] arr = new int[n];
  
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        System.out.println("Các phần tử của mảng: ");
        
        
        LuuTruSapXep jame1= new James1(new insertionSort());
        jame1.sx.sort(arr, n);
        
        
        show(arr);
    }
 
    /*
     * in các phần tử của mảng ra màn hình
     * 
     * @param arr: mảng các số nguyên
     * @param n: số phần tử của mảng
     */
    public static void show(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
        
    }

