import java.util.Scanner;
public class Averagemarks {


	public static void main(String[] args) {
        Scanner S= new Scanner(System.in);
		String str= S.next();
        char ch= str.charAt(0);
        
        
        int m1,m2,m3;
        m1= S.nextInt();
        m2= S.nextInt();
        m3= S.nextInt();
        int c= (m1+ m2+ m3)/3;
        System.out.println(ch);
        System.out.println(c);
		

		
	}

}
