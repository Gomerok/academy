package by.academy.classwork.lesson9;

import java.util.ArrayList;
import java.util.Iterator;

public class HeavyBoxDemo {

	public static void main(String[] args) {
		HeavyBox box1 = new HeavyBox(4, 3, 5, 6);
		HeavyBox box2 = new HeavyBox(6, 7, 3, 6);
		HeavyBox box3 = new HeavyBox(9, 6, 4, 6);
		HeavyBox box4 = new HeavyBox(4, 8, 5, 3);
		HeavyBox box5 = new HeavyBox(10, 5, 5, 6);
		ArrayList<HeavyBox> list = new ArrayList<>();
		
		list.add(box1);
		list.add(box2);
		list.add(box3);
		list.add(box4);
		list.add(box5);
	
		for(HeavyBox l: list) {
			System.out.println(l);
			
		}
		list.remove(list.lastIndexOf(box5));
		list.clear();
	}

}
