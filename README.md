# jet_brains_internships_2020_tasks_scheduler

1. Чтобы посмотреть как действуют команды, нужно зайти в директорию \out\artifacts\jet_brains_internships_2020_tasks_scheduler_jar
и вызвать команду с соответствующими аргументами. Вызов команды происходит так: java -jar Command.jar parameter1 parameter2 ...
(где Command - название вызываемой команды, parameter1, parameter2 и т.д. - передаваемые ей параметры).

2. Тесты лежат в файле src\test\java\menu\MenuImplementationTest.java. Тесты на пустой список или на отсутствие списков начинаются с oneNewEmptyList и emptyFile, emptyHashMapOfLists соответственно. Тест на большое количество заданий в списке называется addManyTasks.

3. Помимо озвученных в задании команд я также добавил от себя команды CreateList и DeleteList, которые обеспечивают создание или удаление списков. Таким образом списков может быть много и в каждый вы можете добавлять задания.

4.Также можно вызвать справку по команде набрав ее без параметров или с аргументом -h или --help.

5. Доступно соответственно 8 команд:

    CreateList - создает новый список заданий
    
    DeleteList - удаляет список, если таковой имеется /n
    
    AddTaskToList - добавляет задание в список по названию списка
    
    DeleteTask - удаляет задание из списка по названию списка и номеру задания в списке
    
    MarkTask - отмечает задание как выполненное/невыполненное по названию списка и номеру задания в списке(выполненное задание отмечается символом '*' в конце строки) 
    
    ShowLists - показывает названия всех существующих списков
    
    ShowTasks - выводит все задания в списке по названию списка
    
    ShowOnlyNotCompletedTasks - выводит все еще не выполненные задания в списке по названию списка
    
6. Пример использования:

вызов команды с аргументом -h:

![Image alt](https://github.com/BigBey/jet_brains_internships_2020_tasks_scheduler/blob/develop/raw/help.PNG)

Создание нового списка с именем "New list":

![Image alt](https://github.com/BigBey/jet_brains_internships_2020_tasks_scheduler/blob/develop/raw/CreateList.PNG)

Показ всех списков:

![Image alt](https://github.com/BigBey/jet_brains_internships_2020_tasks_scheduler/blob/develop/raw/ShowLists.PNG)

Добавление нового задания в список:

![Image alt](https://github.com/BigBey/jet_brains_internships_2020_tasks_scheduler/blob/develop/raw/AddTaskToList.PNG)

Отмечаем дело как выполненное(чтобы убрать * достаточно выполнить ту же самую команду):

![Image alt](https://github.com/BigBey/jet_brains_internships_2020_tasks_scheduler/blob/develop/raw/MarkTask.PNG)

Выводим все задания списка "New list":

![Image alt](https://github.com/BigBey/jet_brains_internships_2020_tasks_scheduler/blob/develop/raw/ShowTasks.PNG)
