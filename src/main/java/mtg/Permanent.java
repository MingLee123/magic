package mtg;

import mtg.zones.Zone;

public class Permanent extends MtgObject implements Controllable {
    boolean isTapped;
    boolean isFlipped;
    boolean isFaceUp;
    boolean isPhasedIn;

    Permanent(Player controller, Player owner, Zone zone) {
        super(controller, owner, zone);
    }
}
