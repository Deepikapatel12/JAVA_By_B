package com.example.io;

import com.example.bean.Student;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadStudentData {
    //create a method readData with accept a parameter filename of type string and returns an array of studnts
    public Student[] readData(String fileName) throws IOException {
        Student[] studentData = null;
        //create array = size? count number of lines
        File file = new File(fileName);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line = bufferedReader.readLine();
        int count = 0;
        while(line != null){
            line = bufferedReader.readLine();
            count++;
        }
        studentData = new Student[count];
        //read data form file, add objects of student to array
        bufferedReader = new BufferedReader(new FileReader(file));
        line = bufferedReader.readLine(); //reading the header
        int indexOfStudentData = 0;
         while(line!= null) {
             if (line != null) {
                 String[] split = line.split(",");
                 Student student = new Student();
                 student.setName(split[0]);
                 student.setRollNo(Integer.parseInt(split[1]));
                 student.setEmail(split[2]);
                 student.setMobile(split[3]);
                 student.setRank(Integer.parseInt((split[4])));

                 studentData[indexOfStudentData] = student;
                 indexOfStudentData++;
             }
         }
        return studentData;
    }
}
