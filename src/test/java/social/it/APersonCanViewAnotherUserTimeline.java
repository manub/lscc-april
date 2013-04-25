package social.it;

import org.testng.annotations.Test;
import social.Message;
import social.Person;
import social.Timeline;
import social.Wall;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: manub
 * Date: 24/04/2013
 * Time: 19:29
 * To change this template use File | Settings | File Templates.
 */
public class APersonCanViewAnotherUserTimeline {

    @Test
    public void withNoMessagesPublished() throws Exception {
        Wall wall = new Wall();
        Timeline timeline = new Timeline();
        Person alice = new Person(timeline, wall);
        alice.showTimeline();
        assertTrue(wall.isEmpty());
    }

    @Test
    public void withOneMessagePublished() throws Exception {

        //given
        Wall wall = new Wall();

        Message message = new Message("Hello");
        Timeline timeline = new Timeline();
        //when

        Person alice = new Person(timeline, wall);
        alice.publish(message);
        alice.showTimeline();

        //then

        assertTrue(wall.equals("Hello"));
    }
}
