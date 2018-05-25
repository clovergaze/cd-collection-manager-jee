# CD Collection Manager
A simple sample application that uses Java EE technologies.

## About
The application uses JPA, EJBs and JSF with [BootsFaces](https://www.bootsfaces.net/) and was developed for [WilfFly](http://wildfly.org/).
Although the underlying data model is very simple, it has a repository layer and a service layer, that is used by page backing beans.

For simplicity the application uses an H2 in-memory database as datasource, but this can easily be changed to any other database using the WildFly datasource configuration.

## How to build
[Maven](https://maven.apache.org/) is used to build the program from source code. 
Just execute the following Maven goal to build and package the application:

~~~bash
mvn clean package
~~~

As mentioned earlier an in-memory H2 database is used as datasource, so if WildFly is used no further configuration is required.
To use another database simply configure one called `CDCollectionManagerDS`.

## Bugs & Issues
If there are problems with this program or you find any bugs, then please feel free to create a new issue on the
[corresponding GitHub page](https://github.com/clovergaze/cd-collection-manager/issues).

## Author
Johannes Hillert ([GitHub](https://github.com/clovergaze))

## License
Copyright (c) 2018 Johannes Hillert. Licensed under the MIT license, see the included LICENSE file for details.