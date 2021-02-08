package simulation;

public class ball {
	double[] position,speed,acceleration;

	ball(double[] position, double[] speed, double acceleration[]){
	this.position = position;
	this.speed = speed;
	this.acceleration = acceleration;
	}
	
	void update() {
		if(position[1]>=495 && speed[1] > 0) {
			speed[1]=-speed[1];
			speed[1] -= 0.20*speed[1];
		}
		if(position[1]<= 5) {
			speed[1]=-speed[1];
			//speed[1] -= 0.05*speed[1];
		}
		if(position[0]>=495 && speed[0] > 0) {
			speed[0]=-speed[0];
			speed[0] -= 0.20*speed[0];
		}
		if(position[0]<= 5 && speed[0] <0) {
			speed[0]=-speed[0];
			speed[0] -= 0.20*speed[0];
		}
		position[1]+= -(speed[1]*speed[1]-Math.pow(acceleration[1]+speed[1],2))/(2*acceleration[1]);
		position[0]+= speed[0];
		speed[1] += acceleration[1];
		//System.out.println(0.5*speed[1]*speed[1]+0.5*speed[0]*speed[0]+acceleration[1]*(500-position[1]));
	}
}
