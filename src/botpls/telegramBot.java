/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package botpls;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

/**
 *
 * @author jabro
 */
public class telegramBot extends TelegramLongPollingBot {

    @Override
    public void onUpdateReceived(Update update) {
        // We check if the update has a message and the message has text
    if (update.hasMessage() && update.getMessage().hasText()) {
        // Set variables
        String message_text = update.getMessage().getText();
        String [] partido = message_text.split(" ");
        String mensaje = "";
        try {
            double cantidad = Double.parseDouble(partido[0]);
            String from = partido[1];
            final String to = partido[2];
            mensaje = String.valueOf(api.conversion(from, to, cantidad));
            mensaje = cantidad + from +" = "+mensaje+to;
        } catch (URISyntaxException ex) {
            Logger.getLogger(telegramBot.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(telegramBot.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(telegramBot.class.getName()).log(Level.SEVERE, null, ex);
        }
        long chat_id = update.getMessage().getChatId();

        SendMessage message = new SendMessage();
        message.setChatId(chat_id);// Create a message object object
        message.setText(mensaje);
                
        try {
            execute(message); // Sending our message object to user
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
    }

    @Override
    public String getBotUsername() {
        return "conversomnibot";
    }

    @Override
    public String getBotToken() {
        return "6481804049:AAF-fcVtnNbVSFjoss8LyQ6SZJ0h0t-BkKk";
    }
    
}
