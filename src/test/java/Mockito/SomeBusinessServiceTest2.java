package Mockito;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

/***
 * Use @RunWith(MockitoJUnitRunner.class) when ever we use
 * @Mock, @InjectMock annotations
 */
@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessServiceTest2 {
    @Mock
    DataService dataServiceMock;

    // Inject all mocks into someBusinessService (for ex: it injects DataService). No need calling constructor
    @InjectMocks
    SomeBusinessService someBusinessService;

    @Before
    public void before() {
    }

    @Test
    public void testFindMaxValue() {
        when(dataServiceMock.getAllData()).thenReturn(new int[] {24, 5, 3});
        assertEquals(3, someBusinessService.findMaxValue());
    }
}
