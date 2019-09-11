# exercism
Solution of the exercism.io Java problems
1. Two-fer - Two-fer or 2-fer is short for two for one. One for you and one for me.

    Given a name, return a string with the message:

    One for X, one for me.

    Where X is the given name.

    However, if the name is missing, return the string:

    One for you, one for me.

    Here are some examples:
    Name 	String to return
    Alice 	One for Alice, one for me.
    Bob 	One for Bob, one for me.
	    One for you, one for me.
    Zaphod 	One for Zaphod, one for me.
  
2. Introductory Hello world! 
  
3. Reverse a string
  
4. Resistor color - Resistors have color coded bands, where each color maps to a number. The first 2 bands of a resistor have a simple encoding scheme: each color maps to a single number.

    These colors are encoded as follows:

      Black: 0
      Brown: 1
      Red: 2
      Orange: 3
      Yellow: 4
      Green: 5
      Blue: 6
      Violet: 7
      Grey: 8
      White: 9

     Mnemonics map the colors to the numbers, that, when stored as an array, happen to map to their index in the array: Better Be Right Or Your Great Big Values Go Wrong.
     
5. Darts - Write a function that returns the earned points in a single toss of a Darts game.

        Darts is a game where players throw darts to a target.

        In our particular instance of the game, the target rewards with 4 different amounts of points, depending on where the dart lands:

        If the dart lands outside the target, player earns no points (0 points).
        If the dart lands in the outer circle of the target, player earns 1 point.
        If the dart lands in the middle circle of the target, player earns 5 points.
        If the dart lands in the inner circle of the target, player earns 10 points.

        The outer circle has a radius of 10 units (This is equivalent to the total radius for the entire target), the middle circle a radius of 5 units, and the inner circle a radius of 1. Of course, they are all centered to the same point (That is, the circles are concentric) defined by the coordinates (0, 0).

        Write a function that given a point in the target (defined by its real cartesian coordinates x and y), returns the correct amount earned by a dart landing in that point.

6. Armstrong Numbers - An Armstrong number is a number that is the sum of its own digits each raised to the power of the number of digits.

    For example:
      
      9 is an Armstrong number, because 9 = 9^1 = 9
      
      10 is not an Armstrong number, because 10 != 1^2 + 0^2 = 1
      
      153 is an Armstrong number, because: 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
      
      154 is not an Armstrong number, because: 154 != 1^3 + 5^3 + 4^3 = 1 + 125 + 64 = 190

   Write some code to determine whether a number is an Armstrong number.

7. RNA Transcription - Given a DNA strand, return its RNA complement (per RNA transcription).

   Both DNA and RNA strands are a sequence of nucleotides.

   The four nucleotides found in DNA are adenine (A), cytosine (C), guanine (G) and thymine (T).

   The four nucleotides found in RNA are adenine (A), cytosine (C), guanine (G) and uracil (U).

   Given a DNA strand, its transcribed RNA strand is formed by replacing each nucleotide with its complement:

    G -> C
    C -> G
    T -> A
    A -> U

8. D&D Character - For a game of Dungeons & Dragons, each player starts by generating a character they can play with. This character has, among other things, six abilities; strength, dexterity, constitution, intelligence, wisdom and charisma. These six abilities have scores that are determined randomly. You do this by rolling four 6-sided dice and record the sum of the largest three dice. You do this six times, once for each ability.

   Your character's initial hitpoints are 10 + your character's constitution modifier. You find your character's constitution modifier by subtracting 10 from your character's constitution, divide by 2 and round down.

   Write a random character generator that follows the rules above.

   For example, the six throws of four dice may look like:

    5, 3, 1, 6: You discard the 1 and sum 5 + 3 + 6 = 14, which you assign to strength.
    
    3, 2, 5, 3: You discard the 2 and sum 3 + 5 + 3 = 11, which you assign to dexterity.
    
    1, 1, 1, 1: You discard the 1 and sum 1 + 1 + 1 = 3, which you assign to constitution.
    
    2, 1, 6, 6: You discard the 1 and sum 2 + 6 + 6 = 14, which you assign to intelligence.
    
    3, 5, 3, 4: You discard the 3 and sum 5 + 3 + 4 = 12, which you assign to wisdom.
    
    6, 6, 6, 6: You discard the 6 and sum 6 + 6 + 6 = 18, which you assign to charisma.

   Because constitution is 3, the constitution modifier is -4 and the hitpoints are 6.
   
9. Pangram - Determine if a sentence is a pangram. A pangram (Greek: παν γράμμα, pan gramma, "every letter") is a sentence using every letter of the alphabet at least once. The best known English pangram is:

    The quick brown fox jumps over the lazy dog.

    The alphabet used consists of ASCII letters a to z, inclusive, and is case insensitive. Input will not contain non-ASCII symbols.

10. Calculate the Hamming Distance between two DNA strands.

    Your body is made up of cells that contain DNA. Those cells regularly wear out and need replacing, which they achieve by dividing into daughter cells. In fact, the average human body experiences about 10 quadrillion cell divisions in a lifetime!

    When cells divide, their DNA replicates too. Sometimes during this process mistakes happen and single pieces of DNA get encoded with the incorrect information. If we compare two strands of DNA and count the differences between them we can see how many mistakes occurred. This is known as the "Hamming Distance".

    We read DNA using the letters C,A,G and T. Two strands might look like this:

      GAGCCTACTAACGGGAT
      
      CATCGTAATGACGGCCT
      
      ^ ^ ^  ^ ^    ^^

    They have 7 differences, and therefore the Hamming Distance is 7.

    The Hamming Distance is useful for lots of things in science, not just biology, so it's a nice phrase to be familiar with :)

11. Space Age - Given an age in seconds, calculate how old someone would be on:

      Earth: orbital period 365.25 Earth days, or 31557600 seconds
      
      Mercury: orbital period 0.2408467 Earth years
      
      Venus: orbital period 0.61519726 Earth years
      
      Mars: orbital period 1.8808158 Earth years
      
      Jupiter: orbital period 11.862615 Earth years
      
      Saturn: orbital period 29.447498 Earth years
      
      Uranus: orbital period 84.016846 Earth years
      
      Neptune: orbital period 164.79132 Earth years

    So if you were told someone were 1,000,000,000 seconds old, you should be able to say that they're 31.69 Earth-years old.
    
12. Acronym - Convert a phrase to its acronym.

    Techies love their TLA (Three Letter Acronyms)!

    Help generate some jargon by writing a program that converts a long name like Portable Network Graphics to its acronym (PNG).

13. Convert a number to a string, the contents of which depend on the number's factors.

      If the number has 3 as a factor, output 'Pling'.
      If the number has 5 as a factor, output 'Plang'.
      If the number has 7 as a factor, output 'Plong'.
      If the number does not have 3, 5, or 7 as a factor, just pass the number's digits straight through.

    Examples

      28's factors are 1, 2, 4, 7, 14, 28.
      
         In raindrop-speak, this would be a simple "Plong".
         
      30's factors are 1, 2, 3, 5, 6, 10, 15, 30.
         
         In raindrop-speak, this would be a "PlingPlang".
      
      34 has four factors: 1, 2, 17, and 34.
         
         In raindrop-speak, this would be "34".
