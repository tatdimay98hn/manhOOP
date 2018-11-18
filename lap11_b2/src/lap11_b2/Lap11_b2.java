/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap11_b2;

import java.util.ArrayList;

/**
 *
 * @author Manh Nguyen
 */
public class Lap11_b2 {

    /**
     * @param args the command line arguments
     */
     /*
    Quy ước đặt tên tham số kiểu cho Generics
    Ký tự	Ý nghĩa
    E           Element – phần tử
    K           Key – khóa
    V           Value – giá trị
    T           Type – kiểu dữ liệu
    N           Number – số*/
    
    /*Ký tự đại diện <? extends type> chấp nhận bất ký đối tượng 
    nào miễn là đốitượng này kế thừa từ type hoặc đối tượng của type
    -----------
    Ký tự đại diện <? super type> chấp nhận bất ký đối tượng
    nào miễn là đối tượng này là cha của type hoặc đối tượng của type*/
   public static <T extends Comparable> Pair<T> minmax(ArrayList<T> a) {
        if (a == null || a.size() == 0) {
            return null;
        }
        T min = a.get(0);
        T max = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            if (min.compareTo(a.get(i)) > 0) {
                min = a.get(i);
            }
           if (max.compareTo(a.get(i)) < 0) {
                max = a.get(i);
            }
        }
        return new Pair<T>(min, max);
    }

    public static void main(String[] args) {
//        String[] words = {"a", "b", "c", "d", "e"};
//        
//        Pair<String> mm = Lap11_b2.minmax(words);
//        System.out.println("min = "+mm.getFirst());
//        System.out.println("max = "+mm.getSecond());

        ArrayList<String> words = new ArrayList<String>();
        words.add("a");
        words.add("b");
        words.add("c");
        words.add("d");
        words.add("e");
        words.add("f");
        
        Pair<String> mm = Lap11_b2.minmax(words);
        System.out.println("min="+mm.getFirst());
        System.out.println("max="+mm.getSecond());
    }
    
}
