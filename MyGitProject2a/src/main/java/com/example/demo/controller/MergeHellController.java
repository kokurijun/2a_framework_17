package com.example.demo.controller;

import java.util.Random;

public class MergeHellController {
	public static void main(String[] args) {
		kadaiA();
		kadaiB();
		kadaiC();
		kadaiK();
	}

	void kadaiB() {
		Random rnd = new Random();

		int R = rnd.nextInt(1, 100);

		System.out.println(R + "がでました");
	}

	void kadaiC() {

		int a = 50;
		int b = 75;

		int c = a + b;

		System.out.println(c);
	}

	void kadaiK() {

		System.out.println("暇だったから物語を作ってみる。アイスクンでしたおしまい。");
	}
}