##### code testing notes
*things i notice while writing/running this code*

###### reverse linked list
recursive methods seem to be favored in these type of problems. notice that the trade is code elegance for performance, IMO.
**example** method sizeRecursive() throws a runtime exception StackOverflowError with N = 100K recursive calls.  The iterative size() method is fine even at 1000K.  I also dont' like having to violate encapsulation by accessing the Nodes directly, even with a private method.
<br><br>

###### bubble sort
nothing yet
