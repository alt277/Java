import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        PhoneList list = new PhoneList();
        list.addPhone("8 903 787-54-21","Senya");
        list.addPhone("8 903 187-34-25","Tanya");
        list.addPhone("8 703 337-54-15","Vanya");
        list.addPhone("8 408 187-00-25","Sanya");
        list.addPhone("8 203 187-54-25","Manya");
        list.addPhone("8 903 187-00-75","Senya");
        list.addPhone("8 903 187-54-25","Maya");
        list.addPhone("8 903 187-54-85","Tanya");
        list.addPhone("8 903 300-54-25","Sanya");
        list.addPhone("8 903 187-54-27","Senya");
        list.findPhone("Senya");
        list.findPhone("Tanya");

        PhoneList2 list2 = new PhoneList2();
        list2.addPhone("Anya","8 903 187-34-25");
        list2.addPhone("Anya","8 103 187-04-27");
        list2.addPhone("Anya","8 978 187-24-21");
        list2.addPhone("Tanya","8 903 007-27-91");
        list2.addPhone("Tanya","8 978 187-277-11");
        list2.findPhone("Anya");

        }

    }




