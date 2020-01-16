//changing grades
import java.util.Scanner;
class Q76 
{
	public static void main(String[] args) 
	{
		int[] marks = {33, 37, 65, 79, 58, 69, 32, 58, 65, 25, 
				  44, 66, 56, 29};
		int passGrade = 35, firstGrade = 60, distictGrade = 70;
		int failCount = 0, passCount = 0, firstCount = 0, 
			distictCount = 0;
		for(int i = 0; i < marks.length; i ++)
		{
			if(marks[i] < passGrade)
			{
				failCount ++;
			}
			else if(marks[i] >= passGrade && 
					marks[i] < firstGrade)
			{
				passCount ++;
			}
			else if(marks[i] >= firstGrade && 
					marks[i] < distictGrade)
			{
				firstCount ++;
			}
			else if(marks[i] >= distictGrade)
			{
				distictCount ++;
			}
		}
		System.out.println("Fail count:" + failCount);
		System.out.println("Pass count:" + passCount);
		System.out.println("First class count:" + firstCount);
		System.out.println("Distinction count:" + distictCount);
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter bonus");
		int bonusPoints = sc.nextInt();
		passGrade -= bonusPoints;
		firstGrade -= bonusPoints;
		distictGrade -= bonusPoints;
		failCount = 0;
		passCount = 0;
		firstCount = 0;
		distictCount = 0;
		for(int i = 0; i < marks.length; i ++)
		{
			if(marks[i] < passGrade)
			{
				failCount ++;
			}
			else if(marks[i] >= passGrade && 
					marks[i] < firstGrade)
			{
				passCount ++;
			}
			else if(marks[i] >= firstGrade && 
					marks[i] < distictGrade)
			{
				firstCount ++;
			}
			else if(marks[i] >= distictGrade)
			{
				distictCount ++;
			}
		}
		System.out.println("Fail count:" + failCount);
		System.out.println("Pass count:" + passCount);
		System.out.println("First class count:" + firstCount);
		System.out.println("Distinction count:" + distictCount);
	}
}
