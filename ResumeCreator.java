import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ResumeCreator {

    public static void main(String[] args) {
        String fileName = "resume.doc";
        
        // Student data
        String name = "John Doe";
        String objective = "To secure a challenging position in a reputable organization to expand my learnings, knowledge, and skills.";
        String skillSet = "C,C++";
        String projectTitle = "Project Title Example";
        String projectDescription = "This project aims to develop a software application that automates the process of managing student records.";
        
        try {
            // Create a FileWriter object
            FileWriter fileWriter = new FileWriter(fileName);
            
            // Create a BufferedWriter object
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            
            // Writing student data to the file
            bufferedWriter.write("Name: " + name);
            bufferedWriter.newLine(); // New line
            bufferedWriter.write("Objective: " + objective);
            bufferedWriter.newLine(); // New line
            bufferedWriter.write("SkillSet: " + skillSet);
            bufferedWriter.newLine(); // New line
            bufferedWriter.write("Project Title: " + projectTitle);
            bufferedWriter.newLine(); // New line
            bufferedWriter.write("Project Description: " + projectDescription);
            
            System.out.println("Resume has been created successfully.");
            
            // Closing BufferedWriter and FileWriter
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
