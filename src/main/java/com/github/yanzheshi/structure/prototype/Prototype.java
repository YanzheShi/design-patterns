package com.github.yanzheshi.structure.prototype;

/**
 * @author shiyanzhe
 */
public class Prototype implements Cloneable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Prototype prototype = null;

        try {
            prototype = (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {

        }
        return prototype;
    }
}
