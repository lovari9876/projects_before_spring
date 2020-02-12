package scheduler;

import java.text.SimpleDateFormat;
import java.util.*;
import java.sql.Date;
import java.text.ParseException;

public class SchedulerViewer {
	public static void main(String[] args) throws Exception {
		ConnectionMaker m = new MySqlConnectionMaker();
		SchedulerController c = new SchedulerController(m);
		Scanner scan = new Scanner(System.in);
		showMenu(c, scan);
		scan.close();
	}

	private static void showMenu(SchedulerController schedulerController, Scanner scan) throws ParseException {
		while (true) {
			System.out.println("===============================");
			System.out.println("\t Scheduler \t");
			System.out.println("===============================");
			System.out.println("1. 전체 보기  2. 날짜별 보기  3. 입력하기  4. 종료하기");
			System.out.println("> ");
			int choice = scan.nextInt();
			if (choice == 4) {
				System.out.println("오늘도 해내자~~!");
				break;
			} else if (choice == 1) {
				showList(schedulerController, scan);
			} else if (choice == 2) {
				do {
					System.out.println("보고싶은 날짜를 yyyyMMdd 으로 입력하세요....");
					System.out.print("> ");
					scan.nextLine();
					String date = scan.nextLine();

					showDay(schedulerController, scan, date);

				} while (true);

			} else if (choice == 3) {
				insert(schedulerController, scan);
			}
		}

	}

	private static void showList(SchedulerController schedulerController, Scanner scan) {
		ArrayList<SchedulerVO> list = schedulerController.selectAll();
		Collections.reverse(list);
		System.out.println("===============================");
		System.out.println("ID\tWHEN\tTo Do1\tTo Do2\tTo Do3\tActually Done\tDID?\tWrittenDate");
		System.out.println("===============================");
		if (list.size() == 0) {
			System.out.println("해야 할 일을 입력해 보세요! ");
			return;
		} else {
			for (SchedulerVO s : list) {
				System.out.println(s);
			}
			System.out.println("0을 눌러서 메인메뉴로 돌아갑시다");
			System.out.print("> ");
			int id = scan.nextInt();
		}
	}

	private static void showDay(SchedulerController schedulerController, Scanner scan, String date)
			throws ParseException {
		System.out.println(date);
		ArrayList<SchedulerVO> list = schedulerController.selectDay(date);
		System.out.println("===============================");
		System.out.println("날짜: " + date);
		System.out.println("===============================");
		System.out.println("id\t시간\t 할일1\t할일2\t할일3\tactdone\tDID");
		System.out.println("===============================");
		for (SchedulerVO s : list) {
			System.out.println(s);
			System.out.println("1. 수정  2. 삭제  3. 목록으로");
			System.out.println("> ");
			int choice = scan.nextInt();
			/*
			 * if (choice == 3) { showList(boardController, scan); } else if (choice == 1) {
			 * update(boardController, scan, id); } else if (choice == 2) {
			 * delete(boardController, id); showList(boardController, scan); }
			 */
		}

	}

	private static void insert(SchedulerController schedulerController, Scanner scan) {

	}

	// 검사해서 데이터형이면 문자형을 데이터로 바꾸는 것!!
	// + 잘못 입력시 다시입력 무한 루프 고고
	private static String stringTodate(Scanner scan) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		do {
			System.out.println("시간을 yyyy-MM-dd HH:mm:ss 으로 입력해주세요 ");
			System.out.println("> ");
			String str = scan.nextLine();
			try {
				Date dayAndTime = new Date(sdf.parse(str).getTime());
				sdf = new SimpleDateFormat("yyyy년 M월 d일 / H시 m분 s초");
				// String dt = sdf.format(dayAndTime);

				ArrayList<Calendar> seperatedDate = new ArrayList<>();
				Calendar cal = Calendar.getInstance();
				seperatedDate.add(cal);
				cal.setTime(dayAndTime);
				cal.get(Calendar.YEAR);
				cal.get(Calendar.MONTH);
				cal.get(Calendar.DAY_OF_MONTH);

				cal.get(Calendar.HOUR);
				cal.get(Calendar.MINUTE);
				cal.get(Calendar.SECOND);

				cal.setTime(dayAndTime);
				int year = cal.get(Calendar.YEAR);
				int month = cal.get(Calendar.MONTH);
				int day = cal.get(Calendar.DAY_OF_MONTH);
				String ymd = Integer.toString(year - month - day);
				sdf = new SimpleDateFormat("yyyy-MM-dd");
				Date onlyYMD = new Date(sdf.parse(ymd).getTime());

			} catch (ParseException e) {
				System.out.println("잘못 입력하셨습니다. ");
				continue;
			}

		} while (true);

	}
}
