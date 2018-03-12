package intro.to.java.ch13;

public class HouseDemo {
	public static void main(String[] args) {
		House house1 = new House(1, 1750.50);
		House house2 = null;
		
		try {
			house2 = (House)house1.clone();
			System.out.println("id: " + house2.getId()
					+ "\narea: " + house2.getArea()
					+ "\nwhen built: " + house2.getWhenBuilt());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
