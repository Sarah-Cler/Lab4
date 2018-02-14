import java.util.Scanner;

        public class Main {

            public static void main(String[] args) {

                String UserHexaDec; //hexadecimal number input by user
                int i = 0;          //character index/place starting at 0
                int HexDecvalue;    //value of single hexadecimal
                long HexDecSum;     // value of hexadecimal added up in decimal
                long sum = 0;
                int exp;
                Scanner scnr = new Scanner(System.in);

                System.out.print("Enter a hexadecimal number: ");

                UserHexaDec = scnr.nextLine();        //input from user
                int l = UserHexaDec.length();            //length of all characters inputted
                 if (l>3) {
                     if (UserHexaDec.charAt(0) == '0' && UserHexaDec.charAt(1) == 'x')  {//used to ignore when there is 0x in front of hexdecimal.

                         exp = l - 3; //Used to get the exponent value when hexdecimal starts with 0x
                     }
                     else {
                         exp = l - 1; //used to get exponent value for formula
                     }

                 }
                 else {
                     exp=l-1;

                 }


                while (i < UserHexaDec.length())
                {
                    char c = UserHexaDec.charAt(i);

                    if (c >= 48 && c <= 57) {
                        //values from 1-9 in hexdec
                        sum += (long) ((c - 48) * Math.pow(16, exp));
                        exp -=1;
                    } else if (c >= 65 && c <= 70) {
                        sum += (long) ((c - 55) * Math.pow(16, exp));
                        exp -=1;
                        //values from A-F
                    } else if (c >= 97 && c <= 102) {
                        // values from a-f
                        sum += (long) ((c - 87) * Math.pow(16, exp));
                        exp -=1;
                    } else {
                        sum +=0;
                        exp += 1;
                    }


                        {

                                         //input something so the program does not accept any values
                    }

                    i++;


                }

                System.out.println("Your number is " + sum + " in decimal");

            }



        }




