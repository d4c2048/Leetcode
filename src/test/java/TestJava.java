import org.junit.Test;
import pojo.Programmer;

import java.util.HashSet;

/**
 * @author Lee
 * @since 2022/7/11 14:40
 */
public class TestJava {

    @Test
    public void testProgrammer() {
        Programmer programmer1 = new Programmer("李华", 23);
        Programmer programmer2 = new Programmer("李华", 23);
        System.out.println("programmer1 == programmer2 ? =======> " + (programmer1 == programmer2));
        System.out.println("programmer1.equals(programmer2) ? =======> " + (programmer1.equals(programmer2)));
        System.out.println("programmer1.hashCode() == programmer2.hashCode() ? =======> " + (programmer1.hashCode() == programmer2.hashCode()));
        HashSet<Programmer> set = new HashSet<>();
        set.add(programmer1);
        set.add(programmer2);
        System.out.println("set.size() =======> " + set.size());

    }

}
