package mtg;

public enum Type implements Characteristic{
    ARTIFACT(true, false),
    CREATURE(true, false),
    ENCHANTMENT(true, false),
    INSTANT(false, true),
    LAND(true, false),
    PLANESWALKER(true, false),
    SORCERY(false, true),
    TRIBAL(false, false);

    boolean isPermanentOnly;
    boolean isNonPermanentOnly;

    Type(boolean isPermanentOnly, boolean isNonPermanentOnly) {
        this.isPermanentOnly = isPermanentOnly;
        this.isNonPermanentOnly = isNonPermanentOnly;
    }
}
