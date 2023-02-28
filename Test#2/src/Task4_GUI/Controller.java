package Task4_GUI;
import java.util.*;

public class Controller {
    private List<Event> eventList = new LinkedList<Event>();
    public void addEvent(Event c) { eventList.add(c);}
    public void run() {
        /*while (eventList.size() > 0)
            for (Event e : new ArrayList<Event>(eventList))
                if (e.ready()) {
                    System.out.println(e);
                    e.action();
                    eventList.remove(e);
                }*/
        Iterator<Event> it = new LinkedList<Event>(eventList).listIterator();
        while(it.hasNext()) {
            Event event = it.next();
            if(event.ready()) {
                System.out.println(event);
                event.action();
                eventList.remove(event);
            }
        }
    }
}
