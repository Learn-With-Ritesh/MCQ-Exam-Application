package org.examReposatory;
import java.util.*;
import org.questionModule.*;
public class ExamReposatory {
	ArrayList al=new ArrayList();
	Scanner sc=new Scanner(System.in);
	public void addQuestion(Question que)
	{
		boolean b=true;
		for(Object o:al)
		{
			Question q=(Question)o;
			if(que.getId()==q.getId())
			{
				b=false;
			}
		}
		if(b)
		{
			al.add(que);
			System.out.println("\n===================Question Added Successfully================");
		}
		else
			System.out.println("\n================Duplicated Id Question Not Added==============");
	}
	public void viewAllQue()
	{
		for(Object o:al)
		{
			Question que=(Question)o;
			System.out.println("\n=================================Question==================================");
			System.out.println(que.getId()+") "+que.getQue()+"\nA = "+que.getOp1()+"\tB = "+que.getOp2()+"\tC = "+que.getOp3()+"\tD = "+que.getOp4()+"\nAnswer : "+que.getAns());
			System.out.println("\n===========================================================================");
		}
	}
	public void removeQue(int id)
	{
		int index=-1;
		Question que=(Question)al.get(0);
		for(Object o:al)
		{
			que=(Question)o;
			if(que.getId()==id)
			{
				index=al.indexOf(o);
				break;
			}
		}
		if(index!=-1)
		{
			System.out.println("Question is = "+que.getQue()+"\nDo You want to delete Press 'Yes': ");
			String str=sc.next();
			if(str.equalsIgnoreCase("yes"))
			{
				al.remove(index);				
				System.out.println("\n-------------------------Question deleted-------------------------");
			}
			else
				System.out.println("\n-------------------------Question not deleted-------------------------");
		}
		else
		{
			System.out.println("\n====================Id Not Found Question Not Deleted====================");
		}
	}
	public void searchQue(String que)
	{
		Question q=(Question)al.get(0);
		boolean b=false;
		for(Object o:al)
		{
			q=(Question)o;
			if((q.getQue()).equalsIgnoreCase(que))
			{
				b=true;
				break;
			}
		}
		if(b)
		{
			System.out.println("\n----------------Question Found----------------");
			System.out.println(q.getId()+") "+q.getQue()+"\nA = "+q.getOp1()+"\tB = "+q.getOp2()+"\tC = "+q.getOp3()+"\tD = "+q.getOp4()+"\nAnswer : "+q.getAns());
		}
		else
		{
			System.out.println("\n----------------Question Not Found----------------");
		}
	}
	public void attempExam(String name)
	{
		int count=0;
		for(Object o:al)
		{
			Question que=(Question)o;
			System.out.println(que.getId()+") "+que.getQue()+"\nA = "+que.getOp1()+"\tB = "+que.getOp2()+"\tC = "+que.getOp3()+"\tD = "+que.getOp4()+"\nEnter Answer : ");
			String ans=sc.nextLine();
			if((que.getAns()).equalsIgnoreCase(ans))
			{
				count++;
			}
		}
		System.out.println("\n"+name+"\nYour Score is : "+count);
	}
}
