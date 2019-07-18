package com.strangerws.dnd.info.impl.generator;

import com.strangerws.dnd.info.api.combiner.Combiner;
import com.strangerws.dnd.info.api.consts.NamePart;
import com.strangerws.dnd.info.api.consts.Race;
import com.strangerws.dnd.info.api.loader.Loader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Generator {

    public static void main(String[] args) {
        //System.out.println("FULL LIST:\n");
        //getFullList();
        System.out.println("\nWEIRD LIST\n");
        getWeirdNames();
        //System.out.println("\nAMOUNTED LIST:\n");
        //getAmountedList();

    }

    public static void getAmountedList() {
        System.out.println("Give me amount of names:");
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        System.out.println("Give me race number:");
        System.out.println("1 - Human\n2 - Elf");
        int raceNumber = scanner.nextInt();

        List<String> firstNames = null;
        List<String> LastNames = null;
        try {
            firstNames = Loader
                    .getNamePartsAsList(Race.getByNumber(raceNumber), NamePart.NAME_FIRST_PART);
            LastNames = Loader
                    .getNamePartsAsList(Race.getByNumber(raceNumber), NamePart.NAME_LAST_PART);

            for (int i = 0; i < amount; i++) {
                System.out.println(Combiner.combineFromLists(firstNames, LastNames));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getFullList() {
        List<String> firstNames = null;
        List<String> lastNames = null;

        try {
            for (Race race : Race.values()) {
                System.out.println(race.getCode());
                firstNames = Loader.getNamePartsAsList(race, NamePart.NAME_FIRST_PART);
                lastNames = Loader.getNamePartsAsList(race, NamePart.NAME_LAST_PART);

                Combiner.combineFromListsEachToEach(firstNames, lastNames)
                        .forEach(System.out::println);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getWeirdNames() {
        List<String> firstNames = null;
        List<String> lastNames = null;

        try {
            firstNames = Loader.getNamePartsAsList(Race.ELF, NamePart.NAME_FIRST_PART);
            lastNames = Loader.getNamePartsAsList(Race.HUMAN, NamePart.NAME_LAST_PART);

            Combiner.combineFromListsEachToEach(firstNames, lastNames).forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
