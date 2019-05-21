/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BotChatAdapter;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.TelegramBotAdapter;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.request.GetUpdates;
import com.pengrad.telegrambot.response.BaseResponse;
import com.pengrad.telegrambot.response.GetUpdatesResponse;
import com.pengrad.telegrambot.response.SendResponse;
import java.util.List;
import com.pengrad.telegrambot.request.SendChatAction;

/**
 *
 * @author ITJ-ANDERSON
 */
import com.pengrad.telegrambot.model.request.ChatAction;
import com.pengrad.telegrambot.request.SendMessage;
public class TelegramChatBot implements BotChat{
        private static final String BOT_TOKEN = "837056971:AAG03KfBU0gDXlTp1CAiK5JXxwSE4Kkj2Yg";
        public String respondendoUser(){
            TelegramBot bot = TelegramBotAdapter.build(BOT_TOKEN);
            GetUpdatesResponse controleEnvio ;
            SendResponse respostachat;
            BaseResponse gerenciaAcoes;
            int m = 0;
            
            while (true){
                //commit
                controleEnvio = bot.execute(new GetUpdates().limit(100).offset(m));
                List<Update> mensagens = controleEnvio.updates();
                
                
                for (Update update: mensagens){
                    m = update.updateId()+1;
                    System.out.println("Recebendo Mensagem"+update.message().text());
                    gerenciaAcoes = bot.execute(new SendChatAction(update.message().chat().id(), ChatAction.typing.name()));
                    System.out.println("Enviada ? "+gerenciaAcoes.isOk());
                    // envio da mensagem de resposta , aqui que posso melhorar, fazer uma biblioteca de respostas
                    respostachat = bot.execute(new SendMessage(update.message().chat().id(),"Nop Entendi"));
                    System.out.println("Mensagem Enviada ? " + respostachat.isOk());
                    
                }
            }
            
            
            
            
           // return "null";
        }
        
      
        
    
    
    
}
