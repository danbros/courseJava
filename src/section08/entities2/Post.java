package section08.entities2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

	private Date moment;
	private String title;
	private String content;
	private int likes;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private List<Comment> comments = new ArrayList<>();

	public Post() {
	}

	public Post(Date moment, String title, String content, int likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}
		
	//Get/Set
	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public List<Comment> getComment() {
		return comments;
	}
	//Methods
	public void addComment(Comment comment) {
		comments.add(comment);
	}
	
	public void removeComment(Comment comment) {
		comments.remove(comment);
	}
	//toString
	public String toString() {							//==toString concatenated==
		StringBuilder sb = new StringBuilder();			//return title
		sb.append(title + "\n");								//+ "\n"
		sb.append(likes + " Likes - ");							//+ likes
		sb.append(sdf.format(moment) + "\n");					//+ " - "
		sb.append(content + "\n");								//+ moment
		sb.append("Comments:\n");								//+ "\n"
		for(Comment c : comments) {								//+ content
			sb.append(c.getText() + "\n");								//+ content
		}														//+ "Comments:\n";
		return sb.toString();
	}
}
