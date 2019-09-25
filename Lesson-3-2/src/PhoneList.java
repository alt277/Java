import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.sun.javafx.css.StyleCache;
import java.security.Key;
import java.util.*;
public class PhoneList {

         private HashMap<String, String> phones = new HashMap<String, String>();

         public void addPhone(String phone, String name) {
             phones.put(phone, name);
         }

         public void findPhone(String name) {
             for (Map.Entry<String, String> e : phones.entrySet()) {
                 if (e.getValue().equals(name)) {
                     System.out.println(e.getValue() + " " + e.getKey());
                 }
             }
         }

     }


