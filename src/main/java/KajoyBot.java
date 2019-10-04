import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class KajoyBot extends TelegramLongPollingBot {
    public void onUpdateReceived(Update update) {
        final String messageTextReceived = update.getMessage().getText();
        final long chatId = update.getMessage().getChatId();
        SendMessage message = new SendMessage().setChatId(chatId).setText(messageTextReceived);
        try {
            execute(message);
        } catch (TelegramApiException e) {

        }
    }

    public String getBotUsername() {
        return "Kajoybot";
    }

    public String getBotToken() {
        return "883396045:AAFnccy-vbkbg7dxuqzs7XkvhjYbqw78n4o";
    }
}
