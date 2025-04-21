Activitat proposada pel professorat de l'asignatura de programació:

A la nostra empresa matemàtiques per a tothom ens demanen que fem un programa per
ajudar a practicar les taules de multiplicar. L’alumne ha de seguir un camí des de l’inici fins
al final movent-se només cap a la dreta o cap avall i seleccionant només caselles que
continguin resultats vàlids de la taula de multiplicar seleccionada. Ens donen el següent
exemple:

<ins>**Taula 5**</ins>


![image](https://github.com/user-attachments/assets/48fb8bfe-197d-4c7b-9cde-dc7d2b34c421)

Analitzant el problema a solucionar, determinem les següents especificacions:
  - El punt inicial sempre serà la cantonada superior-esquerra.
  - El punt final sempre serà la cantonada inferior-dreta.
  - Volem que sigui aplicable a qualsevol taula de multiplicar entre 1 i 10 (per defecte la del 5).
  - Volem que es pugui definir qualsevol mesura de la matriu (per defecte 8x5).
  - Ha d’haver-hi mínim 1 camí correcte (podria ser que es donés la situació de que n’hi hagi
    més d’un, però no és el propòsit).
  - No s’ha de guardar el camí de la solució.

**Recomanació:** ompliu primer el camí de la solució en la matriu.
