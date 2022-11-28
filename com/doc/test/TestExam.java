package com.doc.test;


import java.util.Scanner;

import com.doc.beans.Exam;
import com.doc.services.*;

public class TestExam {

	public static void main(String[] args) {
		
		Scanner ins = new Scanner(System.in);
		
				
		System.out.println("Choose the exam you want:\n1.Java \n2.HTML");
		int choice = ins.nextInt();
		
		if(choice==1) {
			Exam javaExam = new Exam(1,"Half-Yearly","Java",ExamService.populateJava());
			int[] sans = ExamService.conductJavaExam(ExamService.populateJava());
			int result = ExamService.validateOption(sans);
			ExamService.showGreeting(result);							
		}

	}

}
