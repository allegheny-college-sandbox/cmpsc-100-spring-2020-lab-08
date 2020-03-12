package labeight;

import java.util.Scanner;

/** Tells our gripping tale.
 *
 * @author Solutions Repository
 */
public class CatnapCaper {

  /** Entry point.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    // Set up scanner
    Scanner input = new Scanner(System.in);
    
    // Take in scenario for Alice
    System.out.print("Does Alice defect [true/false]: ");
    boolean alice = input.nextBoolean();
    
    // Print the result of the scenario
    if (alice) {
      System.out.println("Alice defects!");
    } else {
      System.out.println("Alice stays quiet.");
    }
    
    // Take in scenario for Bob
    System.out.print("Does Bob defect [true/false]: ");
    boolean bob = input.nextBoolean();
    
    // Print the result of the scenario
    if (bob) {
      System.out.println("Bob defects!");
    } else {
      System.out.println("Bob stays quiet.");
    }
    
    // Initialize variables to hold Alice and Bob's sentences
    int aliceSentence = 0;
    int bobSentence = 0;
    
    // Assess penalties for catnapperz
    if (alice && !bob) {
      bobSentence += 3;
    } else if (!alice && bob) {
      aliceSentence += 3;
    } else if (!alice && !bob) {
      aliceSentence += 2;
      bobSentence += 2;
    } else {
      bobSentence += 1;
      aliceSentence += 1;
    }
    
    // Print sentences
    System.out.println("Alice recieves " + aliceSentence + " year(s).");
    System.out.println("Bob recieves " + bobSentence + " year(s)."
    
    // Print summary status message
    if (aliceSentence < 2 || bobSentence < 2) {
      System.out.print("They live to catnap again!");
    } else {
      System.out.print("Their sentences reformed them!");
    }
  }
}