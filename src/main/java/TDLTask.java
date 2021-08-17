/**
 *  This class encapsulates a Task element in Duke's TDList, and features
 *  various methods to manipulate the Task.
 */
public class TDLTask {
    private String taskName;
    private boolean isDone;

    public enum TaskType {
        NONE,
        TODO,
        EVENT,
        DEADLINE
    }

    /**
     * A constructor used to create a new TDLTask.
     *
     * @param taskName      The name and description of the task.
     */
    public TDLTask(String taskName) {
        this.taskName = taskName;
        this.isDone = false;
    }

    /**
     * Sets the current task as finished.
     */
    public void setAsDone() {
        isDone = true;
    }

    /**
     * Checks whether the task is finished.
     *
     * @return true if finished, false if undone.
     */
    public boolean isTaskDone() {
        return isDone;
    }

    /**
     * Gets the name/description of the task.
     *
     * @return the name/description of the task.
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * Gets the name/description of the task, as well as whether it is done
     * neatly formatted in one line.
     *
     * @return the String containing the line describing the task.
     */
    public String getLineOfTaskInfo() {
        String doneCheckboxStr = "";
        if (isDone) {
            doneCheckboxStr = "[X]";
        } else {
            doneCheckboxStr = "[ ]";
        }

        String returnThis = doneCheckboxStr + " " + this.getTaskName();

        return returnThis;
    }

    /**
     * Gets the type of the Task in enum form.
     *
     * @return the enum representing the type of the current task.
     */
    public TaskType getTaskType() {
        return TaskType.NONE;
    }


}