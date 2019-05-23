/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BotChatAdapter;

/**
 *
 * @author ITJ-ANDERSON
 */
public class BotChatAdapter {
 
    public BotChatAdapter(){
        social = BotChatFactory.createChat();
    }
    
    private BotChat social;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BotChatAdapter chat = new BotChatAdapter();
        chat.respondendoUser();
        
        
        // TODO code application logic herehsghdgfd
    }
    
    public String respondendoUser(){
        return social.respondendoUser();
    }
    
}
