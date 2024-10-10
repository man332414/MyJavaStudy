package chapter6_1;

public class car {
	static int number;
	boolean powerOn; //시동
	String color; // 차량의 색상
	int wheel; // 바퀴의 수
	int speed;
	boolean wiperOn;
	
	void power() {powerOn = !powerOn;}
	void speedUp() {speed+=10;}
	void speedDown() {speed-=10;}
	void wiper() {wiperOn = !wiperOn;}
}
