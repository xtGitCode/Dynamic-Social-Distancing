class LocationDatabase {

    //store data for 5 locations in 5 different classes:
    static class giant{
        //properties
        public static int id=1000;
        public static String name="Giant Supermarket";
        public static int area=5109;//square metres
        public static int max_capacity = max_capacity(area);
        public static double average_time=45;//minutes

        //getters
        public static int getId() {
            return id;
        }

        public static String getName() {
            return name;
        }

        public static int getArea() {
            return area;
        }

        public static int getMax_capacity() {
            return max_capacity;
        }

        public static double getAverage_time() {
            return average_time;
        }
    }

    static class sunwayPyramid{
        public static int id=1001;
        public static String name="Sunway Pyramid";
        public static int area=76186;//square metres
        public static int max_capacity = max_capacity(area);
        public static double average_time=145;//minutes

        public static int getId() {
            return id;
        }

        public static String getName() {
            return name;
        }

        public static int getArea() {
            return area;
        }

        public static int getMax_capacity() {
            return max_capacity;
        }

        public static double getAverage_time() {
            return average_time;
        }
    }

    static class kfc{
        public static int id=1002;
        public static String name="KFC Semenyih";
        public static int area=929;//square metres
        public static int max_capacity = max_capacity(area);
        public static double average_time=25;//minutes

        public static int getId() {
            return id;
        }

        public static String getName() {
            return name;
        }

        public static int getArea() {
            return area;
        }

        public static int getMax_capacity() {
            return max_capacity;
        }

        public static double getAverage_time() {
            return average_time;
        }
    }

    static class jayaGrocer{
        public static int id=1003;
        public static String name="Jaya Grocer";
        public static int area=2787;//square metres
        public static int max_capacity = max_capacity(area);
        public static double average_time=45;//minutes

        public static int getId() {
            return id;
        }

        public static String getName() {
            return name;
        }

        public static int getArea() {
            return area;
        }

        public static int getMax_capacity() {
            return max_capacity;
        }

        public static double getAverage_time() {
            return average_time;
        }
    }

    static class libraryUNMC{
        public static int id=1004;
        public static String name="UNMC Library";
        public static int area=2517;//square metres
        public static int max_capacity = max_capacity(area);
        public static double average_time=90;//minutes

        public static int getId() {
            return id;
        }

        public static String getName() {
            return name;
        }

        public static int getArea() {
            return area;
        }

        public static int getMax_capacity() {
            return max_capacity;
        }

        public static double getAverage_time() {
            return average_time;
        }
    }

//METHODS
    //calculate max_capacity
    public static int max_capacity(int area) {
        int max_capacity = (int) (area / 10.36); //reference from this website: https://peoplecounting.co.uk/blog/social-distancing-capacity-calculator-how-much-space-do-you-need/
        return max_capacity;
    }

}


