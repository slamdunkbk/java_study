package com.java.constant2;
//class Fruit{
//    public static final Fruit APPLE  = new Fruit();
//    public static final Fruit PEACH  = new Fruit();
//    public static final Fruit BANANA = new Fruit();
//}

//enum은 서로 연관된 상수들의 집합 = 열거형
//Fruit는 클래스
enum Fruit {
	APPLE("red"), PEACH("pink"), BANANA("yellow");
	// enum은 필드와 메소드를 생성할 수 있다
	private String color;
	public String getColor(){
		return this.color;
	}
	// 생성자 Fruit가 호출되므로 enum은 생성자를 가질 수 있다.
	Fruit(String color) {
		this.color = color;
		System.out.println("Call Constructor " + this);
	}
}
enum Company {
	GOOGLE, APPLE, ORACLE;
}
public class ConstantDemo{
	public static void main(String[] args){
		// foreach문으로 Fruit의 값을 하나씩 불러온다
		for (Fruit f : Fruit.values()) {
			System.out.println(f);
		}
		Fruit type = Fruit.APPLE;
		switch (type) {
			case APPLE :
				System.out.println(57 + " kcal, color " + Fruit.APPLE.getColor());
				break;
			case PEACH :
				System.out.println(34 + " kcal, color " + Fruit.PEACH.getColor());
				break;
			case BANANA :
				System.out.println(93 + " kcal, color " + Fruit.BANANA.getColor());
				break;
		}
	}
}
