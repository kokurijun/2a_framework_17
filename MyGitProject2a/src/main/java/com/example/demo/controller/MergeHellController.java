package com.example.demo.controller;

import java.util.Random;

public class MergeHellController {
	public static void main(String[] args) {
		kadaiB();
		kadaiC();
	}

	void kadaiA() {
		for (int i = 0; i < 10; i++) {
			System.out.println("ループ回数は" + (i + 1));
		}
	}

	static void kadaiB() {
		Random rand = new Random();

		int R = rand.nextInt(1, 100);

		System.out.println(R + "がでました");
	}

	static void kadaiC() {

		int a = 50;
		int b = 75;

		int c = a + b;

		System.out.println(c);
	}
}
