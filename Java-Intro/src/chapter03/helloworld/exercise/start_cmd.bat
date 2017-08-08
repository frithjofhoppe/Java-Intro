@echo off
rem ------------------------------------------------------------
rem Programm von Kommandozeile aus kompiliern und ausführen:
rem ------------------------------------------------------------
rem 
rem a) Wechsel ins Verzeichnis: 
rem    c:\course\java\src\chapter03\helloworld\demo
rem 
rem b) Kompilieren mit Befehl:
rem    javac HelloWorld.java
rem    > Es wird die Datei HelloWorld.class erstellt
rem
rem c) Für die Ausführung, wechsel ins Verzeichnis 
rem    c:\course\java\src
rem 
rem d) Ausführen mit dem Befehl:
rem    java chapter03.helloworld.demo.HelloWorld
rem ------------------------------------------------------------

set COURSE=c:\course\java
set LABS=%COURSE%\labs

rem Pfad mit Java ergänzen (falls notwendig):
rem set JAVA_BIN=%COURSE%\software\jdk1.6.0_21\bin
rem set PATH=%JAVA_BIN%;%PATH%

cd %LABS%\Java-Intro\src\chapter03\helloworld\demo
cmd
