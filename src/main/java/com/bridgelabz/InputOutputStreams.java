package com.bridgelabz;

import java.io.File;
import java.io.IOException;

public class InputOutputStreams {
    public static void main(String[] args) {
        createFile();
        getFileInformation();
       // writingToFile();
        //readFile();
    }

    private static void createFile() {
        File file=new File("C:\\Users\\JJadhao\\IdeaProjects\\untitled\\EmployeePayRolll\\src\\test.txt");
        try{
            if(file.createNewFile()){
                System.out.println("file created "+file.getName());
            }
            else {
                System.out.println("file exist"+file.getName());
            }
        }catch (IOException e){
            System.out.println("error is "+e);

        }
    }

    private static void getFileInformation() {
        File file1 = new File("C:\\Users\\JJadhao\\IdeaProjects\\untitled\\EmployeePayRolll\\src\\test.txt");
        if (file1.exists()) {
            System.out.println("File name " + file1.getName());
            System.out.println("Readable " + file1.canRead());
            System.out.println("Writable " + file1.canWrite());
            System.out.println("Excecutable " + file1.canExecute());
            System.out.println("Absolute path " + file1.getAbsolutePath());
            System.out.println("path " + file1.getPath());
            System.out.println("path " + file1.length());
        }
    }
}












