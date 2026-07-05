import java.util.ArrayList;

import java.util.List;

public class User  {

    
        List<Habit> habits=new ArrayList<>();
        List<Studytopic>todaytopics=new ArrayList<>();

       public void addHabit(Habit habit){
           this.habits.add(habit);
        }
       public void addStudytopic(Studytopic sd){
            this.todaytopics.add(sd);
        }
       public void deleteHabit(int i){
            if (i >= 1 && i <= habits.size()) {
            this.habits.remove(i-1);}
            else{
                System.out.println("invalid habit");
            }
        }
       public void deleteTopic(int i){
            if (i >= 1 && i <= todaytopics.size()) {
            this.todaytopics.remove(i-1);
        }
        else{
            System.err.println("invalid topic");
        }}
       public void markupHabit(int i){
            if (i >= 1 && i <= habits.size()) {
            Habit h=habits.get(i-1);
            h.markCompleted();}
            else{
                System.out.println("Invalid to markup");
            }
        }
       public void markupTopic(int i){
            if (i >= 1 && i <= todaytopics.size()) {
            Studytopic s= todaytopics.get(i-1);
            s.markCompleted();}
            else{
                System.out.println("Invalid to markup");
            }
        }
       public void display(){
            if(habits.isEmpty()){
                System.out.println("No habits are added");
            }else{
                System.out.println("===== Today's Habits ======");
            for (Habit h : habits) {
                      System.out.println(h);
                }}
            if(todaytopics.isEmpty()){
                System.out.println("No studytopics are added");
            }
            else{
                System.out.println("====== Today's Topics ======");
                for(Studytopic s: todaytopics)
            System.out.println(s);}
        }


    
}
