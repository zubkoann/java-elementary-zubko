package test_hm_13;

import com.zubko.homework.hw_13.DataMapper;
import com.zubko.homework.hw_13.FileDataMapper;
import com.zubko.homework.hw_13.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FileDataMapperTest {
    private DataMapper mapper;

    @Before
    public void setUp() {
        mapper = new FileDataMapper("src/test/resources/userTest.txt");
    }

    @Test
    public void testFindUserById() {
        User expectedUser = new User("2", "Ivanov", "Ivanov@gmail.com", "54323", "user");
        User actualUser = mapper.findUserById("2");
        assertEquals("Find by id is failed", actualUser, expectedUser);
    }

    @Test
    public void testFindUserByUserName() {
        User expectedUser = new User("1", "Zubko", "zubko@gmail.com", "12345", "admin");
        User actualUser = mapper.findUserByUsername("Zubko");
        assertEquals("Find by Name is failed", actualUser, expectedUser);
    }

    @Test
    public void testFindUserByEmail() {
        User expectedUser = new User("2", "Ivanov", "Ivanov@gmail.com", "54323", "user");
        User actualUser = mapper.findUserByEmail("Ivanov@gmail.com");
        assertEquals("Find by Email is failed", actualUser, expectedUser);
    }

}
