package scheduler;

import java.sql.Date;

public class SchedulerVO {
	private int id;
	private Date when;
	private String todo1;
	private String todo2;
	private String todo3;
	private String actDone;
	private String did;
	private Date writtenDate;
	private Date updatedDate;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	
	public Date getWhen() {
		return when;
	}

	public void setWhen(Date when) {
		this.when = when;
	}

	public String getTodo1() {
		return todo1;
	}
	
	public void setTodo1(String todo1) {
		this.todo1 = todo1;
	}
	
	public String getTodo2() {
		return todo2;
	}
	
	public void setTodo2(String todo2) {
		this.todo2 = todo2;
	}
	
	public String getTodo3() {
		return todo3;
	}
	
	public void setTodo3(String todo3) {
		this.todo3 = todo3;
	}
	
	public String getActDone() {
		return actDone;
	}
	
	public void setActDone(String actDone) {
		this.actDone = actDone;
	}
	
	public String getDid() {
		return did;
	}
	
	public void setDid(String did) {
		this.did = did;
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
	
	public String toString() {
		return id + "\t" + when + "\t" + todo1 + "\t" + todo2 + "\t" + todo3 + 
				"\t" + actDone + "\t" + did +"\t"+ writtenDate;
	}
	
	public String toString2() {
		return id + "\t" + when +"\t"+ writtenDate;
	}	
}
