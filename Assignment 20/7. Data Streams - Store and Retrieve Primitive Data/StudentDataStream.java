import java.io.*;

public class StudentDataStream {
    public static void main(String[] args) {
        String fileName = "students.dat";
        writeStudentData(fileName);
        readStudentData(fileName);
    }

    private static void writeStudentData(String fileName) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            dos.writeInt(101);
            dos.writeUTF("Alice");
            dos.writeDouble(3.9);

            dos.writeInt(102);
            dos.writeUTF("Bob");
            dos.writeDouble(3.7);

            dos.writeInt(103);
            dos.writeUTF("Charlie");
            dos.writeDouble(3.8);

            System.out.println("Student data written successfully.");
        } catch (IOException e) {
            System.err.println("Error writing student data: " + e.getMessage());
        }
    }

    private static void readStudentData(String fileName) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            System.out.println("\nReading Student Data:");
            while (dis.available() > 0) {
                int rollNo = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();
                System.out.println("Roll No: " + rollNo + ", Name: " + name + ", GPA: " + gpa);
            }
        } catch (IOException e) {
            System.err.println("Error reading student data: " + e.getMessage());
        }
    }
}
