package social;

/**
 * Created with IntelliJ IDEA.
 * social.Person: manub
 * Date: 24/04/2013
 * Time: 18:52
 * To change this template use File | Settings | File Templates.
 */
public class Message {

    private final String content;

    public Message(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return content;
    }
}
