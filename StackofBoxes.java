package DynamicProgramming;
import java.util.*;

public class StackofBoxes {
	
	

	public int Stackit(ArrayList<Box> boxes) {
		int[] stackMap = new int[boxes.size()];
		Collections.sort(boxes, new BoxComparator());
		return createStack(boxes,null,0,stackMap);
	}
	
	public int createStack(ArrayList<Box> boxes,Box bottom,int offset,int[] stackMap) {
		if(offset>=boxes.size()) {
			return 0;
		}
		Box newBottom = boxes.get(offset);
		int heightwithbottom = 0;
		if(bottom == null || canBeAbove(newBottom,bottom)) {
			if(stackMap[offset] == 0) {
				stackMap[offset] = createStack(boxes,newBottom,offset+1,stackMap);
				stackMap[offset]+=newBottom.height;
			}
		}
		heightwithbottom = stackMap[offset];
		int heightwithoutbottom = createStack(boxes,bottom,offset+1,stackMap);
		return Math.max(heightwithbottom, heightwithoutbottom);
	}
	
	public boolean canBeAbove(Box newBottom,Box bottom) {
		if(bottom.height < newBottom.height) {
			return false;
		}
		return true;
	}

}
