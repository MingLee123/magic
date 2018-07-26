package mtg;

import mtg.zones.Zone;

public class Token extends Permanent implements Controllable {
    Token(Player controller, Player owner) {
        super(controller, owner);
    }

    @Override
    public void setZone(Zone zone) {
        if (zone != GameState.battlefield) {
            GameState.battlefield.removeMtgObject(this);
        }
    }
}
