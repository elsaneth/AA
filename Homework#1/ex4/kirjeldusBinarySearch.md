# Binary Search
Ülesanne: leida listist kindel täisarv

1. Töötab ainult sorteeritud listi korral

2. Põhimõte:

2.1. Võtab listi keskmise elemendi (kui on paarisarv elemente listis võtab floor divisioni kasutamisel keskmiseks väiksema indeksiga elemendi)

2.2. Kontrollib, kas keskmine element on otsitav

2.3. Kui ei -> kontrollib, kas otsitav on suurem või väiksem kui keskmine element

2.4. Vastavalt sellele, kas otsitav element on suurem või väiksem ignoreerib elemente, mis on väiksemad/suuremad
ning kordab samasugust poolitamist kuni leiab otsitava elemendi

Algoritmi näitlikustamiseks joonis:
![image](https://github.com/elsaneth/AA/assets/106624129/0f749a66-3292-42e6-9d91-59f6eb8bcd29)
