package prova;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class intefaccia {
	public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
	public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
	public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
	public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
	public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
	public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
	
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";
	
	public static void main(String[] args) throws InterruptedException {
		int s = 0;
		int cont=0;
		String colore;
		for (int i = 1; i < 60; i++) {
			s+=1;
	
			if(cont==0) {
			colore = new String (ANSI_RED);
			cont++;
			}
			
			else if (cont==1){
				colore=  new String (ANSI_WHITE);
				cont ++;
			}
			else {
				colore= new String (ANSI_PURPLE);
			cont=0;
			}
	
			
		System.out.println(colore+"sono la somma numero["+i+"]:"+s);
		TimeUnit.SECONDS.sleep(1);
   
		}
		
		
	}
}