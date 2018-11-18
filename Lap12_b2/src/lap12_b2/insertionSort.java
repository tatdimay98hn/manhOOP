/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap12_b2;

/**
 *
 * @author Manh Nguyen
 */

// tạo các lớp cụ thể cho từng thuật toán
public class insertionSort implements SapXep {

    @Override
    public void sort(int arr[], int n) {
        int i, key, j;
        for (i = 1; i < n; i++) {
            key = arr[i];
            j = i - 1;

            /* Di chuyển các phần tử có giá trị lớn hơn giá trị 
       key về sau một vị trí so với vị trí ban đầu
       của nó */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

}
