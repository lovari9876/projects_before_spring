package day1121.q6;

//도시 이름, 위도, 경도 정보를 가진 Location 클래스를 작성하고, 
//도시 이름을 '키'로 하는 HashMap<String, Location> 컬렉션을 만들고,
//사용자로부터 입력 받아 4개의 도시를 저장하라.
//그리고 도시 이름으로 검색하는 프로그램을 작성하라.
//
//============================================================================
//도시, 경도, 위도를 입력하세요.
//
//>> 서울, 37, 126
//>> LA, 34, -118
//>> 파리, 2, 48
//>> 시드니, 151, -33
//----------------------------------
//
//서울 37 126
//LA 34 -118
//파리 2 48
//시드니 151 -33
//----------------------------------
//
//도시 이름 >> 피리
//피리는 없습니다.
//도시 이름 >> 파리
//파리 2 48
//도시 이름 >> 그만

class Location {
	private String city;
	private int latitude; // 위도
	private int longitude; // 경도

	public Location(String city, int latitude, int longitude) {
		this.city = city;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public String getCity() {
		return city;
	}

	public int getLatitude() {
		return latitude;
	}

	public int getLongitude() {
		return longitude;
	}	
}
