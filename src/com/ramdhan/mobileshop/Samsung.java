/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramdhan.mobileshop;

/**
 *
 * @author Ramdhan
 */
public class Samsung implements MobileShop{

    @Override
    public void modelNo() {
        System.out.println("No Id = Samsung S7");
    }

    @Override
    public void price() {
        System.out.println("Harga = 6 Ribu");
    }
    
}
