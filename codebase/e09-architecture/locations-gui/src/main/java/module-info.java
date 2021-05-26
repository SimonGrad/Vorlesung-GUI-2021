import de.throsenheim.gui.locations.business.location.api.LocationService;

module de.throsenheim.gui.locations.gui {
    requires de.throsenheim.gui.locations.business;

    requires  javafx.controls;
    requires  javafx.fxml;
    requires org.slf4j;

    opens de.throsenheim.gui.locations;
    opens de.throsenheim.gui.locations.locationform;
    opens de.throsenheim.gui.locations.status;
    opens de.throsenheim.gui.locations.location;

    uses LocationService;
}
