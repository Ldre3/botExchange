/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package botpls;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

/**
 *
 * @author jabro
 */
public class BotPls {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botsApi.registerBot(new telegramBot());
        } catch (TelegramApiException ex) {
            Logger.getLogger(BotPls.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
