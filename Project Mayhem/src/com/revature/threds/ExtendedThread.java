package com.revature.threds;

public class ExtendedThread extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("\t\tHi-ExtendThread");
		}
	}
}
