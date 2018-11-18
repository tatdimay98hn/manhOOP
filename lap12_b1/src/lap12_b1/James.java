/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap12_b1;

import java.util.Date;

/**
 *
 * @author Manh Nguyen
 */
public class James extends Person{
    
    public James(String name, String gioiTinh, Date namSinh, int Con, boolean KetHon) {
        super(name, gioiTinh, namSinh, Con, KetHon);
    }

    
    @Override
    public void setCon(int Con) {
        this.Con= Con;
    }

    @Override
    public void setKetHon(boolean KetHon) {
        this.KetHon = KetHon;
    }
    
}
