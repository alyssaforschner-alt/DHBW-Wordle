# Anleitung zum Starten von Wordle

Um Wordle zu starten, müssen folgende Schritte durchgeführt werden:

## Backend starten (Spring Boot):

Option 1 – über das Terminal in Visual Studio Code:

    cd Backend
    cd wordle-dev
    .\mvnw.cmd clean package
    .\mvnw.cmd spring-boot:run


Option 2 – direkt über VSC:

• Visual Studio Code öffnen
• Im Explorer navigieren zu:
    Backend → wordle-dev → src → main → java/de/dhbw/stuttgart/wordle
• Datei: WordleApplication.java
• Rechtsklick → Run Java


## Frontend starten (Angular):

Option 1 – im normalen Terminal / CMD (falls Administratorrechte notwendig):

    cd <Pfad zum Projekt>
    npm install
    ng serve --host <Ihre IP> --port 4200 (am besten im privaten Netzwerk)


Option 2 – direkt im Terminal von Visual Studio Code:

    cd <Pfad zum Projekt>
    npm install
    ng serve --host <Ihre IP> --port 4200 (am besten im privaten Netzwerk)


Spieler 2 startet in Browser mit: `http://<Ihre IP>:4200/` (muss im selben Netzwerk wie der Host sein).