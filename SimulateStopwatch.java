package com.logicalprogram.all;

import java.util.Scanner;

class StopWatch 
{
	public long startTimer=0;
	public long stopTimer=0;
	public long elapsed;

	//to start timer
	public void start()
	{
		startTimer=System.currentTimeMillis();
		System.out.println("Start Time is: "+startTimer);
	}

	// to stop timer
	public void stop()
	{
		stopTimer=System.currentTimeMillis();
		System.out.println("Stop Time is: "+stopTimer);
	}

	public long getElapsedTime()
	{
		this.elapsed=stopTimer-startTimer;
		return elapsed;
	}
}
public class SimulateStopwatch {
	public static void main(String[] args)
	{
		StopWatch sw=new StopWatch();
		Scanner sc = new Scanner(System.in);
		System.out.println("Press '1' to Start Time: ");
		int a = sc.nextInt();
		//u.inputInteger();
		if(a==1)
		sw.start();

		System.out.println();
		System.out.println("Press '2' to Stop Time: ");
		int b = sc.nextInt();
		//u.inputInteger();
		if(b==2)
		sw.stop();

		long l=sw.getElapsedTime();
		System.out.println();
		System.out.println("Total Time Elapsed(in millisec) is:"+l);
		System.out.println();
		System.out.println("Converting millisec to seconds: "+(l/1000)+" sec");
	}
}



