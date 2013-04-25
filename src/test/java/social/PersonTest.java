package social;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class PersonTest {

    private Person person;
    private Timeline timeline;
    private Wall wall;

    @BeforeMethod
    public void setUp() throws Exception {
        timeline = mock(Timeline.class);
        wall = mock(Wall.class);
        person = new Person(timeline, wall);
    }

    @Test
    public void anUserShouldPublishMessagesToAPersonalTimeline() throws Exception {
        //given
        Message message = mock(Message.class);

        //when
        person.publish(message);

        //then
        verify(timeline).publish(message);
    }

    @Test
    public void canShowHerTimeline() throws Exception {
        //given

        //when
        person.showTimeline();

        //then
        verify(wall).print(timeline);

    }
}
