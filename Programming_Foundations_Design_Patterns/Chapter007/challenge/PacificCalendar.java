import java.util.*;

public class PacificCalendar extends Calendar {
	Zone zone;
	public PacificCalendar(ZoneFactory zoneFactory) {
		zone = zoneFactory.createZone("US/Pacific");
	}
	public void createCalendar(List<String> appointments) {
		System.out.println("Making the calendar");
	}
}