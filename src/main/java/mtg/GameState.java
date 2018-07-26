package mtg;

import mtg.events.Event;
import mtg.zones.Battlefield;
import mtg.zones.Stack;

import java.util.Collection;

public class GameState {
    static Battlefield battlefield;
    static Stack stack;
    static Collection<Event> events;

    public static void addEvent(Event event) {
        events.add(event);
    }
}
