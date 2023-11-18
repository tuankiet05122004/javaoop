package Encapsulation;
public class Date {

    private int day;
    private int moth;
    private int year;

    private boolean check(int day, int month, int year) {
        if (year < 9999 && year > 1990) {
            if (moth == 1 || moth == 3 || moth == 5 || moth == 7 || moth == 8 || moth == 10 || moth == 12) {
                if (day >= 1 && day <= 31) {
                    return true;
                } else {
                    return false;
                }
            } else if (moth == 2) {
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    if (day > 29) {
                        return false;
                    } else {
                        return true;
                    }
                } else {
                    if (day > 28) {
                        return false;
                    } else {
                        return true;
                    }
                }
            } else {
                if (day > 30) {
                    return false;
                } else {
                    return true;
                }
            }
        } else {
            return false;
        }
    }

    public Date(int day, int moth, int year) {
        if (check(day, moth, year) == true) {
            this.day = day;
            this.moth = moth;
            this.year = year;
        }else{
            System.out.println("input invalid");
        }
    }

    public int getDay() {
        return day;
    }

    public int getMoth() {
        return moth;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        if(check(day, getMoth(), getYear())){
            this.day = day;
        } else{
            System.out.println("input invalid");
        }
        
    }

    public void setMoth(int moth) {
        if(check(getDay(), moth, getYear())){
            this.moth = moth;
        } else{
            System.out.println("input invalid");
        }
    }

    public void setYear(int year) {
        if(check(getDay(), getMoth(), year)){
            this.year = year;
        } else{
            System.out.println("input invalid");
        }
    }
    public void setDate(int day, int moth, int year){
        if(check(getDay(), getMoth(), getYear())){
            this.day = day;
            this.moth = moth;
            this.year = year;
        }else{
            System.out.println("input invalid");
        }
    }
    @Override
    public String toString() {
        return String.format("%02d", day)+"/" + String.format("%02d", moth)+"/" + year;
    }
    
}
