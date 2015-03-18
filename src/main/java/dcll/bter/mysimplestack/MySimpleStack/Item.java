package dcll.bter.mysimplestack.MySimpleStack;

/**
 * Created by Boris on 17/03/2015.
 */
public class Item {
    private Object value;

    Item(Object value){
        setValue(value);
    }

    /**
     * Un commentaire répondant à l'exigence #2
     */
    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
