package Assignment5.src;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// this is a classic operations that is done by object serialization operation
// also to deserialize the object that is serialized before

class Person implements Serializable {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
public class Test6 {

    public static void main(String[] args) {
        
        Person person = new Person("Logesh", 25);

        
        serializeObject(person, "person.ser");

        
        Person deserializedPerson = (Person) deserializeObject("person.ser");

        
        System.out.println("Deserialized person:");
        System.out.println("Name: " + deserializedPerson.getName());
        System.out.println("Age: " + deserializedPerson.getAge());
    }

    private static void serializeObject(Object obj, String fileName) {
        try {
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(obj);
            objectOut.close();
            System.out.println("Serialized object saved as " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Object deserializeObject(String fileName) {
        Object obj = null;
        try {
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            obj = objectIn.readObject();
            objectIn.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return obj;
    }

}






