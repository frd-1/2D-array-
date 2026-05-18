package HRS_Lab5;
import java.util.*;

public class Lab5 {
	
	//Hotel Reservation System (Java, 2D Array)

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int hotel[][] = new int[7][5]; //7 floors, 5 rooms per floor
		int choice = 0;
		
		while (choice != 4 ) {
		// display menu
			System.out.println("=== HOTEL RESERVATION SYSTEM ===");
			System.out.println("1. View Rooms");
			System.out.println("2. Check in");
			System.out.println("3. Check out");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();		
			
			switch (choice) {
			//View rooms
	        case 1: // View Rooms
                for (int i = 0; i < 7; i++) {
                    System.out.print("Floor " + (i + 1) + ": ");
                    for (int j = 0; j < 5; j++) {
                        System.out.print("[" + hotel[i][j] + "]");
                    }
                    System.out.println();
                }
                break;

			//Check in
			case 2:
				System.out.print("Enter floor (1-7): ");
				int floor_In = sc.nextInt() - 1;
				System.out.println("Enter room (1-5): ");
				int room_In = sc.nextInt() - 1;
				
				if (hotel [floor_In][room_In] == 0) {
					hotel [floor_In][room_In] = 1;
					System.out.println("Check-in Successful!");
				} else {
					System.out.println("Room already occupied!");
				}
				break;
				
				//check out
			case 3:
				System.out.print("Enter floor (1-7): ");
				int floor_Out = sc.nextInt() - 1;
				System.out.println("Enter room (1-5): ");
				int room_Out = sc.nextInt() - 1;
				
				if (hotel [floor_Out][room_Out] == 1) {
					hotel [floor_Out][room_Out] = 0;
					System.out.println("Check-out Successful!");
				} else {
					System.out.println("Room already empty!");
				}
				break;
				
			//exit	
			case 4:
				System.out.println("Exiting system. Goodbye!");
				break;
				
				default:
					System.out.println("Invalid choice. Try again!");
			}
			System.out.println();
		}
		sc.close();	
	}
}

