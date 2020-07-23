package logger;

import java.util.Scanner;

import java.util.logging.LogManager;

import java.util.logging.Logger;

public class ConstructionCost
 {

	static

	{

		Logger logger=Logger.getLogger(ConstructionCost.class.getName());

		Scanner sc=new Scanner(System.in);

		int s,a;

		String message;

		logger.info("Enter Material Standard\n1.standard\n2.above standard\n3.high standard\n4.high standard and fully automated home");

		s=sc.nextInt();

		if(s==1||s==2||s==3||s==4)

		{

			logger.info("Enter sq.ft");

			a=sc.nextInt();

			Construct ob1=new Construct(s,a);

			message=ob1.calculate();

			logger.info(message);

		}

		else

		{

			logger.info("invalid selection");

			java.lang.System.exit(0);

		}

	}

	public static void main(String[] args)
                 {

		// TODO Auto-generated method stub



	}


}