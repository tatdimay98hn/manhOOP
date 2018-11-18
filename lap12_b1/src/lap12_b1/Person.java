/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap12_b1;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Manh Nguyen
 */


public abstract class Person {
    /*
        Person namsinh và con là 1 cái trừu tượng -> Person sẽ là abstract
    */
    protected String name;
    protected String gioiTinh;
    protected Date namSinh;
    protected int Con;
    protected boolean KetHon;
    
    
    public Person(){}; 

    public Person(String name, String gioiTinh, Date namSinh, int Con, boolean KetHon) {
        this.name = name;
        this.gioiTinh = gioiTinh;
        this.namSinh = namSinh;
        this.Con = Con;
        this.KetHon = KetHon;
    }

   

    public void setNamSinh(Date namSinh) {
        this.namSinh = namSinh;
    }

    public abstract void setCon(int Con);

    public abstract void setKetHon(boolean KetHon);

     
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNamSinh() {
        return namSinh;
    }

    public int getCon() {
        return Con;
    }

    public boolean isKetHon() {
        return KetHon;
    }

    

    
    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", gioiTinh=" + gioiTinh + ", namSinh=" + DateConverter.fromDate(this.namSinh)+ ", Con=" + Con + ", KetHon=" + KetHon + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (this.Con != other.Con) {
            return false;
        }
        if (this.KetHon != other.KetHon) {
            return false;
        }
        if (!Objects.equals(this.namSinh, other.namSinh)) {
            return false;
        }
        return true;
    }
    
        
    
}
