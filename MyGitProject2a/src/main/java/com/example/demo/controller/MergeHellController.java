package com.example.demo.controller;

import java.util.Random;

public class MergeHellController {
	public static void main(String[] args) {
		kadaiA();
		kadaiB();
		kadaiC();
		kadaiK();
	}

	static void kadaiA() {
		for (int i = 0; i < 10; i++) {
			System.out.println("現在" + i + "回目のループです");
		}
	}

	static void kadaiB() {
		Random rnd = new Random();

		int R = rnd.nextInt(1, 100);

		System.out.println(R + "がでました");
	}

	static void kadaiC() {

		int a = 50;
		int b = 75;

		int c = a + b;

		System.out.println(c);
	}

	static void kadaiK() {

		System.out.println("暇だったから物語を作ってみる。アイスクンでしたおしまい。");
	}
}