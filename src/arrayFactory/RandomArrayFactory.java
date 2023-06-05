package arrayFactory;

public class RandomArrayFactory extends ArrayFactory {

    @Override
    public Array getArray(int size) {
        return new RandomArray(size);
    }
}
