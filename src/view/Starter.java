/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author Dulina
 */
class Starter {
    public static void main(String[] args) {
            DefenceObservable defenceObservable=new DefenceObservable();
            MainController mainController=new MainController(defenceObservable);
            defenceObservable.addObserver(new Submarine(mainController,1));
            defenceObservable.addObserver(new Tank(mainController,2));
            defenceObservable.addObserver(new Helicopter(mainController,3));
            mainController.setVisible(true);
    }
}
