import java.io.File;
public class FileDirectory {
    public void priPath(File file , String pre){
        if(file.isFile() || file.listFiles().length == 0){
            System.out.println(pre+file.getName());
            return;
        }
        System.out.println(pre+file.getName());
        for (File f:file.listFiles()
             ) {
            priPath(f,pre+"-");

        }

    }
    public static void main(String[] argus) {
        FileDirectory FD = new FileDirectory();
        FD.priPath(new File("/Users/tianlinzhao/Documents/work/test"),"");


    }

}
