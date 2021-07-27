package com.madhav.demo1;

import com.madhav.demo.Audi;
import com.madhav.demo.BMW;
import com.madhav.demo.Car;
import com.madhav.demo.Honda;

public class CarRentalMain {

	public static void main(String[] args) {
		Driver sonu=new Driver("Sonu");
		Driver suresh=new Driver("Suresh");
		Driver ramesh=new Driver("Ramesh");
		
		Car bmw=new BMW("Class c","Silver");
		Car audi=new Audi("A8","Blue");
		Car honda=new Honda("City","Black");
		
		suresh.setCar(honda);
		suresh.drive();

	}

}
