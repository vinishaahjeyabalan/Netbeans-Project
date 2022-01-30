/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carparkreservationsystem;
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class CarParkReservationSystem {
    static Scanner sc = new Scanner(System.in); //import Scanner class
    static LinkedList<Customer> custData = new LinkedList<Customer>(); //create a linked list called custData for Customer class (which stores customer's username, password, name, ic and phome no.)
    static LinkedList<Booking> booking = new LinkedList<Booking>();    //create a linked list called booking for Booking class (which stores
    static LinkedList<ParkSpace> parkspace = new LinkedList<ParkSpace>(); //create a linked list called booking for ParkSpace class (
    static Random r = new Random(); //import Random class
    static int input = 0;
    static Customer temp = new Customer(); //instantiate a customer object called temp
    static boolean loginStatus = false;    //set loginStatus as false
    static String currentUser = "";        //currentUser is based on user input

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        parseUsers(); //call this method from line 482
        printList();  //call this method from line 584
        genParkspace("06-01-01-21",120);        //HH-DD-MM-YY  //call this method from line 545
        updateParkspaceFile(); //call this method from line 524
        
        landingPage(); //call this method from line 79
        mainMenu();    //call this method from line 47                                        //throws Exception

    }
    
    public static void mainMenu()  throws Exception{
        while(true){
            System.out.println("\n--------------------- CURRENT USER: "+currentUser+" ---------------------");
            System.out.println("What would you like to do?");
            System.out.print("\n   1:Make New Booking"                           
                            + "\n   2:Modify Booking"
                            + "\n   3:View Upcoming Bookings"
                            + "\n   4:Cancel Booking"
                            + "\n  -1:Logout"
                            + "\n\n-Enter your selection: ");
            input  = Integer.parseInt(sc.nextLine());
            switch(input){
                case(1):
                    book(); //call this method from line 144
                    break;
                case(2):
                    modify();
                    break;
                case(3):
                    viewUpcoming();
                    break;
                case(4):
                    cancel();
                    break;
                case(-1):
                    loginStatus = false;
                    landingPage();
                    break;   
            }
        }
    }
    
    public static void landingPage(){
        System.out.println("\n---------------------------------------------------");
        System.out.println("WELCOME TO THE CAR PARK RESERVATION SYSTEM");
        System.out.println("    ");
        
        while(!loginStatus){ //while loginStatus false
            System.out.print("Enter \"1\" to Login or \"2\" to Register: ");
            input = sc.nextInt();
            sc.nextLine();

            if(input == 1){
                login();   //call this method from line 100
            }else if (input == 2){
                register(); //call this method from line 122
            }
            
            if(!loginStatus)
                System.out.println("Login/Registration Failed!\n");
        }
    }
    
    public static void login(){
        System.out.println("\n----------------USER LOGIN----------------");
        System.out.print("Enter your Username: ");
        String username = sc.nextLine(); //user input for username

        for(int i=0; i<custData.length(); i++){  //for every element(customer) in custData linked list
            //System.out.println(custData.get(i).getUsername());
            if(custData.get(i).getUsername().equals(username)){
                System.out.print("Username Found, Enter Password: ");
                String password = sc.nextLine();
                if(custData.get(i).getPassword().equals(password)){
                    System.out.println("\nSuccessful Login!");
                    currentUser = custData.get(i).getUsername(); //currentUser is the username inputted by the customer
                    loginStatus = true;
                    return;
                }
            break; //?
            }
        }
        System.out.println("\nUsername not found!");
    }
    
    public static void register(){
        System.out.println("\n----------------NEW USER REGISTRATION----------------");
        System.out.print("Enter your username: ");
        String username = sc.nextLine();
        System.out.print("Enter your password: ");
        String password = sc.nextLine();
        System.out.print("Enter your full name: ");
        String name = sc.nextLine().toUpperCase(); //?
        System.out.print("Enter your IC(XXXXXXXXXXXX): ");
        String ic = sc.nextLine();
        System.out.print("Enter the phone no(01XXXXXXXX): ");
        String phone = sc.nextLine();

        temp = new Customer(username, password, name, ic, phone);
        custData.add(temp);
        updateUsers(); //call this method from line 504
        printList();   //call this method from line 584
        
        System.out.println("Registration Successful! Please Login\n");
        login(); //after registration done, do login
    }
    
    public static void book(){
        System.out.println("\n---------------------NEW BOOKING---------------------");
        System.out.println("Username: "+currentUser);
        System.out.println("    ");

        System.out.print("Enter Booking Time (HH-DD-MM-YY): ");
        String timeStart = sc.nextLine();
        if(timeStart.equals("-1")) 
            return; //return to mainmenu()
        
        System.out.print("Enter Booking Duration: ");
        int duration = sc.nextInt();sc.nextLine();
        if(duration == -1)
            return; //return to mainmenu()
        
        showAvailable(timeStart, duration);//?
        
        System.out.print("Which Parking Space do you want to book? ");
        String chosenSpace = sc.nextLine().toUpperCase(); //user input the space id that he wants
        makeBooking(currentUser, chosenSpace, timeStart, duration);
        
        System.out.print("\nWould you like to make another booking? (Y/N): ");
        String capture = sc.nextLine().toUpperCase();
        if(capture.contains("Y")) //why not .equals
            book();

    }
    
    public static void makeBooking(String user, String space, String timeStart, int dur){
        String[] dateString = timeStart.split("-"); //date format HH-DD-MM-YY
        int[] date = new int[4];
        for(int i=0; i<4; i++){
            date[i] = Integer.parseInt(dateString[i]);
        }
        
        String bookDate = date[0]+"-"+date[1]+"-"+date[2]+"-"+date[3];
        boolean success = false;
        
        for(int i=0; i<parkspace.length(); i++){
            if(parkspace.get(i).spaceId.equals(space)){
                System.out.println("\nMATCH: "+parkspace.get(i).spaceId);
                for(int j=0; j<dur; j++){
                    bookDate = date[0]+"-"+date[1]+"-"+date[2]+"-"+date[3];
                    parkspace.get(i).data.put(bookDate, "x");

                    date[0]++;
                    if(date[0] == 24){
                        date[0] = 0;
                        date[1]++;
                    }
                }
                booking.add(new Booking(user, space, timeStart, dur));       
                System.out.println("Successfully made booking for User: "+currentUser);
                System.out.println("    -Parking Space: "+space);
                System.out.println("    -Start Time : "+timeStart);
                System.out.println("    -End Time   : "+getTimeEnd(timeStart, dur)+"\n");
                success = true;
                break;
            }
        }
        if(!success){
            System.out.println("Booking Unsuccessful!");
        }
        updateParkspaceFile();
    }
    
    public static void showAvailable(String time, int dur){ //?
        boolean available = true;
        int spacer = 0;
        String[] dateString = time.split("-"); //date format HH-DD-MM-YY
        int[] date = new int[4];
        for(int i=0; i<4; i++){
            date[i] = Integer.parseInt(dateString[i]);
        }
        
        String[] floors = {"A","B","C","D","E"};
        System.out.println("\nAvailable Parking Spaces ([x]=taken & [ ]=available): \n");
        for(int i=0; i<parkspace.length(); i++){
            if(i%20 == 0){
                System.out.println("");
                System.out.println("FLOOR "+floors[i/20]);
            }
            for(int k=0; k<dur; k++){
                String searchDate = date[0]+"-"+date[1]+"-"+date[2]+"-"+date[3];
                if(parkspace.get(i).data.get(searchDate).equals("x")){
                    available = false;
                }
                date[0]++;
                if(date[0] == 24){
                    date[0] = 0;
                    date[1]++;
                }
            }
            for(int j=0; j<4; j++){
                date[j] = Integer.parseInt(dateString[j]);
            }
            if(available)
                System.out.print(parkspace.get(i).spaceId+" [ ] | ");
            else
                System.out.print(parkspace.get(i).spaceId+" [x] | ");

            if(spacer%4 == 3)
                System.out.println("");

            available = true;
            spacer++;

        }
        System.out.println("");
        
    }
    
    public static void modify() throws Exception{
        System.out.println("\n---------------------MODIFY BOOKING---------------------");
        
        boolean bookingExists = viewUpcoming();
        if(!bookingExists){
            return;
        }
        
        System.out.print("Which booking do you want to modify? (enter Booking ID): ");
        String mod = sc.nextLine();
        for(int i=0; i<booking.length();i++){
            if(booking.get(i).bookingId.equals(mod)){
                System.out.println("Booking "+ booking.get(i).bookingId);
                System.out.println("    -Parking Space: "+booking.get(i).parkSpace);
                System.out.println("    -Start Time : "+booking.get(i).timeStart);
                System.out.println("    -End Time   : "+booking.get(i).timeEnd+"\n");
                break;
            }
        }
        System.out.print("Enter Modified Start Time (HH-DD-MM-YY): ");
        String timeStart = sc.nextLine();
        System.out.print("Enter Booking Duration: ");
        int duration = sc.nextInt();sc.nextLine();
        
        showAvailable(timeStart, duration);
        
        System.out.print("Which Parking Space do you want to book? ");
        String chosenSpace = sc.nextLine().toUpperCase(); 
        if(chosenSpace.equals("-1"))
            return;
        boolean modSuccess = modifyBooking(mod, chosenSpace, timeStart, duration);
        if(modSuccess){
            System.out.println("\nBooking Modified Successfully");
        }else{
            System.out.println("\nBooking Modification Unsuccessful");
        }
    }
    
    public static boolean modifyBooking(String bookingId, String chosenSpace, String timeStart, int dur){
        
        String parkSpace;
        String old_timeStart;
        int old_dur;
        for(int i=0; i<booking.length();i++){
            if(booking.get(i).bookingId.equals(bookingId)){
                System.out.println("FOUND BOOKING TO MODIFY");
                parkSpace = booking.get(i).parkSpace;
                old_timeStart = booking.get(i).timeStart;
                old_dur = booking.get(i).duration;

                String[] dateString = old_timeStart.split("-"); //date format HH-DD-MM-YY
                int[] date = new int[4];
                for(int j=0; j<4; j++){
                    date[j] = Integer.parseInt(dateString[j]);
                }

                for(int k=0; k<parkspace.length(); k++){
                    if(parkspace.get(k).spaceId.equals(parkSpace)){
                        for(int j=0; j<old_dur; j++){
                            String searchDate = date[0]+"-"+date[1]+"-"+date[2]+"-"+date[3];
                            if(parkspace.get(k).data.get(searchDate).equals("x")){
                                parkspace.get(k).data.put(searchDate," ");
                            }else{
                                System.out.println("MOD CLASH ERROR IN REMOVAL "+searchDate+" "+parkSpace);
                                return false;
                            }
                            date[0]++;
                            if(date[0] == 24){
                                date[0] = 0;
                                date[1]++;
                            }
                        }
                    break;
                    }
                }               
            }
        }
        
        for(int i=0; i<booking.length();i++){
            if(booking.get(i).bookingId.equals(bookingId)){
                booking.get(i).parkSpace = chosenSpace;
                booking.get(i).timeStart = timeStart;
                booking.get(i).timeEnd = getTimeEnd(timeStart, dur);
                break;
            }
        }
        
        String[] dateString = timeStart.split("-"); //date format HH-DD-MM-YY
        int[] date = new int[4];
        for(int j=0; j<4; j++){
            date[j] = Integer.parseInt(dateString[j]);
        }

        for(int k=0; k<parkspace.length(); k++){
            if(parkspace.get(k).spaceId.equals(chosenSpace)){
                for(int j=0; j<dur; j++){
                    String searchDate = date[0]+"-"+date[1]+"-"+date[2]+"-"+date[3];
                    if(parkspace.get(k).data.get(searchDate).equals(" ")){
                        parkspace.get(k).data.put(searchDate,"x");
                    }else{
                        System.out.println("MOD CLASH ERROR IN BLOCKING");
                        return false;
                    }
                    date[0]++;
                    if(date[0] == 24){
                        date[0] = 0;
                        date[1]++;
                    }
                }
            break;
            }
        }
        updateParkspaceFile();
        return true;
    }
    
    public static boolean viewUpcoming() throws Exception{
        System.out.println("\n-------UPCOMING BOOKING-------");
        boolean bookingExists = false;
        System.out.println("Current Bookings for User: "+currentUser+"\n");
        for(int i=0; i<booking.length();i++){
            if(booking.get(i).username.equals(currentUser)){
                bookingExists = true;
                System.out.println("Boooking ID: "+ booking.get(i).bookingId);
                System.out.println("    -Parking Space: "+booking.get(i).parkSpace);
                System.out.println("    -Start Time : "+booking.get(i).timeStart);
                System.out.println("    -End Time   : "+booking.get(i).timeEnd+"\n");
            }
        }
        
        if(!bookingExists){
            System.out.println("    - There are no bookings for user: "+currentUser);
            TimeUnit.SECONDS.sleep(1);
            return false;
        }else{
            TimeUnit.SECONDS.sleep(1);
            return true;
        }
    }
    
    public static void cancel() throws Exception{
        System.out.println("\n---------------------CANCEL BOOKING---------------------");
        
        boolean bookingExists = viewUpcoming();

        if(!bookingExists){
            return;
        }
        
        System.out.print("Which booking do you want to Cancel? (enter Booking ID): ");
        String bookingId = sc.nextLine();
        for(int i=0; i<booking.length();i++){
            if(booking.get(i).bookingId.equals(bookingId)){
                System.out.println("\nCanceling Boooking "+ booking.get(i).bookingId);
                System.out.println("    -Parking Space: "+booking.get(i).parkSpace);
                System.out.println("    -Start Time : "+booking.get(i).timeStart);
                System.out.println("    -End Time   : "+booking.get(i).timeEnd+"\n");
                break;
            }
        }
        boolean cancelSuccess = false;
        System.out.print("Are you sure you want to cancle this booking? (Y/N): ");
        String cancel = sc.nextLine();
        if(cancel.equals("Y"))
            cancelSuccess = cancelBooking(bookingId);
        else
            return;
        
        if(cancelSuccess){
            System.out.println("nBooking "+bookingId+" cancelled successfully!");
        }else{
            System.out.println("Booking "+bookingId+" cancellation unsuccessful!");
        }
  
    }
    
    public static boolean cancelBooking(String bookingId){
        String parkSpace;
        String old_timeStart;
        int old_dur;
        for(int i=0; i<booking.length();i++){
            if(booking.get(i).bookingId.equals(bookingId)){
                System.out.println("\nFOUND BOOKING TO CANCEL");
                parkSpace = booking.get(i).parkSpace;
                old_timeStart = booking.get(i).timeStart;
                old_dur = booking.get(i).duration;

                String[] dateString = old_timeStart.split("-"); //date format HH-DD-MM-YY
                int[] date = new int[4];
                for(int j=0; j<4; j++){
                    date[j] = Integer.parseInt(dateString[j]);
                }

                for(int k=0; k<parkspace.length(); k++){
                    if(parkspace.get(k).spaceId.equals(parkSpace)){
                        for(int j=0; j<old_dur; j++){
                            String searchDate = date[0]+"-"+date[1]+"-"+date[2]+"-"+date[3];
                            if(parkspace.get(k).data.get(searchDate).equals("x")){
                                parkspace.get(k).data.put(searchDate," ");
                            }else{
                                System.out.println("MOD CLASH ERROR IN REMOVAL "+searchDate+" "+parkSpace);
                                return false;
                            }
                            date[0]++;
                            if(date[0] == 24){
                                date[0] = 0;
                                date[1]++;
                            }
                        }
                    break;
                    }
                }  
                break;
            }
        }
        
        for(int i=0; i<booking.length();i++){
            if(booking.get(i).bookingId.equals(bookingId)){
                booking.delete(i);
                break;
            }
        }
        updateParkspaceFile();
        return true;
    }
    
    public static void parseUsers(){
        
        File file = new File("users.txt");  //create a text file called users.txt
        int count =0;
        try{
            Scanner in = new Scanner(new FileInputStream(file));
            while(in.hasNextLine()){ //reading every line
                String line = in.nextLine(); //initializing every line in the file as line
                if(!line.contains(",")) //if the current line doesnt have a comma, break and proceed to next line
                    break;
                count++; //counting the line (in other words, counting the no. of users)
                String[] info = line.split(","); //create an array called info  //splitting line by comma and storing in array info
                temp = new Customer(info[0], info[1], info[2], info[3], info[4]); //storing username, password, name, ic and phone no respectively as elements in info array
                custData.add(temp); //add temp into the custData linked list
                //System.out.println("added "+info[0]+", "+info[1]+", "+info[2]+", "+info[3]+", "+info[4]);
            }  
            System.out.println("ADDED "+count+" USERS");
        }catch(FileNotFoundException e){
            System.out.println("Userdata parse file not found");
        }
    }
    
    public static void updateUsers(){     //update user or customer details in user.txt file
        File file = new File("users.txt");
        try{
            PrintWriter pw = new PrintWriter(file);
            for(int i=0; i<custData.length(); i++){
                StringBuilder sb = new StringBuilder();
                sb.append(custData.get(i).getUsername()).append(",");
                sb.append(custData.get(i).getPassword()).append(",");
                sb.append(custData.get(i).getName()).append(",");
                sb.append(custData.get(i).getIc()).append(",");
                sb.append(custData.get(i).getPhone_no());
                pw.println(sb.toString());
            }
            pw.close();
  
        }catch(IOException e){
            System.out.println("Update Users Error");
        }
    }
    
    public static void updateParkspaceFile(){
        //System.out.print("STORING PARKSPACE DATA");
        File file = new File("parkspace.txt");
        try{
            PrintWriter pw = new PrintWriter(new FileOutputStream(file));
            
            for(int i=0; i<parkspace.length(); i++){
                //System.out.println("Storing: "+parkspace.get(i).spaceId);
                pw.print(parkspace.get(i).spaceId+",");
                for(String value : parkspace.get(i).data.values())
                    pw.print(value+",");
                pw.println("");
            }
            pw.close();
 
        }catch(FileNotFoundException e){
            System.out.println("Userdata parse file not found");
        }
        //System.out.print("  -DONE!\n");
    }
    
    public static void genParkspace(String startDate, int periods){
        System.out.print("GENERATING PARKSPACE DATA");
        String[] dateString = startDate.split("-"); //date format HH-DD-MM-YY
        int[] date = new int[4];
        for(int i=0; i<4; i++){
            date[i] = Integer.parseInt(dateString[i]); //storing the dateString which is String into date as integers
        }
        String[] floor = {"A","B","C","D","E"}; //creating floor in array
        String[] space = {  "001","002","003","004","005",    // creating space in array
                            "006","007","008","009","010",
                            "011","012","013","014","015",
                            "016","017","018","019","020"};
        for(int f=0; f<5; f++){ // for every floor
            for(int i=0; i<20; i++){ //for every space
                String spaceId = floor[f]+space[i]; //create a unique space id
                ParkSpace newSpace = new ParkSpace(spaceId); //every unique space id refers to a ParkSpace object
                parkspace.add(newSpace); //add every unique ParkSpace object into the parkspace linked list
                for(int k=0; k<periods; k++){
                    //System.out.print("Generating: "+floor[f]+space[i]+" - "+k);
                    //System.out.print("      Date: "+date[0]+"-"+date[1]+"-"+date[2]+"-"+date[3]+"\n");
                    if(r.nextInt(10) < 3){
                        newSpace.addBooking(date[0]+"-"+date[1]+"-"+date[2]+"-"+date[3], "x");
                    }else{
                        newSpace.addBooking(date[0]+"-"+date[1]+"-"+date[2]+"-"+date[3], " ");
                    }
                    date[0]++;
                    if(date[0] == 24){
                        date[1]++;
                        date[0] = 0;
                    }
                }
                for(int j=0; j<4; j++){
                    date[j] = Integer.parseInt(dateString[j]);
                }
            }
        }
        System.out.print("  -DONE!\n");
    }
    
    public static void printList(){  //print customer details
        System.out.println("\nRegistered Users:");
        for(int i=0; i<custData.length(); i++){
            System.out.println("---------------------------");
            System.out.println(custData.get(i).getUsername()); //in custData linked list, get a customer element, then get the username
            System.out.println(custData.get(i).getPassword()); //in custData linked list, get a customer element, then get the password
            System.out.println(custData.get(i).getName());     //in custData linked list, get a customer element, then get the name
        }
        System.out.println("---------------------------\n");
    }
    
    public static String getTimeEnd(String timeStart, int dur){
        String[] dateString = timeStart.split("-"); //date format HH-DD-MM-YY
        int[] date = new int[4];
        for(int i=0; i<4; i++){
            date[i] = Integer.parseInt(dateString[i]);
        }
        
        for(int i=0; i<dur; i++){
            date[0]++;
            if (date[0] == 24){
                date[0] = 0;
                date[1]++;
            }
        }
        String timeEnd = date[0]+"-"+date[1]+"-"+date[2]+"-"+date[3];
        return timeEnd;
    
    }
    
    public static void favouriteSpot(){
        System.out.print("Type in your favourite parking space to check its availability: ");
        String favSpace = sc.nextLine().toUpperCase();
        for(int k=0; k<parkspace.length(); k++){
                    if(parkspace.get(k).spaceId.equals(favSpace)){
                            if(parkspace.get(k).available.get(searchDate).equals("x")){
        
        
                            }
                    }
                           
    
        }
    }
}
