package demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadSerialized  {

	public static void main(String[] args) {
		System.out.println("=============================================");
		System.out.println("Deserializing the shapes array.");
		Shape[] shapes = null;
		File file = new File("Shapes.ser");
		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object obj = ois.readObject();
			if(obj instanceof Shape[]) {
				shapes = (Shape[]) obj;
				for (Shape shape : shapes) {
					System.out.println(shape);
				}
			} else {
				System.out.println("Deserialized object was not a Shape[]");
			}
			ois.close();
			System.out.println("Shapes array was deserialized from " + file.getAbsolutePath());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
