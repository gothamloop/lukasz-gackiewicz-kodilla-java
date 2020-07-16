Listę zadań z tabeli ISSUESS z dołączonymi do nich nazwami list zadań z tabeli ISSUESLISTS

SELECT  ISS.SUMMARY, IL.NAME
FROM ISSUES ISS
JOIN ISSUESLISTS IL
ON ISS.ISSUESLIST_ID = IL.ID



Listę zadań z tabeli ISSUESS z przypisanymi do nich użytkownikami z tabeli USERS

SELECT U.FIRSTNAME, U.LASTNAME
FROM ISSUES ISS
JOIN USERS U
ON U.ID = ISS.USER_ID_ASSIGNEDTO


Imiona i nazwiska użytkowników posiadających zadania, wraz z informacją o ilości zadań, które są do nich przypisane

SELECT U.FIRSTNAME, U.LASTNAME
FROM USERS U
JOIN ISSUES ISS
ON U.ID=ISS.USER_ID_ASSIGNEDTO
GROUP BY U.ID
ORDER BY U.LASTNAME, U.FIRSTNAME;





Twoim zadaniem jest utworzenie tabel:

ISSUESLISTS - zawierającej listy zadań, posiadającej pola (kolumny):

ID - klucz główny,
NAME - nazwa listy zadań.

ISSUES - zawierającej zadania, posiadającej pola (kolumny):

ID - klucz główny,
ISSUESLIST_ID - klucz obcy do tabeli z listami zadań,
SUMMARY - podsumowanie zadania (nazwa),
DESCRIPTION - opis zadania,
USER_ID_ASSIGNEDTO - klucz obcy do tabeli USERS wskazujący użytkownika, do którego przypisane jest zadanie.