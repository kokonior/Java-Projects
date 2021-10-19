import java.util.Scanner;
public class Chindyfebryan {
    public static void main(String[] args){
        String name1,name2,pokemon1,pokemon2,f,e,g,i,w;
        Scanner in = new Scanner(System.in);
        name1 = in.next();
        pokemon1 = in.next().toLowerCase();
        name2 = in.next();
        pokemon2 = in.next().toLowerCase();

        f="fire";
        e="elecric";
        g="ground";
        i="ice";
        w="water";
        
        if (pokemon1.equals(f)){
            if (pokemon2.equals(i)||pokemon2.equals(e)){
                System.out.println(name1);
            }
            else if(pokemon2.equals(f)){
                System.out.println("Draw");
            }
            else if(pokemon2.equals(g)||pokemon2.equals(w)){
                System.out.println(name2);
            }
        }
        else if (pokemon1.equals(g)){
            if (pokemon2.equals(e)||pokemon2.equals(f)){
                System.out.println(name1);
            }
            else if(pokemon2.equals(g)){
                System.out.println("Draw");
            }
            else if(pokemon2.equals(w)||pokemon2.equals(i)){
                System.out.println(name2);
            }
        }
        else if (pokemon1.equals(w)){
            if (pokemon2.equals(f)||pokemon2.equals(g)){
                System.out.println(name1);
            }
            else if(pokemon2.equals(w)){
                System.out.println("Draw");
            }
            else if(pokemon2.equals(e)||pokemon2.equals(i)){
                System.out.println(name2);
            }
        }
        else if (pokemon1.equals(i)){
            if (pokemon2.equals(g)||pokemon2.equals(w)){
                System.out.println(name1);
            }
            else if(pokemon2.equals(i)){
                System.out.println("Draw");
            }
            else if(pokemon2.equals(e)||pokemon2.equals(f)){
                System.out.println(name2);
            }
        }
        else if (pokemon1.equals(e)){
            if (pokemon2.equals(w)||pokemon2.equals(i)){
                System.out.println(name1);
            }
            else if(pokemon2.equals(e)){
                System.out.println("Draw");
            }
            else if(pokemon2.equals(f)||pokemon2.equals(g)){
            System.out.println(name2);
            }
        }
        in.close();
    }
}
