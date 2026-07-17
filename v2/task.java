  public abstract class task {
    
    protected String name;
    protected boolean status;

    public task(String name) {
        this.name = name;
        this.status = false;
    }
    public task(String name,boolean status){
        this.name=name;
        this.status=status;
    }
    public void markCompleted() {
        status = true;
    }

    @Override
    public String toString() {
        return name + " " + (status ? "[√]" : "[X]");
    }
}

