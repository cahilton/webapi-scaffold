###WebAPI
The project is meant to be a lightweight scaffold of OHDSI's WebAPI, for more information about that project, see [that project](https://github.com/OHDSI/WebAPI)


##### Compilation
Compiling thhis project will require Maven.  Maven is a command line tool that will build the WAR for deployment to a servlet container.

##### JDBC Drivers
JDBC Drivers are not included with the source or any release packages.  Obtaining JDBC Drivers and making them available on the hosting server via environment classpath or web server configuration are left as an excercise for the developer / system administrator.  

##### Configuration
Once the source code is built and the resulting libraries are deployed to your web environment the **web.xml** file needs to be updated for your specific environment

**database.driver** : this parameter specifies the class name of the driver for your database environment *(ie com.microsoft.sqlserver.jdbc.SQLServerDriver)*

**database.url** : this parameter specifies the connection string for your database environment

**database.dialect** this parameter specifies the dialect of your database environment and is used by the SQLRender library to translate the embedded templated queries to one of the supported dialects (SQL Server, Oracle, PostgreSQL, Amazon RedShift)


