package DynamicProgramming;

public class PaintFill {
	enum colors{
		red,black,white,blue,pink,green,yellow;
	}
	public boolean fillColor(colors screen[][], int r, int c, colors ncolor) {
		if(screen[r][c] == ncolor) {
			return false;
		}
		return paintit(screen,r,c,screen[r][c],ncolor);
	}
	public boolean paintit(colors[][] screen,int r, int c, colors oncolor, colors ncolor) {
		if(r<0 || r>screen.length || c<0 || c>screen[0].length) {
			return false;
		}
		
		if(screen[r][c]==oncolor) {
			screen[r][c]=ncolor;
			paintit(screen,r+1,c,oncolor,ncolor);
			paintit(screen,r-1,c,oncolor,ncolor);
			paintit(screen,r,c+1,oncolor,ncolor);
			paintit(screen,r,c-1,oncolor,ncolor);
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
