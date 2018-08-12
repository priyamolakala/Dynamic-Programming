package DynamicProgramming;

public class CoinChange {
	
	public int makeChange(int n) {
		int[] denoms = {25,10,5,1};
		int[][] map = new int[n+1][denoms.length];
		return coinchange(n,denoms,map,0);
	}
	public int coinchange(int amount, int[] denoms, int[][] map,int index) {
		if(map[amount][index]>0) {
			return map[amount][index];
		}
		if(index>=denoms.length-1) {
			return 1;
		}
		int ways = 0;
		int denamount = denoms[index];
		for(int i = 0; i*denamount <= amount; i++ ) {
			int amountremaining = amount - i *denamount;
			ways+=coinchange(amountremaining,denoms,map,index+1);
		}
		map[amount][index] = ways;
		return ways;
		
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
