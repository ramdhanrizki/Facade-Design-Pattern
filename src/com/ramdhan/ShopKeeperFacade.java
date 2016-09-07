/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramdhan;

import com.ramdhan.mobileshop.Blackberry;
import com.ramdhan.mobileshop.Iphone;
import com.ramdhan.mobileshop.MobileShop;
import com.ramdhan.mobileshop.Samsung;

/**
 *
 * @author Ramdhan
 */
public class ShopKeeperFacade {
    //atribut 
    private MobileShop iphone; 
    private MobileShop samsung; 
    private MobileShop blackBerry;
    
    //method 

    public ShopKeeperFacade() {
    }
    
    public void iphoneSale(){
        iphone = new Iphone();
        iphone.modelNo();
        iphone.price();
    }
    
    public void samsungSale(){
        samsung = new Samsung(); 
        samsung.modelNo();
        samsung.price();
    }
    
    public void blackberrySale(){
        blackBerry = new Blackberry(); 
        blackBerry.modelNo();
        blackBerry.price();
    }
    
    
    
    
    
}
