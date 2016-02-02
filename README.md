# Abstract
This project is **Maven, Spring and Mybatis** based **multi-module** web project.

## Create New Module(Maven)

The groupId is **com.chen**

```bash
mvn archetype:generate \
    -DarchetypeArtifactId=maven-archetype-webapp \
	    -DgroupId=com.chen -DartifactId=[e.g spring] 
```
### Change pom.xml

The parent pom is changed automatically, the module pom need:

* add <relativePath> inside <parent>

	```
	without <relativePath>, the parent should be
	mvn install
	which put parent pom in localRepo
	```

* delete <groupID>, <version> and <build>, which are got from parent

* revise <dependencies>
