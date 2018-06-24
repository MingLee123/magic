package mtg;

import java.util.Collection;

public class TriggeredAbility extends Ability {
    private Collection<Event> conditions;
    private Collection<Event> effects;
}
