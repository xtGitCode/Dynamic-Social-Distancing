class SocialBubble  {

    static class user{
        public static int id=20303967;
        public static String name="Gan Xiao Thung";
        public static int LocationID;
        public static String LocationName;
        public static String Date ="22-3-2022";
        public static String Time ="21:30";
        public static String Status="Low Risk, No Symptoms";

        //getter and setter

        public static int getLocationID() {
            return LocationID;
        }

        public static void setLocationID(int locationID) {
            LocationID = locationID;
        }

        public static String getLocationName() {
            return LocationName;
        }

        public static void setLocationName(String locationName) {
            LocationName = locationName;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public static String getName() {
            return name;
        }

        public static void setName(String name) {
            user.name = name;
        }

        public static String getDate() {
            return Date;
        }

        public static void setDate(String date) {
            Date = date;
        }

        public static String getTime() {
            return Time;
        }

        public static void setTime(String time) {
            Time = time;
        }

        public static String getStatus() {
            return Status;
        }

        public static void setStatus(String status) {
            Status = status;
        }
    }
//METHODS
    //random boolean value for close contact
   public static boolean closeContact(){
        boolean closeContact;
       double RandomNum = Math.floor(Math.random() * 2);//generate random number from 0-1
       int x=(int) RandomNum;//convert to integer, x will have value of 1 or 0 depending on above
       if(x==0){ //if x=0,set boolean variable to false
           closeContact=false;
       }
       else{//else, set it to true
           closeContact=true;
       }
       return closeContact;
    }

    //set status according to boolean value
    public static String status(boolean closeContact){ //take boolean after randomly generating value
        String status;
        if(closeContact=true){
            status="Casual Contact";
        }else{
            status="Low Risk, No Symptoms";
        }
        return status;
    }

    //print user details
    public static void printUser(){
        System.out.println("\n---Your Details---");
        System.out.println("ID: "+user.id);
        System.out.println("Name: "+user.name);
        System.out.println("Location ID: "+ user.LocationID);
        System.out.println("Location Name: "+ user.LocationName);
        System.out.println("Date: "+user.Date);
        System.out.println("Time: "+user.Time);
        System.out.println("Status: "+user.Status);
    }
}
