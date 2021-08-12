
---------

readme:

download both projects. import both into eclipse as maven projects.

in UtopiaSpring:
	modify application.properties with your sql db username/pass

run both projects in eclipse at the same time:
	r-click UtopiaSpringApplication.java > run as java application
	r-click BootSecurityApplication.java > run as java application

if you get Error: Could not find or load main class rc.bootsecurity.BootSecurityApplication
	r-click bootsecurity project > maven > update project

in browser:
	open new incognito window
	go to home page - https://localhost:8443/
	log in with: admin / admin123



