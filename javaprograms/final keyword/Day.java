final class Day {
  // Constant variables to store the number of minutes and hours in a day
  static final int MINUTES_PER_DAY = 1440;
  static final int HOURS_PER_DAY = 24;

  // Method to display the number of hours and minutes in a day
  static void displayHoursAndMinutes() {
    System.out.println("Number of hours in a day: " + HOURS_PER_DAY);
    System.out.println("Number of minutes in a day: " + MINUTES_PER_DAY);
  }
}

class Main {
  // Main method
  public static void main(String[] args) {
    // Call the displayHoursAndMinutes method
    Day.displayHoursAndMinutes();
  }
}
