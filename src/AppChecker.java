public class AppChecker {
    public static void main(String[] args) {
        AndroidApp android = new AndroidApp("calculator");
        IphoneApp iphone = new IphoneApp("dbz");
        android.appInfo();
        android.runAndroidApp();
        iphone.runIphoneApp();
        iphone.appInfo();

    }
}
