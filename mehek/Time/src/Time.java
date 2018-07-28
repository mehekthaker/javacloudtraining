
public class Time {

	private int hours;
	private int minutes;

	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public Time sum(Time time1, Time time2) {
		Time totalTime = new Time();
		totalTime.hours = time1.getHours() + time2.getHours();
		totalTime.minutes = time1.getMinutes() + time2.getMinutes();
		if (totalTime.minutes % 60 == 0) 
		{
			totalTime.hours += (int) totalTime.minutes / 60;
			totalTime.minutes = 0;
		} 
		else 
		{
			totalTime.hours += (int) totalTime.minutes / 60;
			totalTime.minutes = totalTime.minutes % 60;
		}
		return totalTime;
	}

}
