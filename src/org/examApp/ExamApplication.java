package org.examApp;
import java.util.*;
import org.questionModule.*;
import org.examReposatory.*;

public class ExamApplication {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		ExamReposatory er=new ExamReposatory();
		do {
		System.out.println("\n1 : Add New Question \n2 : View All Question \n3 : Remove question using Id \n4 : Search Question \n5 : Attempt Exam \n0 : Exit \nEnter Choice\t: ");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			Question que=new Question();
			System.out.println("\nEnter id : ");
			que.setId(sc.nextInt());
			System.out.println("Enter Question: ");
			sc.nextLine();
			que.setQue(sc.nextLine());
			System.out.println("Enter option 1: ");
			que.setOp1(sc.nextLine());
			System.out.println("Enter option 2: ");
			que.setOp2(sc.nextLine());
			System.out.println("Enter option 3: ");
			que.setOp3(sc.nextLine());
			System.out.println("Enter option 4: ");
			que.setOp4(sc.nextLine());
			System.out.println("\nEnter Correct Answer: ");
			que.setAns(sc.nextLine());
			er.addQuestion(que);
			break;
		case 2:
			er.viewAllQue();
			break;
		case 3:
			System.out.println("\nEnter Id to delete Question  : ");
			er.removeQue(sc.nextInt());
			break;
		case 4:
			System.out.println("\nEnter Question to Search : ");
			sc.nextLine();
			er.searchQue(sc.nextLine());
			break;
		case 5:
			System.out.println("\nEnter Your name : ");
			sc.nextLine();
			er.attempExam(sc.nextLine());
			break;
		case 0:
			System.out.println("\n============================Thank you for Using App==============================");
			break;
		default:
			System.out.println("\n--------------------------------------Wrong Choice--------------------------------------");
		}
		}while(choice!=0);
	}
}
