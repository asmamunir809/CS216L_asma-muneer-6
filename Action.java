/** Stores one user action so it can be undone later. */
public class Action {
    public enum Type { ADD, DELETE }

    Type type;
    Task task;      // the task that was added or deleted
    int index;      // position of the task in the list (needed to restore a delete)

    public Action(Type type, Task task, int index) {
        this.type = type;
        this.task = task;
        this.index = index;
    }
}