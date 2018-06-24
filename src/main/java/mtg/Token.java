package mtg;

import mtg.zones.Zone;

public class Token extends Permanent implements Controllable {
    Token(Player controller, Player owner, Zone zone) {
        super(controller, owner, zone);
    }
}
