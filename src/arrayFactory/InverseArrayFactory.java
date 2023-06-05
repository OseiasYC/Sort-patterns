package arrayFactory;

public class InverseArrayFactory extends ArrayFactory {

    @Override
    public Array getArray(int size) {
        return new InverseArray(size);
    }

}
