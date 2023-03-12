public class BoolToWord {

    public static void main(String[] args) {
        System.out.println(boolToWord(false));
    }

    //    public static String boolToWord(boolean b){       //Scheint nicht zu Funktionieren jan es auf mit einer
//                                                      //if else funktion versucht
//        while (b = true) {
//            return "Yes";
//        }
//        while (b = false) {
//        }
//        return "No";
//    }
//    public static String boolToWord(boolean b) {  //Via google gefunden allerdings wird hier der boolschw wert als text ausgegen
//        String a = String.valueOf(b);             // Wenn ich es richtig verstanden hab
//        return a;
//    }

    public static String boolToWord(boolean b) {
        if (b == true) {   //vorheriger fehler bei meinem if else war == ich hab lediglich = gemacht
            return "Yes";
        } else
            return "No";
    }

    public static String boolToWord2(boolean b)  //Andere antworten auf CodeWars
    {
        return b ? "Yes" : "No";
    }

    public static String boolToWord3(boolean b) { //Auch auf CodeWars gefunden
        if(b) return "Yes";
        else return "No";
    }


}