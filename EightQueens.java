package DynamicProgramming;
import java.util.*;

public class EightQueens {
	int GRID_SIZE = 8;
	public void placeQueen(int row,  Integer[] columns, ArrayList<Integer[]> results) {
		if(row == GRID_SIZE) {
			results.add(columns.clone());
		}else {
			for(int col = 0; col < GRID_SIZE; col++) {
				if(checkit(columns,row,col)) {
					columns[row]=col;
					placeQueen(row+1,columns,results);
				}
			}
		}
	}
	
	public boolean checkit(Integer[] columns, int row1, int col1) {
		for(int row2=0; row2 < row1; row2++) {
			int col2 = columns[row2];
			
			if(col1 == col2) {
				return false;
			}
			
			int coldistance = Math.abs(col1 - col2);
			int rowdistance = row1-row2;
			if(rowdistance == coldistance) {
				return false;
			}
			
		}
		return true;
	}

}
