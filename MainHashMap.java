package fr.dauphine.javaavance.td3;


import java.util.HashMap;
import java.util.Map;

import fr.dauphine.javaavance.td1.Circle;
import fr.dauphine.javaavance.td1.Point;

public class MainHashMap {

	public static void main(String[] args) {
		Map<Point, Circle> m = new HashMap<>();
		Point p1 = new Point(100,150);
		Circle c1 = new Circle(p1,100);
		m.put(p1, c1);
		System.out.println(m.containsKey(p1));
		System.out.println(m.containsKey(new Point(100,150)));
		// We need to generate hashcode and equals methods in the Point class and set the values of the class
		// Point to 100 and 150 so it returns true, true.

	}

}
