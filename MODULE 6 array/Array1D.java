public class Array1D {
    public static void main(String[] args) {
        String[] cities = {"Delhi", "Mumbai", "Bangalore", "Chennai", "Kolkata", "Pune", "Jaipur"};
        System.out.println("List of Cities:");
        for (int i = 0; i < cities.length; i++) {
            System.out.println((i + 1) + ". " + cities[i]);
        }

        String search = "Pune";
        boolean found = false;
        for (int i = 0; i < cities.length; i++) {
            if (cities[i].equalsIgnoreCase(search)) {
                System.out.println(search + " is found at position " + (i + 1));
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(search + " is not in the list.");
        }

        String longest = cities[0];
        for (int i = 1; i < cities.length; i++) {
            if (cities[i].length() > longest.length()) {
                longest = cities[i];
            }
        }
        System.out.println("The city with the longest name is: " + longest);

        System.out.println("Cities in reverse order:");
        for (int i = cities.length - 1; i >= 0; i--) {
            System.out.print(cities[i] + " ");
        }
        System.out.println();
    }
}
