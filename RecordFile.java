package vehicleregistrationfx;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import vehicleregistrationfx.PrivateOwner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 *
 * @author admin
 */
public class RecordFile {
    public static void writeToFile(PrivateOwner ownerprivate) throws FileNotFoundException, IOException{
        FileOutputStream fileOutputstream = new FileOutputStream("private.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputstream);
        objectOutputStream.writeObject(ownerprivate.toString());
        objectOutputStream.flush();
        objectOutputStream.close();
        fileOutputstream.close();
        
        
        }
    public static PrivateOwner readFromFile() throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream fileInputstream = new FileInputStream("private.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputstream);
        return (PrivateOwner) objectInputStream.readObject();
    }
}

