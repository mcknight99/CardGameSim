import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Goodbye World!");
        //VSCode Extension Pack for Java
        //oracle linux 9.1 distro from F1 > WSL > Connect to WSL
        //java oracle jdk https://docs.oracle.com/en/java/javase/21/install/installation-jdk-microsoft-windows-platforms.html#GUID-BCE568C9-93D3-49F4-9B0C-9DD4A3419792
        //update include path in windows to the jdk bin
        //reboot
        //double check versions
            // java --version & javac --version
            ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            HashMap<Character, Integer> myMap = new HashMap<>();
            char myChar = 'x';
            int piecesLeft = 12;
            myMap.put(myChar, piecesLeft);

            int getPiecesLeft = myMap.get('x');
            System.out.println(getPiecesLeft);
    }

}
