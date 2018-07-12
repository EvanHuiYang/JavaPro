package demo.java.web.services;

import java.text.SimpleDateFormat;

public class QuakeWebServiceDemo {
	public static ArrayList<Quake> getQuakes(String url) {
		
	}
	
	public static void main(String[] args) {
		ArrayList<Quake> earthquakes = getQuakes(
				"https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/2.5_day.atom");
		
		System.out.println("TODAY'S EARTHQUAKES 2.5 AND HIGHER");
		SimpleDateFormat df = new SimpleDateFormat("HH:MM");
		System.out.printf("%s\t%-25s\t%s\t%s\n", 
				"WHEN", "LAT / LONG", "MAGNITUDE", "DETAILS");
		for (Quake q : earthquakes) {
			System.out.printf("%s\t%-25s\t%f\t%s\n",
					df.format(q.getDate()), q.getLocation(), q.getMagnitude(), q.getDetails());
		}
	}
}
