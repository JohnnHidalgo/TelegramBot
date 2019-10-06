import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.logging.BotLogger;

import java.util.ArrayList;
import java.util.List;

public class KajoyBot extends TelegramLongPollingBot {

    private static final String INGRESAR_CURSO = "Ingresar a un curso";
    private static final String REGISTRARSE = "Registrarse";
    private static final String SALIR= "SALIR";

    public void onUpdateReceived(Update update) {
//        final String messageTextReceived = update.getMessage().getText();
 //       final long chatId = update.getMessage().getChatId();
  //      SendMessage message = new SendMessage().setChatId(chatId).setText(messageTextReceived);

        try {

            if (update.hasMessage()) {
                Message message = update.getMessage();
                if (message.hasText() || message.hasLocation()) {
                    long chat_id=update.getMessage().getChatId();
                    handleIncomingMessage(message, update);
                }
            }
    //        execute(message);
        } catch (TelegramApiException e) {
            BotLogger.error("LOGTAG",e);

        }//catch
    }//onUpdateReceived

    private void handleIncomingMessage(Message message, Update update) throws TelegramApiException {

        SendMessage sendMessageGreeting =   new SendMessage().setChatId(update.getMessage().getChatId());
        switch(message.getText()) {
            case "Hola":
                System.out.println(message.getChat().getFirstName());
                sendMessageGreeting = new SendMessage().setChatId(update.getMessage().getChatId()).setText("" +
                        "Que tal "+ message.getChat().getFirstName() +", mi nombre es Kajoy, sere tu acompañante para navegar por las grandes aventuras de la apliaciòn Kajoy, elege una de las opciones que aparecen a continuación ");
                setButtons(sendMessageGreeting);
                break;
            case "/pregunta":
                sendMessageGreeting = new SendMessage().setChatId(update.getMessage().getChatId()).setText("" +
                        "Que tal "+ message.getChat().getFirstName() +", mi nombre es Kajoy, sere tu acompañante para navegar por las grandes aventuras de la apliaciòn Kajoy, elege una de las opciones que aparecen a continuación ");
                sendMessageGreeting.setReplyMarkup(etMenu(sendMessageGreeting,update.getMessage().getChatId()));
                SendMessage messageo=new SendMessage().setChatId(update.getMessage().getChatId()).setText("Menu");
                sendMessageGreeting = new SendMessage().setChatId(update.getMessage().getChatId()).setReplyMarkup(etMenu(sendMessageGreeting,update.getMessage().getChatId()));
                sendMessageGreeting.setText("¿Cuánto es dos mas dos?");

/*
                try {

                    SendMessage sendMessage=new SendMessage().setChatId(chat_id).setText(messageTextReceived);
                    sendMessageGreeting=new SendMessage().getChatId(update.getMessage().getChatId(

                }
                catch (TelegramApiException e){
                    e.printStackTrace();
                }
*/

//                sendMessageRequest = messageOnMainMenu(message);

                break;
            case REGISTRARSE:
//                sendMessageRequest = messageOnCurrentWeather(message);
                break;
            case SALIR:
                //                sendMessageRequest = messageOnForecastWeather(message);
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + message.getText());
        }
        execute(sendMessageGreeting);
    }

    public ReplyKeyboardMarkup  etMenu(SendMessage message,long chat_id) throws TelegramApiException{

        message=new SendMessage().setChatId(chat_id).setChatId("Opciones");

        ReplyKeyboardMarkup keyboardMarkup= new ReplyKeyboardMarkup();
        List<KeyboardRow> keyboard=new ArrayList<>();

        KeyboardRow row= new KeyboardRow();

        row.add("5");
        row.add("3");
        row.add("4");

       keyboard.add(row);

        row= new KeyboardRow();

        row.add("8");
        row.add("9");
        row.add("10");

        keyboard.add(row);

        keyboardMarkup.setKeyboard(keyboard);
        return keyboardMarkup;
//        message.setReplyMarkup(keyboardMarkup);




/*
        try {
            message.sendMessage(message);

        }
        catch (TelegramApiException e){
            e.printStackTrace();
        }

*/




    }


    public synchronized void setButtons(SendMessage sendMessage) {

        // Create a keyboard
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        // Create a list of keyboard rows
        List<KeyboardRow> keyboard = new ArrayList<>();

        // First keyboard row
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        // Add buttons to the first keyboard row
        keyboardFirstRow.add(new KeyboardButton(REGISTRARSE));

        // Second keyboard row
        KeyboardRow keyboardSecondRow = new KeyboardRow();
        // Add the buttons to the second keyboard row
        keyboardSecondRow.add(new KeyboardButton(INGRESAR_CURSO));

        // Second keyboard row
        KeyboardRow keyboardThirdRow = new KeyboardRow();
        // Add the buttons to the second keyboard row
        keyboardThirdRow.add(new KeyboardButton(SALIR));

        // Add all of the keyboard rows to the list
        keyboard.add(keyboardFirstRow);
        keyboard.add(keyboardSecondRow);
        keyboard.add(keyboardThirdRow);
        // and assign this list to our keyboard
        replyKeyboardMarkup.setKeyboard(keyboard);
    }

    public String getBotUsername() {
        return "Kajoybot";
    }//getBotUsername

    public String getBotToken() {
        return "883396045:AAFnccy-vbkbg7dxuqzs7XkvhjYbqw78n4o";
    }//getBotToken
}//KajoyBot
