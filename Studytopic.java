public class Studytopic {
     private String topic;
     private boolean status;
         public Studytopic( String name){
            this.topic=name;
            this.status=false;
        }
       public Studytopic(String name,boolean status){
            this.topic=name;
            this.status=status;

}
 @Override
        public String toString(){
            return topic+" "+(status?"[√]" : "[X]");
        }
        public void markCompleted() {
    status = true;
}
}
