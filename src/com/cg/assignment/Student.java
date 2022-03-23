package com.cg.assignment;

public class Student {

		private String studId;
		private String studName;
		private String studDept;
		private String studMailId;
		private int studMarks;
		
		
		public Student(String studId, String studName, String studDept, String studMailId, int studMarks) {
			this.studId = studId;
			this.studName = studName;
			this.studDept = studDept;
			this.studMailId = studMailId;
			this.studMarks = studMarks;
		}
		
		public boolean isEqual(Object obj) {
			if(this == obj) {
				return true;
			}
			if(obj instanceof Student) {
				Student stud = (Student) obj;
				return ( (stud.studId.equals(this.studId)) && (stud.studName.equals(this.studName)) && (stud.studDept.equals(this.studDept)) && (stud.studMailId.equals(this.studMailId)) && (stud.studMarks==this.studMarks) );
			}
			return false;
		}
		
		@Override
		public int hashCode() {
			int hash = 0;
			hash = 213*this.studMarks;
			return hash ;
		}
		
		public static void main(String[] args) {
			Student student01 = new Student("145","A A","Bio","AA@gmail.com",82);
			Student student02 = new Student("257","B B","ME","BB@gmail.com",65);
			Student student03 = new Student("373","C C","EE","CC@gmail.com",55);
			Student student04 = new Student("145","A A","Bio","AAgmail.com",82);
			
			System.out.println(student01.isEqual(student04));
			System.out.println(student02.isEqual(student02));
			System.out.println(student03.isEqual(student01));
		}
	}


