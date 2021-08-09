package jp.learningdesign.javastudy;

import java.util.Scanner;
public class BmiCalc {
	/* BMI　体格指数を計算するプログラム
	 */
	public static void main(String[] args) {
		double weight,height,bmi;
		Scanner stdIn = new Scanner(System.in);
		System.out. println("体重は?(kg) :");
		weight = stdIn.nextDouble();
		System.out. println("身長は?(cm) :");
		height = stdIn.nextDouble();
		height /= 100;
		
		bmi = weight / (height * height);
		
		System.out.println(bmi);
		
		if (bmi < 18.5) {
			System .out.println("瘦せ型です");
		}else if (bmi < 25) {
			System.out.println("標準です");
		}else {
			System.out.println("肥満です");
		}
	}
}

