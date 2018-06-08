import java.awt.Point;

public class Node {
	Point point;
	ArrayList<Node> children;
	Node parent;
	
	public Node(Point x) {
		this.point = x;
		children = new ArrayList<Node>();
	}
	public Node(Point x, ArrayList<Node> children) {
		this.point = x;
		this.children = children;
	}
	public Node(Point x, ArrayList<Node> children, Node parent) {
		this.point = x;
		this.children = children;
		this.parent = parent;
	}
	
	public ArrayList<Node> getChildren(){
		return children;
	}
	public void setChildren(ArrayList<Node> children) {
		this.children = children;
	}
	public boolean equals(Object x) {
		Node check = (Node)x;
		return(check.point.equals(this.point;
	}
}
