package mtg;

import mtg.zones.Stack;

public class AbilityOnStack extends MtgObject implements Controllable {
    Targetable target;

    public AbilityOnStack(Player controller, Player owner, Stack stack, Targetable target) {
        super(controller, owner, GameState.stack);
        this.target = target;
    }
}
