package com.dojo.kata;

import javafx.util.Pair;
import org.reflections.Reflections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class HotDrinkMachine
{
    public enum AvailableDrink
    {
        COFFEE, TEA
    }

    private Map<AvailableDrink, HotDrinkFactory> factories =
            new Hashtable<>();

    private List<Pair<String, HotDrinkFactory>> namedFactories =
            new ArrayList<>();

    public HotDrinkMachine() throws Exception
    {
        // option 1: use an enum
        for (AvailableDrink drink : AvailableDrink.values())
        {
            String s = drink.toString();
            String factoryName = "" + Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
            Class<?> factory = Class.forName("com.dojo.kata." + factoryName + "Factory");
            factories.put(drink, (HotDrinkFactory) factory.getDeclaredConstructor().newInstance());
        }

        // option 2: find all implementors of HotDrinkFactory
        Set<Class<? extends HotDrinkFactory>> types =
                new Reflections("com.dojo.kata.") // ""
                        .getSubTypesOf(HotDrinkFactory.class);
        for (Class<? extends HotDrinkFactory> type : types)
        {
            namedFactories.add(new Pair<>(
                    type.getSimpleName().replace("Factory", ""),
                    type.getDeclaredConstructor().newInstance()
            ));
        }
    }

    public HotDrink makeDrink() throws IOException
    {
        System.out.println("Available drinks");
        for (int index = 0; index < namedFactories.size(); ++index)
        {
            Pair<String, HotDrinkFactory> item = namedFactories.get(index);
            System.out.println("" + index + ": " + item.getKey());
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true)
        {
            String s;
            int i, amount;
            if ((s = reader.readLine()) != null
                    && (i = Integer.parseInt(s)) >= 0
                    && i < namedFactories.size())
            {
                System.out.println("Specify amount: ");
                s = reader.readLine();
                if (s != null
                        && (amount = Integer.parseInt(s)) > 0)
                {
                    return namedFactories.get(i).getValue().prepare(amount);
                }
            }
            System.out.println("Incorrect input, try again.");
        }
    }

    public HotDrink makeDrink(AvailableDrink drink, int amount)
    {
        return factories.get(drink).prepare(amount);
    }
}