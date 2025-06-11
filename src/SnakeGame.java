import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;
public class SnakeGame extends JPanel{
    int boardWidth;
    int boardHeight;
    int tileSize = 25;
    Tile snakeHead;

    public SnakeGame(int BOARDWIDTH, int BOARDHEIGHT){
        this.boardWidth = BOARDWIDTH;
        this.boardHeight = BOARDHEIGHT;
        setPreferredSize(new Dimension(boardWidth, boardHeight));
        setBackground(Color.BLACK);

        snakeHead = new Tile(5,5);
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);
    }
    public void draw(Graphics g){
        //Grid
        for(int i = 0; i< boardWidth/tileSize; i++){
            g.drawLine(i*tileSize,0,i*tileSize,boardHeight);
            g.drawLine(0, i*tileSize, boardWidth, i*tileSize);
        }


        //Snake
        g.setColor(Color.green);
        g.fillRect(snakeHead.x * tileSize, snakeHead.y * tileSize, tileSize, tileSize);
    }


    private class Tile {
        int x;
        int y;

        Tile(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
