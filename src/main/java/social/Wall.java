package social;

/**
 * Created with IntelliJ IDEA.
 * User: manub
 * Date: 24/04/2013
 * Time: 19:07
 * To change this template use File | Settings | File Templates.
 */
public class Wall {
    private String content = "";

    public void print(Timeline timeline) {
        StringBuilder contentBuilder = new StringBuilder();
        for (Message message : timeline) {
            contentBuilder.append(message);
        }
        content = contentBuilder.toString();

    }

    public boolean isEmpty() {
        return content.isEmpty();
    }

    @Override
    public boolean equals(Object obj) {
        return content.equals(obj);
    }
}
