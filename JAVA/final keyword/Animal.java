class Animal {
  // Method to display the general characteristics of an animal
  final void displayCharacteristics() {
    // Constant variables to store the number of legs, ears, eyes, and whether the animal has a tail
    static final int NUM_LEGS = 4;
    static final int NUM_EARS = 2;
    static final int NUM_EYES = 2;
    static final int HAS_TAIL = 1;

    System.out.println("General characteristics of an animal are: ");
    System.out.println("Legs: " + NUM_LEGS);
    System.out.println("Eyes: " + NUM_EYES);
    System.out.println("Ears: " + NUM_EARS);
    System.out.println("Tail: " + (HAS_TAIL == 1 ? "Yes" : "No"));
  }
}

class Wolf extends Animal {
  // Method to display the additional characteristics of a wolf
  final void displayAdditionalCharacteristics() {
    System.out.println();
    System.out.println("Additional characteristics:");
    System.out.println("Sound: howl");
  }

  public static void main(String[] args) {
    Wolf w = new Wolf();
    w.displayCharacteristics();
    w.displayAdditionalCharacteristics();
  }
}
