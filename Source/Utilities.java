public class Utilities {
      public enum OperatingSystem {
          Windows, Linux, macOS
      };

    private static OperatingSystem operatingSystem = null;

    public static OperatingSystem getOS() {
        if (operatingSystem == null) {
            String operSys = System.getProperty("os.name").toLowerCase();
            if (operSys.contains("win")) {
                operatingSystem = OperatingSystem.Windows;
            } else if (operSys.contains("nix") || operSys.contains("nux")
                    || operSys.contains("aix")) {
                operatingSystem = OperatingSystem.Linux;
            } else if (operSys.contains("mac")) {
                operatingSystem = OperatingSystem.macOS;
            }
        }
        return operatingSystem;
    }
}
