package social;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Timeline implements Iterable<Message>{

    private final List<Message> messages = new LinkedList<Message>();

    public void publish(Message message) {
        messages.add(message);
    }

    @Override
    public Iterator<Message> iterator() {
        return messages.iterator();
    }
}
