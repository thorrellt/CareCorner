<div align="center"> 
	<img src="https://user-images.githubusercontent.com/64343445/169721102-d4956aba-789b-4b5d-aadc-dcc722ae5c86.jpeg" width= "1000">
</div> 

## :wave: Welcome
Welcome to the Care Corner Android appkucation. This app served as the senior team project for my CS degree. This Android application is built using Java with the layouts designed using XML. This prototype served as my team’s proof of concept for our application designed to increase the user’s safety by:  
- GPS tracking a user in case an emergency or attack occurs
- Messaging user-specified contacts when the user is in danger including the user’s location.  
- Storing data from any “incident” that occurs, including device audio, GPS route, timestamps and journal entries.    
Amongst other things.

By our prototype delivery date, we were able to successfully demonstrate the implementation of
- SMS messaging via the Twilio API
- GPS tracking via the HERE API
- End to End communication between our app and our backend designed using Serverless Framework and LocalStack to serve as a local AWS environment
- Audio Recording as an Android Service
- Audio Storage on Device using Shared Preferences 
- Audio playback as an Android Service, and 
- An editable Journal with individual entries in a Recycler View  

## My Contribution
For the Care Corner Project I served as team lead as well as the organizational driver of the team. I oversaw and planned most semiweekly team meetings, organized our Trello board and gantt chart, and delivered some portion of every presentation or demo the team gave.  

For the application, my contributions included:  
- Integration of the HERE API for the GPS mapping.
- Implementing the mapping functionality and accompanying drawer.
- Building and implementing the audio playback service for the Fake Phone Call.
- Building and implementing the audio recording service.
- Building and implementing the audio recording page, it’s recycler view list, and it’s customer media player and accompanying drawer.
- Building the Panic Button Activity.
- Building the “incident” class and the logic behind how the data is tracked and stored when the Panic Button is activated, including its recycler view list.
- Designed the DB schema and built it using SQL  
<div align="center"> 
	<img src="https://user-images.githubusercontent.com/64343445/135740904-425c2144-aa3e-445a-9511-036e51d5c3d2.gif" width="175">
	<img src="https://user-images.githubusercontent.com/64343445/135741004-46473371-b984-46bf-8123-7016653e80d0.gif" width="175">
</div> 


## If I Revisited This Project, 
#### I Would...

-   Update the UI to eliminate the inconsistency between pages and give the app a more polished appearance. 

-   Optimize the app by implementing proper Android design patterns to help eliminate a large portion of the bloat.

-   Increase my testing coverage as most files lack testing of any kind. 


## Installation

1. Download the zip file from Master and unzip it onto your PC.

2. Import the Project in Android Studio.

3. Build the application using the build.gradle file located in CareCorner/care-corner-mobile.

4. Run the app on an emulator. 

To include database connection follow the instructions on the API ReadMe [here.](https://github.com/thorrellt/CareCorner/blob/master/care-corner-api/README.md)  


## How to use Care Corner

- Upon opening the Care Corner you will be greeted by the Welcome Screen. Please select Login.

- You will now be asked for your credentials, please put “demo” for both the username and password.

- After you have successfully put in your credentials, you will land on the Care Corner Home screen. 

<div align="center"> 
	<img src="https://user-images.githubusercontent.com/64343445/135739565-f6634799-3071-4da2-a70b-7a5d1b705699.png" width="175">
</div>      

#### For more information about navigating the features of Care Corner  
[please visit the Wiki]( https://github.com/thorrellt/CareCorner/wiki)  
  
  

## The Care Corner Website   
The project website for Care Corner is available here!  
[https://thorrellt.github.io/care-corner/](https://thorrellt.github.io/care-corner/)
