
package botpls;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

/**
 *
 * @author Ldre
 */
public class BotPls {
    public static void main(String[] args) {
        try {
            // Registrar el bot
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botsApi.registerBot(new telegramBot());
        } catch (TelegramApiException ex) {
            Logger.getLogger(BotPls.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
