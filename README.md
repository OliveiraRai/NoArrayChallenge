💻 <b>No Arrays Here – Java Challenge<b>

A simple Java project where the goal was to **process several user-entered numbers without using arrays, lists, or any collection structure**.
Everything had to be handled manually with basic variables and comparisons.

<hr>

📌 <b>Challenge Description</b>

Implement a program that:

* Reads integers from the user **one at a time**
* Stops when the user enters **0**
* Must NOT use:

  * Arrays
  * Lists
  * Any data structure to store multiple values
* After the loop ends, display:

  * **Total sum**
  * **Average**
  * **Highest** number
  * **Lowest** number
  * **Amount** of numbers entered

All calculations must be done using:

* Primitive variables (`int`, `double`)
* Simple comparisons (`>`, `<`)
* Accumulators

Basically: **old-school Java, without fancy containers.**

<hr>

🛠️ <b>What the Program Does</b>

The program:

* Validates empty input
* Converts text to number using `Integer.parseInt()`
* Rejects invalid input (letters, symbols, empty strings)
* Updates highest/lowest values correctly
* Counts valid inputs
* Stops when 0 is entered
* Calculates the average without counting the termination value
* Displays all results cleanly in the console

🎯 <b>Purpose of the Exercise</b>

<hr>

Practice and reinforce:

* **While loops**
* **Exception handling (`try/catch`)**
* **Basic numeric logic**
* **Flow control without arrays**
* **User input handling**

In short: **learning to manage data manually instead of stuffing everything in a list.**

<hr>

🔥 <b>Final Output Example</b>

```
Total sum: X
Average: Y
Greater: Z
Lower: W
Total of numbers: N
```

Straightforward, functional, and compliant with the “no arrays allowed” rule.
