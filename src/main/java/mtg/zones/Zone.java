package mtg.zones;

import mtg.MtgObject;
import mtg.Targetable;

import java.util.Collection;

public abstract class Zone implements Targetable {
    private Collection<MtgObject> mtgObjects;

    public void addMtgObject(MtgObject mtgObject) {
        mtgObjects.add(mtgObject);
    }

    public void removeMtgObject(MtgObject mtgObject) {
        mtgObjects.remove(mtgObject);
    }
}
