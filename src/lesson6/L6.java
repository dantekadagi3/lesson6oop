package lesson6;

import java.util.Scanner;

public class L6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

		int i,k; 
		String results[]=new String[4];
		int marks[][]=new  int[4][3];
		int[] studentNumbers = new int[4];
        String[] studentNames = new String[4];
        String[] grade=new String[4];
        double[] averages = new double[4];
        int totals[]=new int[4];

        
		for(k=0;k<4;k++) {
			 System.out.println("Enter the Student Roll Number: ");
	            studentNumbers[k] = scanner.nextInt(); 
	            System.out.println("Enter the Student Name: ");
	            studentNames[k] = scanner.next();
	            System.out.println("Enter th Three Marks: ");
	            totals[k]=0;
	            for(i=0;i<3;i++) {
	            	marks[k][i]=scanner.nextInt();
	            totals[k]+=marks[k][i];
	            if(marks [k][i]>=50) {
	            results[k]="P";
	            	
	            }
	            else {
	            	results[k]="F";
	            }
	            
	            }
	            double average=totals[k]/3;
	            averages[k]=average;
		if(average>=70&& average<=100) {
		     grade[k]="A";
		}
		else if(average>=50&&average<=69) {
			grade[k]="B";
		}
			else if(average<50) {
				grade[k]="C";
			}
	        System.out.println("The total is:"+totals[k]);    
		}
		System.out.println("***************************************************************************************");
		System.out.println("\t\t\tSTUDENT MARKLIST");
		System.out.println("***************************************************************************************");
		System.out.println("ROLL  NAME  \tMARK1  \tMARK2  \tMARK3  TOTAL  RESULT \t Average   GRADE");
		for(k=0;k<4;k++) {
			System.out.print(studentNumbers[k] +"\t" +studentNames[k] +"\t" );
			for(i=0;i<3;i++) {
				System.out.print(marks[k][i]+"\t" );
				
			}
			System.out.print(totals[k] +"\t" +results[k] +"\t"   +averages[k] +"\t\t"   +grade[k]+"\n");
			
		}
		
		

	}

}
