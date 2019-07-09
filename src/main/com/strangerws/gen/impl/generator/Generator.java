package com.strangerws.gen.impl.generator;

import com.strangerws.gen.api.combiner.Соединитель;
import com.strangerws.gen.api.consts.ЧастьИмени;
import com.strangerws.gen.api.consts.Раса;
import com.strangerws.gen.api.loader.Загрузчик;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Generator {

    public static void main(String[] args) {
        //System.out.println("FULL LIST:\n");
        //получитьПолныйСписок();
        System.out.println("\nWEIRD LIST\n");
        получитьДикиеИмена();
        //System.out.println("\nAMOUNTED LIST:\n");
        //получитьПосчитанныйСписок();

    }

    public static void получитьПосчитанныйСписок() {
        System.out.println("Give me amount of names:");
        Scanner сканер = new Scanner(System.in);
        int количество = сканер.nextInt();
        System.out.println("Give me race number:");
        System.out.println("1 - Human\n2 - Elf");
        int номерРасы = сканер.nextInt();

        List<String> первыеЧастиИмён = null;
        List<String> последниеЧастиИмён = null;
        try {
            первыеЧастиИмён = Загрузчик
                    .получитьЧастиИмёнВКачествеСписка(Раса.получитьПоНомеру(номерРасы), ЧастьИмени.ИМЯ_ПЕРВАЯ_ЧАСТЬ);
            последниеЧастиИмён = Загрузчик
                    .получитьЧастиИмёнВКачествеСписка(Раса.получитьПоНомеру(номерРасы), ЧастьИмени.ИМЯ_ПОСЛЕДНЯЯ_ЧАСТЬ);

            for (int i = 0; i < количество; i++) {
                System.out.println(Соединитель.соединитьСписки(первыеЧастиИмён, последниеЧастиИмён));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void получитьПолныйСписок() {
        List<String> первыеЧастиИмён = null;
        List<String> последниеЧастиИмён = null;

        try {
            for (Раса раса : Раса.values()) {
                System.out.println(раса.получитьКод());
                первыеЧастиИмён = Загрузчик.получитьЧастиИмёнВКачествеСписка(раса, ЧастьИмени.ИМЯ_ПЕРВАЯ_ЧАСТЬ);
                последниеЧастиИмён = Загрузчик.получитьЧастиИмёнВКачествеСписка(раса, ЧастьИмени.ИМЯ_ПОСЛЕДНЯЯ_ЧАСТЬ);

                Соединитель.соединитьИменаКаждыйСКаждым(первыеЧастиИмён, последниеЧастиИмён)
                        .forEach(System.out::println);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void получитьДикиеИмена() {
        List<String> первыеЧастиИмён = null;
        List<String> последниеЧастиИмён = null;

        try {
            первыеЧастиИмён = Загрузчик.получитьЧастиИмёнВКачествеСписка(Раса.ЭЛЬФ, ЧастьИмени.ИМЯ_ПЕРВАЯ_ЧАСТЬ);
            последниеЧастиИмён = Загрузчик.получитьЧастиИмёнВКачествеСписка(Раса.ЧЕЛОВЕК, ЧастьИмени.ИМЯ_ПОСЛЕДНЯЯ_ЧАСТЬ);

            Соединитель.соединитьИменаКаждыйСКаждым(первыеЧастиИмён, последниеЧастиИмён).forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
