package mtg;

import mtg.zones.Zone;

public class Spell extends MtgObject implements Controllable {
    Spell(Player controller, Player owner, Zone zone) {
        super(controller, owner, zone);
    }
}
