package Moon;

/**
 *
 * @author MOON
 */
public class TimeSheet {
    private Date timeIn;
    private Date timeOut;
    private float hourlyRate;
    private float weeklyHoursLimit;
    private float weeklyHoursWorked;

    public TimeSheet(float hourlyRate, float weeklyHoursLimit) {
        this.hourlyRate = hourlyRate;
        this.weeklyHoursLimit = weeklyHoursLimit;
        this.weeklyHoursWorked = 0;
    }

    public void logTimeIn() {
        this.timeIn = new Date();
    }

    public void logTimeOut() {
        this.timeOut = new Date();
        float hoursWorked = (this.timeOut.getTime() - this.timeIn.getTime()) / (1000.0f * 60 * 60);
        this.weeklyHoursWorked += hoursWorked;
    }

    public float getTotalWorkingHours() {
        if (this.timeIn != null && this.timeOut != null) {
            return (this.timeOut.getTime() - this.timeIn.getTime()) / (1000.0f * 60 * 60);
        }
        return 0;
    }

    public float getWeeklySalary() {
        float weeklySalary = 0;
        if (this.weeklyHoursWorked > this.weeklyHoursLimit) {
            weeklySalary = this.hourlyRate * (this.weeklyHoursLimit + (this.weeklyHoursWorked - this.weeklyHoursLimit) * 1.5f);
        } else {
            weeklySalary = this.hourlyRate * this.weeklyHoursWorked;
        }
        return weeklySalary;
    }
}
