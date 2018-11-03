/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3;

import java.util.Arrays;
import java.util.Iterator;


/**
 *
 * @author brandonedwards
 */
public class Knight implements Application {
    
    public static int POSSIBLE = 0;
    public static final int DEAD = -1;
    
    protected int[][] grid;

    
    protected Position start;
    protected BackTrack back;

    public Knight(int x,int y,int sx,int sy) {
        
        grid = new int[x][y];
        start = new Position(sx, sy);
        back = new BackTrack(this);
        
        
    }
    
    
    
    @Override
    public boolean isOK(Position pos) {
        
        return pos.getRow() >= 0 && pos.getRow() < grid.length 
                && pos.getColumn() >= 0 && pos.getColumn() < grid.length;
        
    }

    @Override
    public void markAsPossible(Position pos) {
        
    grid[pos.getRow()][pos.getColumn()] = POSSIBLE;
    }

    @Override
    public boolean isGoal(Position pos) {
        
        return pos.getRow() == grid.length * grid.length && pos.getColumn() == grid[0].length;
    }

    @Override
    public void markAsDeadEnd(Position pos) {
        //board[pos.getRow()][pos.getColumn()] = DEAD;
        
    }

    @Override
    public Iterator<Position> iterator(Position pos) {
        
        return new KnightIterator(pos);
    }
    
    public int[][] getGrid() {
        return grid;
    }

    public Position getStart() {
        return start;
    }

    @Override
    public String toString() {
        
        return Arrays.toString(this.getGrid());

    }
    
    

    private static class KnightIterator implements Iterator<Position> {

        protected static final int MAX_MOVES = 8;
        
        protected int row, column, count;
        
        public KnightIterator(Position pos) {
            
            row = pos.getRow();
            column = pos.getColumn();
            count = 0;
            
        }

        @Override
        public boolean hasNext() {
            return count < MAX_MOVES;
        }

        @Override
        public Position next() {
            
            Position nextPosition = new Position();
            
            switch(count++){
                case 0: nextPosition = new Position(row-1, column-2);//down 1 left 2
                        break;
                case 1: nextPosition = new Position(row-1, column+2);//down 1 right 2
                        break;
                case 2: nextPosition = new Position(row-2, column-1);//down 2 left 1
                        break;
                case 3: nextPosition = new Position(row-2, column+1);//down 2 right 1
                        break;
                case 4: nextPosition = new Position(row+1, column-2);//up 1 left 2
                        break;
                case 5: nextPosition = new Position(row+1, column+2);//up 1 right 2
                        break;
                case 6: nextPosition = new Position(row+2, column-1);//up 2 left 1
                        break;
                case 7: nextPosition = new Position(row+2, column+1);//up 2 right 1
                        break;
            }
            return nextPosition;
        }
    }
    
    
   
}
