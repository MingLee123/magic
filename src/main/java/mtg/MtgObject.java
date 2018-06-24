package mtg;

import mtg.zones.Zone;
import org.apache.commons.lang3.Validate;

import java.util.ArrayList;
import java.util.Collection;

public class MtgObject implements Controllable, Localizable {
    private Collection<Collection<? extends Characteristic>> characteristics;
    private Player controller;
    private Player owner;
    private Zone zone;

    MtgObject(Player controller, Player owner, Zone zone) {
        Validate.notNull(owner);
        Validate.notNull(zone);
        characteristics = new ArrayList<>();
        this.owner = owner;
        this.zone = zone;
        this.controller = controller == null ? owner : controller;
    }

    @Override
    public Zone getZone() {
        return zone;
    }

    @Override
    public void setZone(Zone zone) {
        this.zone = zone;
    }

    private Collection<? extends Characteristic> getCharacteristic(Class<? extends Characteristic> characteristicClass) {
        for (Collection<? extends Characteristic> characteristic : characteristics) {
            if (characteristic.getClass().equals(characteristicClass)) {
                return characteristic;
            }
        }
        return new ArrayList<>();
    }

    private void setCharacteristic(Collection<? extends Characteristic> characteristic) {
        characteristics.removeIf(c -> c.getClass().equals(characteristic.getClass()));
        characteristics.add(characteristic);
    }

    boolean isColorless() {
        return getCharacteristic(Color.class).isEmpty();
    }

    boolean isMonocolored() {
        return getCharacteristic(Color.class).size() == 1;
    }

    boolean isMulticolored() {
        return getCharacteristic(Color.class).size() > 1;
    }

    boolean isType(Type type) {
        return getCharacteristic(Type.class).contains(type);
    }

    @Override
    public Player getOwner() {
        return owner;
    }

    @Override
    public Player getController() {
        return controller;
    }

    @Override
    public void setController(Player controller) {
        this.controller = controller;
    }
}
