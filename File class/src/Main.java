import java.io.File;

public class Main {
    public static void main(String[] args) {
// file = An abstract representation of file and directory path names
File file =new File("secret_message.txt");
//you can use file location path of file
if(file.exists()){
    System.out.println("File exists");
    System.out.println(file.getPath());
    System.out.println(file.getAbsolutePath());
    System.out.println(file.isFile());
//    file.delete();
}
else {
    System.out.println("File not available");
}
    }
}