# Phase2_Submission_from_laptop

1: Open Github link: https://github.com/
2: Clone directory on your local using code: git clone https://github.com/Utkarsh20th/Phase2_Submission_from_laptop.git
3: Clone directory on your local using code: git clone




1)
com.simplilearn.project folder has Java code to demonstrate "reading from excel" in TestNG framework with the help of dataprovider annotation. It also demonstrates the capability of including "Listeners". I have used a "RetryAnalyzer" - ir is a type of Listener.

Purpose of this listner:
Lets say a code executes for the first time and error is obtained. In ideal case, the program execution stops. But by using this listener, the run-time will be ordered to keep on a)re-running a piece of code as many times a user wishes or b)piece of code passes.
Here, I have created a code to subtract [5-7], ideally the answer should be [-2] but I've delibrately coded to give wrong answer [-18]. In JUnit result tab it will be seen that the code is executed 10 times and then finally it shows that the program has failed  ----->  Message:"java.lang.AssertinError: expected [-2] but found [-18]"

Usage of this listener:
Sometimes a web page does not load within a set time limit. So this listener can order the run-time to keep on re-running the code fro a certain number of times before declaring it a fail or keep on re-running the code until the page loads within set time.

Path to execute the code:
Path2_Submission_from_laptop --> com.simplilearn.project --> src --> framework.excel --> TestNG_withExcelDataProvider.java  -->  run as  -->  TestNG Test
(If we read the code:     the data provider "ExcelAsDataProvider" shows the capability of reading from excel     the data provider "@CustomTestNGAnnotation(10)" shows the capability of re-running a piece of code 10 times)



2)
simplilearn.HnM.project
This is a Maven project with Cucumber-Gherkin as BDD language for "feature" file. It also generates extent report.
The Swiggy web app has a login feature where mobile OTP is required to login. It is a manual intervention process, so login task cannot be automated. This is a roadblock in automating the remaining tasks like [choosing restaurant --> ordering dish --> checking out --> making payment]
So I have done same using another web app [h&M - online apparel store]. It does not require any manual intervention.
I have created the automation using a Windows OS machine. When I moved the code to Simplilearn lab and tried to execute the code --> Simplilearn lab shows small screen, so the program is stopping as it is unable to find the designated WebElement[s], so I request to execute the code in full-screen mode and not on small screen as the test will fail. It is maven project so no OS issues will be there. But it will be easy if the user runs the code on Windows OS machine.

Path to execute the code:
Path2_Submission_from_laptop --> simplilearn.HnM.project --> src/test/java --> runners --> TestRunner.java  -->  run as  -->  JUnit Test

Path to Extent (html) report folder:
simplilearn.HnM.project --> target --> cucumber-reports --> Simplilearn_Phase2_Project_Report.html
