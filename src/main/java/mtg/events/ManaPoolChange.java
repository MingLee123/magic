package mtg.events;

import mtg.Mana;
import org.apache.commons.lang3.Validate;

import java.util.Map;

public class ManaPoolChange extends Event {
    private int amount;
    private Map<Mana, Integer> manaPool;
    private Mana mana;

    public ManaPoolChange(Map<Mana, Integer> manaPool, Mana mana, int amount) {
        this.amount = amount;
        this.manaPool = Validate.notNull(manaPool);
        this.mana = Validate.notNull(mana);
    }

    @Override
    void takeEffect() {
        if (manaPool.getOrDefault(mana, 0) + amount == 0) {
            manaPool.remove(mana);
        }
        else {
            manaPool.merge(mana, amount, (a, b) -> a + b);
        }
    }
}
