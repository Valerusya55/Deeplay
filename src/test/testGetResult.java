package test;

import com.company.Solution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testGetResult  {
    @Test
    public void testGetResultHuman() throws Exception {
        assertEquals(10,Solution.getResult("Human","STWSWTPPTPTTPWPP"));
    }

    @Test
    public void testGetResultHuman2() throws Exception {
        assertEquals(14,Solution.getResult("Human","STWSWWWWTTPWPPTS"));
    }

    @Test
    public void testGetResultSwamper() throws Exception {
        assertEquals(15,Solution.getResult("Swamper","STWSWTPPTPTTPWPP"));
    }

    @Test
    public void testGetResultSwamper2() throws Exception {
        assertEquals(12,Solution.getResult("Swamper","STWSWWWWTTPWPPTS"));
    }

    @Test
    public void testGetResultWoodman() throws Exception {
        assertEquals(12,Solution.getResult("Woodman","STWSWTPPTPTTPWPP"));
    }

    @Test
    public void testGetResultWoodman2() throws Exception {
        assertEquals(14,Solution.getResult("Woodman","STWSWWWWTTPWPPTS"));
    }

    @Test(expected = Exception.class)
    public void testGetResultExceptionStringLengthField() throws Exception {
        assertEquals(12,Solution.getResult("Woodman","STWSWTPPTPTTPWPPPWT"));
    }

    @Test(expected = Exception.class)
    public void testGetResultExceptionStringSpesies() throws Exception {
        assertEquals(12,Solution.getResult("Woodmann","STWSWTPPTPTTPWPP"));
    }

    @Test(expected = Exception.class)
    public void testGetResultExceptionStringField() throws Exception {
        assertEquals(0,Solution.getResult("Woodman","STWSWTPPTPTTPQPP"));
    }

}
