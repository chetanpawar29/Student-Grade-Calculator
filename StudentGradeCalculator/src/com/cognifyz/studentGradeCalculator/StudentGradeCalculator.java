package com.cognifyz.studentGradeCalculator;

import java.util.Scanner;

public class StudentGradeCalculator {
	//method for calculate avg of grade
	public static double calAvgOfGrade(int grade[])
	{
		double sum=0;
		double avg;
		for(int i=0; i<grade.length; i++)
		{
			sum = sum + grade[i];
		}
		
		avg = sum / grade.length;
		
		return avg;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n ----->>> Welcome to Student Grade Calculator <<<----- \n");
		System.out.print("\tEnter the number of grades: ");
		int n = sc.nextInt();
		
		int grade[] = new int[n];
		
		System.out.println();
		
		for(int i=0; i<n; i++)
		{
			System.out.print("\tEnter Grade "+(i+1)+" : ");
			grade[i]= sc.nextInt();
		}
		
		System.out.println("\n\tAverage of the Grade is : "+calAvgOfGrade(grade));

	}

}
