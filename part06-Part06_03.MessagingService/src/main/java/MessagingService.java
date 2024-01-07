
import java.util.ArrayList;

public class MessagingService {

    private ArrayList<Message> list;

    public MessagingService() {
        this.list = new ArrayList<>();

    }

    //adds a message passed as a parameter to the messaging service as long as the message content is at most 280 characters long.
    public void add(Message message) {
        if (message.getContent().length() <= 280) {
            list.add(message);
        }
    }
    //returns the messages added to the messaging service.
    public ArrayList<Message> getMessages(){
         ArrayList<Message> result = new ArrayList<>();
        for(Message i:list){
           result.add(i);
        }
        return result;
    }


}
