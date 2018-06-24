package mtg;

import mtg.zones.Zone;

public interface Localizable {
    Zone getZone();

    void setZone(Zone zone);
}
