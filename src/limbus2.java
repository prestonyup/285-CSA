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

public class limbus2 {
    public static void main(String[] args) {

    // ALLY STATS
    // ===========================================
    // STAT ORDER: (HEALTH, SANITY, SPEED-MIN, SPEED-CAP)
    // SKILL ONE: (SKILL-COUNT, BASE-POWER, COIN-POWER, COIN-AMOUNT)
    // SKILL TWO: (SKILL-COUNT, BASE-POWER, COIN-POWER, COIN-AMOUNT)
    // SKILL THREE: (SKILL-COUNT, BASE-POWER, COIN-POWER, COIN-AMOUNT)
    // DEFENSE SKILL: (BASE-POWER, COIN-POWER, COIN-AMOUNT)

    // ALLY A
        ArrayList<Integer> allyStatsA = new ArrayList<>(List.of(200, 0, 4, 7)); // 200HP, 0SP, 4-SPEED, 7+SPEED
        ArrayList<Integer> skillOneA = new ArrayList<>(List.of(3, 4, 3, 2)); // 3COUNT, 4BP, 3CP, 2C -- 10MAX
        ArrayList<Integer> skillTwoA = new ArrayList<>(List.of(2, 5, 7, 1)); // 2COUNT, 5BP, 7CP, 1C -- 12MAX
        ArrayList<Integer> skillThreeA = new ArrayList<>(List.of(1, 7, 2, 4)); // 1COUNT, 7BP, 2CP, 4C -- 15MAX
        ArrayList<Integer> DefenseSkillA = new ArrayList<>(List.of(6, 3, 3)); // 6BP, 3CP, 3C -- 15MAX


    // ALLY B



    }
}