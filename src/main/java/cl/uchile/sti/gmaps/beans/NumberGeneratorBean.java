package main.java.cl.uchile.sti.gmaps.beans;

import javax.faces.bean.ManagedBean;

/**
 * Created with IntelliJ IDEA.
 * User: Julio Villane
 * Date: 12-04-13
 * Time: 10:07 AM
 * To change this template use File | Settings | File Templates.
 */
@ManagedBean
public class NumberGeneratorBean {
    public double getRandomNumber(){
        return Math.random()*100+1;
    }
}
