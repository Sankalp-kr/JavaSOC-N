package com.doc.services;

import com.doc.beans.Exam;
import com.doc.beans.Exam.Question;
import java.util.Scanner;

public class ExamService  {
		
	public static Question[] populateJava() {
		
		Exam ex=new Exam();//creation of the object of Exam		
		Exam.Question eq1=ex.new Question(1,"why you study java?","Aur koi choice nahi hai","Naukri ka chakkar babu bhaiya","Fee bhar di hai","refund date has passed",2);
		Exam.Question eq2=ex.new Question(2,"why you study java?","Aur koi choice nahi hai","Naukri ka chakkar babu bhaiya","Fee bhar di hai","refund date has passed",2);
		Exam.Question eq3=ex.new Question(3,"why you study java?","Aur koi choice nahi hai","Naukri ka chakkar babu bhaiya","Fee bhar di hai","refund date has passed",2);
		Exam.Question eq4=ex.new Question(4,"why you study java?","Aur koi choice nahi hai","Naukri ka chakkar babu bhaiya","Fee bhar di hai","refund date has passed",2);
		Exam.Question eq5=ex.new Question(5,"why you study java?","Aur koi choice nahi hai","Naukri ka chakkar babu bhaiya","Fee bhar di hai","refund date has passed",2);
		
		Exam.Question[] javaQuestions= {eq1,eq2,eq3,eq4,eq5};
		
		return javaQuestions;
	}
	
	public static int[] conductJavaExam(Question[] arr) {
		
		Scanner ins = new Scanner(System.in);
		
		int[] storedans = new int[5];
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			System.out.print("ans: ");
			storedans[i] = ins.nextInt();
		}
		
		return storedans;
	}
	
	public static int validateOption(int[] arr) {
		int result=0;
		Question[] r_arr = populateJava();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==r_arr[i].getCorrect_op())
				result++;
		}
		return result;
	}
	
	public static void showGreeting(int marks) {
		System.out.println("you got: "+marks);
		if(marks>3) {
			System.out.println("\nCongratulations");
		}else {
			System.out.println("try harder! that what she said...;)");
		}
	}
	
	
	
}
