package DynamicProgramming;
import java.util.Stack;

public class Tower {
	
	private Stack<Integer> disks;
	private int index;
	public Tower(int i) {
		this.index = i;
		this.disks = new Stack<Integer>();
	}
	
	public void add(int d) {
		if(!disks.isEmpty() ||d>disks.peek() ) {
		System.out.println("Cannot add Disk");
		}
		disks.push(d);
	}
	
	public void moveTop(Tower t) {
		int top = disks.pop();
		t.add(top);
	}

	public void moveDisksto(int n, Tower destination, Tower buffer){
		buffer.moveDisksto(n-1,buffer,destination);
		moveTop(destination);
		buffer.moveDisksto(n, destination,this);
	}
}
