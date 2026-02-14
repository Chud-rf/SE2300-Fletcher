class ToDoList(Object):

    categories = []

    def __init__(self, list_name):
        self.name = list_name
        self.listId = 123       # FIXME: GENERATE LIST ID

    @property
    def name(self):
        return self._name

    @name.setter
    def name(self, new_name):
        if type(new_name) == str:
            self._name = new_name
        else:
            raise Exception("Invalid value for name")

    @property
    def categories(self):
        return self._categories

    @categories.setter
    def categories(self, category):
        self._categories.append(category)       # FIXME: ADD INPUT VALIDATION?


class Category:

    tasks = []

    def __init__(self, name):
        self.name = name

    def getName(self):
        return name

    def setName(name):
        self.name = name

    def addTask(task):
        self.tasks.append(task)

    def removeTask(task):
        self.tasks.remove(task)


class Task:

    def __init__(self, taskContent):
        self.taskId = 123
        self.taskContent = taskContent

    def getTaskId(self):
        return taskId

    def getTaskContent(self):
        return taskContent


# Create a category
firstCategory = Category("Topic A")

# Create a task
newTask = Task("This is a task")

# Add task to category
firstCategory.addTask(newTask)

# Create a todo list
testList = ToDoList("My Todo List")

# Add category to list
testList.addCategory(firstCategory)

print(testList.name)