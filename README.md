## Zadanie od zákazníka

Naša organizácia potrebuje interaktívnu študentskú pomôcku na precvičovanie správneho slovosledu v angličtine. Aplikácia bude ponúkať dva režimy:

Učiteľský režim: Učiteľ si uloží v systéme napríklad 5 preddefinovaných viet, ktoré budú slúžiť na precvičovanie. V tomto režime je možné vety vytvárať a ukladať.
Študentský režim: Vety sa zobrazia rozhádzané, pretože úlohou študenta je ich správne poskladať.



## Zber požiadaviek
- **RQ01** Systém poskytne hlavnú obrazovku s možnosťou zvoliť režim Teacher alebo Student.
- **RQ02** Systém zobrazí učiteľovi v učiteľskom režime 5 polí na vytvorenie, editovanie a ukladanie piatich viet.
- **RQ03** Systém zobrazí študentovi v študentskom režime rozhádzané slová vety, pričom študent má za úlohu poskladať ich do správneho poradia.
- **RQ04** Systém vyhodnotí, či je veta poskladaná správne.
- **RQ05** Systém zobrazí študentovi príslušnú správu – napríklad "Great job! You arranged the sentence correctly!" alebo "Oops, that's not quite right."
- **RQ06** Po vyhodnotení každej vety systém automaticky posunie študenta na ďalšiu vetu.
- **RQ07** Po vyhodnotení poslednej vety systém zobrazí výsledné hodnotenie, ktoré obsahuje počet správnych a nesprávnych viet.
- **RQ08** Systém priebežne zobrazuje počet správne a nesprávne poskladaných viet.
- **RQ09** Systém zobrazuje poradie otázky, napríklad 1/5, čím indikuje, ktorá z piatich viet sa práve precvičuje.
- **RQ10** Systém umožní študentovi kedykoľvek sa vrátiť do hlavného menu pomocou tlačidla „Leave“.


## Slovník pojmov

| **Pojem**              | **Anglický názov** | **Definícia** |
|------------------------|--------------------|---------------|
| **Veta**               | Sentence           | Základná jednotka precvičovania, ktorú študent musí poskladať zo správneho poradia slov. |
| **Učiteľský režim**    | Teacher Mode       | Režim, v ktorom učiteľ vytvára, upravuje a ukladá vety na precvičovanie. |
| **Študentský režim**    | Student Mode       | Režim, v ktorom študent skladá rozhádzané slová do správneho poradia a získava spätnú väzbu. |
| **Slová**              | Words              | Jednotlivé prvky vety, ktoré sú zobrazené v náhodnom poradí a majú byť usporiadané do správnej vety. |
| **Hodnotenie**         | Evaluation         | Proces, ktorým systém kontroluje správnosť poskladaných viet a poskytuje študentovi spätnú väzbu. |
| **Výsledné hodnotenie**| Final Score        | Súhrnné hodnotenie testu, ktoré zobrazuje počet správnych a nesprávnych viet. |
| **Menu**               | Menu               | Hlavná obrazovka aplikácie, kde si používateľ vyberá medzi režimami Teacher a Student. |
| **Pole**               | Field              | Miesto, kde sa zadáva alebo zobrazuje text, napr. pri tvorbe vety učiteľom alebo skladaní vety študentom. |
