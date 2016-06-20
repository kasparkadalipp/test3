package test1;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.Math;
import java.applet.Applet;
import java.awt.*;

public class Main {

	public static void main(String[] args) {

		int die1 , die2, die3, die4, die5;
		int rolls = 0;

		do{
		die1 = (int)(Math.random()*6)+1;
		die2 = (int)(Math.random()*6)+1;
		die3 = (int)(Math.random()*6)+1;
		die4 = (int)(Math.random()*6)+1;
		die5 = (int)(Math.random()*6)+1;
		rolls++;
		}while(( die1 != 6 || die2 != 6 || die3 != 6 || die4 != 6 || die5 != 6)
				&&( die1 != 5 || die2 != 5 || die3 != 5 || die4 != 5 || die5 != 5)
				&&( die1 != 4 || die2 != 4 || die3 != 4 || die4 != 4 || die5 != 4)
				&&( die1 != 3 || die2 != 3 || die3 != 3 || die4 != 3 || die5 != 3)
				&&( die1 != 2 || die2 != 2 || die3 != 2 || die4 != 2 || die5 != 2)
				&&( die1 != 1 || die2 != 1 || die3 != 1 || die4 != 1 || die5 != 1));
		
		 System.out.println("It took " + rolls);


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
