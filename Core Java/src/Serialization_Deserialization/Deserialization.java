package Serialization_Deserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
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


public class Deserialization
{
	public static void main(String[] args) {
        Student s = null;

        try {
            FileInputStream fileIn = new FileInputStream("C:\\Users\\ADITYA\\Desktop\\FileStream\\Serialization.txt");

            ObjectInputStream in = new ObjectInputStream(fileIn);
            s = (Student) in.readObject();
            in.close();
            fileIn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Deserialized Student:");
        System.out.println("ID: " + s.id);
        System.out.println("Name: " + s.name);
    }

}
