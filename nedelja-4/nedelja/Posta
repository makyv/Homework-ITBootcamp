public class Posta {
    private ArrayList<Poruka> poruke;

    /*Konstruktori*/

    public Posta(ArrayList<Poruka> poruke) {
        this.poruke = poruke;
    }
    /*Metode*/

    //Dodaje poruku p u poruke ako ona vec ne postoji (gledano u odnosu na id)
    public void add(Poruka p){
        for(Poruka a : poruke)
            if(a.getId() == (p.getId()))
                return;
            poruke.add(p);
    }

    //Brise poruku p iz poruka ako ona postoji (gledano u odnosu na id)
    public void remove(Poruka p){
        for(Poruka a : poruke)
            if(a.getId() == (p.getId()))
                poruke.remove(a.getPoruka());
                return;

    }

    //Ispisuje poruku p  i brise je iz poruka, ako ona postoji (gledano u odnosu na id)
    public void send(Poruka p){
        for(Poruka a : poruke)
            if(a.getId() == (p.getId())) {
                System.out.println(a.getPoruka());
                poruke.remove(a);
            }
            return;

    }

    //Menja tekst poruke
    public void change(Poruka p, String msg){
        for (int i = 0; i < poruke.size(); i++) {
            if(poruke.get(i).getPoruka().equals(p.getPoruka())){
                poruke.get(i).setPoruka(msg);
            }
        }

    }

    // Vraca sumu poruke p ako ta poruka postoji u listi
    public int isplata(Poruka p){
        for(Poruka a : poruke)
            if(a.getPoruka() == (p.getPoruka())) {
               return a.getSuma();
            }
        return 0;
    }


    // U konzoli ispisuje, ako je suma nenegativna:
    // {posiljalac} salje {suma} para {primalac}-u, uz poruku:
    // {poruka}
    // a ako je suma negativna:
    // {posiljalac} primac {suma} para od {primalac}-a, uz poruku:
    // {poruka}
    // za svaki element iz liste!
    @Override
    public String toString() {
        String res = "";
        for(Poruka e : poruke){
            res += e.toString() +  "\n" ;
        }
        return res;
    }
}
