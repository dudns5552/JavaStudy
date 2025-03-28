package ex20io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Circle implements Serializable {
	
	int xPos, yPos;
	double radian;
	public Circle(int x, int y, double r) {
		xPos = x;
		yPos = y;
		radian = r;
	}
	public void showCircleInfo() {
		System.out.printf("좌표[%d, %d]", xPos, yPos);
		System.out.println("반지름 :"+ radian);
	}
}

public class E11ObjectSerializable {

	public static void main(String[] args) {
		
		try {
			ObjectOutputStream out =
					new ObjectOutputStream(
							new FileOutputStream(
									"src/ex20io/circle.obj"));
			
			out.writeObject(new Circle(1, 1, 2.4));
			out.writeObject(new Circle(2, 2, 4.8));
			out.writeObject(new String("String타입의 오브젝트"));
			out.close();
			
			//// 여기까지 실행하면 obj 파일이 생성됨 ////
			
			
		}
	}
}
