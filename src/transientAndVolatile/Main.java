package transientAndVolatile;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        User user = new User("Harish" , "Test");

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("user.ser"));
        out.writeObject(user);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("user.ser"));
        User savedUser = (User) in.readObject();
        in.close();
        System.out.println(savedUser.password);
        System.out.println(savedUser.username);

    }
}
