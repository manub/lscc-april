package social;

/**
 * Created with IntelliJ IDEA.
 * social.Person: manub
 * Date: 24/04/2013
 * Time: 18:57
 * To change this template use File | Settings | File Templates.
 */
public class Person {
    private final Timeline timeline;
    private final Wall wall;


    public Person(Timeline timeline, Wall wall) {
        this.timeline = timeline;
        this.wall = wall;
    }

    public void publish(Message message) {
        timeline.publish(message);
    }

    public void showTimeline() {
        wall.print(timeline);
    }
}
