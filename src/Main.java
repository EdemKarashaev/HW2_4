public class Main {
    public static void main(String[] args) throws Exception {

        //Обьявление новой коробки(массива) для целых чисел
        MagicBox<Integer> intBox = new MagicBox<Integer>(4);
        intBox.add(55);
        intBox.add(12);
        intBox.add(1);
        intBox.add(6);
        System.out.println(intBox.pick());

        //Обьявление новой коробки(массива) для строковых данных
        MagicBox<String> strBox = new MagicBox<String>(3);
        strBox.add("Привет");
        strBox.add("Бывает");
        strBox.add("Хуже");
        System.out.println(strBox.pick());
    }
}
