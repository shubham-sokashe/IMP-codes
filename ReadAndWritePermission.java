package IOPackage;


// write java code to check weather file/directory has read and write permission or not

import java.io.File;

public class ReadAndWritePermission {
    public static void main(String[] args) {
        File directoryToCheck = new File("E:\\JAVA\\JAVA Source Code in NOTEPAD\\MethodCalling.java");
        if(directoryToCheck.canRead()){
            System.out.println("File is readable");
        }
        if(directoryToCheck.canWrite())
            System.out.println("file is writeable");
        if(directoryToCheck.canExecute())
            System.out.println("file is executable");
    }
}
