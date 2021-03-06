package TaskHandler;

import java.io.Serializable;
import java.time.LocalDate;


    public class TodoTask implements Serializable {

        /** Attributes for the task - title, duedate,taskstatus,projectname */

        private String taskTitle;
        private LocalDate dueDate;
        private String taskStatus;
        private String projectName;


        /** Constructor created with parameters - creates a new Task item
         * @param taskTitle
         * @param dueDate
         * @param taskStatus
         * @param projectName
         */

        public TodoTask(String taskTitle, LocalDate dueDate, String taskStatus, String projectName) {
            this.taskTitle = taskTitle.trim();
            this.dueDate = dueDate;
            this.taskStatus = taskStatus.trim();
            this.projectName = projectName.trim();
        }


        public String getTaskTitle() {
            return taskTitle;
        }

        public void setTaskTitle(String taskTitle) {
            this.taskTitle = taskTitle;
        }

        public LocalDate getDueDate() {
            return dueDate;
        }

        public void setDueDate(LocalDate dueDate) {
            this.dueDate = dueDate;
        }

        public String getTaskStatus() {
            return taskStatus;
        }

        public void setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
        }

        public String getProjectName() {
            return projectName;
        }

        public void setProjectName(String projectName) {
            this.projectName = projectName;
        }
    }

