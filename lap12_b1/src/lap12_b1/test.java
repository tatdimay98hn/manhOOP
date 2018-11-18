/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap12_b1;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Manh Nguyen
 */
public class test {

    public static void main(String[] args) {
        ArrayList<Person> ListPar = new ArrayList<Person>();
//        Scanner input = new Scanner(System.in);
//        int n;
//        System.out.println("nhập số người");
//        n = input.nextInt();
//        input.nextLine();
//        for (int i = 0; i < n; i++) {
//
//            
//            System.out.println("nhập tên");
//            String name;
//            name = input.nextLine();
//            System.out.println("Nhập giới tính");
//            String gioiTinh;
//            gioiTinh = input.nextLine();
//            System.out.println("Nhập ngày tháng năm");
//            Date D = DateConverter.fromString(input.nextLine());
//            System.out.println("Nhập số con");
//            int son;
//            son = input.nextInt();
//            System.out.println("Đã kết hôn chưa?");
//            boolean KetHon;
//            KetHon = input.nextBoolean();
//            James j = new James(name, gioiTinh, D, son, KetHon);
//            ListPar.add(j);
//
//        }

        James james = new James("Hana", "nu", DateConverter.fromString("12/12/1998"), 2, true);
        Ryan ryan = new Ryan("", "nam", DateConverter.fromString("12/12/1998"), 0, false);
        Kai kai = new Kai("Jennifer ", "nam", DateConverter.fromString("12/12/1998"), 4, true);
        Kai1 kai1 = new Kai1("hehe", "nu", DateConverter.fromString("12/12/1998"), 2, true);
        Kai2 kai2 = new Kai2("hoho", "nam", DateConverter.fromString("12/12/1998"), 2, true);

        ListPar.add(james);
        ListPar.add(ryan);
        ListPar.add(kai);
        ListPar.add(kai1);
        ListPar.add(kai2);
        System.out.println("tất cả các cá nhân không kết hôn trong danh sách phả hệ:");
        for (int i = 0; i < ListPar.size(); i++) {
            if(ListPar.get(i).KetHon==false)
            {
                System.out.println(ListPar.get(i));
            }
        }
         System.out.println("---------------------------------");
        System.out.println("tất cả các cặp vợ chồng có hai con trong danh sách phả hệ:");
        for (int i = 0; i < ListPar.size(); i++) {
            if (ListPar.get(i).Con == 2) {
                System.out.println(ListPar.get(i));
            }
        }
        System.out.println("---------------------------------");
        System.out.println("tất cả các thế hệ mới nhất trong danh sách phả hệ:");
        for(int i=0;i<ListPar.size();i++)
        {
            if(ListPar.get(i) instanceof Kai)
            {
                System.out.println(ListPar.get(i));
            }
        }
    
    }

}
