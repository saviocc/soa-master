package br.com.accenture.npc;

import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EnumTest {
	Day day;
	
	public EnumTest(Day day) {
		this.day = day;
	}
	
	public void tellItLikeItIs() {
		switch (day) {
			case MONDAY:
				System.out.println("Mondays are bad.");
				break;
			case FRIDAY:
				System.out.println("Fridays are better.");
				break;		
			case SATURDAY: case SUNDAY:
				System.out.println("Weekends are best.");
				break;	
			default:
				System.out.println("Midweek day are so-so.");
				break;				
		}
	}
	
	public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year); 
        cal.set(Calendar.MONTH, month-1); 
        cal.set(Calendar.DAY_OF_MONTH, 23);
        System.out.println(cal.getTime());
        int dayCal = cal.get(Calendar.DAY_OF_WEEK);
        String dia = "";
        switch(dayCal){
           case 1:
                dia="SUNDAY";
                break;
           case 2:
                dia="MONDAY";
                break;
           case 3:
                dia="TUESDAY";
                break;
            case 4:
                dia="WEDNESDAY";
                break;
            case 5:
                dia="THURSDAY";
                break;
            case 6:
                dia="FRIDAY";
                break;
            case 7:
                dia="SATURDAY";
            break;
        }
        return dia;

    }

	public static void main(String[] args) {
		
        Scanner scan = new Scanner( System.in );
        int y = 0;
        int w = 1;
        try {
            int x = scan.nextInt();
            y = scan.nextInt();
            int z = x / y;
        }
        catch( InputMismatchException e ) {
            System.out.println( "java.util.InputMismatchException" );
            w = 0;
        }
        catch( NullPointerException e ) {
            System.out.println( e.toString() );
            w = 0;
        }        catch( ArithmeticException e ) {
            System.out.println( e.toString() );
            w = 0;
        }
        
        if( w == 1 ) System.out.println(y);

	}

}
