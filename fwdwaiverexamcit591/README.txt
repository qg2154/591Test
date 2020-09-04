Design decisions (why this design. why those classes) :
    There are mainly two parts.
    1. In the class constructor, I read the .txt file into a List<String>.
    For each input, I will split each String input into two parts and store
    the info into Map<String, Set<String>> : the person's name and a set
    of its friends (deduplication)
    2. Realize the two required functions based on the map. I use the
    dataStructure Map because the search api in Map is O(1), which saves time
    for the findCommonFriends api.

Testing decisions (why those tests) :
    1. to check whether duplicated friends counts only once
    2. if name not exist: return -1
    3. check the case when a person does not have any friend
    4. check the case to find the common friend shared between same person


Git commands to push my file:
    git add .
    git commit -m "all file"
    git push origin master

How long did this take you (do not count any breaks/food eating etc):
    1 hour 10 min

If you used the internet/books, what did you have to look up? :
    1. how to read data in a separate
    2. semantics for java unit test



