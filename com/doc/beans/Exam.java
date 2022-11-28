package com.doc.beans;

import java.util.Arrays;

public class Exam {
	
	//member variables of Exam
	private int eid;
	private String ename;
	private String topic;
	private  Question[] qarr= new Question[5];
			
	//default constructor
	public Exam() {
		this.eid = 0;
		this.ename = null;
		this.topic = null;
		this.qarr = null;
	}
	
	//parameterized constructor
	public Exam(int eid, String ename, String topic, Question[] qarr) {
		this.eid = eid;
		this.ename = ename;
		this.topic = topic;
		this.qarr = qarr;
	}
	
	// Exam-getters
	public int getEid() {return eid;}
	public String getEname() {return ename;}
	public String getTopic() {return topic;}
	public Question[] getQarr() {return qarr;}

	// Exam-setters
	public void setEid(int eid) {this.eid = eid;}
	public void setEname(String ename) {this.ename = ename;}
	public void setTopic(String topic) {this.topic = topic;}
	public void setQarr(Question[] qarr) {this.qarr = qarr;}

	
	
	
	
	
	//Question nested class
	public class Question{
		
		//question member variable
		private int qno;
		private String question;
		private String op1;
		private String op2;
		private String op3;
		private String op4;
		private int correct_op;
		private static int marks;
		
		static {
			marks=1;
		}
		
		
		//Parameterized Constructor
		public Question(int qno, String question, String op1, String op2, String op3, String op4, int correct_op) {
			this.qno = qno;
			this.question = question;
			this.op1 = op1;
			this.op2 = op2;
			this.op3 = op3;
			this.op4 = op4;
			this.correct_op = correct_op;
		}

		//question getters
		public int getQno() {return qno;}
		public String getQuestion() {return question;}
		public String getOp1() {return op1;}
		public String getOp2() {return op2;}
		public String getOp3() {return op3;}
		public String getOp4() {return op4;}
		public int getCorrect_op() {return correct_op;}
		
		//question-setters
		public void setQno(int qno) {this.qno = qno;}
		public void setQuestion(String question) {this.question = question;}
		public void setOp1(String op1) {this.op1 = op1;}
		public void setOp2(String op2) {this.op2 = op2;}
		public void setOp3(String op3) {this.op3 = op3;}
		public void setOp4(String op4) {this.op4 = op4;}
		public void setCorrect_op(int aop) {this.correct_op = aop;}
		
		//question toString
		public String toString() {
			return "Q."+qno+". ---> "+question+"\n1. "+op1+"\n2. "+op2+"\n3. "+op3+"\n4. "+op4;
			}
		
	}
	
	
	
	
	
	
	

	//Exam toString
	public String toString() {
		return "Exam [eid=" + eid + ", ename=" + ename + ", topic=" + topic + ", qarr=" + Arrays.toString(qarr) + "]";
	}
	
	
}
