package DynamicProgramming;
import java.awt.Point;
import java.util.ArrayList;

public class RobotInaGrid {
	ArrayList<Point> getPath(boolean[][] maze) {
		ArrayList<Point> path = new ArrayList<Point>();
		if(getPath(maze, maze.length, maze[0].length, path)) {
			return path;
		}
		return null;
	}

	
	public boolean getPath(boolean[][] maze,int row,int col,ArrayList<Point> path) {
		if( row<0 || col<0 || !maze[row][col]) {
			return false;
		}
		boolean isAtOrigin = row==0 && col==0;
		
		if(isAtOrigin || getPath(maze, row - 1, col, path) || getPath(maze, row, col - 1, path)) {
			Point p = new Point(row, col);
			path.add(p);
			return true;
		}
		return false;
	}

}
