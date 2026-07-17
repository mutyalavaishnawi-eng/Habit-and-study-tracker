
    import java.util.ArrayList;
    import java.util.Scanner;

public class Tracker   {
    static ArrayList<User> users = new ArrayList<>();
        static User person;
        public static User findUser(String username) {

    for (User u : users) {
        if (u.getUserName().equalsIgnoreCase(username)) {
            return u;
        }
    }

    return null;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String Username;
        int choice;
        do{
            System.out.println("1.Register");
            System.out.println("2.login");
            System.out.println("3.exit");
            System.out.println("Enter the choice:");
            choice=sc.nextInt();
            switch(choice){
                case 1: System.out.print("Enter username: ");
                  sc.nextLine();              // consume the newline left by nextInt()
                    Username = sc.nextLine();

                         User u = findUser(Username);

                    if (u == null) {
              person = new User(Username);
           users.add(person);
            System.out.println("Registration Successful!");
          tracker(sc);
            } else {
           System.out.println("User already exists. Please Login.");
        }
        break;
        case 2:
            System.out.print("Enter username: ");
             sc.nextLine();
              Username = sc.nextLine();

           person = findUser(Username);

           if (person != null) {
            System.out.println("Welcome back " + person.getUserName());
             tracker(sc);
        } else {
           System.out.println("User not found. Please register first.");
       }
         break;
         case 3:System.out.println("Thank you for using the app");
                    break;
    
            }

        }while(choice!=3);
       
       
       
    }
   public static void tracker(Scanner sc){
    String name;
    int choice;
    System.out.println("============Habit && Study tracker==========");
            System.out.println("welcome to the tracker:");
            System.out.println("1.Add your Habits");
            System.out.println("2.Add your todays study topics");
            System.out.println("3.see todays schedule");
            System.out.println("4.Delete your habit");
            System.out.println("5.Delete your Study topic");
            System.out.println("6.markup habit");
            System.out.println("7.markup study");
            System.out.println("8.logout");
            
            do{
             System.err.println("Enter Choice:");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:System.out.println("Enter the habit name:");
                      name=sc .nextLine();
                      addH(name);
                      break;
                case 2:System.out.println("Enter the topic name:");
                             name=sc.nextLine();
                             addS(name); 
                              break;
                case 3:  person.display() ;  
                         break;          
                case 4:System.out.println("Enter the habit number:");
                        int n=sc.nextInt();
                        person.deleteHabit(n);
                         break;
                case 5:System.out.println("Enter the topic number:");
                        int ni=sc.nextInt();
                        person.deleteTopic(ni);
                         break;
                case 6:System.out.println("Enter the habit number:");
                        int nr=sc.nextInt();
                        person.markupHabit(nr);
                         break;
                case 7:System.out.println("Enter the topic number:");
                         int nf=sc.nextInt();
                         person.markupTopic(nf);
                          break;
                case 8:break;
                default:System.out.println("Invalid choice please try again");

            }

        }while(choice!=8);
    }
     static void addH(String  name ){
        Habit one =new Habit(name);
        person.addHabit(one);
    }
   static void addS(String name){
        Studytopic one= new Studytopic(name);
        person.addStudytopic(one);

   }
        }


