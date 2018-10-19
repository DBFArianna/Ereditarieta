package ereditarieta;

public class Prove {

    public static void main(String[] args) {
//        Inizializzo le classi
        A a = new A();

//        possiamo dichiarare un oggetto di tipo A
//        come new B poiché B estende A
//        quindi è come se fosse una continuazione
//        b rimane comunque di tipo A
        A b = new B();

//        questa dichiarazione si usa quando si ha una classe creata precedentemente
//        e si crea una nuova classe che estenda quella precedente
//        per evitare di ricompilare tutto la dichiaro 
//        del tipo vecchia classe come new nuova classe
//        in questo modo posso utilizzare tutti i metodi della prima classe
        A c = new C();

//        non possiamo dichiarare un oggetto B
//        come new A poiché A non estende B
//////       B d = new A();
//        mi permette di scriverlo 
//        perchè lo vede come un oggetto di tipo B
//        ma se lo mando in Run non funziona
//        perché d non esiste
//////       d.stampa();
//        richiamo il metodo stampa della classe B
//////       b.stampa();
//        non posso scriverlo 
//        perchè non si trova nella classe A
//////        a.stampa();
        System.out.println("_____________________________");
//        creo un vettore nel quale inserisco a, b, c
        A[] v = {a, b, c};

//        for
//        da i = 0 fino a i < 3 incrementando i
        for (int i = 0; i < 3; i++) {
//            per l'elemento in posizione i di v
//            stampa il risultato del meotdo calcola di A 
            System.out.println(v[i].calcola());
        }

//        OPPURE:
        System.out.println("_____________________________");
//        for each
//        per ogni elemento e di tipo A appartenenti al vettore v
        for (A e : v) {
//            per l'elemento e in questione 
//            stampa il risultato del metodo calcola di A 
            System.out.println(e.calcola());
        }

        System.out.println("_____________________________");
//        il risultato del metodo calcola di A
//        stampo il risultato del metodo calcola di A
        System.out.println(a.calcola());

        System.out.println("_____________________________");
//        stampo il risultato del metodo calcola di A
        System.out.println(b.calcola());

        System.out.println("_____________________________");
//        stampo il risultato del metodo calcola di A
        System.out.println(c.calcola());

    }
}

//costruiamo la classe A
class A {

    public String calcola() {
//        ritorna una stringa
        return "* Calcolo con modalità di B";
    }
}

//costruiamo la classe B
//diciamo che B estende A
class B extends A {

    @Override
    public String calcola() {
//        ritorna una stringa
        return "* Calcolo con modalità di B";
    }
}

class C extends A {

    @Override
    public String calcola() {
//        ritorna una stringa
        return "* Calcolo con modalità di B";
    }
}
