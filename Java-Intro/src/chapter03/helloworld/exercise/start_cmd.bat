@echo off
rem ------------------------------------------------------------
rem Programm von Kommandozeile aus kompiliern und ausf�hren:
rem ------------------------------------------------------------
rem 
rem a) Wechsel ins Verzeichnis: 
rem    c:\course\java\src\chapter03\helloworld\demo
rem 
rem b) Kompilieren mit Befehl:
rem    javac HelloWorld.java
rem    > Es wird die Datei HelloWorld.class erstellt
rem
rem c) F�r die Ausf�hrung, wechsel ins Verzeichnis 
rem    c:\course\java\src
rem 
rem d) Ausf�hren mit dem Befehl:
rem    java chapter03.helloworld.demo.HelloWorld
rem ------------------------------------------------------------

set COURSE=c:\course\java
set LABS=%COURSE%\labs

rem Pfad mit Java erg�nzen (falls notwendig):
rem set JAVA_BIN=%COURSE%\software\jdk1.6.0_21\bin
rem set PATH=%JAVA_BIN%;%PATH%

cd %LABS%\Java-Intro\src\chapter03\helloworld\demo
cmd
