
    public class Habit {
       private String name;
        private boolean status;
        public Habit( String name){
            this.name=name;
            this.status=false;
        }
        public Habit(String name,boolean status){
            this.name=name;
            this.status=status;
        }
         @Override
        public String toString(){
            return name+" "+(status?"[√]" : "[X]");
        }
        public void markCompleted() {
            this.status = true;
        }
    }
