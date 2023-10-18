Oppgaven

Du skal lage et program som håndterer bud på boliger som er til salgs. Programmet skal kunne ta imot bud på en bolig, og holde oversikt over alle innkomne bud.

Funksjonalitetskrav 1: Registrering og uthenting

- [x] Lag en klasse for boliger, som representerer en bolig som er til salgs. Boliger skal lagres med gateadresse, postnummer og takstpris.  
- [x] Lag en klasse for budgivere. budgivere skal lagres med navn og telefonnummer.  
- [x] Lag en klasse for bud. Alle bud registreres med boligen det bys på, budgiver, og prisen som bys. I tillegg skal budet lagres med en akseptfrist, som er fristen budet kan godtas innen.  
- [x] Oppdater bolig-klassen slik at bud kan lagres. Bolig-klassen skal også lagre vinnerbudet når boligen blir solgt. 
- [x] Lag en metode som henter ut alle budene som er gitt og fortsatt er aktive (akseptfristen har ikke gått ut). Budene skal være sortert på akseptfrist fra kortest tid igjen til lengst tid igjen. 
- [ ] Implementer en metode i bolig-klassen som henter ut det høyeste budet som er gitt som er aktivt. 



Funksjonalitetskrav 2: Budgivning

- [ ] Lag en metode i budgiver-klassen som oppretter et bud fra budgiveren. Ta imot boligen, budpris samt timer og minutter til akseptfrist som parametere. Forsikre om at budet lagres i bolig-objektet 
- [ ] Lag en metode for å akseptere et bud som vinnerbud. Budet som godtas må være registrert i boligklassen og akseptfristen kan ikke ha gått ut. 
- [ ] Implementer en string-representasjon av bolig-objekter. Stringen skal inneholde adressen til boligen, takstpris samt informasjon om salgsprosessen. Dersom boligen ikke er solgt skal alle aktive bud sortert på akseptfrist vises. Dersom boligen er solgt skal kjøper og salgssum vises. 



Funksjonalitetskrav 3: Feilhåndtering

- [ ] Potensielle feil og unntak skal håndteres fornuftig 