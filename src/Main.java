import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        PhoneList list = new PhoneList();
        list.addPhone("8 903 787-54-21","Senya");
        list.addPhone("8 903 787-54-21","Senya");
        list.addPhone("8 903 187-34-25","Tanya");
        list.addPhone("8 903 337-54-15","Vanya");
        list.addPhone("8 408 187-00-25","Sanya");
        list.addPhone("8 203 187-54-25","Manya");
        list.addPhone("8 903 187-00-75","Senya");
        list.addPhone("8 903 187-54-25","Maya");
        list.addPhone("8 903 187-54-85","Tanya");
        list.addPhone("8 903 300-54-25","Sanya");
        list.addPhone("8 903 187-54-07","Senya");
        list.addPhone("8 408 187-77-90","Sanya");
        list.findPhone("Senya");
        list.findPhone("Tanya");
        }

    }




