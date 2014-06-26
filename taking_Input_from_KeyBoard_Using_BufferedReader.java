import java.io.BufferedReader;

import java.io.InputStreamReader; 

class taking_Input_from_KeyBoard_BufferedReader{
    public static void main(String args[]){
        float PI = 3.1416f;
        int r=0;
        String rad; //We're going to read all user's text into a String and we try to convert it later
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Here you declare your BufferedReader object and instance it.
        System.out.println("Radius?");
        try{
            rad = br.readLine(); //We read from user's input
            r = Integer.parseInt(rad); //We validate if it is an integer (if so we 'jump' catch call, otherwise, we go to it)
            System.out.println("Circle area is: " + PI*r*r + " Permieter: " +PI*2*r); //If all was right, we print this
        }
        catch(Exception e){
            System.out.println("Write an integer number"); //This is what user will see if he/she write other thing that is not an integer
            InputUsingBufferedReader a = new InputUsingBufferedReader(); //We call this class again, so user can try it again
        }
    }
}