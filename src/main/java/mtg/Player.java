package mtg;

import mtg.zones.Library;

import java.util.Collection;

class Player implements Targetable {
    public Library library;
    public int life;
    public Collection<Mana> manaPool;
}
