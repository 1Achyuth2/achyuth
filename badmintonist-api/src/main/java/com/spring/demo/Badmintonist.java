package com.spring.demo;

public class Badmintonist {
private Integer id;
private String style;
private String country;
private String name;



public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getStyle() {
	return style;
}
public void setStyle(String style) {
	this.style = style;
}

public Badmintonist() {
	// TODO Auto-generated constructor stub
}


@Override
public String toString() {
	return "Badmintonist [id=" + id + ", name=" + name + ", country=" + country + ", style=" + style + "]";
}




public Badmintonist(Integer id, String name, String country, String style) {
	super();
	this.id = id;
	this.name = name;
	this.country = country;
	this.style = style;
}
}
