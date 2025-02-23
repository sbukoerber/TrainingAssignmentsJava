package Q1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

class FileUtil {
    public static List<String> readFiles(String Filename) {
        List<String> files = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(Filename))) {
            String line = null;
            while ((line = br.readLine()) != null) {
                files.add(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return files;
    }
}

class DownloadManager {
    public static void download(String url){
        System.out.println(Thread.currentThread().getName()+" is starting download "+ url);
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" is done download "+ url);
    }
}
public class FileDownload {
    public static void main(String[] args) {
        List<String> urls=FileUtil.readFiles("link.txt");

        for(String url: urls){
            new DownloadManager().download(url);
        }
    }
}