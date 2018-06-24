package mtg;

import mtg.zones.Zone;

public class AbilityOnStack<A extends Ability> extends MtgObject implements Controllable {
    public AbilityOnStack(Player controller, Player owner, Zone zone) {
        super(controller, owner, zone);
    }
}
