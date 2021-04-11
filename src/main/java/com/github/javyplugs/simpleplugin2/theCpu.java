/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.javyplugs.simpleplugin2;

import com.github.javyplugs.sharedinterfaces1.cpu;

/**
 *
 * @author DELL
 */
public class theCpu implements cpu  {
    
    private String thecpu;

    public theCpu(String thecpu) {
        this.thecpu = thecpu;
    }

    public theCpu() {
    }
    

    @Override
    public String cup() {
        return thecpu;
    }
    
}
