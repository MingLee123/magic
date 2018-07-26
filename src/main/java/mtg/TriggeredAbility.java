package mtg;

import mtg.events.Event;

import java.util.Collection;
import java.util.function.Predicate;

public interface TriggeredAbility extends Ability {
    Collection<Event> getTriggeringEvents();

    Collection<Predicate<GameState>> getPreconditions();

    Collection<Event> getEffects();
}
