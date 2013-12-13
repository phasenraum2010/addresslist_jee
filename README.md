addresslist_jee
===============

educational project for teaching Java EE comparable to Spring MVC and other Frameworks

install JBoss
-------------

install JBoss 7.1.Final from http://www.jboss.org/jbossas/downloads/ to e.g. /Users/tw/srv/jboss-as-7.1.1.Final/

start JBoss by: cd /Users/tw/srv/jboss-as-7.1.1.Final/bin ; ./standalone.sh

build and run
-------------

build project with: mvn clean install

copy war to deployment directory of jboss: cp -f target/addresslist_jee6-1.0-SNAPSHOT.war /Users/tw/srv/jboss-as-7.1.1.Final/standalone/deployments/

open url in browser: http://localhost:8080/addresslist_jee6-1.0-SNAPSHOT/

open tasks for development
--------------------------

add validation

add use case "edit"

