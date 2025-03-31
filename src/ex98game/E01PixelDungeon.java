package ex98game;

import java.util.Random;
import java.util.Scanner;

/*
던전의 구성요소
벽, 길, 방을 일단 구현해보자

벽의 성격
1. 플레이어가 지나가지 못한다.
2. 길과 방을 구분한다.

길의 성격
1. 방에서 나와서 다른방으로 이동하는 통로의 역할
2. 길은 다른방으로 가는동안 꺾이거나 할순 있어도 경로가 막히진 않는다.

방의 성격
1. 방크기는 일단 정사각형으로 구성
2. 방은 길과 벽으로 둘러싸여 있다.
3. 방과 방 사이는 붙어있으면 안된다.

공격의 구현

프로그램의 구현순서를 어떻게 할것인가?
1. 맵을 전부 벽으로 막는다.
2. 방을 설치한다.
3. 방과 방사이를 잇는 다리를 만든다.


 */


public class E01PixelDungeon {
	
	private static final int DUNGEON_SIZE = 20;  //던전크기
    private static final char PLAYER = '@'; 
    private static final char EMPTY = ' ';
    private static final char ENEMY = 'E';
    private static final char WALL = 'O';
    private static final char EXIT = 'E';
    
    
    private char[][] dungeon;
    private int playerX, playerY;
    private Random random;
    
    
    public E01PixelDungeon() {
        dungeon = new char[DUNGEON_SIZE][DUNGEON_SIZE];
        random = new Random();
        initializeDungeon();
    }
    
    private void initializeDungeon() {
        for (int i = 0; i < DUNGEON_SIZE; i++) {
            for (int j = 0; j < DUNGEON_SIZE; j++) {
                dungeon[i][j] = WALL;
                
                for(int m = random.nextInt(18)+1,
                		n = random.nextInt(18)+1, k = 1 ; 
                		k <= 4 ; k++ ) {
                	
                	dungeon[m-1][n-1] = EMPTY;
                	dungeon[m-1][n] = EMPTY;
                	dungeon[m-1][n+1] = EMPTY;
                	dungeon[m][n-1] = EMPTY;
                	dungeon[m][n] = EMPTY;
                	dungeon[m][n+1] = EMPTY;
                	dungeon[m+1][n-1] = EMPTY;
                	dungeon[m+1][n] = EMPTY;
                	dungeon[m+1][n+1] = EMPTY;
                	
                	
                	
                }//따로 빼서 룸이라는 메소드 만들수 있을듯?
                
                
                
            }
        }
        
        playerX = random.nextInt(DUNGEON_SIZE);
        playerY = random.nextInt(DUNGEON_SIZE);
        dungeon[playerX][playerY] = PLAYER;
        
        int enemyX, enemyY;
        do {
            enemyX = random.nextInt(DUNGEON_SIZE);
            enemyY = random.nextInt(DUNGEON_SIZE);
        } while (enemyX == playerX && enemyY == playerY);
        
        dungeon[enemyX][enemyY] = ENEMY;
    }
    
    public void printDungeon() {
        for (int i = 0; i < DUNGEON_SIZE; i++) {
            for (int j = 0; j < DUNGEON_SIZE; j++) {
                System.out.print(dungeon[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public void movePlayer(char direction) {
        int newX = playerX;
        int newY = playerY;
        
        switch (direction) {
            case 'w': newX--; break;
            case 's': newX++; break;
            case 'a': newY--; break;
            case 'd': newY++; break;
            default: return;
        }
        
        if (newX >= 0 && newX < DUNGEON_SIZE && newY >= 0 && newY < DUNGEON_SIZE) {
            dungeon[playerX][playerY] = EMPTY;
            playerX = newX;
            playerY = newY;
            dungeon[playerX][playerY] = PLAYER;
        }
    }
    
    public static void main(String[] args) {
        E01PixelDungeon game = new E01PixelDungeon();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            game.printDungeon();
            System.out.println("Move (WASD): ");
            char move = scanner.next().charAt(0);
            game.movePlayer(move);
        }
    }
}

