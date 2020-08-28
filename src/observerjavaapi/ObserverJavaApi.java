/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerjavaapi;

import java.util.Observer;
/**
 *
 * @author awv6
 */
public class ObserverJavaApi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Senior obj1 = new Senior();
	Marketing obj2 = new Marketing();
	HeadQuater observable = new HeadQuater();              
	observable.addObserver(obj1);              
	observable.addObserver(obj2);              
	observable.setSomeData(6);
        observable.setSomeData(7);
    }
    
}
