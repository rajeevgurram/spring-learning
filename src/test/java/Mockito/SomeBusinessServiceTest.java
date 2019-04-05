package Mockito;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class SomeBusinessServiceTest {
    SomeBusinessService someBusinessService;
    DataService dataServiceMock;

    @Before
    public void before() {
        dataServiceMock = mock(DataService.class);
    }

    @Test
    public void testFindMaxValue() {
        when(dataServiceMock.getAllData()).thenReturn(new int[] {24, 5, 3});
        someBusinessService = new SomeBusinessService(dataServiceMock);
        assertEquals(3, someBusinessService.findMaxValue());
    }
}
