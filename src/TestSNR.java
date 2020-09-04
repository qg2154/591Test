import org.junit.Test;
import static org.junit.Assert.*;
public class TestSNR {
    @Test
    public void test() {
        SocialNetworkRunner test = new SocialNetworkRunner("fwdwaiverexamcit591/friends.txt");
        String largest = test.mostFriends();
        int commonCount = test.friendsInCommon("Snoopy", "Charlie");
        assertEquals(commonCount, 1);
        assertEquals(largest, "Charlie");

        SocialNetworkRunner test1 = new SocialNetworkRunner("fwdwaiverexamcit591/friends1.txt");
        String largest1 = test1.mostFriends();
        int commonCount1 = test1.friendsInCommon("Snoopy", "WoodStock");  //empty friend list
        int commonCount1a = test1.friendsInCommon("Snoopy", "Snoopy");   //compare with itself
        int commonCount1b = test1.friendsInCommon("Snoopy", "Manning");   //the name not exist, return -1
        assertEquals(commonCount1, -1);
        assertEquals(commonCount1a, 3);
        assertEquals(commonCount1b, -1);
        assertEquals(largest1, "Charlie");
    }
}
