import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import strings.BasicStringOps;

public class BasicStringOpstest {

    private BasicStringOps basicStringOps;
    @Before
    public void setUp(){
        basicStringOps = new BasicStringOps();
    }

    @Test
    public void testCopyString(){
        char[] source = {'T','e','s','t'};
        char[] destination = new char[source.length];
        destination = basicStringOps.copyString(source,destination);
        System.out.println(destination);
    }

    @Test
    public void testCheckPangram(){
        Assert.assertTrue(basicStringOps.chackPangram("The quick brown fox jumps over the lazy dog"));
        Assert.assertFalse(basicStringOps.chackPangram("The quick brown fox jups over the lazy dog"));
    }

    @Test
    public void testMissingCharachters(){
        System.out.println(basicStringOps.missingLetters("The quick brown fox jumps over the lazy dog"));
        System.out.println(basicStringOps.missingLetters("The quick brown fox jups over the lazy dog"));
    }
}
