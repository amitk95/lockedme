package lockedMe;
import java.util.*;
import java.io.*;
import java.text.ParseException;


public class Lockedme {
	
	//Retrieving function
	public static int findAllFilesInFolder(File folder) {
		File[] fileList = folder.listFiles();

        Arrays.sort(fileList);
		for (File file : folder.listFiles()) {
			
			if (!file.isDirectory()) {
				 
				System.out.println(file.getName());
			} else {
				findAllFilesInFolder(file);
			}
		}
		return 0;
	}
	
	public static void Addingfiles(){
		try  
		{  
			System.out.println("Enter the file name for adding in root folder\n");
			Scanner sc=new Scanner(System.in);
			String add= "C:\\Users\\SILE SINGH\\Desktop\\simplilearn screenshot\\root\\";
			String S=add.concat(sc.next());
			File myObj = new File(S);
  	      if (myObj.createNewFile()) {
  	        System.out.println("File created: " + myObj.getName());
  	        System.out.println("Do You want to write somethoing inthe file?"
  	        		+ " Press y for yes and n for no");
  	        boolean y= true;
  	        boolean n=false;
  	        if(y) 
  	        {
  	        	System.out.println("Now you can write:\n");
  	        	String w=sc.next();
  	            FileWriter fw = new FileWriter(myObj.getAbsoluteFile());
  	            BufferedWriter bw = new BufferedWriter(fw);

  	            // Write in file
  	            bw.write(w);

  	            // Close connection
  	            bw.close();
  	        }
  	        else{
  	        	System.out.println("");
  	        }
  	        
  	      } else {
  	        System.out.println("File already exists.");
  	      }
					   
		}  
		catch(Exception e)  
		{  
		e.printStackTrace();          
		}  
		}
	
	//deleting the file.
	public static void deletingfiles() {
		try {
			System.out.println("Enter the file name i.e. to be deleted:\n ");
			Scanner sc=new Scanner(System.in);
			String delete= "C:\\Users\\SILE SINGH\\Desktop\\simplilearn screenshot\\root";
			String S=delete.concat(sc.next());
			File myObj = new File(S);
			if(myObj.delete())                      //returns Boolean value  
			{  
			System.out.println(myObj.getName() + " deleted");   //getting and printing the file name  
			}  
			else  
			{  
			System.out.println("File not Found");  
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
	}
	
	
	//searching the file
	public static void searchingfiles() {
		try {
			System.out.println("Enter the file name i.e. to be searched:\n ");
			Scanner sc=new Scanner(System.in);
			String search= "C:\\Users\\SILE SINGH\\Desktop\\simplilearn screenshot\\root";
			String S= sc.next();
			
			  File directory = new File(search);
			 
		        String[] flist = directory.list();
		        int flag = 0;
		        if (flist == null) {
		            System.out.println("Empty directory.");
		        }
		        else {
		  
		            // Linear search in the array
		            for (int i = 0; i < flist.length; i++) {
		                String filename = flist[i];
		                if (filename.equalsIgnoreCase(S)) {
		                    System.out.println(filename + " :found!");
		                    flag = 1;
		                }
		            }
		        }
		  
		        if (flag == 0) {
		            System.out.println("File Not Found");
		        }
		}
		
		catch(Exception e) {
			e.printStackTrace();
			
		}
	}
	
	//return back to main menu
	
	public static int returnmenu(int n) {
		return n ;
	}
	
		
	

	public static void main(String[] args)throws ParseException {
		
	String App= "Lockedme.com";
	String Develop="Amit Kumar";
	Scanner sc = new Scanner(System.in);
	
	for(int i= 1; i<=50; i++) {
		System.out.print("*"  );
	}
	
	System.out.println("\n");
	System.out.println("Welcome To: " + App);
	System.out.println("This Application is developed By: " + Develop);
	System.out.println("\n");
	
	for(int j= 1; j<=50; j++) {
		System.out.print("*"  );
	}
	
	System.out.println("\n1. This application is made for reteriving the files from \"root\" folder."
			+ "\n2. You can performed some operation(Searching,Deleting and Adding)on the files by selecting the option which is mentioned below:\n");
	
	System.out.println("*********Select any operation number from below and press Enter*********\n");
	
	
	int n;
	do{
		System.out.println("1. Reterive all files from \"root\" folders\n2. Display Menu for File Operations."
				+ "\n3. Exit from the Application.");
		n=sc.nextInt();
		switch(n) {
		
		case 1:
			
			//for Retrieving the files.
			File folder = new File("C:\\Users\\SILE SINGH\\Desktop\\simplilearn screenshot\\root");
			findAllFilesInFolder(folder);
			break;
			
		case 2:
			int num;
			do {
				System.out.println("\nEnter the numbers for (Adding,Deleting,Searching) files:"
						+ "\n1. Adding the files."
						+ "\n2. Deleting the files."
						+ "\n3. Searching the files"
						+ "\n4. Return to main Menu.");
				 num=sc.nextInt();
				switch(num) {
				
				case 1:
					Addingfiles();
					break;
					
				case 2:
					deletingfiles();
					break;
					
				case 3:
					searchingfiles();
					break;
				
				case 4:
					System.out.println("");
					returnmenu(n);
					break;
					
				default:
					System.out.println("Choice must be between 1 and 4");
					break;
					
				
				}
				
				
			}while(num!=4);
			break;
			
			
		case 3:
			System.out.println("exit successfully");
			break;
		
		default:
			System.out.println("Choice must be between 1 and 3");
			break;
	}
	}while(n!=3);
			
	}
	
	
	}


