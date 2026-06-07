package Serialization_Deserialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable 
{
    int id;
    String name;

    // Constructor
    public Student(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
}


public class Serialization
{
    public static void main(String[] args)
    {
        Student s = new Student(1, "Alice");

        try 
        {
            FileOutputStream fileOut = new FileOutputStream("C:\\Users\\ADITYA\\Desktop\\FileStream\\Serialization.txt");
            
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            
            out.writeObject(s);
            
            out.close();
            
            fileOut.close();
            
            System.out.println("Serialized data is saved in Serialization.txt");
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
