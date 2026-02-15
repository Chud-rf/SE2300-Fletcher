main.class
    while True:
        "What would you like to do?"
        - View/print lists          ->  toDoList.printCategorizedLists() / toDoList.printMergedLists()
        - Create new list           ->  newList = toDoList( USER ENTERED DETAILS )
        - Edit existing list        ->  * edit prompts*
        - Exit application          ->


toDolist.class

    list id
    list name/category
    list items/tasks []

    printCategorizedLists()
        print each category as its own list

    printMergedLists()
        print all categories merged into one list

    

* edit prompts *
    "What list would you like to edit?"
    - Print list id followed by the categories/name
    - User can select by matching id

    * Print full list of user selected option *
    "What would you like to do?"
    - Change name/category          ->  toDoList.setName( USER INPUT )
    - Add item                      ->  toDoList.addItem( USER INPUT )
    - Remove item                   ->  toDoList.removeItem( USER INPUT )
    - Delete list                   ->  toDoList.deleteList( USER INPUT )