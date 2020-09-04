import com.sun.xml.internal.xsom.XSUnionSimpleType;

import java.util.*;

public class SocialNetworkRunner {
    Map<String, Set<String>> map = new HashMap<>();

    public SocialNetworkRunner(String pathName) {
        List<String> input = ReadFile.read(pathName);
        for (String line : input) {
            String[] strArr = line.split(": ");
            if (strArr.length == 1) {    // no friend at all
                map.put(strArr[0], new HashSet<>());
                continue;
            }
            String[] friends = strArr[1].split(", |\\.");
            Set<String> friendsSet = new HashSet<>();
            for (String friend : friends) {
                friendsSet.add(friend);
            }
            map.put(strArr[0], friendsSet);
        }
    }

    public String mostFriends() {
        int most = 0;
        String mostName = "";
        for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
            if (entry.getValue().size() > most) {
                most = entry.getValue().size();
                mostName = entry.getKey();
            }
        }
        return mostName;
    }

    public int friendsInCommon(String name1, String name2) {
        if (!map.containsKey(name1) || !map.containsKey(name2)) {
            return -1;
        }
        int count = 0;
        Set<String> oneFriends = map.get(name1);
        Set<String> twoFriends = map.get(name2);
        if (twoFriends.size() == 0) {
            return 0;
        }
        for (String twoF : twoFriends) {
            if (oneFriends.contains(twoF)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        SocialNetworkRunner sol = new SocialNetworkRunner("fwdwaiverexamcit591/friends1.txt");
        System.out.println(sol.mostFriends());
        System.out.println(sol.friendsInCommon("Snoopy", "Linus"));
        List<String> list = new ArrayList<>();
        for (String  str : list) {
            System.out.println(str);
        }

    }
}
