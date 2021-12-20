package com.yedam;

public class Employees {
private int id;
private String name;
private String birth;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBirth() {
	return birth;
}
public void setBirth(String birth) {
	this.birth = birth;
}
@Override
public String toString() {
	return "Employees [id=" + id + ", name=" + name + ", birth=" + birth + "]";
}



}
