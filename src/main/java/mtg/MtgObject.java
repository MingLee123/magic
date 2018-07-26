package mtg;

import mtg.zones.Zone;
import org.apache.commons.lang3.Validate;

import java.util.ArrayList;
import java.util.Collection;

public abstract class MtgObject implements Controllable, Localizable, Targetable {
    private Collection<Collection<? extends Characteristic>> characteristics = new ArrayList<>();
    private Player controller;
    private Player owner;
    private Zone zone;

    MtgObject(Player controller, Player owner, Zone zone) {
        this.owner = Validate.notNull(owner);
        this.zone = Validate.notNull(zone);
        this.controller = controller == null ? owner : controller;
    }

    private Collection<? extends Characteristic> getCharacteristic(Class<? extends Characteristic> characteristicClass) {
        for (Collection<? extends Characteristic> characteristic : characteristics) {
            if (characteristic.getClass().equals(characteristicClass)) {
                return characteristic;
            }
        }
        return new ArrayList<>();
    }

    @Override
    public Player getController() {
        return controller;
    }

    @Override
    public void setController(Player controller) {
        this.controller = controller;
    }

    @Override
    public Player getOwner() {
        return owner;
    }

    @Override
    public Zone getZone() {
        return zone;
    }

    @Override
    public void setZone(Zone zone) {
        this.zone.removeMtgObject(this);
        this.zone = zone;
        zone.addMtgObject(this);
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

    public void setCharacteristic(Collection<? extends Characteristic> characteristic) {
        characteristics.removeIf(c -> c.getClass().equals(characteristic.getClass()));
        characteristics.add(characteristic);
    }
}
