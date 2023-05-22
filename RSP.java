import java.util.*;  
public class RPS {
    public static void main (String[] args) {
        String[] options = new String[]{"rock","paper","scissor"};
        Scanner sc= new Scanner(System.in);
        System.out.println("Select a option among rock, paper and scissor:");  
        String userInput= sc.nextLine();
        int random = (int )(Math.random() * 3 );
        String computerInput =  options[random];
        boolean validOption = false;
        for ( int i = 0 ; i < options.length ; i++ ) {
            if (userInput.toLowerCase().equals(options[i])) {
                validOption = true;
                break;
            }
        }
        if (!validOption) {
            System.out.println("Please enter a valid option");
            return;
        }
        if ( userInput.toLowerCase().equals("rock") ) {
             if ( computerInput.equals("paper") ) {
                System.out.println("computer selected: "+computerInput);       
                System.out.println("computer won! better luck next time");
            } else if ( computerInput.equals("rock") ) {
                System.out.println("computer selected: "+computerInput);
                System.out.println("its a tie!");
            } else {
                 System.out.println("computer selected: "+computerInput);
                System.out.println("user won!!!");
            }
        } else if ( userInput.toLowerCase().equals("paper") ) {
            if ( computerInput.equals("scissor") ) {
                System.out.println("computer selected: "+computerInput);       
                System.out.println("computer won! better luck next time");
            } else if ( computerInput.equals("paper") ) {
                System.out.println("computer selected: "+computerInput);
                System.out.println("its a tie!");
            } else {
                 System.out.println("computer selected: "+computerInput);
                System.out.println("user won!!!");
            }
        } else {
            if ( computerInput.equals("paper") ) {
                System.out.println("computer selected: "+computerInput);       
                System.out.println("computer won! better luck next time");
            } else if ( computerInput.equals("scissor") ) {
                System.out.println("computer selected: "+computerInput);
                System.out.println("its a tie!");
            } else {
                 System.out.println("computer selected: "+computerInput);
                System.out.println("user won!!!");
            }
        }   
       
    } 
}
