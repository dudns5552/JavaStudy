package ex98game;

import java.util.Random;
import java.util.Scanner;

public class E01PixelDungeon {
	
	private static final int DUNGEON_SIZE = 5;
    private static final char PLAYER = '@';
    private static final char EMPTY = '.';
    private static final char ENEMY = 'E';
    
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
                dungeon[i][j] = EMPTY;
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

