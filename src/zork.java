import java.util.ArrayList;
import java.util.Scanner;
public class zork {
	
	public static String sentenceSplitter(String sentence) {
		String[] sentences = sentence.split(" ");
		return sentences[1];
	}
	
	public static String sentence(String sentence) {
		String[] sentences = sentence.split(" ");
		return sentences[0];
	}
	
	public static String openFunction(String command) {
		if(sentenceSplitter(command).equals("wardrobe")){
			return "You opened the wardrobe.";
		}
		if(sentenceSplitter(command).equals("door")){
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("You need a password to open the door. Enter a password:");
			
			int password=scanner.nextInt();
			
			if(password==101) {
				System.out.println("The door is opened. Now you can 'move west'.");
			}else {
				System.out.println("Password is wrong");
			}
		}
		if(sentenceSplitter(command).equals("kitbag")){
			return "You opened the kitbag and you see an axe into kitbag.";
		}
		if(sentenceSplitter(command).equals("window")){
			return "You opened the window and a red button and a text thrown into room. In the text, you must use this button but you must take cover it is very dangerous is written.";
		}
		else {
			return "You cannot open it.";	
		}
		
	}
	
	public static String anotherOpenFunction(String command) {
		if(command.equals("wardrobe")) {
			return "You opened the wardrobe.";
		}
		if(command.equals("door")) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("You need a password to open the door. Enter a password:");
			
			int password=scanner.nextInt();
			
			if(password==101) {
				System.out.println("The door is opened. Now you can 'move west'.");
			}else {
				System.out.println("Password is wrong");
			}
		}
		if(command.equals("window")){
			return "You opened the window and a red button and a text thrown into room. In the text, you must use this button but you must take cover it is very dangerous is written.";
		}
		if(command.equals("kitbag")){
			return "You opened the kitbag and you see an axe into kitbag.";
		}
		else {
			return "You cannot open it.";
		}
		
	}
	
	public static String closeFunction(String command) {
		if(sentenceSplitter(command).equals("wardrobe")){
			return "You closed the wardrobe.";
		}
		if(sentenceSplitter(command).equals("door")){
			return "You closed the door.";
		}
		else {
			return "You cannot close it.";	
		}
	}
	
	public static String anotherCloseFunction(String command) {
		if(command.equals("wardrobe")) {
			return "You closed the wardrobe.";
		}
		if(command.equals("door")) {
			return "You closed the door.";
		}
		else {
			return "You cannot close it.";
		}
	}
	
	public static String examineFunction(String command) {
		if(sentenceSplitter(command).equals("bed")) {
			return "There is nothing special about bed.";
		}
		if(sentenceSplitter(command).equals("jeans")) {
			return "There is a key.";
		}
		if(sentenceSplitter(command).equals("wardrobe")) {
			return  "There is nothing special about wardrobe.";
		}
		if(sentenceSplitter(command).equals("paint")) {
			return "You thought that the paint is watching you. You can hear a whisper that examine me! You examined the paint and you saw that there is a secret lock.";
		}
		if(sentenceSplitter(command).equals("text")) {
			return "You are in a building like a russian nested dool. If you want to escape, you must be careful!";
		}
		if(sentenceSplitter(command).equals("kitbag")) {
			return "You must open it.";
		}
		if(sentenceSplitter(command).equals("door")) {
			return "The door is locked. You need a password to open the door.";
		}
		if(sentenceSplitter(command).equals("piano")) {
			return "The piano is ready to play.";
		}
		if(sentenceSplitter(command).equals("picture")) {
			return "This is Mozart's picture, you thought that his eye watching you.";
		}
		if(sentenceSplitter(command).equals("book")) {
			return "In this book, there is Turkish March and there is a note 'if you want to escape you must play Turkish March' written.";
		}
		else {
			return "There is not such a thing.";
		}
		
	}
	
	public static String anotherExamineFunction(String command) {
		if(command.equals("bed")) {
			return "There is nothing special about bed.";
		}
		if(command.equals("jeans")) {
			return "There is a key.";
		}
		if(command.equals("wardrobe")) {
			return  "There is nothing special about wardrobe.";
		}
		if(command.equals("paint")) {
			return "You thought that the paint is watching you. You can hear a whisper that examine me! You examined the paint and you saw that there is a secret lock.";
		}
		if(command.equals("text")) {
			return "You are in a building like a russian nested dool. If you want to escape, you must be careful!";
		}
		if(command.equals("kitbag")) {
			return "You must open it.";
		}
		if(command.equals("door")) {
			return "The door is locked. You need a password to open the door.";
		}
		if(command.equals("piano")) {
			return "The piano is ready to play.";
		}
		if(command.equals("picture")) {
			return "This is Mozart's picture, you thought that his eye watching you.";
		}
		if(command.equals("book")) {
			return "In this book, there is Turkish March and there is a note 'if you want to escape you must play Turkish March' written.";
		}
		else {
			return "There is not such a thing.";
		}
		
	}
	
	public static String takeFunction(String command) {
		if(sentenceSplitter(command).equals("key")) {
			return "The key is taken.";
		}
		if(sentenceSplitter(command).equals("axe")) {
			return "The axe is taken.";
		}
		if(sentenceSplitter(command).equals("text")) {
			return "The text is taken.";
		}
		else {
			return "You cannnot take it.";
		}
	}
	
	public static String anotherTakeFunction(String command) {
		if(command.equals("key")) {
			return "The key is taken.";
		}
		if(command.equals("axe")) {
			return "The axe is taken.";
		}
		if(command.equals("text")) {
			return "The text is taken.";
		}
		else {
			return "You cannnot take it.";
		}
	}
	
	public static String useFunction(String command) {
		if(sentenceSplitter(command).equals("key")) {
			return "You used key to unlock secret lock. You saw a note and int this note that is written 'COMP_***'.";
		}
		if(sentenceSplitter(command).equals("axe")) {
			return "You used axe to destroy the barrier. Now you can 'move north'.";
		}
		if(sentenceSplitter(command).equals("phone")) {
			return "You used phone to call your best friend. You told your situation and he recommended that you must have fresh air.";
		}
		if(sentenceSplitter(command).equals("button")) {
			return "You used button after you took cover a big noise came from up.You look up and you see a small holl is opened.";
		}
		if(sentenceSplitter(command).equals("ladder")) {
			return "You used ladder to climb and now you can 'move up'.";
		}
		if(sentenceSplitter(command).equals("piano")) {
			return "You played Turkish March and the exit is unlocked. You are free to go. You escaped from building. Congrulations !!!";
			
		}
		else {
			return "You cannot use it.";
		}
	}
	
	public static String anotherUseFunction(String command) {
		if(command.equals("key")) {
			return "You used key to unlock secret lock. You saw a note and int this note that is written 'COMP_***'.";
		}
		if(command.equals("axe")) {
			return "You used axe to destroy the barrier. Now you can 'move north'.";
		}
		if(command.equals("phone")) {
			return "You used phone to call your best friend. You told your situation and he recommended that you must have fresh air.";
		}
		if(command.equals("button")) {
			return "You used button after you took cover a big noise came from up.You look up and you see a small holl is opened.";
		}
		if(command.equals("ladder")) {
			return "You used ladder to climb and now you can 'move up'.";
		}
		if(command.equals("piano")) {
			return "You played Turkish March and the exit is unlocked. You are free to go. You escaped from building. Congrulations !!!";
			
		}
		else {
			return "You cannot use it.";
		}
	}
	
	
	
	public static String moveFunction(String command) {
		if(sentenceSplitter(command).equals("west")) {
			return "You moved west and now you are in second room. You see that there is a kitbag and a barrier so, you cannot move other room because of this barrier. You must somehow destroy it.";
		}
		if(sentenceSplitter(command).equals("north")) {
			return "You moved north and now you are in third room. You see that there is a phone on the table and a window on the wall and a ladder. You cannot see any door.";
		}
		if(sentenceSplitter(command).equals("up")) {
			return "You moved up and now you are in last room. You see that there are a Mozart picture on wall, a piano, a music book and an exit. There is no lock on the exit you must find a way to escape!";
		}
		if(sentenceSplitter(command).equals("east")) {
			return "You are in the first room. There are a bed, a jeans, a wardrobe and a paint. ";
		}
		if(sentenceSplitter(command).equals("south")) {
			return "You moved south and now you are in second room. You see that there is a kitbag.";
		}
		if(sentenceSplitter(command).equals("down")) {
			return "You moved down and now you are in third room. You see that there is a phone on the table and a window on the wall and a ladder.";
		}
		else {
			return "You cannot move this direction";
		}
	}
	
	public static String anotherMoveFunction(String command) {
		if(command.equals("west")) {
			return "You moved west and now you are in second room. You see that there are a kitbag and a barrier so, you cannot move other room because of this barrier. You must somehow destroy it.";
		}
		if(command.equals("north")) {
			return "You moved north and now you are in third room. You see that there are a phone on the table, a window on the wall and a ladder. You cannot see any door.";
		}
		if(command.equals("up")) {
			return "You moved up and now you are in last room. You see that there are a Mozart picture on wall, a piano, a music book and an exit. There is no lock on the exit you must find a way to escape!";
		}
		if(command.equals("east")) {
			return "You are in the first room. There are a bed, a jeans, a wardrobe and a paint. ";
		}
		if(command.equals("south")) {
			return "You moved south and now you are in second room. You see that there is a kitbag.";
		}
		if(command.equals("down")) {
			return "You moved down and now you are in third room. You see that there is a phone on the table and a window on the wall and a ladder.";
		}
		else {
			return "You cannot move this direction";
		}	
	}
	

	public static void main(String[] args) {
		

		System.out.println("You are in the first room. There are a bed, a jeans, a wardrobe, a paint, a text and a door. ");
		
		ArrayList list = new ArrayList();
		
		list.add("key");
		list.add("axe");
		list.add("text");
		
		ArrayList<String> myList = new ArrayList();
		
		Scanner scanner = new Scanner(System.in);
		
		boolean gameEnd = false;
		
		String command;
		
		while (!gameEnd) {
			
			command=scanner.nextLine();
			
			while(!(command.contains("open") || command.contains("close") || command.contains("examine") || command.contains("take") || command.contains("use") || command.contains("move") || command.contains("inventory"))) {
				
				System.out.println("I do not understand you.");
				command=scanner.nextLine();
				}
			
			if(command.contains("open") || command.contains("close") || command.contains("examine") || command.contains("take") || command.contains("use") || command.contains("move") || command.contains("inventory"))  {
				
				if(command.equals("use piano")) {
					gameEnd=true;
				}
				
				if(command.contains("open") || command.equals("open")) {
					if(command.equals("open")) {
						System.out.println("What do you want to open?");
						command=scanner.nextLine();
						System.out.println(anotherOpenFunction(command));
						
					}else {
						System.out.println(openFunction(command));
					}
				}
				
				
				if(command.contains("close") || command.equals("close")) {
					if(command.equals("close")) {
						System.out.println("What do you want to close?");
						command=scanner.nextLine();
						System.out.println(anotherCloseFunction(command));
						
					}else {
						System.out.println(closeFunction(command));
					}
				}
				
				
				if(command.contains("examine") || command.equals("examine")) {
					if(command.equals("examine")) {
						System.out.println("What do you want to examine?");
						command=scanner.nextLine();
						System.out.println(anotherExamineFunction(command));
						
					}else {
						System.out.println(examineFunction(command));
					}
				}
				
				
				if(command.contains("take") || command.equals("take")) {
					if(command.equals("take")) {
						System.out.println("What do you want to take");
						command=scanner.nextLine();
						if(list.contains(command)) {
							list.remove(command);
							myList.add(command);
						}
						System.out.println(anotherTakeFunction(command));
					}
					else {
						if(list.contains(sentenceSplitter(command))) {
							list.remove(sentenceSplitter(command));
							myList.add(sentenceSplitter(command));
						}
						System.out.println(takeFunction(command));
						
						
					}
					
				}
				
				
				if(command.contains("use") || command.equals("use")) {
					if(command.equals("use")) {
						System.out.println("What do you want to use?");
						command=scanner.nextLine();
						System.out.println(anotherUseFunction(command));
						if(myList.contains(command)) {
							myList.remove(command);
						}
					}else {
						System.out.println(useFunction(command));
						if(myList.contains(sentenceSplitter(command))) {
							myList.remove(sentenceSplitter(command));
						}
					}
				}
				
				
				if(command.contains("move") || command.equals("move")) {
					if(command.equals("move")) {
						System.out.println("Where do you want to move?");
						command=scanner.nextLine();
						System.out.println(anotherMoveFunction(command));
						
					}else {
						System.out.println(moveFunction(command));
					}
				}
				
				
				if(command.equals("inventory")) {
					System.out.println(myList.toString());
				}

				
				}
				
			}
			
		}
}