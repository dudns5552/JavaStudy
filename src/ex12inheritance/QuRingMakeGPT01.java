package ex12inheritance;

class Point {
    int xDot, yDot;

    public Point(int x, int y) {
        xDot = x;
        yDot = y;
    }

    public void showPointInfo() {
        System.out.println("[x좌표:" + xDot + ", y좌표:" + yDot + "]");
    }
}

// Circle 클래스: 원을 표현 (중심점 + 반지름)
class Circle {
    int radian;  // 반지름
    Point center; // 중심점 (Point 객체)

    public Circle(int x, int y, int r) {
        center = new Point(x, y);
        radian = r;
    }

    public void showCircleInfo() {
        System.out.println("반지름: " + radian);
        center.showPointInfo();
    }
}

// Ring 클래스: 두 개의 원을 사용하여 링을 표현
class Ring {
    Circle innerCircle; // 안쪽 원
    Circle outerCircle; // 바깥쪽 원

    public Ring(int x1, int y1, int r1, int x2, int y2, int r2) {
        innerCircle = new Circle(x1, y1, r1);
        outerCircle = new Circle(x2, y2, r2);
    }

    public void showRingInfo() {
        System.out.println("안쪽 원의 정보:");
        innerCircle.showCircleInfo();
        System.out.println("바깥쪽 원의 정보:");
        outerCircle.showCircleInfo();
    }
}

// 실행 클래스
public class QuRingMakeGPT {
    public static void main(String[] args) {
        Ring c = new Ring(1, 1, 3, 2, 2, 9);
        c.showRingInfo();
    }
}