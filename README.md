Fingerings

To run the application, go to the Application.java file, right-click (or however you right-click on a Mac) and choose "Run Application.main()" or "Debug Application.main()". Ctrl+Shift+F10 or Cmd+Shift+F10 will also do the trick.

Now try navigating to the following URLs in your browser:

localhost:8080

localhost:8080?name={name} e.g. localhost:8080?name=Phil

The version with a name will personalise the greeting with your name. To see how this is done, check out the index.html file.
To see how the request is handled, look at the HomeController.java file.

localhost:8080/clarinet

To see how this request is handled, look at the ClarinetController.java file.
