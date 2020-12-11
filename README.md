## Sprint 2 - SmartCare

# I have checked and satisfied all tests.
1.	Login to the system (user = "doctor", password= "doctor") and create a Session lasting for 20 minutes.
2.	List all patients and all invoices per selected period (including costs)
3.	List private patients and NHS patients, separately
4.	Add a patient - including all relevant data.
5.	Add doctor or nurse users
6.	Book an appointment with a doctor or a nurse as a patient
7.	Check daily surgery schedule as a doctor or nurse
8.	Issue a prescription if required and an invoice following each surgery including all details
9.	Forward a patient to a hospital or a specialist clinic if need specialist consultation or care.
10.	Calculate turnovers per selected period.  
11.	Let patients pay their bills - only the full total current bill is accepted - no part payment allowed.
12.	Remove a patient from surgery schedule as an admin
13.	Cancel a booked appointment as a patient
14.	Change the prices per service or period of consultation 


# All the screenshots 

# All the jps's
<img src="Views/View.PNG" width="650" height="200">


# index.jsp
<img src="Views/indexJsp.PNG" width="650" height="200">


# patientLogin.jsp
<img src="Views/patientLogin.PNG" width="650" height="200">


# patientSignup.jsp
<img src="Views/patientSignup.PNG" width="650" height="200">


# patientDashboard.jsp
<img src="Views/patientDashboard.PNG" width="650" height="200">


# staffLogin.jsp
<img src="Views/staffLogin.PNG" width="650" height="200">


# staffDashboard.jsp
<img src="Views/staffDashboard.PNG" width="650" height="200">


# adminDashboard.jsp
<img src="Views/adminDashboard.PNG" width="650" height="200">


# patientRecords.jsp
<img src="Views/patientRecords.PNG" width="650" height="200">


# updatePatient.jsp
<img src="Views/updatePatient.PNG" width="650" height="200">


# staffRecords.jsp
<img src="Views/staffRecords.PNG" width="650" height="200">

# addStaff.jsp
<img src="Views/addStaff.PNG" width="650" height="200">


# updateStaff.jsp
<img src="Views/updateStaff.PNG" width="650" height="200">


# calcRevenue.jsp
<img src="Views/calcRevenue.PNG" width="650" height="200">

##------------------------------------------------------------
# vaccine-microchip-dev-team-3
Enterprise systems group project vaccine-microchip-dev-team-3


DOWNLOAD & INSTALL GIT SCM

    In your browser go to this URL and follow the instructions on page:
    https://git-scm.com/downloads

SET UP SSH ON GITHUB

    ( For offical guide: https://docs.github.com/en/free-pro-team@latest/github/authenticating-to-github/adding-a-new-ssh-key-to-your-github-account )

    In your browser go to this address:
    https://github.com/settings/keys

    Run the following command to create an ssh key: 
    ssh-keygen -t ed25519 -C "your_email@example.com" (this might not work on windows)

    Run through the setup process or press return to skip.

    Run the following command to copy ssh to your clipboard: 
    pbcopy < ~/.ssh/id_ed25519.pub (this might not work on windows)

    Back in your browser window follow the UI to add new SSK Key. 
    Name the key after the current PC Name of the machine you are using for future reference.

CLONE THE REPO LOCALLY

    Create a directory named dev.

    Open terminal/cmd inside of the dev directory.

    Run the following command to clone the git repository locally:
    git clone git@github.com:JDeluxe69/vaccine-microchip-dev-team-3.git

    Run the following command to change directory to the local repository:
    cd ./vaccine-microchip-dev-team-3/

GIT PRACTISES AND INFO

    (Git flow refrence: https://datasift.github.io/gitflow/IntroducingGitFlow.html#:~:text=GitFlow%20is%20a%20branching%20model,and%20scaling%20the%20development%20team.)
    (Git conventional commit refrence: https://www.conventionalcommits.org/en/v1.0.0/)
    (Git cheat sheet: https://www.atlassian.com/git/tutorials/atlassian-git-cheatsheet)

    The following command is your friend run it before and after every git command:
    git status 

    Another good command to help you visualise current state of your current branch and more:
    gitk

SET UP YOUR OWN FEATURE BRANCH

    In terminal/cmd go to ./vaccine-microchip-dev-team-3/ directory

    The following command will help you to establish which branch you are currently on:
    git status
    
    The following command will take you to develop branch:
    git checkout develop

    The following command will create a new branch and change HEAD to that branch 
    git checkout -b feature/your-branch-name-in-kebbab-case
    
    Now you can safely start making changes to the source code

