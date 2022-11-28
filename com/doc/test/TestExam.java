package com.doc.test;


import java.util.Scanner;

import com.doc.beans.Exam;
import com.doc.services.*;

public class TestExam {

	public static void main(String[] args) {

		Scanner ins = new Scanner(System.in);
		int again = 1;
		while (again != 0) {
			System.out.println("Choose the exam you want:\n1.Java \n2.HTML");
			int choice = ins.nextInt();
			if (choice == 1) {
				Exam javaExam = new Exam(1, "Half-Yearly", "Java", ExamService.populateJava());
				int[] sans = ExamService.conductExam(ExamService.populateJava());
				int java_result = ExamService.validateOption(sans,choice);
				ExamService.showGreeting(java_result);
			}
			else if(choice==2){
				Exam javaExam = new Exam(2,"Half-Yearly","HTML",ExamService.populateHTML());
				int[] s_ans = ExamService.conductExam(ExamService.populateHTML());
				int html_result=ExamService.validateOption(s_ans,choice);
				ExamService.showGreeting(html_result);
			}
			else
				System.out.println("Invalid Input! stupid.");

			System.out.println("Do you want to attempt the exam again? 1/0: ");

			again=ins.nextInt();

		}
	}

}
