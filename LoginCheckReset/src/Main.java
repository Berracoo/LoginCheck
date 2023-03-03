import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //specifying our account data
        String loginName = "Chilli";
        String loginPassword = "quit45";
        int i = 0;
        int chances = 0;

       // getting input from user
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the user name that you are registered : ");
        // trim is used for deleting the spaces
        String userName = input.nextLine().trim();
        System.out.println("****************************");
        System.out.print("Please enter your password that is registered in the system : ");
        String userPassword = input.nextLine().trim();
        System.out.println("****************************");
        // equals questions if the first given object equals to the one in the bracket
        if (loginName.equals(userName) && !(loginPassword.equals(userPassword))) {
            System.out.println("Your username is correct unlike your password, please try again! ");
        } else if (!(loginName.equals(userName)) && loginPassword.equals(userPassword)) {
            System.out.println("Please check your username again.");
        } else if (loginName.equals(userName) && loginPassword.equals(userPassword)) {
            System.out.println("Successfully login! ");

        } else if (!(loginPassword.equals(userPassword) && loginName.equals(userName))) {
            System.out.println("Both your username and password are wrong, you'll be given 3 chances to enter them correctly!");
            chances = 3;
            // to let user try entering its account data for 3 times we use loop
            for (i = 0; i < chances; i++) {


                System.out.print("Enter your username : ");
                userName = input.nextLine();
                System.out.println();
                System.out.print("Enter your password : ");
                userPassword = input.nextLine().trim();
                // if the information matches with login data it will stop asking to enter again to the user
                if ((loginPassword.equals(userPassword) && loginName.equals(userName))) {
                    System.out.println("Your account information is correct. ");
                    break;

                }
            }
        }
        String newName, newPassword;
       // if our loop works for 3 times we will ask the user to change its account data.
        if (i >= chances) {
            System.out.println("You've entered your account information wrong for 3 times, please reset your account data! " +
                    "Please choose your new password and if necessary new username : ");
            // do-while loop will help us when we enter the same data and won't stop asking until we change it.
            do {
                newName = input.nextLine().trim();
                newPassword = input.nextLine().trim();

                System.out.println("Input received.");
                if (newName.equals(loginName) && newPassword.equals(loginPassword)) {
                    System.out.println("Please do not use the same account information! ");

                } else {
                    System.out.println("Congrats your account data successfully changed! " + " " +
                            "New username : " + " " + newName + " " + "New Password : " + " " + newPassword);
                }
            }while((newName.equals(loginName) && newPassword.equals(loginPassword)));
            input.close();
        }


    }

}



