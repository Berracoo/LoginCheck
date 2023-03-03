import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // determining our account information
      String loginName = "Coochie Coo";
      String loginPassword = "Wxct45.4@g";
      // asking user to give us inputs
      Scanner input = new Scanner(System.in);
      System.out.print("Please enter the user name that you are registered : ");
      String userName = input.nextLine();
        System.out.println("****************************");
        System.out.print("Please enter your password that is registered in the system : ");
        String userPassword = input.nextLine();
        System.out.println("****************************");
        // equals questions if the first given object equals to the one in the bracket
        if(loginName.equals(userName) && !(loginPassword.equals(userPassword))){
            System.out.println("Your username is correct unlike your password, please try again! ");
        }else if(!(loginName.equals(userName)) && loginPassword.equals(userPassword)){
            System.out.println("Please check your username again.");
        }else if (loginName.equals(userName) && loginPassword.equals(userPassword)){
            System.out.println("Successfully login! ");

        }else{
            System.out.println("Would you like to reset your account data ?" );
            String newName,newPassword;
            System.out.print("Choose your new password and if necessary new username : " );
            newName = input.nextLine();
            newPassword = input.nextLine();
            if( newName.equals(loginName) && newPassword.equals(loginPassword)){
                // to avoid user from choosing same account information we use do-while it will stop once they different
                do {
                    System.out.println("Please do not choose the same account information ! ");
                }while(newName.equals(loginName) && newPassword.equals(loginPassword));

            }else{
                System.out.println("Account Information Successfully Changed! ");
                loginName = newName;
                loginPassword = newPassword;
                System.out.println("Updated account information => " + "Username : " + loginName + " " + "User Password : " +
                        loginPassword);
            }

        }

    }
}