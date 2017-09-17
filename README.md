# Object Mocker
Object Mockerer automatically generates random field values within a POJO. 
You can use it for unit testing purpose or use it just for fun.
Reflection is used in this project.
This tool is lightweight and super easy to use, you just need to copy one class and it comes with no other dependencies.
All you need to do is to copy the Mocker.java into your own project.
And in order to randomly generate field values for a POJO, do it like:
Mocker mocker = new Mocker();
YourClass yourClass = mocker.mockObject(YourClass.class);
