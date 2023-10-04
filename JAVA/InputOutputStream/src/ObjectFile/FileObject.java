package ObjectFile;

import java.io.File;

public class FileObject {
    public static void main(String[] args) {
        File file = new File("MyBufferReaderClass");
        System.out.println(file.exists());

        File file1 = new File("D:\\JAVA\\InputOutputStream\\src\\BufferReader","MyBufferReaderClass.java");
        System.out.println(file1.exists());

        File file2 = new File("D:\\JAVA\\InputOutputStream\\src");
        System.out.println(file2.exists());
        System.out.println("Is Directory ="+file2.isDirectory());

        File file3 = new File(file2,"MyBufferReaderClass.java");
        System.out.println(file1.exists());

        File file6 = new File(file2,"MyBufferReaderClass.java");
        File file5 = new File("D:\\JAVA\\InputOutputStream\\src\\BufferReader","MyBufferReaderClass.java");
        System.out.println("Is Absolute ="+file5.isAbsolute());

        System.out.println(file6.getAbsoluteFile());
        System.out.println(file5.getAbsolutePath());
        System.out.println("Is File = "+file5.isFile());
        System.out.println("Can Execute ="+file5.canExecute());
        System.out.println("Can Execute ="+file3.canExecute());
        System.out.println("Can Execute ="+file2.canExecute());

        File file7 = new File("D:\\JAVA\\InputOutputStream\\src\\BufferReader","abc.java");
        file7.deleteOnExit();
        System.out.println("IS File = "+file7.isFile());

        System.out.println("get path ="+file5.getPath());
        System.out.println("Parant file ="+file5.getParentFile());
        System.out.println("Read file ="+file5.canRead());
        System.out.println("write file ="+file5.canWrite());

        System.out.println("get path ="+file6.getPath());
        System.out.println("Parant file ="+file6.getParentFile());
        System.out.println("Compare the file ="+file5.compareTo(file7));
//        System.out.println("Set last modified date ="+file5.setLastModified(Double.doubleToLongBits(18082023)));
        System.out.println("Get last modified date ="+file7.lastModified());



        String[] array= file2.list();
        for(String string:array){
            System.out.println("String array= "+string);
        }

        File []array1=file2.listFiles();
        for(File string1:array1){
            System.out.println("Array of objects(File class) = "+string1);
        }

    }
}