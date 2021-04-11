/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.javyplugs.simpleplugin2;

import com.github.javyplugs.sharedinterfaces1.GreetMessage;

/**
 *
 * @author DELL
 */
public class theMessage implements GreetMessage{

    private String message;
    
    public theMessage() {
    }

    
    
    @Override
    public String GreetMessage() {
        return message;
    }

    public theMessage(String message) {
        this.message = message;
    }
    
}
