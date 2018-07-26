package mtg;

import org.apache.commons.lang3.Validate;

import java.util.Collection;

public class Mana {
    public Color color;
    public Collection<Characteristic> consumerRestrictions;
    public MtgObject source;

    public Mana(Color color, Collection<Characteristic> consumerRestrictions, MtgObject source) {
        this.color = color;
        this.consumerRestrictions = consumerRestrictions;
        this.source = Validate.notNull(source);
    }
}
