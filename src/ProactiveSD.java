import java.util.Scanner;

class ProactiveSD extends SocialBubble{ //extends social bubble as we are calling their methods in this class
    static Scanner sc = new Scanner(System.in); //tells the compiler that system input will be provided through keyboard

    public static void main(String[] args) {
        int choice, visitor, socialdistance;
        choice=displayMenu(); //call method to display menu to user, user input is stored inside variable choice

        switch (choice){ //each case is a different location

            case 1://for location-Giant
                visitor=generateVisitors(LocationDatabase.giant.getMax_capacity());//generate number of current visitors
                user.setLocationID(LocationDatabase.giant.getId());//set giant location id to user details in social bubble
                user.setLocationName(LocationDatabase.giant.getName());//set giant name to user details
                System.out.println("\n------"+LocationDatabase.giant.getName()+"------");
                System.out.println("Max Capacity: "+ LocationDatabase.giant.getMax_capacity());
                System.out.println("Current Visitors: "+ visitor);
                if(visitor < LocationDatabase.giant.getMax_capacity()){ //max capacity not reached- user allowed to enter
                    socialdistance=allow();
                }else{
                    System.out.println("Max Capacity Reached!!");
                    System.out.println("\nDo you want to wait for average time of "+LocationDatabase.giant.getAverage_time()+"minutes");//display average time of location
                    disallow(); //max capacity reached- user not allowed to enter
                }
                break;

            case 2://for location- Sunway Pyramid
                visitor=generateVisitors(LocationDatabase.sunwayPyramid.getMax_capacity());//same as case 1, just changed the location
                user.setLocationID(LocationDatabase.sunwayPyramid.getId());
                user.setLocationName(LocationDatabase.sunwayPyramid.getName());
                System.out.println("\n------"+LocationDatabase.sunwayPyramid.getName()+"------");
                System.out.println("Max Capacity: "+ LocationDatabase.sunwayPyramid.getMax_capacity());
                System.out.println("Current Visitors: "+ visitor);
                if(visitor < LocationDatabase.sunwayPyramid.getMax_capacity()) {
                    socialdistance=allow();
                } else{
                    System.out.println("Max Capacity Reached!!");
                    System.out.println("\nDo you want to wait for average time of "+LocationDatabase.sunwayPyramid.getAverage_time()+"minutes");
                    disallow();
                }
                break;
            case 3:
                visitor=generateVisitors(LocationDatabase.kfc.getMax_capacity());
                user.setLocationID(LocationDatabase.kfc.getId());
                user.setLocationName(LocationDatabase.kfc.getName());
                System.out.println("\n------"+LocationDatabase.kfc.getName()+"------");
                System.out.println("Max Capacity: "+ LocationDatabase.kfc.getMax_capacity());
                System.out.println("Current Visitors: "+ visitor);
                if(visitor < LocationDatabase.kfc.getMax_capacity()) {
                    socialdistance=allow();
                } else{
                    System.out.println("Max Capacity Reached!!");
                    System.out.println("\nDo you want to wait for average time of "+LocationDatabase.kfc.getAverage_time()+"minutes");
                    disallow();
                }
                break;
            case 4:
                visitor=generateVisitors(LocationDatabase.jayaGrocer.getMax_capacity());
                user.setLocationID(LocationDatabase.jayaGrocer.getId());
                user.setLocationName(LocationDatabase.jayaGrocer.getName());
                System.out.println("\n------"+LocationDatabase.jayaGrocer.getName()+"------");
                System.out.println("Max Capacity: "+ LocationDatabase.jayaGrocer.getMax_capacity());
                System.out.println("Current Visitors: "+ visitor);
                if(visitor < LocationDatabase.jayaGrocer.getMax_capacity()) {
                    socialdistance=allow();
                } else{
                    System.out.println("Max Capacity Reached!!");
                    System.out.println("\nDo you want to wait for average time of "+LocationDatabase.jayaGrocer.getAverage_time()+"minutes");
                    disallow();
                }
                break;
            case 5:
                visitor=generateVisitors(LocationDatabase.libraryUNMC.getMax_capacity());
                user.setLocationID(LocationDatabase.libraryUNMC.getId());
                user.setLocationName(LocationDatabase.libraryUNMC.getName());
                System.out.println("\n------"+LocationDatabase.libraryUNMC.getName()+"------");
                System.out.println("Max Capacity: "+ LocationDatabase.libraryUNMC.getMax_capacity());
                System.out.println("Current Visitors: "+ visitor);
                if(visitor < LocationDatabase.libraryUNMC.getMax_capacity()) {
                    socialdistance=allow();
                } else{
                    System.out.println("Max Capacity Reached!!");
                    System.out.println("\nDo you want to wait for average time of "+LocationDatabase.libraryUNMC.getAverage_time()+"minutes");
                    disallow();
                }
                break;
        }
    }


//METHODS
    //display all locations stored in LocationDatabase
    public static int displayMenu(){
        System.out.println("\n-------WELCOME to MySejahtera 2.0-------");
        System.out.println("Select a building you would like to enter: \n");
        System.out.println("Press 1. to enter "+ LocationDatabase.giant.getName());
        System.out.println("Press 2. to enter "+ LocationDatabase.sunwayPyramid.getName());
        System.out.println("Press 3. to enter "+ LocationDatabase.kfc.getName());
        System.out.println("Press 4. to enter "+ LocationDatabase.jayaGrocer.getName());
        System.out.println("Press 5. to enter "+ LocationDatabase.libraryUNMC.getName());

        int choice;
        do{
            System.out.println("Enter Number: ");//user input their choice
            choice=sc.nextInt();
        } while(choice>5||choice<0);//user need to input number between 1-5 or question will be repeated

        return choice;//variable choice is used to tell the program which switch case to go to
    }

    //generate random number of current visitors
    public static int generateVisitors(int max_capacity){
        max_capacity += 1;
        double RandomNum = Math.floor(Math.random() * max_capacity);//generate random number from 0 to max capacity of selected location
        int visitor = (int)RandomNum;
        return visitor;
    }

    //users allow to enter building
    public static int allow(){
        int socialdistance;
        double gap;
        double north, south, east, west;
        System.out.println("---You are allowed to enter---");
        do { //let user enter their distance in all 4 directions
            System.out.println("\nEnter your distance from other people (in meters)");
            System.out.println("North: ");
            north = sc.nextDouble();
            System.out.println("South: ");
            south = sc.nextDouble();
            System.out.println("East: ");
            east = sc.nextDouble();
            System.out.println("West: ");
            west = sc.nextDouble();

            if (north >= 2 && south >= 2 && east >= 2 && west >= 2) { // if user is more than or 2 meters away from others
                System.out.println("Social distancing achieved! Good job for taking care of yourself and others");

                System.out.println("Press 1. to view user details");
                System.out.println("Print 2. to view menu");
                System.out.println("Press 0. to exit");
                int userChoice;
                do {
                    System.out.println("Enter number:");
                    userChoice = sc.nextInt();
                    switch (userChoice) {
                        case 1:
                            printUser(); //method from social bubble to display user details
                            break;
                        case 2:
                            displayMenu();
                            break;
                        case 0:
                            break;
                    }
                } while (userChoice < 0 || userChoice > 2);//user can only key in number from 0-2
                socialdistance = 1;
            } else { //user is less than 2 meters away from others
                System.out.println("Social distancing failed!");

                System.out.println("\nYou NEED to: "); //display how far they need to move
                socialdistance = 0;
                if (socialdistance == 0) {
                    if (north < 2) {
                        gap = 2 - north;
                        System.out.println("Move South for " + gap + " meters");//user move in opposite direction
                    }
                    if (south < 2) {
                        gap = 2 - south;
                        System.out.println("Move North for " + gap + " meters");
                    }
                    if (east < 2) {
                        gap = 2 - east;
                        System.out.println("Move West for " + gap + " meters");
                    }
                    if (west < 2) {
                        gap = 2 - west;
                        System.out.println("Move East for " + gap + " meters");
                    }
                }
                boolean closeContact = closeContact(); // close contact is randomly set
                if (closeContact == true){
                    System.out.println("\n*** WARNING: Someone near you is a close contact ***");
                    System.out.println("Your status has been updated");
                    String status = status(closeContact);
                    user.setStatus(status);
                    printUser();
                    System.out.println("\nPlease follow the steps above and try again");
                } else {
                    System.out.println("\nPlease follow the steps above and try again");
                }
            }
        }while (socialdistance == 0) ; //if user fail social distancing, it will keep looping until they pass
            return socialdistance;
        }

    //users not allow to enter building
    public static void disallow(){
        int x;
        do {
            System.out.println("press 1. to wait");
            System.out.println("press 2. to leave");
            x = sc.nextInt();
        } while (x<1||x>2);

        if(x==1){
            allow();
        } else{
            displayMenu();
        }
    }
}
