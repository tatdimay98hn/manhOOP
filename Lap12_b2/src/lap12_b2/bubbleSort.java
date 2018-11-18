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
public class bubbleSort implements SapXep { // sắp xếp nổi bọt

    @Override
    public void sort(int arr[], int n) {
        int i, j;
        boolean haveSwap = false;
        for (i = 0; i < n - 1; i++) {
            // i phần tử cuối cùng đã được sắp xếp
            haveSwap = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    haveSwap = true;// Kiểm tra lần lặp này có swap không
                }
            }
            // Nếu không có swap nào được thực hiện => mảng đã sắp xếp. Không cần lặp thêm
            if (haveSwap == false) {
                break;
            }
        }
    }

}
