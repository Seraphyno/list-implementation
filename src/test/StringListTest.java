package test;

import list.StringList;
import org.junit.Test;

public class StringListTest {
    
    @Test
    public void test_add() {
        StringList target = new StringList();
        
        assert target.add("element");
    }
    
    @Test
    public void test_size() {
        StringList target = new StringList();
        target.add("One");
        
        assert 1 == target.size();
    }
    
    @Test
    public void test_get() {
        StringList target = new StringList();
        target.add("One");
    
        assert "One".equals(target.get(0));
    }
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void test_negative_get() {
        StringList target = new StringList();
        target.get(2);
    }
    
}