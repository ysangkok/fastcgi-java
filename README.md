# fastcgi-java

This project contains a FastCGI implementation from http://web.archive.org/web/20131012011650/http://www.fastcgi.com/devkit/java/ patched to work in modern Java environments. It also contains a Gradle build configuration that builds with RoboVM, and an Apache configuration for routing traffic to the FastCGI server.

The Apache server can be started using `apache2 -f httpd.conf -d . -X`. You may need to fix the paths to the shared objects in `httpd.conf`.
