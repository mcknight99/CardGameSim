#Going to need GNU Make to use makefiles to compile and run
compileC:
	g++ main.cpp -Wall -o "main.exe"

runC:
	.\main.exe

cleanC:
	del *.o
	del *.exe

#runJ runs and compiles at once
runJ:
	java Main.java -Xlint:all

#compileJ compiles but doesnt run, makes a .class file. don't really need compile by using runJ, but adding this option anyways
compileJ:
	javac Main.java -Xlint:all

cleanJ:
	del *.class