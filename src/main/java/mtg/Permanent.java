package mtg;

abstract class Permanent extends MtgObject implements Controllable {
    boolean isTapped;
    boolean isFlipped;
    boolean isFaceUp;
    boolean isPhasedIn;

    Permanent(Player controller, Player owner) {
        super(controller, owner, GameState.battlefield);
    }

    void setTapped(boolean isTapped) {
        this.isTapped = isTapped;
    }
}
