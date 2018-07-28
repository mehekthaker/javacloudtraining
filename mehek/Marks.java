//Take the marks of three students for three subjects and then claculate and display the total 
//and average of each student and total and average of each subject

import java.util.*;
class Marks
{
	public static void main(String args[])
	{
		int marks[][]=new int[3][3];
		Scanner sc = new Scanner(System.in);

		int st_total=0, sub_total=0, stud_avg=0, sub_avg=0;

		System.out.println("Enter the marks of first student for the subject A");
		marks[0][0]=sc.nextInt();
		
		System.out.println("Enter the marks of first student for the subject B");
		marks[0][1]=sc.nextInt();
		
		System.out.println("Enter the marks of first student for the subject C");
		marks[0][2]=sc.nextInt();
		
		System.out.println("Enter the marks of second student for the subject A");
		marks[1][0]=sc.nextInt();
		
		System.out.println("Enter the marks of second student for the subject B");
		marks[1][1]=sc.nextInt();
		
		System.out.println("Enter the marks of second student for the subject C");
		marks[1][2]=sc.nextInt();
		
		System.out.println("Enter the marks of third student for the subject A");
		marks[2][0]=sc.nextInt();
		
		System.out.println("Enter the marks of third student for the subject B");
		marks[2][1]=sc.nextInt();
		
		System.out.println("Enter the marks of third student for the subject C");
		marks[2][2]=sc.nextInt();		//Values are entered in the array
		
		for(int stud=0; stud<3; stud++){
			for(int sub_mks=0; sub_mks<3; sub_mks++){
				st_total+=marks[stud][sub_mks];
				stud_avg=st_total/3;
			}
		}	//Calculates the average and total of each student

		for(int sub_mks=0; sub_mks<3; sub_mks++){
			for(int stud=0; stud<3; stud++){
				sub_total+=marks[sub_mks][stud];
				sub_avg=sub_total/3;
			}
		}//Calculates and stores the average of each subject

		System.out.println("The total marks scored by student in all subjects "+st_total);
		System.out.println("The average marks scored by student in all subjects "+stud_avg);
		System.out.println("The total marks scored by students in each subject "+sub_total);
		System.out.println("The average marks scored by students in each subject "+sub_avg);
		
		//displays the output
		
	}
}