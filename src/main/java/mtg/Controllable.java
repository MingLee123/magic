package mtg;

public interface Controllable extends Ownable {
    Player getController();

    void setController(Player controller);
}
