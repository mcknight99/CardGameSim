#Going to need GNU Make to use makefiles to compile and run
compile:
	g++ main.cpp -Wall -o "main.exe"

runC:
	.\main.exe

cleanC:
	del *.o
	del *.exe

runJ:
	java Main.java -Xlint:all

runJclass:
	javac Main.java -Xlint:all

cleanJ:
	del *.class