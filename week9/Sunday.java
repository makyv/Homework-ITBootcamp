public class Sunday {
    public static void main(String[] args) {

        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("TEST.txt"));
            for (int i = 0; i < 1000; i++) {
                Random rd = new Random();
                int length = rd.nextInt(30);
                List<Integer> list = new ArrayList<>();
                for (int j = 0; j < length; j++) {
                    int randInt = ThreadLocalRandom.current().nextInt(0, 9);
                    list.add(randInt);
                }
                String a = " assertEquals(new int[]{  " + (nuleNaKraj(list)) + "  },  ";
                String b = " nuleNaKraj(new int[]{ " + list + " }";
                writer.write(a + b);
                writer.newLine();

            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static List<Integer> nuleNaKraj(List<Integer> list){

        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) != 0)
                lista.add(list.get(i));
        }
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == 0)
                lista.add(list.get(i));
        }
        return lista;
    }

}
