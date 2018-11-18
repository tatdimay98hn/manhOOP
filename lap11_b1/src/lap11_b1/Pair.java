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
public class Pair<T> {

    private T first;

    public Pair() {
 
    }

    public Pair(T first) {
        this.first = first;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T newValue) {
        first = newValue;
    }

}
