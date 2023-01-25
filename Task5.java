package homeTasks;

public class Task5 {
	private int k;
	private String currentDay;
	private String[] weekDays = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

	Task5(String currentDay, int k) {
		this.setCurrentDay(currentDay);
		this.k = k;
	}

	public String getCurrentDay() {
		return currentDay;
	}

	public void setCurrentDay(String currentDay) {
		this.currentDay = currentDay;
	}

	public String afterKDays() throws Exception {
		int curDayIndex = -1, afterKDaysIndex;
		for (int i = 0; i < 7; i++) {
			if (weekDays[i].equals(currentDay)) {
				curDayIndex = i;
				break;
			}
		}
		if (curDayIndex == -1) {
			throw new Exception("please enter valid day name");
		}
		k = k % 7;
		afterKDaysIndex = (k + curDayIndex) % 7;
		return weekDays[afterKDaysIndex];
	}
}
