

class Result {

    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month-1, day);
        String result = "";
        int n = (calendar.get(Calendar.DAY_OF_WEEK));        
        switch(n){
            case 1 : result= "SUNDAY"; break;
            case 2 : result= "MONDAY"; break;
            case 3 : result= "TUESDAY"; break;
            case 4 : result= "WEDNESDAY"; break;
            case 5 : result= "THURSDAY";break;
            case 6 : result= "FRIDAY"; break;
            case 7 : result= "SATURDAY"; break;
        }
        return result;
        
    }

}

