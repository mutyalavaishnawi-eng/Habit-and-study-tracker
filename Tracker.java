import java.util.Scanner;

public class Tracker   {
      static User person=new User();
    public static void main(String[] args) {
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
            System.out.println("8.Exit");
            Scanner sc=new Scanner(System.in);
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
                case 8:System.out.println("Thank you for using the Habit&Study Tracker");
                         break;
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
