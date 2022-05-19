package tarefaMath;

import java.util.Scanner;

public class principal {
	public static void main(String[] args) {
		String opt = displayOpt();
		switch(opt)
		{
			case "1":
				getFator();
				break;
			case "2":
				getExecSixteen();
				break;
			case "3":
				getExecFourteen();
				break;
		}
	}
	
	public static String displayOpt()
	{
		System.out.println("=================================================================");
		System.out.println("-   Digite 1 para fatorial");
		System.out.println("-   Digite 2 para exercício slide 16");
		System.out.println("-   Digite 3 para exemplo slide 14");
		System.out.println("=================================================================");
		Scanner entrada = new Scanner(System.in);
		return entrada.next();
	}

	public static int doFatorial(int nu) 
	{
		int fatorial = 1;
		for(int i = nu; i > 1; i--)
		{
			fatorial *= i;
		}
		return fatorial;
	}

	public static void getFator ()
	{
		Scanner entrada = new Scanner(System.in);
		System.out.print("\nDigite um número: ");
		int nu = entrada.nextInt(), fatorial = 1;
		String estrutura = "", string = "";
		for(int i = nu; i > 1; i--)
		{
			if(i > 2)
			{
				estrutura = estrutura + i+" * ";
			}else
			{
				estrutura = estrutura + i+" * 1";
			}
		}
		fatorial = doFatorial(nu);

		entrada.close();

		System.out.println(nu + "! = " + estrutura + " = " + fatorial);
	}

	public static void getExecSixteen()
	{
		System.out.println("\n3 disciplinas de banco de dados");
		System.out.println("4 disciplinas de programção");
		System.out.println("2 disciplinas de Eng. de Software");
		
		System.out.println("\na) m = C3,1 * C4,1 * C2,1");
		int m = 3 * 4 * 2;
		System.out.println(m);
		System.out.println("\nb) n = C9,1");
		int n = 9;
		System.out.println(n);
	}
	
	
	public static void getExecFourteen()
	{
		System.out.println("\na) p = C5,2");
		int first = doFatorial(5);
		int second = doFatorial(3);
		int third = doFatorial(2);
		int m = first / (second * third);
		System.out.println(m);
	}
}
