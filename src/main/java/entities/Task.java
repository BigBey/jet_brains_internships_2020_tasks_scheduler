package entities;

public class Task {

    private String message;
    private Boolean completed;

    public Task(String message) {
        this.message = message;
        this.completed = false;
    }

    public Task(String message, Boolean completed) {
        this.message = message;
        this.completed = completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public Boolean getCompleted() {
        return completed;
    }

    @Override
    public String toString() {
        return message;
    }
}
