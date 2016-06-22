package test1;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.Math;
import java.applet.Applet;
import java.awt.*;

public class Main {

	public static void main(String[] args) {

		double Cash;
		int multiplier = 2;	
		double winRange = 47.5;
		int roll = 0;
		double result;	
		int wins = 0;
		double probability;
		double bet;

		int numberOfTests=100000;
		double origianlBet = 0.01;
		double goal = 103;



		for(int i = 0;i<numberOfTests;i++){	
			Cash = 60;
			bet = origianlBet;
			while(Cash < goal && Cash > 0){ 
				result = Math.random()*100;
				//roll++;
				if(result > winRange) { // loss
					Cash -= bet;
					//System.out.printf("%.2f",Cash);
					//System.out.println("€ loss:\t-" + Bet);
					bet*=multiplier;
				}
				// BAD OPTION
//				else if(bet >= 20){ 
//					bet = 10;
//				}
				else{//if
					Cash += bet;
					//System.out.printf("%.2f",Cash);
					//System.out.println("€ win:\t+" + Bet);
					bet = origianlBet;
				}//else
			}//while
			if (Cash >= goal){
				//System.out.println("Result: I won");
				//System.out.println("");
				wins++;
			} // if
			//else {
			//System.out.println("Result: I lost");
			//System.out.println("");
			//} // else
		}// for

		probability = (double)wins/numberOfTests*100;
		System.out.print("Win chance is: ");
		System.out.printf("%.2f", probability);
		System.out.println("%");
		//		System.out.println("times won: " + wins);


		/*		
		double principal;  // The value of the investment.
		double rate;       // The annual interest rate.
		double interest;   // The interest earned during the year.

		System.out.print("Enter the initial investment: ");
		principal = TextIO.getlnDouble();

		System.out.print("Enter the annual interest rate (as a decimal): ");
		rate = TextIO.getlnDouble();

		interest = principal * rate;       // Compute this year's interest.
		principal = principal + interest;  // Add it to principal.

		System.out.printf("The amount of interest is $%.2f%n", interest); 
		System.out.printf("The value after one year is $%.2f%n", principal);


		/*
public class Main extends Applet {
	public void paint(Graphics g) { // ül: see mida kirjutan tuleb joonisena tagasi

		int x1 = 350;	// Keskpunkt x
		int y1 = 350;   // Keskpunkt y
		int r1 = 300;	// Raadius
		int r2 = 100;
		int r3 = 10;
		int x2, y2;
		int x3, y3;
		int x4, y4;
		double k, t, m;


		int w = getWidth();
		int h = getHeight();

		g.setColor(Color.white);
		g.fillRect(0, 0, w, h);

		g.setColor(Color.black);
		for(t = -Math.PI; t < Math.PI; t = t + Math.PI / 5) {
			x2 = (int)(r1 * Math.cos(t) + x1);
			y2 = (int)(r1 * Math.sin(t) + y1); 

			g.drawLine(x2, y2, x1, y1);

			for(k = -Math.PI; k < Math.PI; k = k + Math.PI / 57) {
				x3 = (int)(r2 * Math.cos(k) + x2);
				y3 = (int)(r2 * Math.sin(k) + y2);

				g.drawLine(x3, y3, x2, y2);

				for(m = -Math.PI; m < Math.PI; m = m + Math.PI / 10) {
					x4 = (int)(r3 * Math.cos(m) + x3);
					y4 = (int)(r3 * Math.sin(m) + y3);

					g.drawLine(x4, y4, x3, y3);
					}
				}
			}
			/*
public class Main extends Applet {
	public void paint(Graphics g) {

		int w = getWidth();
		int h = getHeight();

		g.setColor(Color.white);
		g.fillRect(0, 0, w, h);

		g.setColor(Color.black);

		int[] x={20,40,40,60,80,60,80,60,40,40,20};
		int[] y={20,20,60,20,20,65,100,100,70,100,100};

		g.drawPolygon(x, y, 11);


public class Main extends Applet {
	public void paint(Graphics g) {

		int i;

		int w = getWidth();
		int h = getHeight();


		g.setColor(Color.white);
		g.fillRect(0, 0, w, h);

		g.setColor(Color.black);
		g.drawRect(20, 20, 600, 600);


		for(i=20;i<600;i++){
			i+=16;

			g.setColor(Color.orange);
			g.drawLine(20,20,i,620);
			g.setColor(Color.blue);
			g.drawLine(620,20,i,620);
		}


		// TODO Auto-generated method stub
		System.out.println("hello world");

		PC myPC = new PC();

		String Cpu;

		int lammas = 0;
		// CPU 4670K
		// GPU GTX770
		// Case ammo box
		myPC.setCpu("4670K");
		myPC.setGpu("GTX770");
		myPC.setPc_case("ammo box");
		Cpu = myPC.getCpu();
		System.out.println("1 lammas on " + lammas);
		lammas = 100;
		System.out.println("2 lammas on " + lammas);
		System.out.println(Cpu);
		System.out.println(myPC.lammas());
		System.out.println(myPC.specs());

		CustomMath myMath = new CustomMath();

		System.out.println(myMath.speed(1000, 20));
		System.out.println(myMath.time(800, 10));
		System.out.println(myMath.distance(200, 4));

		System.out.println(Math.sqrt(199));
		http://enos.itcollege.ee/~jpoial/java/
		 */
	}

}
