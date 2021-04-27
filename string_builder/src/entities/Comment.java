package entities;

public class Comment {
	private String text;
	
	public Comment() {	
	}
	
	public Comment(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void addText(String text) {
		this.text = text;
	}
	
	

}
