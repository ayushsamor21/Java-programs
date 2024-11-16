public class IfElse {

    public static void main(String[] arg){
        //using if , else , elseif command to print different output depending upon defined variable(day)
        String day = "Monday";
        if (day == "Sunday"){
            System.out.print("holiday");
        }
        else if (day == "Saturday"){
            System.out.print("i may go to college");
        }
        else {
             System.out.print("i will go to college");
        }
    }
}
 //output - varies according to the defined variable(day)