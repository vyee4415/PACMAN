import java.util.ArrayList;
import java.util.Queue;

public class mainmethod {
	public ArrayList<Node> moveTowards(Point x){
		Node goal = new Node(x);
		Queue<Node> queue = new LinkedList<>();
		ArrayList<Node> explored = new ArrayList<Node>();
		ArrayList<Node> path = new ArrayList<Node>();
		
		queue.add(new Node(this.myPosition, getChildren(this.myPosition)));
		while(!queue.isEmpty()) {
			Node current  queue.remove();
			if(current.equals(goal)) {
				while(current.getParent() != null) {
					path.add(0,current);
					current = current.getParent();
				}
				return path;
			}
			else {
				explored.add(currentl)for(Nodez:current.getChildren()) {
					if(!explored.contains(z) && !queue.contains(z)) {
						z.setParent(current);
						z.setChildren(getChildren(z.getPoint()));
						queue.add(z);
					}
				}
			}
		}
	}
	
	public MoveType moveTo(Node x) {
		int myX = myPosition.x;
		int myY = myPostion.y;
		int nodeX = x.getPoint().x;
		int nodeY = x.getPoint().y;
		
		if(nodeY == myY-1) return MoveType.UP;
		if(nodeY == myY+1) return MoveType.DOWN;
		if(nodeX == myX-1) return MoveType.LEFT;
		if(nodeX == myX+1) return MoveType.RIGHT;
		
	}
}
