public class Main {
    public static void main(String[] args) {
        /* Размер допустимых значений типа byte не так уж велик: от -128 до +127. Но не в этом его сила.
        Тип byte чаще всего используется, когда нужно хранить в памяти большой блок обезличенных данных.
        Массив типа byte просто идеально подходит для этих целей.
         */
        System.out.println("Minimum byte value: " + Byte.MIN_VALUE);
        System.out.println("Maximum byte value: " + Byte.MAX_VALUE);

        /*
        * Тип short получил свое название от short int. Его еще называют короткое целое.
        * В отличие от типа int, его длина всего два байта и возможный диапазон значений от -32,768 до +32,767.        *
        */
        System.out.println("Minimum short value: " + Short.MIN_VALUE);
        System.out.println("Maximum short value: " + Short.MAX_VALUE);

        /*
        * Самым часто используемым является тип int. Его название происходит от Integer (целый).
        * Все целочисленные литералы в коде имеют тип int (если в конце числа не указана буква L, F или D).
        Переменные этого типа могут принимать значение от -2,147,483,648 до +2,147,483,647.
        */
        System.out.println("Minimum int value: " + Integer.MIN_VALUE);
        System.out.println("Maximum int value: " + Integer.MAX_VALUE);

        /*
        * Этот тип получил свое название от long int — его еще называют длинное целое.
        * В отличие от типа int, у него просто гигантский диапазон значений: от -9*1018 до +9*1018
        */
        System.out.println("Minimum long value: " + Long.MIN_VALUE);
        System.out.println("Maximum long value: " + Long.MAX_VALUE);

        /*
        * Само название типа float происходит от floating point number.
        * Размер этого типа совсем небольшой — всего 4 байта (32 бита),
        * но он может хранить значения от -3.4*1038 до 3.4*1038.
        * Под мантиссу отдается 24 бита, под экспоненту — 8 бит. Этот тип способен хранить всего 8 значащих цифр.
        */
        System.out.println("Minimum float value: " + Float.MIN_VALUE);
        System.out.println("Maximum float value: " + Float.MAX_VALUE);

        /*
        * Тип double является стандартным типом с плавающей точкой. Его название происходит от double floating point.
        * Его еще называют числом с плавающей точкой двойной точности.
        * Все вещественные литералы по умолчанию имеют тип double.
        Этот тип занимает 8 байт памяти (64 бита)
        */
        System.out.println("Minimum double value: " + Double.MIN_VALUE);
        System.out.println("Maximum double value: " + Double.MAX_VALUE);
    }
}