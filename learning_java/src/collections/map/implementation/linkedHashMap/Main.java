package collections.map.implementation.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Vehicle car1 = new Vehicle("Renault Sandero", 2022612);
		Vehicle car2 = new Vehicle("Renault Clio", 2019814);
		Vehicle car3 = new Vehicle("Renault Peugeot", 20081212);

		Vehicle motorcycle1 = new Vehicle("Honda 300", 2023119);
		Vehicle motorcycle2 = new Vehicle("Honda Biz 125", 2022913);

		LinkedHashMap<String, Vehicle> map = new LinkedHashMap<>();

		map.put("motocycle2", motorcycle2);
		map.put("motocycle1", motorcycle1);

		map.put("car3", car3);
		map.put("car1", car1);
		map.put("car2", car2);
		
		for(Map.Entry<String, Vehicle> entry : map.entrySet()) {
			System.out.println(entry);
		}
	}

}
