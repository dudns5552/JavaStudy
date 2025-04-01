package ex97java;

import java.io.*;
import java.util.*;

// 도서 정보 인터페이스
interface BookInfo {
    void displayInfo();
}

// 도서 클래스 (부모 클래스) 추상클래스
abstract class Book implements BookInfo {
    protected String title; //제목
    protected String author; //작가
    protected double price; //가격
    private static int totalBooks = 0; // 정적 변수

    //생성자 제목, 작가, 가격을 멤버로 갖고있다
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        totalBooks++;
    }

    public static int getTotalBooks() { // 정적 메서드
        return totalBooks;
    }

    public abstract void displayInfo(); // 추상 메서드
}

// 일반 도서 클래스(상속)
class PhysicalBook extends Book {
    public PhysicalBook(String title, String author, double price) {
        super(title, author, price);
    }

    @Override
    public void displayInfo() { // 오버라이딩
        System.out.println("[일반 도서] " + title + " - " + author + " ($" + price + ")");
    }
}

// 전자책 클래스(상속)
class EBook extends Book {
    private double fileSize;

    public EBook(String title, String author, double price, double fileSize) {
        super(title, author, price);
        this.fileSize = fileSize;
    }

    @Override
    public void displayInfo() {
        System.out.println("[전자책] " + title + " - " + author + " ($" + price + ", " + fileSize + "MB)");
    }
}

// 도서관 클래스
class Library {
    private List<Book> books = new ArrayList<>(); // 제네릭과 컬렉션 활용

    public void addBook(Book book) {
        books.add(book); //책을 저장하는 배열
    }

    public void showBooks() {
        for (Book book : books) {
            book.displayInfo();
        }
    }

    public void saveToFile(String filename) throws IOException { // 예외 처리
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Book book : books) {
                writer.write(book.title + "," + book.author + "," + book.price + "\n");
            }
        }
    }
}

// 자동 저장 기능 (쓰레드 사용)
class AutoSave extends Thread {
    private Library library;

    public AutoSave(Library library) {
        this.library = library;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(5000);
                library.saveToFile("books.txt");
                System.out.println("자동 저장 완료!");
            } 
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

// 메인 클래스
public class GPTOrganizedJAVA {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new PhysicalBook("자바의 정석", "남궁성", 35000));
        library.addBook(new EBook("Effective Java", "Joshua Bloch", 40000, 2.5));

        AutoSave autoSave = new AutoSave(library);
        autoSave.setDaemon(true); // 데몬 쓰레드 설정
        autoSave.start();

        library.showBooks();
    }
}
