package com.strangerws.gen.api.combiner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Соединитель {

    public static String соединить(String перваяЧасть, String последняяЧасть){
        return String.format("%s%s", перваяЧасть, последняяЧасть);
    }

    public static String соединитьСписки(List<String> первыеЧасти, List<String> последниеЧасти){
        Collections.shuffle(первыеЧасти);
        Collections.shuffle(последниеЧасти);

        return соединить(первыеЧасти.get(0), последниеЧасти.get(0));
    }

    public static List<String> соединитьИменаКаждыйСКаждым(List<String> первыеЧасти, List<String> последниеЧасти){
        List<String> собранныеИмена = new ArrayList<>();

        for (String перваяЧасть: первыеЧасти){
            for (String последняяЧасть: последниеЧасти){
                собранныеИмена.add(соединить(перваяЧасть, последняяЧасть));
            }
        }

        return собранныеИмена;
    }
}
