package mtg;

import mtg.zones.Zone;

class Card extends MtgObject implements Ownable {
    public Card(Player controller, Player owner, Zone zone) {
        super(controller, owner, zone);
    }
}
