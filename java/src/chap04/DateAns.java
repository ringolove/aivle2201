package chap04;

public class DateAns {
	int year, month, day;
	int total = (year-1)*365+(year-1)/4-(year-1)/100+(year-1)/400;
	
	boolean isLeapYear() {
		return this.isLeapYear(year);
	}
	
	boolean isLeapYear(int year) {
		boolean result = false;
		if ((this.year%4 == 0) && (this.year%100!=0) || (this.year%400==0)) {
			result = true;
		}
		return result;
	}
	
	int getMonthLastDay(int month) {
		int lday[] = {-1, 31,28,31,30,31,30,31,31,30,31,30,31};
		
		if(this.isLeapYear()) {
			lday[2] = 29;
		}
		
		return lday[month];
	}
	
	String getWeekday() {
		int total_days = 0;
		String[] weekdays = {"일", "월", "화", "수", "목", "금", "토"};
		
		for(int i=1;i<this.year;i++) {
			if(this.isLeapYear(i)){
				total_days += 366;
			} else {
				total_days += 365;
			}
		}
		
		for(int i=1; i<this.month; i++) {
			total_days += this.getMonthLastDay(i);
		}

		total_days += this.day;
		
		return weekdays[total_days%7];
	}	
}
