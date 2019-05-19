/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BotChatAdapter;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.TelegramBotAdapter;
import com.pengrad.telegrambot.response.BaseResponse;
import com.pengrad.telegrambot.response.GetUpdatesResponse;
import com.pengrad.telegrambot.response.SendResponse;
/**
 *
 * @author ITJ-ANDERSON
 */
public class TelegramChatBot implements BotChat{
        private static final String BOT_TOKEN = "837056971:AAG03KfBU0gDXlTp1CAiK5JXxwSE4Kkj2Yg";
        public String respondendoUser(){
            TelegramBot bot = TelegramBotAdapter.build(BOT_TOKEN);
            GetUpdatesResponse controleEnvio ;
            SendResponse respostachat;
            BaseResponse gerenciaAcoes;
            
            return "null";
        }
        
      
        
    
    
    
}
