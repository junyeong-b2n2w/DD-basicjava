package i_collection.board;

import java.util.Date;
import java.util.HashMap;

public class BoardArticle {

	static int num=1;
	HashMap<String, Object> boardArticle = new HashMap<>();
	
	public BoardArticle(String title, String text) {
		
		this.boardArticle.put("num",this.num++);
		this.boardArticle.put("title",title);
		this.boardArticle.put("author","me");
		this.boardArticle.put("date",new Date());
		this.boardArticle.put("text",text);	
		
	
	}
	
	
	
	
	
}
