package com.strangerws.gen.api.loader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import com.strangerws.gen.api.consts.ЧастьИмени;
import com.strangerws.gen.api.consts.Раса;

public class Загрузчик {

    private static final String ПУТЬ_К_РЕСУРСАМ = "src\\resource\\";
    private static final String РАСШИЕРНИЕ_ГЕНА = ".gene";

    public static List<String> получитьЧастиИмёнВКачествеСписка(Раса раса, ЧастьИмени частьИмени) throws IOException {
        List<String> файл = new ArrayList<>();
        String путьФайла = получитьПутьФайлаИзЧастиИмени(раса, частьИмени);

        Files.lines(Paths.get(путьФайла)).forEach(файл::add);
        return файл;
    }

    private static String получитьПутьФайлаИзЧастиИмени(Раса раса, ЧастьИмени частьИмени) {
        return ПУТЬ_К_РЕСУРСАМ + раса.получитьКод() + "\\" + частьИмени.получитьКод() + РАСШИЕРНИЕ_ГЕНА;
    }
}
