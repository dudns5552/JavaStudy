package ex20io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

public class E03FilterDataStream {

	public static void main(String[] args) {

		String src = "src/ex20io/E03FilterDataStream.bin";
		
		try {
			OutputStream out = new E03FilterDataStream(src);
			DataOutputStream filterOut = new DataOutputStream(out);
			
			filterOut.writeInt(123);
			filterOut.writeDouble(12.34);
			filterOut.writeInt(456);
			filterOut.writeDouble(56.78);
			
			/////// 여기까지 실행하면 bin파일 생성됨 //////////
			
			DataInputStream filterIn =
					new DataInputStream(new FileInputStream(src));
			
			int num1 = filterIn.readInt();
			double dNum1 = filterIn.readDouble();
			int num2 = filterIn.readInt();
			double dNum2 = filterIn.readDouble();
			
			System.out.println("num1 = "+ num1);
			System.out.println("dNum1 = "+ dNum1);
			System.out.println("num2 = "+ num2);
			System.out.println("dNum2 = "+ dNum2);
			
			if(filterOut != null) filterOut.close();
			if(filterIn != null) filterIn.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("해당파일 없음");
		}
		catch (IOException e) {
			System.out.println("IO오류 발생");
		}
	}
}
