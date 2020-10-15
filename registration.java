package ArcadiaAuctionsystem;
import java.util.*;

public class registration {



class player {
   player(){ 
    String player_name,game_tag,wep1,wep2;
    int player_rank,player_hour;
    Scanner sc = new Scanner(System.in);
    player_name = sc.nextLine();
    game_tag = sc.nextLine();
    wep1 = sc.nextLine();
    wep2 = sc.nextLine();
    player_rank = sc.nextInt();
    player_hour = sc.nextInt();
    sc.close();

    System.out.println("The player" + player_name + "having gaming tag" + game_tag + " have a CSGO MM ranking" + player_rank);
  }
}

  class Owner {
   Owner(){ String owner_name,ph;
    Scanner sc = new Scanner(System.in);
    owner_name = sc.nextLine();
    ph = sc.nextLine();
    sc.close();
    System.out.println("The owner" + owner_name + "is intrested is auction");

  }
}

}
