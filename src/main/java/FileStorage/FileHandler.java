package FileStorage;

import TaskHandler.TodoTask;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


    public class FileHandler implements Serializable {
        private List<TodoTask> tasks = new ArrayList<TodoTask>();

        /**
         *  Method to write the tasks to the file
         */
        public void taskWriteToFile() {
            try {
                FileOutputStream file_output_stream = new FileOutputStream("/Users/neetha/IdeaProjects/TodoListApp/src/main/resources/File.txt");
                ObjectOutputStream output_stream = new ObjectOutputStream(file_output_stream);
                for (TodoTask writeTasks : tasks) {
                    output_stream.writeObject(writeTasks);
                }
                output_stream.close();
                file_output_stream.close();
            } catch (EOFException eof_exception) {
                System.out.println("No tasks to be displayed");
            } catch (FileNotFoundException fnf_Exception) {
                System.out.println("The file is not available to write the tasks");
            } catch (IOException io_exception) {
                System.out.println("Unexpected error occured");
                io_exception.printStackTrace();
            }

        }

        /** Method to read the tasks from the file and load the tasks to the array
         * @return Task object
         */
        public List<TodoTask> taskLoadToArray() {
            System.out.println();
            System.out.println();
            try {
                FileInputStream file_input_stream = new FileInputStream("/Users/neetha/IdeaProjects/TodoListApp/src/main/resources/File.txt");
                ObjectInputStream input_stream = new ObjectInputStream(file_input_stream);
                Object obj = null;
                while (file_input_stream.available() > 0) {
                    obj = input_stream.readObject();

                    TodoTask readtask = (TodoTask) obj;
                    tasks.add(readtask);
                }
                input_stream.close();
                file_input_stream.close();

            } catch (ClassNotFoundException cnf_exception) {
                System.out.println("The class not found");
            } catch (EOFException eof_exception) {
                System.out.println("No tasks to be displayed");
            } catch (FileNotFoundException fnf_Exception) {
                System.out.println("The file is not available to read the task.");
            } catch (IOException io_exception) {
                System.out.println("Unexpected error occured");
                io_exception.printStackTrace();
            }
            System.out.println();
            return tasks;

        }


    }





