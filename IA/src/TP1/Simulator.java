package TP1;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;
import java.io.*;

public class Simulator {

	static int WIDTH = 400;
	static int HEIGHT = 400;
		
	static ImageBuffer IMAGE = new ImageBuffer(WIDTH, HEIGHT);
	static Graphics IMG = IMAGE.getGraphics();

	static double neighborDistanceThreshold = 100.0;
	static int nbBoids = 20;
	static ArrayList<Boid> allBoids = new ArrayList<Boid>();

	public static void updateAllBoids()
	{
		IMAGE.cls(255,255,255); // clean image
		for (int i = 0 ; i < nbBoids ; i ++)
		{
			allBoids.get(i).controllerBoid();
			allBoids.get(i).applyDynamics();
			allBoids.get(i).traceBoid(IMAGE);
		}
	}

	public static double computeDistance(Boid a, Boid b)
	{
		Point2d pa = a.getPosition();
		Point2d pb = b.getPosition();
		return Math.sqrt(((pa.x - pb.x) * (pa.x - pb.x)) + ((pa.y - pb.y) * (pa.y - pb.y)));
	}

	public static void computeNeighbors()
	{
		ArrayList<ArrayList<Boid>> neighbors = new ArrayList<ArrayList<Boid>>();
		for (int i = 0 ; i < nbBoids ; i++)
		{
			neighbors.add(new ArrayList<Boid>());
		}

		for (int i = 0 ; i < nbBoids ; i++)
		{
			for (int j = i +1 ; j < nbBoids ; j++)
			{
				if (computeDistance(allBoids.get(i), allBoids.get(j)) < neighborDistanceThreshold)
				{
					neighbors.get(i).add(allBoids.get(j));
					neighbors.get(j).add(allBoids.get(i));
				}
			}
		}

		for (int i = 0 ; i < nbBoids ; i++)
		{
			allBoids.get(i).setNeighbors(neighbors.get(i));
		}
	}

	public static void main(String[] args) 
	{
		Random randomGen = new Random();
		System.out.println("*** boid demo ***");
		ImageFrame imageFrame =	ImageFrame.makeFrame("exemple", IMAGE, 0, WIDTH, HEIGHT );

		IMAGE.cls(255,255,255); // clean image

		for (int i = 0 ; i < nbBoids ; i++)
		{
			allBoids.add(new Boid(randomGen.nextInt(400),randomGen.nextInt(400),((randomGen.nextDouble()*2)-1.0)*Math.PI,WIDTH,HEIGHT));
			allBoids.get(i).setRotationalSpeed(0.0);
			allBoids.get(i).setTranslationalSpeed(2.0);
			allBoids.get(i).traceBoid(IMAGE);
		}
		/*
		allBoids.add(new Boid(190,310,Math.PI,WIDTH,HEIGHT));
		allBoids.add(new Boid(210,300,2*Math.PI,WIDTH,HEIGHT));
		allBoids.add(new Boid(230,310,Math.PI,WIDTH,HEIGHT));
		*/

		for(int i = 0 ; i < nbBoids ; i ++)
		{
			allBoids.get(i).traceBoid(IMAGE);
		}

		try {
				Thread.sleep(2000);
		} catch(InterruptedException ex) {
				Thread.currentThread().interrupt();
		}

			/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
		try {
			String sample = br.readLine();
		} catch(IOException ex) {
			System.out.println("read fail");
		}
			*/
		
		for (int i = 0 ; i < 1000 ; i++)
		{
			computeNeighbors();
			updateAllBoids();

			try {
				Thread.sleep(50);
			} catch(InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
			/*
			br = new BufferedReader(new InputStreamReader(System.in));  
			try {
				String sample = br.readLine();
			} catch(IOException ex) {
				System.out.println("read fail");
			}
			*/
		}

		System.out.println("end.");
	}
}
