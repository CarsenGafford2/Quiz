# Quiz

Quiz is a Java GUI program for playing quizes correctly formatted and saved on a .txt file

# Installation
First use Javac in command prompt to compile the .java files into .class files
```
javac QuizGUI.java
```
Then use Java to run the QuizGUI.class file
```
java QuizGUI
```
# Usage
To use the QuizGUI you need to select a correctly formated .txt file in order to load the quiz
[Example.txt](https://github.com/CarsenGafford2/Quiz/blob/main/Example.txt) is an example file that can be loaded to provide an example quiz

# Text file formating
For creating quizes, you should use the fallowing format in a plain text file
```
The Main question being asked goes here
FBecause 'F' is placed before this, this answer is incorrect
TBecause 'T' is placed at the beginning of this, this answer is correct
FWrong answer
FIncorrect answer
Second Question Goes Here
FIncorrect
FIncorrect
TCorrect
FIncorrect
```
Make sure every question has four answers always. You can have as many questions as needed just ensure that you have no newlines between them.
 Multiple answers can be correct if you want. This process should be easier as I intend to make a quiz maker GUI that will do this process for you.
## License

[MIT](https://choosealicense.com/licenses/mit/)
