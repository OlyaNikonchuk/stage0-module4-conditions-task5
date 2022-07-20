package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {

        int res = 0;
        if (( year % 400 == 0)&& (( year % 4 == 0 ) &&( year % 100 != 0))) {
            res = 0;
        } else if (( year % 400 == 0)|| (( year % 4 == 0 ) &&( year % 100 != 0))) {
            res = 1;
        }

            switch (res) {
                case 1:
                    System.out.println("leap");
                    break;
                case 0:
                    System.out.println("not leap");
                    break;
                default:
                    System.out.println("wrong input");
                    break;
            }
        }
    }
