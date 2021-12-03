public class JavaClasss {
    public String done;
    public String description;



    public String getDone() {
        return done;
    }

    public void setDone(String done) {
        this.done = done;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "JavaClasss{" +
                "done='" + done + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
