package IntlistInterface;

public class IntArrayList implements IntList {

    private int[] data;
    private int size;

    public IntArrayList() {
        data = new int[10];
        size = 0;
    }

    @Override
    public void add(int number) {
        if (size == data.length) {
            int newCapacity = data.length + data.length / 2;
            int[] newData = new int[newCapacity];

            for (int i = 0; i < data.length; i++) {
                newData[i] = data[i];
            }

            data = newData;
        }

        data[size] = number;
        size++;
    }

    @Override
    public int get(int id) {
        if (id < 0 || id >= size) {
            throw new IndexOutOfBoundsException("Index: " + id);
        }
        return data[id];
    }
}
