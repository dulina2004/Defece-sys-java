/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package view;

/**
 *
 * @author Dulina
 */
interface DefencesObserver {

    public void sendMsg();
    public void receiveMsg(String msg);    
    public void areaClear(boolean x);
    public void setCommandValue(int value);
    public void updateBtns();
    public void setInfo(String type);
}
