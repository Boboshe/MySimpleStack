package dcll.bter.mysimplestack.MySimpleStack;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleStackImplTest {

    SimpleStack simpleStack;

    @Before
    public void setUp() throws Exception {
        simpleStack = new SimpleStackImpl();
        System.out.println("setUp() s'execute avant chaque test");
        //Un commentaire répondant à l'exigence #3
    }

    @Test
    public void testIsEmpty() throws Exception {
        Assert.assertEquals(true, simpleStack.isEmpty());
        String element1 = "toto";
        simpleStack.push(new Item(new String(element1)));
        Assert.assertEquals(false, simpleStack.isEmpty());
    }

    @Test
    public void testGetSize() throws Exception {
        Assert.assertEquals(0, simpleStack.getSize());
        String element1 = "toto";
        simpleStack.push(new Item(new String(element1+"1")));
        simpleStack.push(new Item(new String(element1+"2")));
        Assert.assertEquals(2, simpleStack.getSize());
    }

    @Test
    public void testPush() throws Exception {
        Item ita = new Item(new Integer(8));
        Assert.assertEquals(0, simpleStack.getSize());
        simpleStack.push(ita);
        //La pile doit être augmentée de 1 Item
        Item o = simpleStack.peek();
        //On doit retrouver l'obejt initial
        Assert.assertTrue(o.getValue() instanceof Integer);
        Integer integer = (Integer)o.getValue();
        Assert.assertEquals(8,integer.intValue());
        Assert.assertEquals(ita.getValue(),integer);
    }

    @Test
    public void testPeek() throws Exception {
        Item ita = new Item(new Integer(8));
        Assert.assertEquals(0, simpleStack.getSize());
        simpleStack.push(ita);
        Item o = simpleStack.peek();
        //Ne dois pas retirer l'objet de la pile
        Assert.assertEquals(1, simpleStack.getSize());
        //On doit retrouver  l'objet initial
        Assert.assertTrue(o.getValue() instanceof Integer);
        Integer integer = (Integer)o.getValue();
        Assert.assertEquals(8,integer.intValue());
        Assert.assertEquals(ita.getValue(),integer);
    }

    @Test
    public void testPop() throws Exception {
        Item ita = new Item(new Integer(8));
        Assert.assertEquals(0, simpleStack.getSize());
        simpleStack.push(ita);
        Assert.assertEquals(1, simpleStack.getSize());
        Item o = simpleStack.pop();
        //On doit retirer l'objet de la pile
        Assert.assertEquals(0, simpleStack.getSize());
        //On doit retirer l'objet initial
        Assert.assertTrue(o.getValue() instanceof Integer);
        Integer integer = (Integer)o.getValue();
        Assert.assertEquals(8,integer.intValue());
        Assert.assertEquals(ita.getValue(),integer);
    }
}