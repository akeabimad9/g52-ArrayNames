package se.lexicon;

public class Main{
    public static void main(String[] args) {

        // Create an instance of NameRepository
        NameRepository nameRepo = new NameRepository();

        // Initializing the repository with names
        String[] initialNames = {"Erik Svensson", "Alex Johnson", "Marcus Peter"};
        nameRepo.setNames(initialNames);

        // Display the size of the repository
        System.out.println("Size of repository: " + nameRepo.getSize());

        // Display all names
        System.out.println("All names:");
        for (String name : nameRepo.findAll()) {
            System.out.println(name);
        }

        // Finding a name
        String searchName = "Alex Johnson";
        String foundName = nameRepo.find(searchName);
        if (foundName != null) {
            System.out.println("Found: " + foundName);
        } else
        {
            System.out.println("Name not found.");
        }
        // Adding a new name
        String newName = "Chris Green";
        boolean added = nameRepo.add(newName);
        if (added) {
            System.out.println("Added new name: " + newName);
        } else
        {
            System.out.println("Name already exists: " + newName);
        }

        // Try to add an existing name
        boolean addedAgain = nameRepo.add("Erik Svensson");
        if (!addedAgain) {
            System.out.println("Name already exists: Erik Svensson");
        }

        // Display all names after adding new ones
        System.out.println("All names after addition:");
        for (String name : nameRepo.findAll()) {
            System.out.println(name);
        }

        // Clear the repository
        nameRepo.clear();
        System.out.println("Size after clearing: " + nameRepo.getSize());
    }
}

