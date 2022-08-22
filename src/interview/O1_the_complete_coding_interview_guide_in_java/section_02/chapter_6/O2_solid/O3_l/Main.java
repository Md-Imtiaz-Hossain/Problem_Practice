package interview.O1_the_complete_coding_interview_guide_in_java.section_02.chapter_6.O2_solid.O3_l;

import java.util.List;

public class Main {
    public static void main(String[] args) {

       System.out.println("\nApproach that follow Liskov's Substitution Principle:\n");

        List<TournamentJoiner> members2 = List.of(
                new PremiumMember("Tom"),
                new VipMember("Jerry"),
                new FreeMember("Dog")
        );

        List<TournamentOrganizer> members3 = List.of(
                new PremiumMember("Gopal Var"),
                new VipMember("Montri")
        );


        // this code respects LSP
        for (TournamentJoiner member : members2) {
            member.joinTournament();
        }

        System.out.println();

        // this code respects LSP
        for (TournamentOrganizer member : members3) {
            member.organizeTournament();
        }
    }
}




/**
 * SOLID
 * SOLID is an acronym for the first fve Object-Oriented Design (OOD) principles enunciated by Robert C. Martin, also known as Uncle Bob (optional phrase).
 * • S: Single Responsibility Principle
 * • O: Open Closed Principle
 * • L: Liskov's Substitution Principle
 * • I: Interface Segregation Principle
 * • D: Dependency Inversion Principle
 */


// Book: The Complete Coding Interview Guide in Java, Page 93 (118 / 788)