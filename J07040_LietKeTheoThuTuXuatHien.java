import java.io.*;
import java.util.*;

public class J07040_LietKeTheoThuTuXuatHien {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        List<String> nhiPhans =  (ArrayList<String>) ois.readObject();
        ois.close();

        Set<String> nhiPhansSet = new HashSet<>();
        for(String nhiPhan : nhiPhans) {
            StringTokenizer st = new StringTokenizer(nhiPhan);
            while(st.hasMoreTokens()) {
                String word = st.nextToken().toLowerCase().trim();
                nhiPhansSet.add(word);
            }
        }

        BufferedReader br = new BufferedReader(new FileReader("VANBAN.in"));
        List<String> vanBans = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line.trim());
            while (st.hasMoreTokens()) {
                String word = st.nextToken().toLowerCase();
                vanBans.add(word);
            }
        }
        Set<String> printed = new HashSet<>();
        for(String vanBan : vanBans) {
           if(!printed.contains(vanBan)) {
               if(nhiPhansSet.contains(vanBan)) {
                   System.out.println(vanBan);
               }
               printed.add(vanBan);
           }
        }
    }
}
