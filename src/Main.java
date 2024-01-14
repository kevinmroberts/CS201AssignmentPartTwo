/**
 * Kevin Roberts
 * 01/14/2024
 * CS201 Assignment - Part Two
 * This program stores pairs of each state and their corresponding capital in a map using the HashMap function.
 * The program displays the content of the map, then uses the TreeMap class to sort the map using a binary search tree
 * for storage. Additionally, the program prompts the user to enter a U.S. state, and the program then displays the
 * capital associated with the entered state.
 */

import java.util.*;

public class Main {
    // 2D array for capitals and their respective states
    private static final String[][] STATES_AND_CAPITALS = {
            {"Alabama", "Montgomery"},
            {"Alaska", "Juneau"},
            {"Arizona", "Phoenix"},
            {"Arkansas", "Little Rock"},
            {"California", "Sacramento"},
            {"Colorado", "Denver"},
            {"Connecticut", "Hartford"},
            {"Delaware", "Dover"},
            {"Florida", "Tallahassee"},
            {"Georgia", "Atlanta"},
            {"Hawaii", "Honolulu"},
            {"Idaho", "Boise"},
            {"Illinois", "Springfield"},
            {"Indiana", "Indianapolis"},
            {"Iowa", "Des Moines"},
            {"Kansas", "Topeka"},
            {"Kentucky", "Frankfort"},
            {"Louisiana", "Baton Rouge"},
            {"Maine", "Augusta"},
            {"Maryland", "Annapolis"},
            {"Massachusetts", "Boston"},
            {"Michigan", "Lansing"},
            {"Minnesota", "Saint Paul"},
            {"Mississippi", "Jackson"},
            {"Missouri", "Jefferson City"},
            {"Montana", "Helena"},
            {"Nebraska", "Lincoln"},
            {"Nevada", "Carson City"},
            {"New Hampshire", "Concord"},
            {"New Jersey", "Trenton"},
            {"New Mexico", "Santa Fe"},
            {"New York", "Albany"},
            {"North Carolina", "Raleigh"},
            {"North Dakota", "Bismarck"},
            {"Ohio", "Columbus"},
            {"Oklahoma", "Oklahoma City"},
            {"Oregon", "Salem"},
            {"Pennsylvania", "Harrisburg"},
            {"Rhode Island", "Providence"},
            {"South Carolina", "Columbia"},
            {"South Dakota", "Pierre"},
            {"Tennessee", "Nashville"},
            {"Texas", "Austin"},
            {"Utah", "Salt Lake City"},
            {"Vermont", "Montpelier"},
            {"Virginia", "Richmond"},
            {"Washington", "Olympia"},
            {"West Virginia", "Charleston"},
            {"Wisconsin", "Madison"},
            {"Wyoming", "Cheyenne"},
    };

    private static final int STATES_INDEX_POS = 0; // State index position in 2D array
    private static final int CAPITALS_INDEX_POS = 1; // Capital index position in 2D array

    private static HashMap<String, String> statesAndCapitalsHashMap; // HashMap with States as Key and Capitals as Value
    private static TreeMap<String, String> sortedMap; // TreeMap with States as Key and Capitals as Value

    public static void main(String[] args) {
        // Stores the statesAsCapital array into a HashMap
        storeArrayAsMap();

        // Printing out HashMap
        System.out.println("HashMap States & Capitals");
        displayMap(statesAndCapitalsHashMap);

        // Typecasting the HashMap into a TreeMap.
        // TreeMap naturally orders the data alphabetically by key
        sortedMap = new TreeMap<>(statesAndCapitalsHashMap);

        // Printing out the sorted TreeMap
        System.out.println("\nTreeMap States & Capitals");
        displayMap(sortedMap);

        // Printing out the retrieved capital by state
        System.out.println(retrieveCapitalByState());
    }

    // Stores the statesAndCapital array into a HashMap
    private static void storeArrayAsMap() {
        // Initializing HashMap
        statesAndCapitalsHashMap = new HashMap<>();

        // Storing the array into the HashMap
        // Data will be upper-cased to work around case sensitivity
        for (String[] strings : STATES_AND_CAPITALS) {
            statesAndCapitalsHashMap.put(strings[STATES_INDEX_POS].toUpperCase(), strings[CAPITALS_INDEX_POS].toUpperCase());
        }
    }

    // Retrieves the capital of a given state from the sortedMap TreeMap
    private static String retrieveCapitalByState() {
        // Retrieving user input for state
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a state: ");
        String state = userInput.nextLine();
        userInput.close();

        // Storing capital as an upper-cased string
        String capital = sortedMap.get(state.toUpperCase());

        // Returns the capital of the state if it exists.
        return (capital != null) ? "The capital of " + state + " is " + capital + "." : "There is no capital for the state provided.";
    }

    // Displays the contents of a map in a readable manner
    private static void displayMap(Map<String, String> map) {
        for(Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}