# IST146_Module02_HOA

In this module's HOA, you will write another O(n) search algorithm, *randomized search*. The parameters to the algorithm are the
same as for linear search: the array to search, and the key value to look for. Likewise, the return values are the same: an index
where the key occurs if it is in the array, or -1 if the key is not in the array. The difference is that instead of examining the
array elements linearly, from left to right, randomized search chooses a random index in the array and checks to see if the key value
is at that index. If it is, the algorithm returns the index. If the key is not at that index, we somehow remember that we have 
checked that index, and randomly choose another index to look at. If we have checked all of the indices in the array without finding
the key, we know the key is not in the array, and so we can return -1 in that situation. 

To complete this HOA, look for the "TODO" comments and complete these two methods in the `RandomSearch.java` file:

* `allTrue()`: this private, "helper" method should be called by `randomSearch()`. It takes an array of `boolean` as its parameter,
and returns `true` if all the values in the array are `true`. Otherwise, the method returns `false`.
* `randomSearch()`: this is the method implementing the randomized search algorithm. *Hint*: create a `boolean` array of the same
size as `arr`, and use it, in concert with calls to `allTrue()`, to determine when the algorithm has checked all of the possible
locations in `arr`. 

## Instructions

1. Log on to your replit account. 
2. Click the "+ New repl" button to create a new repl. 
3. Click on the "Import from GitHub" tab. 
4. Type or paste the following URL into the "Paste any repository URL" text field: github.com/mmeysenburg/IST146_Module02_HOA
5. Click on the "Import from github" button.
6. Click the "Done" button in the ".replit" dialog that appears.
7. From the "Console" tab, enter the following command: `rm .replit`
8. Select the "RandomSearch.java" file. Search for the keyword "TODO", and write the specified code.
9. At any time you can run the code from the user's perspective, or, from a developer's point of view, execute the unit tests that have been provided.
    * To run the code, click the "Run" button.
    * To execute the unit tests, enter the following command in the "Console" tab: bash test.sh
10. Once you have completed the code correctly, the unit test should pass, and running the code should produce results that make sense.
11. When you are finished, submit your RandomSearch.java file via the HOA 2 Canvas assignment.


## Files in the repository

* `RandomSearch.java`: Class encapsulating the randomized search algorithm. This is the file you should edit.
* `RandomSearchTest.java`: JUnit4 unit tests for the `RandomSearch` class. These tests are executed when you enter the `bash test.sh`
command.
* `LICENSE`: GNU General Public License v3.0 for these materials.
* `Main.java`: Main program to run the code from a user's perspective. This file's `main()` method is invoked when you click the "Run" button.
* `README.md`: This README file.
* `test.sh`: Bash script to execute the JUnit4 unit tests in `RandomSearchTest.java`.

