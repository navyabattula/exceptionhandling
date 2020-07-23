import java.util.Scanner;

import java.util.logging.LogManager;

import java.util.logging.Logger;

public class Construct

{

	int snd,are;

	Construct(int std,int area)

	{

		snd=std;

		are=area;

	}

	String calculate()

	{

		if(snd==1)

			return("Cost: "+are*12000);

		else if(snd==2)

			return("Cost: "+are*15000);

		else if(snd==3)

			return("Cost:"+are*18000);

		else if(snd==4)

			return("Cost:"+are*25000);

		else

			return("invalid");

	}

}