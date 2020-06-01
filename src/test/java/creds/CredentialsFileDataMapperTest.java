package creds;

import com.zubko.lectures.lecture_13.Credentials;
import com.zubko.lectures.lecture_13.CredentialsDataMapper;
import com.zubko.lectures.lecture_13.CredentialsFileDataMapper;
import com.zubko.lectures.lecture_13.CredentialsNotFoundException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class CredentialsFileDataMapperTest {

    private CredentialsDataMapper dm;

    @Before
    public void setUp() {
        dm = new CredentialsFileDataMapper();
    }

    @Test
    public void testGetAll() {
        CredentialsDataMapper dm = new CredentialsFileDataMapper();
        assertEquals("Incorect number of items", 3, dm.getAll().size());
    }

    @Test
    public void testFindCredByID() {
        Credentials actualCred = dm.findById("3");
        Credentials expectedCred = new Credentials("3", "facebook", "userfacebook", "passfacebook");
        assertEquals("Obj are not equal ", expectedCred, actualCred);
    }

    @Test(expected = CredentialsNotFoundException.class)
    public void testFindByNonExistId(){
        dm.findById("33");
    }
}
