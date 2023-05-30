public class FileReader{

  public static String path(String dir){

    if(Utilities.getOS() == Utilities.OperatingSystem.Windows){
      return dir;
    }else{
      return dir.replace("/","//");
    }
  }
}
