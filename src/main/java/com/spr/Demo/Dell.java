package com.spr.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("dell")
public class Dell implements Laptop {
	@Autowired
	private Price price;
	
	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

	public void disp() {
		System.out.println("Laptop is Dell :"+price);
	}

}
