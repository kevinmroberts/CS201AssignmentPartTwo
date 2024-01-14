# CS201 Assignment - Part Two

## Overview

- **Author:** Kevin Roberts
- **Date:** 01/14/2024
- **Assignment:** CS201 Assignment - Part Two

This Java program is designed to store pairs of U.S. states and their corresponding capitals in a map using the HashMap data structure. The program displays the content of the map, then utilizes the TreeMap class to sort the map using a binary search tree for storage. Additionally, the program prompts the user to enter a U.S. state, and it retrieves and displays the capital associated with the entered state.

## How to Use

1. Compile and run the program.
2. The program will display the content of the map, showing U.S. states and their capitals.
3. It will then use a TreeMap to sort the map alphabetically by state.
4. You can enter a U.S. state when prompted.
5. The program will display the capital associated with the entered state.

## Program Structure

The program includes the following components:

- `STATES_AND_CAPITALS`: A two-dimensional array containing U.S. states and capitals.
- `storeArrayAsMap()`: Converts the array into a HashMap, storing states as keys and capitals as values.
- `retrieveCapitalByState()`: Prompts the user for a state and retrieves its capital from the sorted TreeMap.
- `displayMap(Map<String, String> map)`: Displays the content of a map in a readable format.
- `statesAndCapitalsHashMap`: A HashMap containing U.S. states and capitals.
- `sortedMap`: A TreeMap for storing and sorting states and capitals alphabetically by state.

## Example Output

When you run the program, it will display the map content, sort it alphabetically, and prompt you for a state. Here's an example of what you can expect:

```
HashMap States & Capitals
MICHIGAN - LANSING
WASHINGTON - OLYMPIA
...

TreeMap States & Capitals
ALABAMA - MONTGOMERY
ALASKA - JUNEAU
...

Enter a state:
Texas
The capital of TEXAS is AUSTIN.
```
