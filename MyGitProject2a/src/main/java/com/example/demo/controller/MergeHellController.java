package com.example.demo.controller;

public class MergeHellController {
	public static void main(String[] args) {
		kadaiA();
		kadaiC();
	}

	void kadaiA() {
		for (int i = 0; i < 10; i++) {
			System.out.println("ループ回数は" + (i + 1));
		}
	}
}
