# Caesar Cipher

## Overview

This C program implements a Caesar cipher, allowing users to encrypt and decrypt messages. The Caesar cipher is a simple substitution cipher where each letter in the plaintext is shifted a certain number of places down or up the alphabet. [Read more about it here](https://en.wikipedia.org/wiki/Caesar_cipher)

## Features

1. **Encryption**: Shift letters forward in the alphabet based on a positive shift value.
2. **Decryption**: Shift letters backward in the alphabet based on a negative shift value.
3. **LowerCase and UpperCase**: Maintains the case of letters (uppercase or lowercase) during encryption/decryption.
4. **Non-alphabetic Character Preservation**: Leaves non-alphabetic characters (numbers, punctuation, spaces) unchanged.
5. **Continuous Operation**: Allows multiple encryptions/decryptions in a single session.

## How to Use

When you run the program, you'll be prompted to:

1. Enter a sentence to cipher.
2. Provide a shift value:
   - Positive value for encryption
   - Negative value for decryption
   - Zero or any value give a 0 reminder like 26
3. Choose whether to continue or exit the program.

## Code Structure

### Main Functions:

- `caesarCipher()`: Implements the Caesar cipher algorithm.
- `main()`: Handles user input, program flow, and output.

### Helper Functions:

- `setColorGreen()`, `setColorRed()`, `resetColor()`: Manage console text coloring for better user experience.

## Caesar Cipher Algorithm

The Caesar cipher shifts each letter in the plaintext by a certain number of positions in the alphabet. The algorithm implemented in this program:

1. Iterates through each character in the input string.
2. Checks if the character is alphabetic (A-Z or a-z).
3. If alphabetic, shifts the character by the specified value, wrapping around the alphabet if necessary.
4. Preserves the case of the original letter.
5. Leaves non-alphabetic characters unchanged.

```c
UserSentence[i] = 'A' + ((UserSentence[i] - 'A' + (shiftvalue % 26) + 26) % 26);
```

This line performs the shift for uppercase letters. A similar operation is done for lowercase letters.
You can see a simple explaining for the algorithm [here](https://youtu.be/jEK3J_Ezb_E)

## ASCII Table Usage

The program relies on ASCII values for character manipulation:

- 'A' to 'Z' have ASCII values 65 to 90.
- 'a' to 'z' have ASCII values 97 to 122.

By subtracting 'A' or 'a' from a character, we get its position in the alphabet (0-25). After applying the shift and modulo operations, we add 'A' or 'a' back to convert it to the correct ASCII value.

## Notes

- The program uses ANSI escape codes for coloring, which may not be supported in all terminal environments.
- The input is limited to 200 characters.
- The program continues to run until the user chooses to exit.

## Additional Resources

- [ASCII Table Reference](https://www.asciitable.com/)
- [Caesar Cipher on Wikipedia](https://en.wikipedia.org/wiki/Caesar_cipher)
