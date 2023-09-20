package CandidateManagement;

import java.util.ArrayList;

import CandidateManagement.controller.Manager;
import CandidateManagement.model.Candidate;

public class Main {
    public static void main(String[] args) {
        ArrayList<Candidate> candidates = new ArrayList<>();

        while (true) {
            int choice = Manager.menu();
            switch (choice) {
                case 1:
                    Manager.createCandidate(candidates, 0);
                    break;
                case 2:
                    Manager.createCandidate(candidates, 1);
                    break;
                case 3:
                    Manager.createCandidate(candidates, 2);
                    break;
                case 4:
                    Manager.searchCandidate(candidates);
                    break;
                case 5:
                    return;
            }
        }
    }
}
