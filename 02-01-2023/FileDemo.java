import java.io.*;
public class FileDemo {
    public static void main(String[] args) {
        File f = new File("F:/cseb_5a9/02-01-2023", "target.txt");
        System.out.println("Name of file " + f.getName());
        System.out.println("parent name : " + f.getParent());
        System.out.println("relative path: " + f.getPath());
        System.out.println("absolute path: "+ f.getAbsolutePath());
        System.out.println("file is " + (f.exists()?"available":"not available"));
        System.out.println("file is " + (f.canRead()?"readable":"not readable"));
        System.out.println("file can "+(f.canWrite()?"write":"not write"));
        System.out.println("file "+f.isFile());
        System.out.println("file directory: " + f.isDirectory());
        System.out.println("modifier " + f.lastModified());
        System.out.println("file length: "+ f.length());
        System.out.println("delete " + f.delete());
        //System.out.println("file rename " + f.renameTo());
        System.out.println("hidden "+ f.isHidden());
        System.out.println("readonly " + f.setReadOnly());
         f.deleteOnExit();
         System.out.println("total space "+ f.getTotalSpace());
        System.out.println("free space "+ f.getFreeSpace());
        System.out.println("usable space "+ f.getUsableSpace());
    }
}
