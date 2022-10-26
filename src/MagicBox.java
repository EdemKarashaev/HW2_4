import java.util.Random;

public class MagicBox<T> {
    protected T value;
    protected boolean x = true;
    int i = 0;
    int length;
    private T[] items;

    //конструктор для MagicBox
    MagicBox(int length) {
        this.length = length;
        this.items = (T[]) new Object[length];
    }

    //добавление данных в ячейки массива
    public boolean add(T item) throws Exception {
        if (items[items.length - 1] != null) {
            throw new RuntimeException(("Массив заполнен полностью, произошло переполнение"));
        }
        while (x) {
            if (items[i] == null && i <= items.length) {
                items[i] = item;
                i++;
                return true;
            } else {
                x = false;
            }
        }
        return x;
    }

    //Выборо произвольного элемента из массива
    public T pick() throws Exception {
        T pickedV = null;
        int k = 0;
        if (items[items.length - 1] == null) {
            for (i = 0; i < items.length; i++) {
                if (items[i] == null) {
                    k = items.length - i;
                    throw new RuntimeException("Массив не заполнен данными, дополните его еще  " + k + "  слотами и попробуйте снова.");
                }
            }
        } else {
            Random random = new Random();
            int randomInt = random.nextInt(items.length);
            pickedV = items[randomInt];
        }
        return pickedV;
    }
}
