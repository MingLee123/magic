package mtg;

public class PermanentCard extends Permanent implements Card {
    PermanentCard(Player controller, Player owner) {
        super(controller, owner);
    }
}
