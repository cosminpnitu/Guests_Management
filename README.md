[P1] Sistem de gestiune înscrieri
Fiind deja un programator software în devenire, echipa Devmind apelează la tine pentru ajutor în implementarea unui sistem back-end responsabil cu gestiunea listei de participanți. Acest tool va fi deosebit de util pentru procesarea automată a persoanelor care doresc să participe în diversele activități educaționale organizate, de tipul evenimentului Cum să începi o carieră în IT. Aplicația trebuie să îndeplinească un set complet de funcționalități, pe care inginerii din echipă vi le detaliază în continuare.

Specificații tehnice
Aplicația va fi alcătuită din 3 părți componente:

o reprezentare a unui participant - clasa Guest
o clasă care implementează gestiunea listei de participanți - clasa GuestsList
o clasă principală, care reprezintă motorul aplicației. Aceasta va accepta comenzi de la utilizator, va efectua acțiunile potrivite asupra listelor de participare și va răspunde la interogări - clasa Main
Class 'Guest'
Un invitat va fi definit în sistem prin următoarele câmpuri, aferente Formularului de înscriere la eveniment:

last name
first name
email
phone number
În funcție de acțiunile necesare în cadrul aplicației, va trebui să implementezi un set de metode aferente clasei Guest. Citește în continuare specificațiile sistemului și implementează treptat funcționalitatea necesară fiecărei entități în parte.

Class 'GuestsList'
Această clasă va ține evidența înscrierilor la un eveniment. Prin urmare, va conține (cel puțin) următoarele detalii: numărul de locuri disponibile la eveniment (i.e. număr oferit la inițializare), lista de participanți și persoane aflate în așteptare.

Clasa va implementa următoarele funcționalități:

adăugarea unei noi persoane (înscrise)
Obs: se verifică dacă persoana respectivă nu este deja înscrisă la eveniment
căutarea persoanei se poate face după:
lastName și firstName SAU
email SAU
phoneNumber
la adăugare, persoana înscrisă va fi notificată corespunzător, în funcție de lista în care a fost înscrisă:
Obs: notificarea se face prin afișarea la tastatură a unui mesaj simplu:
confirmare participare → Felicitari! Locul tau la eveniment este confirmat. Te asteptam!.
lista de așteptare → Te-ai inscris cu succes in lista de asteptare si ai primit numarul de ordine <X>. Te vom notifica daca un loc devine disponibil.
metoda va returna o valoare întreagă, astfel:
-1 - dacă persoana a fost deja înscrisă la eveniment
0 - dacă a primit un loc la eveniment
X - dacă persoana este pe locul X în lista de așteptare
determină dacă o persoană este înscrisă la eveniment (în oricare listă)
căutarea persoanei se poate face după:
lastName și firstName SAU
email SAU
phoneNumber
Obs: clasa va permite căutarea unui participant după fiecare criteriu mai sus menționat
eliminarea unei persoane (înscrise)
căutarea persoanei se poate face după:
lastName și firstName SAU
email SAU
phoneNumber
Obs: clasa va permite căutarea și respectiv eliminarea unui participant după fiecare criteriu mai sus menționat
se va întoarce o valoare boolean, astfel:
true - persoana a fost ștearsă cu succes
false - eroare: persoana nu era înscrisă
Obs: persoana se poate afla atât pe lista participanților cât și pe cea de așteptare
Obs2: dacă o persoană este ștearsă din lista de participare și există persoane în lista de așteptare, prima persoană din lista de așteptare va fi (1) mutată în lista de participare și (2) notificată în acest sens. Notificarea se face conform specificațiilor de mai sus.
actualizarea detaliilor unei persoane înscrise
oricare dintre câmpuri poate fi actualizat
căutarea persoanei se poate face după:
lastName și firstName
email
phoneNumber
Obs: clasa va permite căutarea și respectiv actualizarea unui participant după fiecare criteriu mai sus menționat
obținerea listei de persoane care au loc la eveniment (i.e. lista de participare)
obținerea listei de persoane din lista de așteptare
obținerea numărului de locuri disponibile
Obs: 0 dacă nu mai sunt locuri libere în lista de participare
obținerea numărului de persoane participante (i.e. aflate în lista de participare)
obținerea numărului de persoane din lista de așteptare
obținerea numărului total de persoane
căutare parțială, după un subșir de caractere:
metoda primește ca parametru un șir de caractere. Acesta este căutat oriunde în cadrul contactului (i.e. în fiecare câmp, începând cu orice poziție).
se returnează o listă de contacte care îndeplinesc criteriile de căutare
lista vidă indică lipsa persoanelor
Obs: căutarea este case insensitive
Exemplu: pentru subșirul dra, se vor întoarce contacte precum
Contact 1: conține email = Roxy.Dragomir1_1@gmail.com
Contact 2: conține firstName = Andra
etc.
Class 'Main'
Clasa Main reprezintă clasa principală a aplicației, responsabilă de interacțiunea cu utilizatorul. Aceasta va implementa funcționalitatea de procesare a input-ului dat aplicației, îndrumarea utilizatorului pentru introducerea corectă a comenzilor de intrare, afișarea comenzilor disponibile etc.

Funcționalitate
Similar cu orice aplicație modernă, folosită în linia de comandă, sistemul de gestiune al înscrierilor va oferi utilizatorului un set de comenzi posibile și o comandă de închidere a aplicației. Programul va primi comenzi (și va răspunde, pe rând, fiecărei comenzi în parte) până la primirea comenzii de închidere. Setul de comenzi pe care programul îl poate primi este prezentat în continuare. Se observă faptul că acestea sunt în conformitate cu acțiunile implementate de clasa GuestsList, prin urmare implementarea acestora se va baza pe apelarea metodelor clasei GuestsList.

Setul de comenzi
Fiecare comandă va fi reprezentată printr-un șir de caractere, fără spații, după cum urmează:

Console
help         - Afiseaza aceasta lista de comenzi
add          - Adauga o noua persoana (inscriere)
check        - Verifica daca o persoana este inscrisa la eveniment
remove       - Sterge o persoana existenta din lista
update       - Actualizeaza detaliile unei persoane
guests       - Lista de persoane care participa la eveniment
waitlist     - Persoanele din lista de asteptare
available    - Numarul de locuri libere
guests_no    - Numarul de persoane care participa la eveniment
waitlist_no  - Numarul de persoane din lista de asteptare
subscribe_no - Numarul total de persoane inscrise
search       - Cauta toti invitatii conform sirului de caractere introdus
quit         - Inchide aplicatia
După introducerea comenzii dorite de către utilizator, aplicația va cere, pe rând datele necesare îndeplinirii comenzii. Acțiunile care primesc date de intrare sunt descrise în continuare:

add:
utilizatorul va introduce pe rând toate câmpurile aferente clasei Guest, cu ajutorul cărora se va construi un nou obiect Guest
check:
utilizatorul va fi invitat inițial să aleagă opțiunea după care se face căutarea:
lastName și firstName
email
phoneNumber
ulterior, în funcție de criteriul ales, se va introduce șirul / șirurile de caracter specifice căutării
remove:
pentru identificarea persoanei de șters, se va utiliza procedura descrisă la comanda check
update:
pentru identificarea persoanei de actualizat, se va utiliza procedura descrisă la comanda check
ulterior, utilizatorul va alege câmpul care trebuie actualizat:
lastName
firstName
email
phoneNumber
la final, va introduce noua valoare pentru câmpul ales
search:
primește ca parametru un șir de caractere
