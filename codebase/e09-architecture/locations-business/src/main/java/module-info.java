import de.throsenheim.gui.locations.business.location.api.LocationService;
import de.throsenheim.gui.locations.business.location.impl.LocationServiceImpl;

module de.throsenheim.gui.locations.business {
    exports de.throsenheim.gui.locations.business.location.api;

    requires de.throsenheim.gui.locations.dataaccess;
    requires org.slf4j;

    provides LocationService with LocationServiceImpl;
}
