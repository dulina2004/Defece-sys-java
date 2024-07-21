/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.ArrayList;

/**
 *
 * @author Dulina
 */
public class DefenceObservable {
    private int slider = 0;
    private ArrayList<DefencesObserver> observerList = new ArrayList<>();

    public void addObserver(DefencesObserver ob) {
        observerList.add(ob);
    }
    
    public void sendMsg(String msg){
        for (DefencesObserver ob:observerList) {
            ob.receiveMsg(msg);
        }
    }
    
    public void setSlider(int slider){
        this.slider=slider;
        notifyDefences();
    }
    
    private void notifyDefences(){
        for (DefencesObserver ob:observerList) {
            ob.setCommandValue(slider);
        }        
    }
    
    
    private boolean isAreaclear=false;
    public void area(){
        if (isAreaclear==true) {
            isAreaclear=false;
        }else{
            isAreaclear=true;
        }
        for (DefencesObserver ob:observerList) {
            ob.areaClear(isAreaclear);
        }    
    }
    
    public void getinfo(String type){
        for (DefencesObserver ob:observerList) {
            ob.setInfo(type);
        }        
    }    
    
}
