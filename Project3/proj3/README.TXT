gradebook.dat contains the data that is found in the project document in �3 Background. The records
in this file are not sorted in any order.

gradebook.dat.bak is a backup copy of gradebook.dat. When your program reads gradebook.dat it is
going to sort the records by the student's last name and will overwrite the original gradebook.dat.
When you need to test your sort algorithm again, you can copy gradebook.dat.bak to gradebook.dat
and then when your program reads gradebook.dat, the records will be unsorted again.
