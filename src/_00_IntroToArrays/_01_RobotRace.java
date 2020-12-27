package _00_IntroToArrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		boolean b = true;
		//2. create an array of 5 robots.
		Robot[] robots = new Robot[5];
		//3. use a for loop to initialize the robots.
		int x = 250;
		int y = 500;
		int ran = new Random().nextInt(50);
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot();
			robots[i].setX(x + (i*100));
			robots[i].setY(y);
		}
			//4. make each robot start at the bottom of the screen, side by side, facing up
	//done
		//5. use another for loop to iterate through the array and make each robot move 
		//   a random amount less than 50.
		while(b) {
			for(int i = 0; i < robots.length; i++) {
				robots[i].move(ran);
				ran = new Random().nextInt(50);
				if(robots[i].getY() < 0) {
					b = false;
				}
			}
		}
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
		//7. declare that robot the winner and throw it a party!
		System.out.println("A Robot has won!");
		//8. try different races with different amounts of robots.
		//9. make the robots race around a circular track.
	}
}
