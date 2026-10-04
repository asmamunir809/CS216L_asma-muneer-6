# CS216L_Project1_Asma Muneer_ Roll no 6

**Course:** Data Structures Lab (CS 216L), Weeks 1–3
**GitHub link:** https://github.com/asmamunir809/CS216L_asma-muneer-6/new/main

## Description
A console-based Task Manager in Java. Tasks are stored in a singly linked list.
Every add/delete is pushed onto a stack so the user can undo the last action.

## Data Structures & Algorithms Used
| Part | Used for |
|---|---|
| Singly Linked List (`TaskLinkedList`) | Storing tasks (add, delete, display) |
| Stack (`UndoStack`, linked nodes) | Undo last add / delete |
| Linear Search | Search task by title keyword |
| Bubble Sort | Sort tasks by priority (1 = highest) |

## Features (menu)
1. Add task
2. Delete task
3. View all tasks
4. Search task
5. Sort by priority
6. Undo last action
7. Show last action (stack peek)
8. Exit

Input validation: menu choice, priority (1-5), and task ID must be valid numbers; titles cannot be empty.
Deleted nodes are unlinked (next = null) so nothing is left dangling.

## Time Complexity
| Operation | Time | Why |
|---|---|---|
| Insert (add at end) | O(n) | walk to the tail |
| Delete (by ID) | O(n) | find the node, then unlink |
| Search (linear) | O(n) | check every node |
| Sort (bubble) | O(n^2) | nested passes over the list |
| Push | O(1) | add at top |
| Pop | O(1) | remove from top |

## How to Run
    javac *.java
    java Main

## Files
Main.java, Task.java, TaskLinkedList.java, UndoStack.java, Action.java

## Screenshots
(add 2-3 screenshots of the running program here)
