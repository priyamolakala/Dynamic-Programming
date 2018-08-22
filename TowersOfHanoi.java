package DynamicProgramming;

public class TowersOfHanoi {
	
	public static void main(String[] args) {
		int n = 3;
		Tower[] tower = new Tower[n];
		for(int i = 0; i < n; i++) {
			tower[i] = new Tower(i);
		}
		
		for(int i = n-1; i >=0; i--) {
			tower[0].add(i);
		}
		
		tower[0].moveDisksto(n, tower[2], tower[1]);
		
	}

	
	
}