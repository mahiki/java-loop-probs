##### code testing notes
*things i notice while writing/running this code*
<br><br>

###### reverse linked list
- recursive methods seem to be favored in these type of problems. notice that the trade is code elegance for performance, IMO.
- I'm gonna pass on the recursive reverseLinkedList for now.
- **example** method sizeRecursive() throws a runtime exception StackOverflowError with N = 100K recursive calls.  The iterative size() method is fine even at 1000K.  I also dont' like having to violate encapsulation by accessing the Nodes directly, even with a private method inside the class.
<br><br>

###### bubble sort
- int[] version is easy
- generic type needs Comparable implementation
- once you pass the inner loop once without swapping, no need to keep iterating
- bubble sort is easy man
