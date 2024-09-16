package com.student.pack;

import org.springframework.stereotype.Component;

@Component("sub")
public class Subject {
private String sub;

public String getSub() {
	return sub;
}

public void setSub(String sub) {
	this.sub = sub;
}

@Override
public String toString() {
	return "To here" ;
}

}

