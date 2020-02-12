package day1016;
//Builder pattern
public class Message {
	
	private String title;
	private String message;
	private Integer alertId;
	private Integer badgeCount;
	
	private Message() {
		
	}
	
	//inner class Builder set sth automatically~
	public static class Builder {
		private String title;
		private String message;
		private Integer alertId;
		private Integer badgeCount;
			
		
		public Builder setTitle(String title) {
			this.title = title;
			return this;
		}
		
		public Builder setMessage(String message) {
			this.message = message;
			return this;
		}
		
		public Builder setAlertId(Integer alertId) {
			this.alertId = alertId;
			return this;
		}
		
		public Builder setBadgeCount(Integer badgeCount) {
			this.badgeCount = badgeCount;
			return this;
		}

		public Builder setNotification(Integer id) {
			this.alertId = id;
			
			switch (id) {
				case 100:
					this.message = "				
				case 200:
					this.message = "
				case 300:
					this.message = "
				case 400:
					this.message = "
				default:
					this.message = "no nightclass today"
					break;					
						
			}
		}

		//빌드 메소드를 쓰면 빌더를 불러올수있어
		public Message build() {
			Message message = new Message();
			message.title = this.title;
			message.message = this.message;
			message.alertId = this.alertId;
			message.badgeCount = this.badgeCount;
			return message;
			
		}
	}
	
	
}
