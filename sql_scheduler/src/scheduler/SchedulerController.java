package scheduler;

import java.sql.*;
import java.util.*;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SchedulerController {
	Connection conn;

	public SchedulerController(ConnectionMaker m) throws Exception {
		conn = m.makeConnection();
	}

	public ArrayList<SchedulerVO> selectAll() {
		ArrayList<SchedulerVO> list = new ArrayList<>();
		String sql = "SELECT * FROM todo";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery(sql);
			while (rs.next()) {
				SchedulerVO schedulerVO = new SchedulerVO();
				schedulerVO.setId(rs.getInt("id"));
				schedulerVO.setWhen(rs.getDate("when"));
				schedulerVO.setTodo1(rs.getString("todo1"));
				schedulerVO.setTodo2(rs.getString("todo2"));
				schedulerVO.setTodo3(rs.getString("todo3"));
				schedulerVO.setActDone(rs.getString("actDone"));
				schedulerVO.setDid(rs.getString("did"));
				schedulerVO.setWrittenDate(rs.getDate("writtenDate"));
				schedulerVO.setUpdatedDate(rs.getDate("updatedDate"));
				list.add(schedulerVO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public ArrayList<SchedulerVO> selectDay(String date) throws ParseException {
		ArrayList<SchedulerVO> list = new ArrayList<>();
		String sql = "SELECT * FROM schedule.todo WHERE todo.when >= ?";
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			Date onlyYMD = new Date(sdf.parse(date).getTime());
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, date);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				SchedulerVO schedulerVO = new SchedulerVO();
				schedulerVO.setId(rs.getInt("id"));
				schedulerVO.setWhen(rs.getDate("when"));
				schedulerVO.setTodo1(rs.getString("todo1"));
				schedulerVO.setTodo2(rs.getString("todo2"));
				schedulerVO.setTodo3(rs.getString("todo3"));
				schedulerVO.setActDone(rs.getString("actDone"));
				schedulerVO.setDid(rs.getString("did"));
				schedulerVO.setWrittenDate(rs.getDate("writtenDate"));
				schedulerVO.setUpdatedDate(rs.getDate("updateDate"));
				list.add(schedulerVO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

//	public ArrayList<SchedulerVO> selectDay(String date) throws ParseException {
//		ArrayList<SchedulerVO> list = new ArrayList<>();
//		String sql = "SELECT * FROM todo WHERE DATE('?') <= todo.when";
//		try {
//			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//			Date dayAndTime = new Date(sdf.parse(date).getTime());
//			Calendar cal = Calendar.getInstance();
//			cal.setTime(dayAndTime);
//			int year = cal.get(Calendar.YEAR);
//			int month = cal.get(Calendar.MONTH);
//			int day = cal.get(Calendar.DAY_OF_MONTH);
//			String ymd = Integer.toString(year-month-day);
//			sdf = new SimpleDateFormat("yyyy-MM-dd");
//			Date onlyYMD = new Date(sdf.parse(ymd).getTime());
//			PreparedStatement pstmt = conn.prepareStatement(sql);
//			pstmt.setDate(1, onlyYMD);
//			ResultSet rs = pstmt.executeQuery(sql);
//			while (rs.next()) {
//				SchedulerVO schedulerVO = new SchedulerVO();
//				schedulerVO.setId(rs.getInt("id"));
//				schedulerVO.setWhen(rs.getDate("when"));
//				schedulerVO.setTodo1(rs.getString("todo1"));
//				schedulerVO.setTodo2(rs.getString("todo2"));
//				schedulerVO.setTodo3(rs.getString("todo3"));
//				schedulerVO.setActDone(rs.getString("actDone"));
//				schedulerVO.setDid(rs.getString("did"));
//				schedulerVO.setWrittenDate(rs.getDate("writtenDate"));
//				schedulerVO.setUpdatedDate(rs.getDate("updatedDate"));
//				list.add(schedulerVO);
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return list;
//	}

	public SchedulerVO selectOne(int id) {
		SchedulerVO schedulerVO = new SchedulerVO();
		String sql = "SELECT * FROM todo WHERE id = ?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				schedulerVO.setId(rs.getInt("id"));
				schedulerVO.setWhen(rs.getDate("when"));
				schedulerVO.setTodo1(rs.getString("todo1"));
				schedulerVO.setTodo2(rs.getString("todo2"));
				schedulerVO.setTodo3(rs.getString("todo3"));
				schedulerVO.setActDone(rs.getString("actDone"));
				schedulerVO.setDid(rs.getString("did"));
				schedulerVO.setWrittenDate(rs.getDate("writtenDate"));
				schedulerVO.setUpdatedDate(rs.getDate("updatedDate"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return schedulerVO;
	}

	public void insert(SchedulerVO schedulerVO) {
		String sql = "INSERT INTO todo(when, todo1, todo2, todo3, actDone, did, writtenDate, updatedDate)"
				+ " VALUES(?, ?, ?, ?, ?, ?, NOW(), NOW())";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setDate(1, schedulerVO.getWhen());
			pstmt.setString(2, schedulerVO.getTodo1());
			pstmt.setString(3, schedulerVO.getTodo2());
			pstmt.setString(4, schedulerVO.getTodo3());
			pstmt.setString(5, schedulerVO.getActDone());
			pstmt.setString(6, schedulerVO.getDid());
			// private fields 이기에 getter로 갖고온다!
			pstmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void update(SchedulerVO schedulerVO) {
		String sql = "UPDATE todo SET when = ?, todo1 = ?, todo2 = ?, todo3 = ?, "
				+ "actDone = ?, did = ?, updatedDate = NOW() WHERE id = ?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setDate(1, schedulerVO.getWhen());
			pstmt.setString(2, schedulerVO.getTodo1());
			pstmt.setString(3, schedulerVO.getTodo2());
			pstmt.setString(4, schedulerVO.getTodo3());
			pstmt.setString(5, schedulerVO.getActDone());
			pstmt.setString(6, schedulerVO.getDid());
			pstmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void delete(int id) {
		String sql = "DELETE FROM todo WHERE id = ?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
