# Servlet_projects1
JavaEE, servlet - projects and learning




-------------------------------------------------------------------

HOW TO USE:

1) stop tomcat , if it already running to use same port for your applicatiopn
sudo /etc/init.d/tomcat7 stop

2) Open at browser : 
 http://localhost:8080/S4/2?limit=78
 or
 http://localhost:8080/S4/2
 when this servlet launched at tomcat server

3) Open front-end file ajax_http2.html 
-> press button to send request to server and get response

-----------------------------------------------------------------

LINKS:

1) Download Tomcat 7 - server:
https://tomcat.apache.org/download-70.cgi

2) Adding Tomcat to Eclipse ( start servlet at Tomcat server ) :
http://www.codejava.net/servers/tomcat/how-to-add-tomcat-server-in-eclipse-ide

3) Google-JSON handler ( put at project WEB-INF folder ) :
https://stackoverflow.com/questions/4112686/how-to-use-servlets-and-ajax/
http://repo1.maven.org/maven2/com/google/code/gson/gson/2.8.4/

3) Servlet allow cross-origin :
https://stackoverflow.com/questions/16351849/origin-is-not-allowed-by-access-control-allow-origin-how-to-enable-cors-using

4) Ajax http-request and http-response (like javascript fetch) :
https://www.w3schools.com/xml/tryit.asp?filename=tryajax_get

-------------------------------------------------------------------

SETUP & CONFIGURATION

1) If JavaEE components are missing from Eclipse, then :
Eclipse -> Help -> Install new software -> 
 Work with : ( http://download.eclipse.org/releases/indigo/ )
 Work with : (http://download.eclipse.org/releases/luna )

2) Eclipse -> window -> Preferences -> Server -> Runtime enviroment (add Tomcat server here)










