package ex19thread;

class SumMulti2 {
	long num;

	public SumMulti2() {
		num = 0;
	}
	//동기화방법1 : 동기화 메서드
//	synchronized public void addNum(int n) {
//		num += n;
//	}
	public void addNum(int n) {
		synchronized (this) {
			num += n;
		}
	}
	public long getNum() {
		return num;
	}
}

class MultiAdderThread extends Thread {
	SumMulti sumInst;
	int start, end;
	public MultiAdderThread(SumMulti sum, int s, int e) {
		sumInst = sum;
		start = s;
		end = e;
	}
	public void run() {
		for(int i = start ; i <= end ; i++) {
			sumInst.addNum(i);
		}
	}
}

public class Ex05Sync2Error {

	public static void main(String[] args) {
		
		SumMulti s = new SumMulti();
		MultiAdderThread mat1 = new MultiAdderThread(s, 1, 5000);
		MultiAdderThread mat2 = new MultiAdderThread(s, 5001, 10000);
		mat1.start();
		mat2.start();
		try {
			mat1.join();
			mat2.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("1~10000까지의 합 : "+s.getNum());
		
	}
}
