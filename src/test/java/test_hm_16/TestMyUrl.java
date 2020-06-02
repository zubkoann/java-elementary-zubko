package test_hm_16;

import com.zubko.homework.hw_16.MyUrl;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertTrue;

public class TestMyUrl {

    @Test
    public void testDomain() {
        MyUrl url = new MyUrl.UrlBuilder()
                .withDomain("google.com")
                .build();
        String expected = "google.com";
        String actual = url.getUrl();
        assertTrue("Domain failed", expected.equalsIgnoreCase(actual));
    }

    @Test
    public void testProtocol() {
        String expected = "https://google.com";
        MyUrl url = new MyUrl.UrlBuilder()
                .withProtocol("https")
                .withDomain("google.com")
                .build();
        String actual = url.getUrl();

        assertTrue("Protocol failed", expected.equalsIgnoreCase(actual));
    }

    @Test
    public void testPort() {
        String expected = "https://google.com:8800";
        MyUrl url = new MyUrl.UrlBuilder()
                .withProtocol("https")
                .withDomain("google.com")
                .withPort("8800")
                .build();
        String actual = url.getUrl();

        assertTrue("Port failed", expected.equalsIgnoreCase(actual));
    }

    @Test
    public void testPath() {
        String expected = "https://google.com/getSomeInfo";
        MyUrl url = new MyUrl.UrlBuilder()
                .withProtocol("https")
                .withDomain("google.com")
                .withPath("getSomeInfo")
                .build();
        String actual = url.getUrl();
        assertTrue("Path failed", expected.equalsIgnoreCase(actual));
    }

    @Test
    public void testParam() {
        Map<String, String> map = new HashMap<>();
        map.put("1", "2");
        map.put("2", "2");
        String expected = "https://google.com?1=2&2=2&anotherSomeName&name=Pete";
        MyUrl url = new MyUrl.UrlBuilder()
                .withProtocol("https")
                .withDomain("google.com")
                .withParam("name", "Pete")
                .withParam("anotherSomeName")
                .withParam((HashMap<String, String>) map)
                .build();
        String actual = url.getUrl();
        assertTrue("Param failed", expected.equalsIgnoreCase(actual));
    }

    @Test(expected = NullPointerException.class)
    public void testWithoutDomain() {
        MyUrl url = new MyUrl.UrlBuilder()
                .build();
        url.getUrl();
    }

}
