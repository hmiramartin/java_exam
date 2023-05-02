# Panthera Foundation Normal Exam

## Getting Started

- **Fork** this repository under your own account
- Clone your forked repository to your computer
- Create a `.gitignore` file so generated files won't be committed
- Commit your progress frequently and with descriptive commit messages
- All your answers and solutions should go in this repository
- Take care of style guide
- Take care of the naming of classes, fields, variables, files, etc.

## Keep in mind

- You can use any resource online, but **please work individually**

- **Don't just copy-paste** your answers and solutions,
  you need to understand every line of your code
- **Don't push your work** to GitHub until your mentor announces
  that the time is up
- At the end of the exam push your solution to **GitHub**

### Java

- All of your classes should be in the `com.gfa.exam` package
- You may use more packages to separate the exercises within the `com.gfa.exam`
  package
- At the end of the exam upload your solution to **Gradescope** too

### TypeScript

- Make sure to export all of your classes and functions.
- At the end of the exam upload your solution to **Gradescope** too

## GradeScope notes for Java and TypeScript

- One hour before the end of the exam you can push your solution to **Gradescope** too
- You may upload to GradeScope multiple times in the allocated time
- You may upload your solution to GradeScope as a **zip** file

## Exercises

### Unique numbers

Write a method/function `getUniqueNumbers()` which
takes a `2D array / matrix` containing integer numbers.
It returns the numbers in a list/array without any duplication.

Write 2 different unit test cases for the method/function.

#### Example 1

Input

```text
[
  [1, 1],
  [4, 2]
]
```

Output

```text
[1, 4, 2]
```

#### Example 2

Input

```text
[
  [4, 3, -1],
  [10, 2, 5],
  [-2, 3, 4]
]
```

Output

```text
[4, 3, -1, 10, 2, 5, -2]
```

### Word Frequency

Write a method/function `getWordFrequency()` which can read and parse a file.
The method should take three parameters:

- a path for the input filename
- a frequency
- a path for the output filename

It collects all of the words that appear the
frequency amount of times in the input file.
It shall write the selected words into the output file separated by commas and spaces.

If there are no words present with the given frequency
the output file should be empty.

The method/function should print `Error happened during file manipulation
with the following message: <message>` if an error/exception
happens during file manipulations. 

> \<message\> is the original message from the error/exception that happened

#### Example

[Example file can be found here.](../../../../../../input.txt)

Example method/function call:

```text
getWordFrequency('input.txt', 2, 'output.txt');
```

The `output.txt` contains this line:

```text
apple, pear, pirate
```

### Restaurant

Your task is to create a program to model the every day life in a restaurant.

#### Restaurant

- Every restaurant has a `name`, the year it was `founded`
  and a list of `employees` who are working there.

- It has a method `guestsArrived` which instructs all employees to `work`

- It is able to `hire` an employee which adds it to the list of `employees`

#### Employee

- Every employee has a `name`, an `experience` (number) and a method `work`

- The `experience` starts from `1` by default if it is not provided

- Every employee is able to `work`, 
  however the specific method is different for every kind

**We cannot hire or create basic employees** because they are always
some kind of specific employee like `Chef`, `Manager` or `Waiter`.

##### Waiter 

- It stores the amount of `tips` it has - in the beginning this is `0`

- Whenever it is instructed to `work`:

  - It increases the amount of `tips` by `1`
  - It increases its `experience` by `1`

##### Chef

- It stores information about the `meals` it ever cooked:
  - Example:
      ```
      {
        'pancake': 1,
        'goulash': 3
      }
      ```

- Whenever it is instructed to `work`:

  - It increases its `experience` by `1`

- It has a `cook` method

  - This gets the `mealName` as an input

  - This updates the `meals` information so 
    we are able to track that it cooked this specific food again

##### Manager

- It has a `moodLevel` - in the beginning this is `400`

- Whenever it is instructed to `work`:

  - It increases the `experience` by `1`
  - It invokes its `startMeeting` method

- Whenever `startMeeting` is invoked, the `moodLevel`
  decreases by the managers `experience`

## Command line exercise

- Take a look at this directory structure:

```text
todo-app-frontend
 ├──.git
 ├──node_modules
 ├──package.json
 ├──build
 ├──public
 │   ├──favicon.ico
 │   ├──index.js
 │   └──manifest.json
 └──src
     ├──App.css
     ├──App.js
     ├──App.test.js
     ├──app.js
     ├──index.css
     ├──index.html
     ├──logo.svg
     └──serviceWorker.js
```

- Your task is to write commands in the correct order from the directory given below.
- Do it with the smallest number of commands possible without chaining them together.
- Assume that the following file is currently in the staging area:
  - `src/App.css`
  - `src/App.js`
  - `src/app.js`
- Your current directory is `todo-app-frontend/`
  1. Remove `src/app.js` from the staging area
  1. Delete the `src/app.js` file
  1. Move the `src/index.html` to `public` directory
  1. Move the `public/index.js` to `src` directory
  1. Create a `.gitignore` file
  1. Add the following lines to the `.gitignore` file
      - node_modules
      - bower_components
  1. Commit all the changes

- Solution:

```text
 git restore --staged src/app.js
 rm src/app.js
 mv src/index.html public/
 mv public/index.js src/
 touch .gitignore
 echo node_modules > .gitignore
 echo bower_components >> .gitignore
 git add .
 git commit -m"changes"
```
