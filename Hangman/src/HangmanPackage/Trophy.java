package HangmanPackage;

public class Trophy {
	
	static char[][] trophy = new char[][]{
			{' ',' ',' ',' ',' ','_','_','_','_','_','_','_','_','_','_','_',' ',' ',' ',' '},
			{' ',' ',' ',' ','(','_','_','_','_','_','_','_','_','_','_','_',')',' ',' ',' '},
			{' ',' ',' ',' ','|','|',' ',' ',' ',' ',' ',' ',' ',' ',' ','|','|',' ',' ',' '} ,
			{' ','/','/','=','|','|',' ','{','{',' ','1',' ','}','}',' ','|','|','=','\\','\\'} ,
			{'|','|',' ',' ','|','|',' ',' ',' ',' ',' ',' ',' ',' ',' ','|','|',' ',' ','|','|'} ,
			{' ','\\','\\','=','|','|',' ',' ',' ',' ','O',' ',' ',' ',' ','|','|','=','/','/'}, 	
			{' ',' ',' ',' ','|','|',' ',' ',' ','\\','|','/',' ',' ',' ','|','|',' ',' ',' '}, 
			{' ',' ',' ',' ','\\','\\',' ',' ',' ','/',' ','\\',' ',' ',' ','/','/',' ',' ',' '},
			{' ',' ',' ',' ',' ','\\','\\','_','_','_','_','_','_','_','/','/',' ',' ',' ',' '},
			{' ',' ',' ',' ',' ',' ',' ','_',')',' ',' ',' ','(','_',' ',' ',' ',' ',' ',' '},
			{' ',' ',' ',' ',' ',' ','/','_','_','_','_','_','_','_','\\',' ',' ',' ',' ',' '},
	};

	public static void draw() {
		for(int x=0 ; x<trophy.length ; x++) {
			for(int y=0; y<trophy[x].length ; y++) {
				System.out.print(trophy[x][y]);
			}
			System.out.println(" ");
		}
	}
}