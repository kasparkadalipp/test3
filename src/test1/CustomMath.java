package test1;

public class CustomMath {

	public int speed(int distance, int time){
		int speed;
		speed = distance / time;
		return speed;
	}
		
	public int time(int distance, int speed){
		int time;
		time = distance / speed;
		return time;
	}
	public int distance(int time, int speed){
		int distance;
		distance = speed * time;
		return distance;
	}
}
