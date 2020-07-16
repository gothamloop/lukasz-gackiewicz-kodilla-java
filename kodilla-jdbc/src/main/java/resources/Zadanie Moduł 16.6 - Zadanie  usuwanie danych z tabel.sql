W ramach ćwiczeń na zakończenie submodułu napisz po 3 zapytania, które mają za zadanie:

1. Dodanie nowego postu do tabeli POSTS.
2. Modyfikacje w dodanym rekordzie wartość pola BODY i ustawienia jej na "To delete".
3. Usunięcie dodany przed chwilą rekord.
Powyższe polecenia SQL zapisz w jednym pliku o rozszerzeniu *.sql, a plik prześlij do mentora za pośrednictwem czatu.


INSERT INTO POSTS (USER_ID, BODY)
VALUES (1, "This is my next post on this forum!");

COMMIT;


UPDATE POSTS 
SET BODY = 'To Delete'
WHERE BODY = 'This is my next post on this forum!'

UPDATE POSTS 
SET BODY = 'To Delete'
WHERE ID=7


COMMIT;

DELETE FROM POSTS 
WHERE BODY = 'To Delete'

COMMIT;