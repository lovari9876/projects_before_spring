package board03;

//데이터베이스 통신을 이용한 게시판 예제 03
//이제 클래스를 분리하여 만들거야~~!

//테이블의 데이터를 담거나 
//사용자의 데이터를 담을 Value Object(값 담긴 객체)
//VO => Value Object
//Data Transfer Object(DTO) 라고도 부른다!

//캡슐화: 필드에 private 접근 제한자 달아주어서
//getter, setter로 필요할 때만 빼오고 넣어주는것

import java.sql.Date;

public class BoardVO {
	private int id;
	private String title;
	private String content;
	private Date writtenDate;
	private Date updatedDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Date getWrittenDate() {
		return writtenDate;
	}

	public void setWrittenDate(Date writtenDate) {
		this.writtenDate = writtenDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	
	//toString 메소드 오버라이딩 한것!!!
	//Overrides: toString() in Object
	//오버라이딩을 안해도 Object 클래스는 당연히 상속받는 거니까
	//그 안의 toString() 메소드를 자동으로 쓸수있다.
	public String toString() {
		return id + "\t" + title + "\t" + writtenDate;
	}
}
