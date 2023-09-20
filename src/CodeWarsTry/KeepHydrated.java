package CodeWarsTry;

public class KeepHydrated {
    public static int Liters(double time)  {
        return (int) Math.floor(time * 0.5);
    }

    public static void main(String[] args) {
        System.out.println(Liters(3));    // Output: 1
        System.out.println(Liters(6.7));  // Output: 3
        System.out.println(Liters(11.8)); // Output: 5
    }
}


// CodeWars Instructions

// Nathan loves cycling.
//
//Because Nathan knows it is important to stay hydrated, he drinks 0.5 litres of water per hour of cycling.
//
//You get given the time in hours and you need to return the number of litres Nathan will drink, rounded to the smallest value.
//
//For example:
//
//time = 3 ----> litres = 1
//
//time = 6.7---> litres = 3
//
//time = 11.8--> litres = 5


// found on CodeWars

//public class KeepHydrated  {
//
//  public int Liters(double time)  {
//
//    //Your code goes here! Hint: You should change that -1
//    return (int) (time * 0.5);
//
//  }
//
//}


//public class KeepHydrated  {
//
//  public int Liters(double time)  {
//
//		if(time > 0){
//			return (int)time/2;
//		}
//
//
//	    return 0;
//
//	  }
//
//}