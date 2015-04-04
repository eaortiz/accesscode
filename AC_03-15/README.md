# Access Code 2.1

Exercises include:
<<<<<<< HEAD
* Methods on extending strings
* Methods on substrings
* Methods on dividing strings

#### Substrings
swaphalves
printtriangle
printuppertriangle
Elision is shortening of a string by leaving out parts of it. The elided string consists of a part of the original string, with the rest replaced by an ellipsis. In English, three dots, "...", is often used as an ellipsis.
Exercise: Write a method that shortens a string to a given number of characters by removing the end and replacing it with three dots. For example, elide("Hello, world!", 10) returns "Hello, ...". Make sure the resulting string is exactly the specified length. If the string is too short, return it unmodified.
Exercise: [optional] Extend the method to accept the ellipsis as an argument. For example, elide("Hello, world!", 10, "--") returns "Hello, w--".
Exercise: [optional] Modify the previous function so that if the string is shorter than the specified length, it is padded.


#### Dividing strings
For example, "Hello, world!".indexOf('l') returns 2, because l first occurs at position 2 (the third character) of the string. Similarly, "Hello, world!".indexOf('d') returns 11.
Exercise: Write a method zapTo(string, zapChar) that returns the portion of the string up to but not including the first occurence of zapChar. For example, zapChar("Hello, world!", ',') returns "Hello".
Exercise: Write a method replace1(string, fromChar, toChar) that replaces the first incidence of a character with another. For example, replace1("Hello, world!", 'w', 'V') returns "Hello, Vorld!".

indexOf() can also take a second argument, the position to start searching from. This enables you to search repeatedly for a character.
Exercise: Write a method replace(string, fromChar, toChar) that replaces every incidence of one character with another in the string, and returns the result. For example, replace("Hello, world!", 'o', '@') returns "Hell@, w@rld!".
Exercise: Extend your replace() methods to replace one string with another string. Note that there are corresponding indexOf() methods for strings.

For the following exercises, you'll need the methods toUpperCase() and toLowerCase().
Exercise: Write a method that changes only the first word of a sentence to upper case. Define words as letters between spaces. For example, firstWordToUpper("Hello, world!") returns "HELLO, world!".
Exercise: Write a method that produces title capitalization, i.e. the first letter of each word is capitalized. For example,
titleCapitalize("The quick brown fox jumped over the lazy dogs.")
returns
"The Quick Brown Fox Jumped Over The Lazy Dogs."
Exercise: [optional] Modify this method to not capitalize the words "a", "an", "the", and "of", unless the word appears at the beginning of the string.
Execise: [optional] Write a method that converts a phrase to a Java variable name by performing the following:
dropping punctuation characters
capitalizing words, except the first
removing spaces
For example, toJavaName("Hello, world!") returns "helloWorld" and toJavaName("What's up, doc?") returns "whatsUpDoc".


#### combining techniques
#### challenge exercises
=======
* Reverse
* Counting Char
* Padding
* Repeat
* Repeat String
* Replace Vowel
* Substring
* Swap Letters
* Underline Box

Objective
==

To learn about `java.lang.String`.

And also to write lots of methods and loops.

The code we write in class is in this github repo: https://github.com/accesscode-2-1/ac20150315


String
--

`String` is the most commonly used class in Java.  It represents a "character string", or sequence of characters.

The full documentation for the `String` class is here:

http://docs.oracle.com/javase/7/docs/api/java/lang/String.html

Recall some ways we've already seen to create strings:

* _String literals_, which are sequences of characters between double quotes, for example, `"Hello, world!"`. 
* Adding other things to strings, for example `"the value is " + value`.
* If you just want to convert a number to a string, use `String.valueOf(number)`.


Extending strings
--

Two string methods we've already seen are,

* `s.length()` returns the number of characters in the string.
* `s.charAt(i)` returns the character at the given position, which is between 0 and one less than the length.

> **Exercise:** Write a method that prints out a string in reverse.  For example, for `"Hello, world!"` it should print `!dlrow ,olleH`.

> **Exercise:** Write a method that reverses a string, i.e. given a string, it  _returns_ the string in reverse.

> **Exercise:** Write a method that counts the number of times a given character appears in a string.  For example, `count("Hello, world!", 'l')` return 3.

> **Exercise:** [optional] Write a method that swaps every two characters of a string.  For example, `swap2("Hello, world!")` returns `"eHll,ow rod !"`.

Let's create some new ways of building strings.

> **Exercise:** Write a method `repeat()` that takes a character and a length, and returns a string consisting of that character repeated to produce a string of the given length.
> 
> For example, `repeat('x', 8)` returns `"xxxxxxxx"`.
> 
> **Exercise:** [optional] Write a method that takes a _string_ and a length, and returns a string consisting of the string repeated to produce a string of the given length.
> 
> For example, `repeat('abc', 10)` returns `"abcabcabca"`.

Let's use this function to format some strings.

> **Exercise:** Write a method that prints a string and then underlines it with a specified character.  For example, `underline("Hello, world!", '=')` prints,
> 
> ```
> Hello, world!
> =============
> ```

> **Exercise:** Write a method that prints a string in a box.  Use `-` for the top and bottom, `|` for the sides, and `+` for the corners.  For example,
> 
> ```
> printInBox("Hello, world!")
> ```
> 
> produces
> 
> ```
> +---------------+
> | Hello, world! |
> +---------------+
> ```

Often, you're given a string of unknown length, and want to fill in characters to make it a known length.  This is known as _padding_.

> **Exercise:** Write a method `pad(string, length, padChar)` that returns `string` padded on the right with `padChar`.  For example, `pad("Hello.", 10, '-')` returns `"Hello.----"`.
> 
> **Exercise:** Write a variation that takes a fourth argument, a boolean, that specifies whether the padding should be added to the left (if true) or the right (if false).  For example, `pad("Hello.", 10, '-', true)` returns `"----Hello."`.

The `charAt()` method, combined with loops, is a powerful tool for modifying strings.

> **Exercise:** Write a method that takes a string and replaces all vowels with asterisks.  For example, `replaceVowels("Hello, world!")` returns `"H*ll*, w*rld!"`.

> **Exercise:** Write a method that replaces any _consecutive_ string of digits (0 through 9) with a single hash sign.  For example, `replaceNumbers("I spent $100 for 12 books.")` returns `"I spent $# for # books.")`.

> **Exercise:** Write a method that drops all characters from a string that are not either letters or digits, and replaces spaces with underscores.  For example, `cleanUp("Hello, world!")` returns `"Hello_world"`.

> **Exercise:** [optional] Write a method that looks for double letters in a string and turns them into triple letters.  For example,
> 
> ```
> doubleToTriple("I look at a balloon and see three apples.")
> ```
> 
> returns
> 
> ```
> "I loook at a balllooon and seee threee appples.")
> ```


Substrings
--

The `substring()` method returns a part of a string.  It takes two positions, and returns the string consisting of characters between the first position and up to _but not including_ the second position.

If you omit the second argument, the substring extends to the end of the string.

> **Exercise:** Write a method that swaps the first and second halves of a string.  For example, `swapHalves("Hello, world!")` returns `"world!Hello, "`.  The resulting string should be exactly the same length as the original.

> **Exercise:** Write a method that takes a string and prints it in a triangle with progressively more letters.  For example, `printTriangle("Hello!")` prints,
> 
> ```
> H
> He
> Hel
> Hell
> Hello
> Hello!
> ```

> **Exercise:** [optional] Write a method that prints the complementary triangle.  For example, `printUpperTriangle("Hello!")` prints,
> 
> ```
> Hello!
>  ello!
>   llo!
>    lo!
>     o!
>      !
> ```
> 

_Elision_ is shortening of a string by leaving out parts of it.  The _elided_ string consists of a part of the original string, with the rest replaced by an _ellipsis_.  In English, three dots, "...", is often used as an ellipsis.

> **Exercise:** Write a method that shortens a string to a given number of characters by removing the end and replacing it with three dots.  For example, `elide("Hello, world!", 10)` returns `"Hello, ..."`.  Make sure the resulting string is exactly the specified length.  If the string is too short, return it unmodified.
 
> **Exercise:** [optional] Extend the method to accept the ellipsis as an argument.  For example, `elide("Hello, world!", 10, "--")` returns `"Hello, w--"`. 

> **Exercise:** [optional] Modify the previous function so that if the string is shorter than the specified length, it is padded.


Dividing strings
--

There are many techniques for dividing strings.  We'll examine one based on the `indexOf()` method.  This method returns the position of the first occurrence of a given character or string.

For example, `"Hello, world!".indexOf('l')` returns 2, because `l` first occurs at position 2 (the third character) of the string.  Similarly, `"Hello, world!".indexOf('d')` returns 11.

> **Exercise:** Write a method `zapTo(string, zapChar)` that returns the portion of the string up to but not including the first occurence of `zapChar`.  For example, `zapChar("Hello, world!", ',')` returns `"Hello"`.

> **Exercise:** Write a method `replace1(string, fromChar, toChar)` that replaces the first incidence of a character with another.  For example, `replace1("Hello, world!", 'w', 'V')` returns `"Hello, Vorld!"`.

`indexOf()` can also take a second argument, the position to start searching from.  This enables you to search repeatedly for a character.

> **Exercise:** Write a method `replace(string, fromChar, toChar)` that replaces _every_ incidence of one character with another in the string, and returns the result.  For example, `replace("Hello, world!", 'o', '@')` returns `"Hell@, w@rld!"`.
> 
> **Exercise:** Extend your `replace()` methods to replace one _string_ with another _string_.  Note that there are corresponding `indexOf()` methods for strings.

For the following exercises, you'll need the methods `toUpperCase()` and `toLowerCase()`.  

> **Exercise:** Write a method that changes only the first word of a sentence to upper case.  Define words as letters between spaces.  For example, `firstWordToUpper("Hello, world!")` returns `"HELLO, world!"`.

> **Exercise:** Write a method that produces title capitalization, i.e. the first letter of each word is capitalized.  For example,
> 
> ```
> titleCapitalize("The quick brown fox jumped over the lazy dogs.")
> ```
> 
> returns
> 
> ```
> "The Quick Brown Fox Jumped Over The Lazy Dogs."
> ```

> **Exercise:** [optional] Modify this method to _not_ capitalize the words "a", "an", "the", and "of", _unless_ the word appears at the beginning of the string.

> **Execise:** [optional] Write a method that converts a phrase to a Java variable name by performing the following:
> 
> - dropping punctuation characters
> - capitalizing words, except the first
> - removing spaces
> 
> For example, `toJavaName("Hello, world!")` returns `"helloWorld"` and `toJavaName("What's up, doc?")` returns `"whatsUpDoc"`.


Combining techniques
--

Let's put it all together.  Use the methods you already have to solve the more complicated exercises!

> **Exercise:** Write a method that prints a string in a box of a given width.  The string should be centered in the box.  For example,
> 
> ```
> printInBox("Hello, world!", 32)
> ```
> 
> prints,
> 
> ```
> +------------------------------+
> |         Hello, world!        |
> +------------------------------+
> ```

> **Exercise:** Write a method that prints a phrase as a title by,
> 
> 1. converting it to title capitalization
> 2. underlining each word, i.e. underlying all characters except spaces
> 
> For example,
> 
> ```
> printTitle("a tale of two cities", '*')
> ```
> 
> produces
> 
> ```
> A Tale of Two Cities
> * **** ** *** ******
> ```

> **Exercise:** Write a method that replaces every character of each word except for the first two and the last with `-` characters.  For example,
> 
> ```
> hideMiddle("I’d rather live with a good question than a bad answer.")
> ```
> 
> returns
> 
> ```
> "I'd ra---r li-e wi-h a go-d qu-----n th-n a bad an---r.")
> ```
> 
> Be careful not to include punctionation marks as parts of words.
> 
> Test your method on a substantial chunk of text (which you can cut-and-paste from the Internet).


Challenge exercises
--

If you found the previous exercises to be easy, here are some others to forge you into a STRING NINJA.  These exercises aren't too hard to get right for most inputs, but might be tricky to get right for _all_ inputs.  Spend some time thinking about which inputs might break your code.

> **Exercise:** [optional] Write a method that counts the number of words in a string.  For example, 
> 
> ```
> coundWords("Eighty percent of success is showing up.")
> ```
> returns 7.

> **Exercise:** [optional] Write a method that computes the average word length.  To compute the average, count the total number of letters in words (not including spaces) as well as the total number of words, and divide them.  Make sure the result is a double, not an int.  For example, 
> 
> ```
> averageWordLength("Eighty percent of success is showing up.")
> ```
> 
> returns about 4.714.

> **Execise:** [optional] Write a method that replaces all occurences of "man" with "wo/man", "men" with "wo/men", "he" with "s/he", "his", with "his/her", and "him" with "him/her".  Feel free to substitute your own preferred gender-neutral nouns and pronouns.

> **Exercise:** [optional] Write a method that reverses a string by order of words (rather than characters).  Treat punctuation as part of a word.
> 
> For example,
> 
> ```
> reverseWords("You miss 100% of the shots you don’t take.")
> ```
> 
> returns
> 
> ```
> "take. don't you shots the of 100% miss You"
> ```
> 
> For extra credit, try to preserve sentences by leaving punctuation at the end and fixing capitlization, so that the result is instead,
> 
> ```
> "Take don't you shots the of 100% miss you."
> ```
>>>>>>> 6d845913036c87b03bd06a7624cb57c8a3c69ce6
