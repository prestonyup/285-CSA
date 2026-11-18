/*
Creation Cycle
(1) Create containers for all stats
    (a) Sanity (-45 to +45)
        -Coins have a 5% to 95% chance to flip heads
        |This is based on the sanity of the unit using a skill
    (b) Skills (1, 2, and 3)
        -Both units one and two have one skill column
        |They have access to two random skills at any given time
        |Also, the next skill in queue will be displayed
        |There are three skill 1s, two skill 2s, and one skill 3
        |Once there is only 1/6 skills left in the column, restock all
    (c) Speed
        -All units roll speed at the beginning of the turn
        |Affects clashing and turn order
*/


// ALL IMPORTS
// ===========================================
import java.util.*;
// ===========================================

public class limbus {
    public static void main(String[] args) {

// CHARACTER STATS 
// ===========================================
    // ALLY A
    String allyNameA = "Ajax";

    // Speed
        int aSpeedMin = 4;
        int aSpeedMax = 7;
        int allySpeedA = (int)Math.random() * ((aSpeedMax-aSpeedMin)+1);

    // Coins
        int aSanity = 0;
        int skillOneCountA = 3;
        int skillTwoCountA = 2;
        int skillThreeCountA = 1;
        // Temporaries
            int skillOneCurrentA = 3;
            int skillTwoCurrentA = 2;
            int skillThreeCurrentA = 1;

    // =======================================
    // ALLY B
    String allyNameB = "Bruce";

    // Speed
        int bSpeedMin = 3;
        int bSpeedMax = 6;
        int allySpeedB = (int)Math.random() * ((bSpeedMax-bSpeedMin)+1);

    // Coins
        int bSanity = 0;
        int skillOneCountB = 3;
        int skillTwoCountB = 2;
        int skillThreeCountB = 1;
        // Temporaries
            int skillOneCurrentB = 3;
            int skillTwoCurrentB = 2;
            int skillThreeCurrentB = 1;

    }
}
