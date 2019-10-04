import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class KajoyBot extends TelegramLongPollingBot {
    public void onUpdateReceived(Update update) {

    }

    public String getBotUsername() {
        return "Kajoybot";
    }

    public String getBotToken() {
        return "883396045:AAFnccy-vbkbg7dxuqzs7XkvhjYbqw78n4o";
    }
}
