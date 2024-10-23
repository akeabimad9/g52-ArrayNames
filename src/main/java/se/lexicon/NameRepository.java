package se.lexicon;

import java.util.Arrays;
public class NameRepository {

    // Private array of names
    private String[] names = new String[0];  // Start with an empty array

        // Method to get the size of the array
        public int getSize() {
        return names.length;
    }

    // Method to set the array of names
    public void setNames(String[] newNames) {
        names = Arrays.copyOf(newNames, newNames.length);

        // Copy names into the array
        }

        // Method to clear the array
    public void clear() {
        names = new String[0];

        // Reset the array to an empty array
        }

        // Method to return all names in the array
    public String[] findAll() {
        return Arrays.copyOf(names, names.length);

        // Return a copy of the names array
        }

    // Method to find a name in the array
    public String find(String fullName) {
        for (String name : names) {
            if (name.equals(fullName)) {
                return name;
                // Name found, return it
                }
        }
        return null;
        // Name not found, return null
        }

        // Method to add a new name if it does not already exist
    public boolean add(String fullName) {
        if (find(fullName) != null) {
            return false;  // Name already exists, return false
            }

        // Add the name to the array
        names = Arrays.copyOf(names, names.length + 1);
        names[names.length - 1] = fullName;  // Add the new name at the last position
        return true;  // Name successfully added, return true
        }
}
